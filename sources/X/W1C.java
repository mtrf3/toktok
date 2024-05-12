package X;

/* loaded from: classes15.dex */
public enum W1C {
    LOADING(0),
    PLAY(1),
    FAIL(2),
    NETWORK_ERROR(3);

    public final int LJLIL;

    public static W1C valueOf(String str) {
        return (W1C) V0N.LJJJ(W1C.class, str);
    }

    public final int getState() {
        return this.LJLIL;
    }

    W1C(int i) {
        this.LJLIL = i;
    }
}
