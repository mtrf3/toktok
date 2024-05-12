package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum PublishFallbackOption {
    DISABLE(0),
    SIMULCAST_SMALL_VIDEO_ONLY(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static PublishFallbackOption fromId(int i) {
        for (PublishFallbackOption publishFallbackOption : values()) {
            if (publishFallbackOption.value() == i) {
                return publishFallbackOption;
            }
        }
        return null;
    }

    public static PublishFallbackOption valueOf(String str) {
        return (PublishFallbackOption) V0N.LJJJ(PublishFallbackOption.class, str);
    }

    PublishFallbackOption(int i) {
        this.value = i;
    }
}
