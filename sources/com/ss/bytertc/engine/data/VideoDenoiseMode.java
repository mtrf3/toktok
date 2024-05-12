package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoDenoiseMode {
    VIDEO_DENOISE_MODE_OFF(0),
    VIDEO_DENOISE_MODE_AUTO(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i != 0) {
            if (i != 1) {
                return "";
            }
            return "kVideoDenoiseModeAuto";
        }
        return "kVideoDenoiseModeOff";
    }

    public int value() {
        return this.value;
    }

    public static VideoDenoiseMode fromId(int i) {
        for (VideoDenoiseMode videoDenoiseMode : values()) {
            if (videoDenoiseMode.value() == i) {
                return videoDenoiseMode;
            }
        }
        return null;
    }

    public static VideoDenoiseMode valueOf(String str) {
        return (VideoDenoiseMode) V0N.LJJJ(VideoDenoiseMode.class, str);
    }

    VideoDenoiseMode(int i) {
        this.value = i;
    }
}
