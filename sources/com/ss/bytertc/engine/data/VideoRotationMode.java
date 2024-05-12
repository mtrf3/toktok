package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoRotationMode {
    FOLLOW_APP(0),
    FOLLOW_GSENSOR(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == FOLLOW_GSENSOR) {
            return "kVideoRotationModeFollowGSensor";
        }
        return "kVideoRotationModeFollowApp";
    }

    public int value() {
        return this.value;
    }

    public static VideoRotationMode fromId(int i) {
        for (VideoRotationMode videoRotationMode : values()) {
            if (videoRotationMode.value() == i) {
                return videoRotationMode;
            }
        }
        return null;
    }

    public static VideoRotationMode valueOf(String str) {
        return (VideoRotationMode) V0N.LJJJ(VideoRotationMode.class, str);
    }

    VideoRotationMode(int i) {
        this.value = i;
    }
}
