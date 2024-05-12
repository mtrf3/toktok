package X;

/* loaded from: classes7.dex */
public enum EAL {
    CONTROL(0),
    TREATMENT_1(1),
    TREATMENT_2(2),
    TREATMENT_3(3),
    TREATMENT_4(4);

    public static final EAM Companion = new EAM();
    public final int LJLIL;

    public static EAL valueOf(String str) {
        return (EAL) V0N.LJJJ(EAL.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EAL(int i) {
        this.LJLIL = i;
    }
}
