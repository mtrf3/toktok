package com.ss.bytertc.engine.video;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoDecoderConfig {
    VIDEO_DECODER_CONFIG_RAW(0),
    VIDEO_DECODER_CONFIG_ENCODE(1),
    VIDEO_DECODER_CONFIG_BOTH(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoDecoderConfig fromId(int i) {
        for (VideoDecoderConfig videoDecoderConfig : values()) {
            if (videoDecoderConfig.value() == i) {
                return videoDecoderConfig;
            }
        }
        return null;
    }

    public static VideoDecoderConfig valueOf(String str) {
        return (VideoDecoderConfig) V0N.LJJJ(VideoDecoderConfig.class, str);
    }

    VideoDecoderConfig(int i) {
        this.value = i;
    }
}
