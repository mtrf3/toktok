package X;

/* loaded from: classes9.dex */
public enum ILD {
    IDLE,
    PREPARED,
    PLAYING,
    BUFFERING,
    PAUSED,
    FINISHED,
    FAILED;

    public static ILD valueOf(String str) {
        return (ILD) V0N.LJJJ(ILD.class, str);
    }
}
