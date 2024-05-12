package X;

/* loaded from: classes10.dex */
public enum L83 {
    PRE_CHECK("pre_check"),
    FINAL_CHECK("final_check");

    public final String LJLIL;

    public static L83 valueOf(String str) {
        return (L83) V0N.LJJJ(L83.class, str);
    }

    public final String getStageStr() {
        return this.LJLIL;
    }

    L83(String str) {
        this.LJLIL = str;
    }
}
