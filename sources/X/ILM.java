package X;

/* loaded from: classes9.dex */
public enum ILM {
    SUCCESS(1),
    FAILURE(2),
    SWITCH_VIDEO(3);

    public final int LJLIL;

    public static ILM valueOf(String str) {
        return (ILM) V0N.LJJJ(ILM.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    ILM(int i) {
        this.LJLIL = i;
    }
}
