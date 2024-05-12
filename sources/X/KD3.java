package X;

/* loaded from: classes9.dex */
public enum KD3 {
    SINGLE_LINE_HINT(1),
    TWO_LINE_HINT(2),
    TWO_LINE_ALL(3);

    public final int LJLIL;

    public static KD3 valueOf(String str) {
        return (KD3) V0N.LJJJ(KD3.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    KD3(int i) {
        this.LJLIL = i;
    }
}
