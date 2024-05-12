package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoSuperResolutionMode {
    VIDEO_SUPER_RESOLUTION_MODE_OFF(0),
    VIDEO_SUPER_RESOLUTION_MODE_ON(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i != 0) {
            if (i != 1) {
                return "";
            }
            return "kVideoSuperResolutionModeOn";
        }
        return "kVideoSuperResolutionModeOff";
    }

    public int value() {
        return this.value;
    }

    public static VideoSuperResolutionMode fromId(int i) {
        for (VideoSuperResolutionMode videoSuperResolutionMode : values()) {
            if (videoSuperResolutionMode.value() == i) {
                return videoSuperResolutionMode;
            }
        }
        return null;
    }

    public static VideoSuperResolutionMode valueOf(String str) {
        return (VideoSuperResolutionMode) V0N.LJJJ(VideoSuperResolutionMode.class, str);
    }

    VideoSuperResolutionMode(int i) {
        this.value = i;
    }
}
