/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.sparql.engine.iterator;

import org.apache.jena.graph.Node;
import org.apache.jena.graph.Node_Triple;
import org.apache.jena.graph.Triple;
import org.apache.jena.sparql.core.Quad;
import org.apache.jena.sparql.core.Var;
import org.apache.jena.sparql.engine.binding.Binding;
import org.apache.jena.sparql.engine.binding.BindingFactory;

// [RDF-star] Merge into RX
public class RX2 {
    public static Binding match(Binding input, Triple tData, Triple tPattern) {
        Node sPattern = tPattern.getSubject();
        Node pPattern = tPattern.getPredicate();
        Node oPattern = tPattern.getObject();

        Node sData = tData.getSubject();
        Node pData = tData.getPredicate();
        Node oData = tData.getObject();

        Binding chain = input;
        chain = match(chain, sData, sPattern);
        if ( chain == null )
            return null;
        chain = match(chain, pData, pPattern);
        if ( chain == null )
            return null;
        chain = match(chain, oData, oPattern);
//        if ( chain == null )
//            return null;
        return chain;
    }

    public static Binding match(Binding input, Quad qData, Node qGraphNode, Triple tPattern) {

        Node sPattern = tPattern.getSubject();
        Node pPattern = tPattern.getPredicate();
        Node oPattern = tPattern.getObject();

        Node gData = qData.getGraph();
        Node sData = qData.getSubject();
        Node pData = qData.getPredicate();
        Node oData = qData.getObject();

        Binding chain = input;
        chain = match(chain, gData, qGraphNode);
        if ( chain == null )
            return null;
        chain = match(chain, sData, sPattern);
        if ( chain == null )
            return null;
        chain = match(chain, pData, pPattern);
        if ( chain == null )
            return null;
        chain = match(chain, oData, oPattern);
//        if ( chain == null )
//            return null;
        return chain;
    }


    /**
     * Match a data node against a pattern node, which can include variables and
     * triple terms. Return null for no match.
     */
    public static Binding match(Binding input, Node nData, Node nPattern) {
        // Deep substitute. This happens anyway as we walk structures.
        //   nPattern = Substitute.substitute(nPattern, input);

        nPattern = Var.lookup(input, nPattern);

        // nPattern.isConcrete() : either nPattern is an RDF term or is <<>> with no variables.
        if ( nPattern.isConcrete() ) {
            // No nested variables. Is data equal to pattern?
            if ( nPattern.equals(nData) )
                // Match, no additional bindings.
                return input;
            else
                // No match
                return null;
        }

        // Easy case - nPattern is a variable.
        if ( Var.isVar(nPattern) ) {
            Var var = Var.alloc(nPattern);
            Binding binding = BindingFactory.binding(input, var, nData);
            return binding;
        }

        // nPattern is <<>> with variables.
        if ( ! nData.isNodeTriple() )
            return null;

        // nData is <<>>, nPattern is <<>>
        // Unpack, match components.
        Triple tPattern = Node_Triple.triple(nPattern);
        Triple tData = Node_Triple.triple(nData);
        return match(input, tData, tPattern);
    }
}
