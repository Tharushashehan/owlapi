/* Generated By:JavaCC: Do not edit this line. Token.java Version 7.0 */
/* JavaCCOptions:TOKEN_EXTENDS=,KEEP_LINE_COLUMN=true,SUPPORT_CLASS_VISIBILITY_PUBLIC=false */
package org.coode.owlapi.obo12.parser;

@SuppressWarnings("all")
class Token implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public int kind;

    public int beginLine;
    public int beginColumn;
    public int endLine;
    public int endColumn;

    public String image;

    public Token next;

    public Token specialToken;

    public Object getValue() {
        return null;
    }

    public Token() {
    }

    public Token(int kind) {
        this(kind, null);
    }

    public Token(int kind, String image) {
        this.kind = kind;
        this.image = image;
    }

    public String toString() {
        return image;
    }

    public static Token newToken(int ofKind, String image) {
        switch (ofKind) {
            default:
                return new Token(ofKind, image);
        }
    }

    public static Token newToken(int ofKind) {
        return newToken(ofKind, null);
    }

}
/* JavaCC - OriginalChecksum=3516ae994c3e699323760244c2e2e50a (do not edit this line) */
