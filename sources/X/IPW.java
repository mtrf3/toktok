package X;

/* loaded from: classes9.dex */
public enum IPW {
    PLAYER_BUFFERING,
    PLAYER_IDLE,
    PLAYER_PREPARE,
    PLAYER_START,
    PLAYER_PAUSE;

    public static IPW valueOf(String str) {
        return (IPW) V0N.LJJJ(IPW.class, str);
    }
}
