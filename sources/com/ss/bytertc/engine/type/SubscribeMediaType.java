package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum SubscribeMediaType {
    NONE(0),
    AUDIO_ONLY(1),
    VIDEO_ONLY(2),
    AUDIO_AND_VIDEO(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubscribeMediaType valueOf(String str) {
        return (SubscribeMediaType) V0N.LJJJ(SubscribeMediaType.class, str);
    }

    SubscribeMediaType(int i) {
        this.value = i;
    }
}
