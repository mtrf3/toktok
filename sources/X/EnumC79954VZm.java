package X;

/* renamed from: X.VZm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79954VZm {
    PLAYBACK_STATE_START,
    PLAYBACK_STATE_PLAYING,
    PLAYBACK_STATE_PAUSED,
    PLAYBACK_STATE_STOPPED,
    PLAYBACK_STATE_ERROR;

    public static EnumC79954VZm valueOf(String str) {
        return (EnumC79954VZm) V0N.LJJJ(EnumC79954VZm.class, str);
    }

    public final boolean isPlayingState() {
        int i = C79953VZl.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }
}
