package X;

/* loaded from: classes10.dex */
public enum M3C {
    NETWORK_ERROR(1001),
    API_ERROR(1002),
    NO_RESULT_SEE_MORE(1003),
    NO_RESULT_COME_BACK(1004);

    public final int LJLIL;

    public static M3C valueOf(String str) {
        return (M3C) V0N.LJJJ(M3C.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    M3C(int i) {
        this.LJLIL = i;
    }
}
