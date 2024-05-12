package X;

/* loaded from: classes19.dex */
public enum ZUA {
    INVALID,
    INIT,
    LOADING,
    LOAD,
    START,
    RUN,
    STOPPING,
    STOP,
    QUITTING;

    public static ZUA valueOf(String str) {
        return (ZUA) V0N.LJJJ(ZUA.class, str);
    }
}
