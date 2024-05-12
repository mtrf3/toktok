package X;

/* loaded from: classes15.dex */
public enum VCI {
    ENABLE_UP_CTL(1),
    ENABLE_DOWN_LOGGER(2),
    ENABLE_DOWN_TEA(4),
    ENABLE_DOWN_VLM_EXE(8);

    public final int LJLIL;

    public static VCI valueOf(String str) {
        return (VCI) V0N.LJJJ(VCI.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    VCI(int i) {
        this.LJLIL = i;
    }
}
