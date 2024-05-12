package X;

/* loaded from: classes6.dex */
public enum CWC {
    Scale120(0),
    Default(1),
    Scale90(2),
    Scale80(3),
    Scale70(4),
    Scale60(5);

    public final float LJLIL;

    public static CWC valueOf(String str) {
        return (CWC) V0N.LJJJ(CWC.class, str);
    }

    public final float getRatio() {
        return this.LJLIL;
    }

    CWC(int i) {
        this.LJLIL = r1;
    }
}
