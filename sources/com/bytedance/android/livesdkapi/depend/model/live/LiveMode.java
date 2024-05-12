package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import X.V0N;

/* loaded from: classes6.dex */
public enum LiveMode {
    VIDEO("video_live", false, true),
    AUDIO("audio", false, false),
    THIRD_PARTY("third_party", true, false),
    SCREEN_RECORD("screen_share", true, false),
    LIVE_STUDIO("live_studio", false, false),
    OFFICIAL_ACTIVITY("official_activity", false, false),
    LIVE_VOICE("live_voice", false, false);


    @InterfaceC65349Pkn("isStreamingBackground")
    public final boolean isStreamingBackground;

    @InterfaceC65349Pkn("isUsingCamera")
    public final boolean isUsingCamera;

    @InterfaceC65349Pkn("logStreamingType")
    public final String logStreamingType;

    public String getModeFromServer() {
        if (this == VIDEO) {
            return "live";
        }
        if (this == SCREEN_RECORD) {
            return "live_by_record";
        }
        if (this == THIRD_PARTY) {
            return "computer";
        }
        if (this == LIVE_VOICE) {
            return "live_voice";
        }
        return "";
    }

    public static boolean isWatchGameLiveOrPCLive(LiveMode liveMode) {
        if (liveMode == THIRD_PARTY || liveMode == SCREEN_RECORD || liveMode == LIVE_STUDIO) {
            return true;
        }
        return false;
    }

    public static LiveMode valueOf(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        return VIDEO;
    }

    public static LiveMode valueOf(String str) {
        return (LiveMode) V0N.LJJJ(LiveMode.class, str);
    }

    LiveMode(String str, boolean z, boolean z2) {
        this.logStreamingType = str;
        this.isStreamingBackground = z;
        this.isUsingCamera = z2;
    }
}
