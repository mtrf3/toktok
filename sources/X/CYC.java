package X;

/* loaded from: classes6.dex */
public enum CYC {
    UNKNOWN(-1),
    SHOW(1),
    HIDE(2),
    TURNTOSHOW(3),
    TURNTOHIDE(4),
    COUNTCHANGE(5);

    public final int LJLIL;

    public static CYC valueOf(String str) {
        return (CYC) V0N.LJJJ(CYC.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    CYC(int i) {
        this.LJLIL = i;
    }
}
