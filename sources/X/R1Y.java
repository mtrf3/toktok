package X;

/* loaded from: classes12.dex */
public enum R1Y {
    UNKNOWN(1),
    FOREGROUND_CONNECTED(100),
    FOREGROUND_DISCONNECTED(101),
    FOREGROUND_ACTIVELY_DISCONNECTED(102),
    BACKGROUND_CONNECTED(103),
    BACKGROUND_DISCONNECTED(104),
    BACKGROUND_ACTIVELY_DISCONNECTED(105),
    LOOP(106),
    NO_NETWORK(107);

    public final int LJLIL;

    public static R1Y valueOf(String str) {
        return (R1Y) V0N.LJJJ(R1Y.class, str);
    }

    public final String field() {
        switch (C68866R1a.LIZ[ordinal()]) {
            case 1:
                return "foreground_online_time";
            case 2:
                return "foreground_offline_time";
            case 3:
                return "foreground_close_time";
            case 4:
                return "background_online_time";
            case 5:
                return "background_offline_time";
            case 6:
                return "background_close_time";
            default:
                return "prepare_time";
        }
    }

    public final int getValue() {
        return this.LJLIL;
    }

    R1Y(int i) {
        this.LJLIL = i;
    }
}
