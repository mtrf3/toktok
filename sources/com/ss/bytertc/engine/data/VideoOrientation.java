package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoOrientation {
    ADAPTIVE(0),
    PORTRAIT(1),
    LANDSCAPE(2);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return "";
                }
                return "kVideoOrientationLandscape";
            }
            return "kVideoOrientationPortrait";
        }
        return "kVideoOrientationAdaptive";
    }

    public int value() {
        return this.value;
    }

    public static VideoOrientation fromId(int i) {
        for (VideoOrientation videoOrientation : values()) {
            if (videoOrientation.value() == i) {
                return videoOrientation;
            }
        }
        return null;
    }

    public static VideoOrientation valueOf(String str) {
        return (VideoOrientation) V0N.LJJJ(VideoOrientation.class, str);
    }

    VideoOrientation(int i) {
        this.value = i;
    }
}
