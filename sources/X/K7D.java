package X;

/* loaded from: classes9.dex */
public enum K7D {
    SYSTEM_BACK_METHOD(0),
    PRESS_LEFT_BACK(1),
    PRESS_CLEAR(2),
    OTHERS(-1);

    public final int LJLIL;

    public static K7D valueOf(String str) {
        return (K7D) V0N.LJJJ(K7D.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    K7D(int i) {
        this.LJLIL = i;
    }
}
