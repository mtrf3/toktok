package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoRotation {
    VIDEO_ROTATION_0(0),
    VIDEO_ROTATION_90(90),
    VIDEO_ROTATION_180(180),
    VIDEO_ROTATION_270(270);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoRotation fromId(int i) {
        for (VideoRotation videoRotation : values()) {
            if (videoRotation.value() == i) {
                return videoRotation;
            }
        }
        return null;
    }

    public static VideoRotation valueOf(String str) {
        return (VideoRotation) V0N.LJJJ(VideoRotation.class, str);
    }

    VideoRotation(int i) {
        this.value = i;
    }
}
