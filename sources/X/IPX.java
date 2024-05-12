package X;

/* loaded from: classes9.dex */
public enum IPX {
    PLAYER_BUFFERING,
    PLAYER_IDLE,
    PLAYER_PREPARE,
    PLAYER_START,
    PLAYER_PAUSE;

    public static IPX valueOf(String str) {
        return (IPX) V0N.LJJJ(IPX.class, str);
    }
}
