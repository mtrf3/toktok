package X;

/* loaded from: classes6.dex */
public enum CXI {
    UNKNOWN(0, ""),
    STRING(1, "string"),
    USER(11, "user"),
    GIFT(12, "gift"),
    HEART(13, "heart"),
    PATTERN_REF(14, "pref"),
    IMAGE(15, "image");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public int getPieceType() {
        return this.LJLIL;
    }

    public String getTag() {
        return this.LJLILLLLZI;
    }

    public static CXI valueOf(String str) {
        return (CXI) V0N.LJJJ(CXI.class, str);
    }

    CXI(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
