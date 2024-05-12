package X;

/* loaded from: classes16.dex */
public enum Y2L {
    NOT_EXIST(0),
    TO_BE_TRANSLATED(1),
    NOT_TRANSLATABLE(2),
    TRANSLATION_NOT_TRIGGERED(3);

    public final int LJLIL;

    public static Y2L valueOf(String str) {
        return (Y2L) V0N.LJJJ(Y2L.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    Y2L(int i) {
        this.LJLIL = i;
    }
}
