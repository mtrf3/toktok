package X;

/* loaded from: classes5.dex */
public enum APL {
    FULL_PAGE(0),
    HALF_PAGE(1);

    public final int LJLIL;

    public static APL valueOf(String str) {
        return (APL) V0N.LJJJ(APL.class, str);
    }

    public final int getStyle() {
        return this.LJLIL;
    }

    APL(int i) {
        this.LJLIL = i;
    }
}
