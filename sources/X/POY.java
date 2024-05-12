package X;

/* loaded from: classes12.dex */
public enum POY {
    UNKNOWN_LOG(-1),
    ORIGIN_LOG(0),
    APP_LOG(1),
    APM_NET_API_LOG(2),
    APM_EVENT_LOG(3),
    ALOG(10);

    public final int LJLIL;

    public static POY valueOf(String str) {
        return (POY) V0N.LJJJ(POY.class, str);
    }

    public final int getCategory() {
        return this.LJLIL;
    }

    POY(int i) {
        this.LJLIL = i;
    }
}
