package X;

/* renamed from: X.VBy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79342VBy {
    UNKNOWN,
    PLAYER_PREPARED,
    COMPLETE_PLAY,
    MEDIA_ERROR,
    DISPLAYED_PLAY,
    STOP_WHEN_PLAYING_OTHER,
    STOP_WHEN_JOIN_INTERACT,
    BUFFERING_START,
    BUFFERING_END,
    INTERACT_SEI,
    VIDEO_SIZE_CHANGED,
    START_SWITCH_RESOLUTION,
    PLAYER_DETACHED,
    RESOLUTION_DEGRADE,
    ABR_NEW_RESOLUTION,
    TEXTURE_RENDER_DRAW_FRAME;

    public static EnumC79342VBy valueOf(int i) {
        if (i < 0 || i >= values().length) {
            return UNKNOWN;
        }
        return values()[i];
    }

    public static EnumC79342VBy valueOf(String str) {
        return (EnumC79342VBy) V0N.LJJJ(EnumC79342VBy.class, str);
    }
}
