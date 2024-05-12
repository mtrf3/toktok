package X;

/* loaded from: classes9.dex */
public enum KD4 {
    SINGLE_LINE_HINT(1),
    TWO_LINE_HINT(2),
    TWO_LINE_ALL(3);

    public final int LJLIL;

    public static KD4 valueOf(String str) {
        return (KD4) V0N.LJJJ(KD4.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    KD4(int i) {
        this.LJLIL = i;
    }
}
