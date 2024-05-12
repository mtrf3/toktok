package X;

/* loaded from: classes16.dex */
public enum YML {
    WS_MSG_ORIGIN,
    WS_ORIGIN,
    ORIGIN;

    public static final YMU Companion = new YMU();

    public static YML valueOf(String str) {
        return (YML) V0N.LJJJ(YML.class, str);
    }

    public final String getStrategy(boolean z) {
        int i = YMQ.LIZ[ordinal()];
        if (i != 1) {
            if (i == 2 && z) {
                return "ws";
            }
            return "origin_http";
        }
        if (z) {
            return "ws";
        }
        return "room_http";
    }
}
