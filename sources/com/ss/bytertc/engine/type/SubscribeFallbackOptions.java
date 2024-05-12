package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum SubscribeFallbackOptions {
    SUBSCRIBE_FALLBACK_OPTIONS_DISABLED(0),
    SUBSCRIBE_FALLBACK_OPTIONS_STREAM_LOW(1),
    SUBSCRIBE_FALLBACK_OPTIONS_AUDIO_ONLY(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubscribeFallbackOptions fromId(int i) {
        for (SubscribeFallbackOptions subscribeFallbackOptions : values()) {
            if (subscribeFallbackOptions.value() == i) {
                return subscribeFallbackOptions;
            }
        }
        return null;
    }

    public static SubscribeFallbackOptions valueOf(String str) {
        return (SubscribeFallbackOptions) V0N.LJJJ(SubscribeFallbackOptions.class, str);
    }

    SubscribeFallbackOptions(int i) {
        this.value = i;
    }
}
