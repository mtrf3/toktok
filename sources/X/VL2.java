package X;

/* loaded from: classes15.dex */
public enum VL2 {
    CLICK_CONTINUE("click_continue"),
    GO_BACK("go_back");

    public final String LJLIL;

    public static VL2 valueOf(String str) {
        return (VL2) V0N.LJJJ(VL2.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    VL2(String str) {
        this.LJLIL = str;
    }
}
