package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum ScreenMediaType {
    SCREEN_MEDIA_TYPE_VIDEO_ONLY(0),
    SCREEN_MEDIA_TYPE_AUDIO_ONLY(1),
    SCREEN_MEDIA_TYPE_VIDEO_AND_AUDIO(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static ScreenMediaType fromId(int i) {
        for (ScreenMediaType screenMediaType : values()) {
            if (screenMediaType.value() == i) {
                return screenMediaType;
            }
        }
        return null;
    }

    public static ScreenMediaType valueOf(String str) {
        return (ScreenMediaType) V0N.LJJJ(ScreenMediaType.class, str);
    }

    ScreenMediaType(int i) {
        this.value = i;
    }
}
