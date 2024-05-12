package X;

/* loaded from: classes15.dex */
public enum WHC {
    MATCH_PARENT(0),
    DIMENSION(1);

    public static final WHD Companion = new WHD();
    public final int LJLIL;

    public static WHC valueOf(String str) {
        return (WHC) V0N.LJJJ(WHC.class, str);
    }

    public final int getMode() {
        return this.LJLIL;
    }

    WHC(int i) {
        this.LJLIL = i;
    }
}
