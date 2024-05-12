package X;

/* loaded from: classes8.dex */
public enum HRG {
    START(0),
    SUCCESS(1),
    FAILED(2),
    CANCELLED(3);

    public final int LJLIL;

    public static HRG valueOf(String str) {
        return (HRG) V0N.LJJJ(HRG.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    HRG(int i) {
        this.LJLIL = i;
    }
}
