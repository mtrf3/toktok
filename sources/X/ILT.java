package X;

/* loaded from: classes9.dex */
public enum ILT {
    UNKNOWN(0),
    SIZE(1),
    COLOR(2);

    public final int LJLIL;

    public static ILT valueOf(String str) {
        return (ILT) V0N.LJJJ(ILT.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    ILT(int i) {
        this.LJLIL = i;
    }
}
