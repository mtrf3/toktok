package X;

/* renamed from: X.ZsY, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public enum EnumC91310ZsY {
    PLAYBACK_STATE_START,
    PLAYBACK_STATE_PLAYING,
    PLAYBACK_STATE_PAUSED,
    PLAYBACK_STATE_STOPPED,
    PLAYBACK_STATE_ERROR;

    public static EnumC91310ZsY valueOf(String str) {
        return (EnumC91310ZsY) V0N.LJJJ(EnumC91310ZsY.class, str);
    }

    public final boolean isPauseState() {
        if (this == PLAYBACK_STATE_PAUSED) {
            return true;
        }
        return false;
    }

    public final boolean isPlayingOrPause() {
        if (this == PLAYBACK_STATE_START || this == PLAYBACK_STATE_PLAYING || this == PLAYBACK_STATE_PAUSED) {
            return true;
        }
        return false;
    }

    public final boolean isPlayingState() {
        if (this == PLAYBACK_STATE_PLAYING) {
            return true;
        }
        return false;
    }

    public final boolean isStartState() {
        if (this == PLAYBACK_STATE_START) {
            return true;
        }
        return false;
    }

    public final boolean isStopState() {
        if (this == PLAYBACK_STATE_STOPPED) {
            return true;
        }
        return false;
    }

    public final boolean startPlaying() {
        if (this == PLAYBACK_STATE_PLAYING || this == PLAYBACK_STATE_START) {
            return true;
        }
        return false;
    }
}
