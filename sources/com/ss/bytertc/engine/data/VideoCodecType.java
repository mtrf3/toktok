package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoCodecType {
    VIDEO_CODEC_TYPE_UNKNOWN(0),
    VIDEO_CODEC_TYPE_H264(1),
    VIDEO_CODEC_TYPE_BYTEVC1(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoCodecType fromId(int i) {
        for (VideoCodecType videoCodecType : values()) {
            if (videoCodecType.value() == i) {
                return videoCodecType;
            }
        }
        return null;
    }

    public static VideoCodecType valueOf(String str) {
        return (VideoCodecType) V0N.LJJJ(VideoCodecType.class, str);
    }

    VideoCodecType(int i) {
        this.value = i;
    }
}
