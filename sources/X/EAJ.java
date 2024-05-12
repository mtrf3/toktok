package X;

/* loaded from: classes7.dex */
public enum EAJ {
    CONTROL(1),
    TREATMENT(2);

    public static final EAK Companion = new EAK();
    public final int LJLIL;

    public static EAJ valueOf(String str) {
        return (EAJ) V0N.LJJJ(EAJ.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EAJ(int i) {
        this.LJLIL = i;
    }
}
