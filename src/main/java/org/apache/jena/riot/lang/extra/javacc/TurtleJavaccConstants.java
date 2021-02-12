/* Generated By:JavaCC: Do not edit this line. TurtleJavaccConstants.java */
/**
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

package org.apache.jena.riot.lang.extra.javacc;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface TurtleJavaccConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int WS = 6;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 7;
  /** RegularExpression Id. */
  int KW_A = 8;
  /** RegularExpression Id. */
  int PREFIX_OLD = 9;
  /** RegularExpression Id. */
  int BASE_OLD = 10;
  /** RegularExpression Id. */
  int BASE = 11;
  /** RegularExpression Id. */
  int PREFIX = 12;
  /** RegularExpression Id. */
  int TRUE = 13;
  /** RegularExpression Id. */
  int FALSE = 14;
  /** RegularExpression Id. */
  int WSC = 15;
  /** RegularExpression Id. */
  int BOM = 16;
  /** RegularExpression Id. */
  int IRIref = 17;
  /** RegularExpression Id. */
  int PLUS = 18;
  /** RegularExpression Id. */
  int MINUS = 19;
  /** RegularExpression Id. */
  int DIGITS = 20;
  /** RegularExpression Id. */
  int INTEGER = 21;
  /** RegularExpression Id. */
  int DECIMAL = 22;
  /** RegularExpression Id. */
  int DOUBLE = 23;
  /** RegularExpression Id. */
  int EXPONENT = 24;
  /** RegularExpression Id. */
  int QUOTE_3D = 25;
  /** RegularExpression Id. */
  int QUOTE_3S = 26;
  /** RegularExpression Id. */
  int ECHAR = 27;
  /** RegularExpression Id. */
  int UCHAR = 28;
  /** RegularExpression Id. */
  int UCHAR4 = 29;
  /** RegularExpression Id. */
  int UCHAR8 = 30;
  /** RegularExpression Id. */
  int STRING_LITERAL1 = 31;
  /** RegularExpression Id. */
  int STRING_LITERAL2 = 32;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG1 = 33;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG2 = 34;
  /** RegularExpression Id. */
  int LPAREN = 35;
  /** RegularExpression Id. */
  int RPAREN = 36;
  /** RegularExpression Id. */
  int LBRACE = 37;
  /** RegularExpression Id. */
  int RBRACE = 38;
  /** RegularExpression Id. */
  int LBRACKET = 39;
  /** RegularExpression Id. */
  int RBRACKET = 40;
  /** RegularExpression Id. */
  int ANON = 41;
  /** RegularExpression Id. */
  int SEMICOLON = 42;
  /** RegularExpression Id. */
  int COMMA = 43;
  /** RegularExpression Id. */
  int DOT = 44;
  /** RegularExpression Id. */
  int LT2 = 45;
  /** RegularExpression Id. */
  int GT2 = 46;
  /** RegularExpression Id. */
  int L_ANN = 47;
  /** RegularExpression Id. */
  int R_ANN = 48;
  /** RegularExpression Id. */
  int DATATYPE = 49;
  /** RegularExpression Id. */
  int AT = 50;
  /** RegularExpression Id. */
  int PNAME_NS = 51;
  /** RegularExpression Id. */
  int PNAME_LN = 52;
  /** RegularExpression Id. */
  int BLANK_NODE_LABEL = 53;
  /** RegularExpression Id. */
  int LANGTAG = 54;
  /** RegularExpression Id. */
  int A2Z = 55;
  /** RegularExpression Id. */
  int A2ZN = 56;
  /** RegularExpression Id. */
  int SURROGATE_PAIR = 57;
  /** RegularExpression Id. */
  int PN_CHARS_BASE = 58;
  /** RegularExpression Id. */
  int PN_CHARS_U = 59;
  /** RegularExpression Id. */
  int PN_CHARS = 60;
  /** RegularExpression Id. */
  int PN_PREFIX = 61;
  /** RegularExpression Id. */
  int PN_LOCAL = 62;
  /** RegularExpression Id. */
  int VARNAME = 63;
  /** RegularExpression Id. */
  int PN_LOCAL_ESC = 64;
  /** RegularExpression Id. */
  int PLX = 65;
  /** RegularExpression Id. */
  int HEX = 66;
  /** RegularExpression Id. */
  int PERCENT = 67;
  /** RegularExpression Id. */
  int UNKNOWN = 68;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<WS>",
    "<SINGLE_LINE_COMMENT>",
    "\"a\"",
    "\"@prefix\"",
    "\"@base\"",
    "\"base\"",
    "\"prefix\"",
    "\"true\"",
    "\"false\"",
    "<WSC>",
    "\"\\ufeff\"",
    "<IRIref>",
    "\"+\"",
    "\"-\"",
    "<DIGITS>",
    "<INTEGER>",
    "<DECIMAL>",
    "<DOUBLE>",
    "<EXPONENT>",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "<ECHAR>",
    "<UCHAR>",
    "<UCHAR4>",
    "<UCHAR8>",
    "<STRING_LITERAL1>",
    "<STRING_LITERAL2>",
    "<STRING_LITERAL_LONG1>",
    "<STRING_LITERAL_LONG2>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<ANON>",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"<<\"",
    "\">>\"",
    "\"{|\"",
    "\"|}\"",
    "\"^^\"",
    "\"@\"",
    "<PNAME_NS>",
    "<PNAME_LN>",
    "<BLANK_NODE_LABEL>",
    "<LANGTAG>",
    "<A2Z>",
    "<A2ZN>",
    "<SURROGATE_PAIR>",
    "<PN_CHARS_BASE>",
    "<PN_CHARS_U>",
    "<PN_CHARS>",
    "<PN_PREFIX>",
    "<PN_LOCAL>",
    "<VARNAME>",
    "<PN_LOCAL_ESC>",
    "<PLX>",
    "<HEX>",
    "<PERCENT>",
    "<UNKNOWN>",
  };

}