package X;

/* loaded from: classes9.dex */
public enum ILS {
    PREPARING,
    PREPARED,
    STOPPED,
    PLAYING,
    BUFFERING,
    PAUSED,
    COMPLETED,
    UNKNOWN;

    public static ILS valueOf(String str) {
        return (ILS) V0N.LJJJ(ILS.class, str);
    }
}
