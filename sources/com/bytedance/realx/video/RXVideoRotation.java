package com.bytedance.realx.video;

import X.V0N;

/* loaded from: classes33.dex */
public enum RXVideoRotation {
    VIDEO_ROTATION_0(0),
    VIDEO_ROTATION_90(90),
    VIDEO_ROTATION_180(180),
    VIDEO_ROTATION_270(270);

    public int value;

    public int value() {
        return this.value;
    }

    public static RXVideoRotation fromId(int i) {
        for (RXVideoRotation rXVideoRotation : values()) {
            if (rXVideoRotation.value() == i) {
                return rXVideoRotation;
            }
        }
        return null;
    }

    public static RXVideoRotation valueOf(String str) {
        return (RXVideoRotation) V0N.LJJJ(RXVideoRotation.class, str);
    }

    RXVideoRotation(int i) {
        this.value = i;
    }
}
