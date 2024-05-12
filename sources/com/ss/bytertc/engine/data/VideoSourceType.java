package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoSourceType {
    VIDEO_SOURCE_TYPE_EXTERNAL(0),
    VIDEO_SOURCE_TYPE_INTERNAL(1),
    VIDEO_SOURCE_TYPE_ENCODED_WITH_SIMULCAST(2),
    VIDEO_SOURCE_TYPE_ENCODED_WITHOUT_SIMULCAST(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoSourceType fromId(int i) {
        for (VideoSourceType videoSourceType : values()) {
            if (videoSourceType.value() == i) {
                return videoSourceType;
            }
        }
        return null;
    }

    public static VideoSourceType valueOf(String str) {
        return (VideoSourceType) V0N.LJJJ(VideoSourceType.class, str);
    }

    VideoSourceType(int i) {
        this.value = i;
    }
}
