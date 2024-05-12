package X;

/* loaded from: classes16.dex */
public enum XOX {
    PLAYBACK_STATE_START,
    PLAYBACK_STATE_PLAYING,
    PLAYBACK_STATE_PAUSED,
    PLAYBACK_STATE_STOPPED,
    PLAYBACK_STATE_ERROR;

    public static XOX valueOf(String str) {
        return (XOX) V0N.LJJJ(XOX.class, str);
    }

    public final boolean isErrorState() {
        if (this == PLAYBACK_STATE_ERROR) {
            return true;
        }
        return false;
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
