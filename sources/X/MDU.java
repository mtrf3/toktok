package X;

/* loaded from: classes10.dex */
public enum MDU {
    DEFAULT(-1),
    REQUEST_START(0),
    RESPONSE_IN_TIME(1),
    RESPONSE_IN_TIME_NO_NET(2),
    RESPONSE_TIMEOUT(3);

    public final int LJLIL;

    public static MDU valueOf(String str) {
        return (MDU) V0N.LJJJ(MDU.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    MDU(int i) {
        this.LJLIL = i;
    }
}
