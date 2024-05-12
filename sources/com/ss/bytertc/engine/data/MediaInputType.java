package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MediaInputType {
    MEDIA_INPUT_TYPE_EXTERNAL(0),
    MEDIA_INPUT_TYPE_INTERNAL(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static MediaInputType fromId(int i) {
        for (MediaInputType mediaInputType : values()) {
            if (mediaInputType.value() == i) {
                return mediaInputType;
            }
        }
        return null;
    }

    public static MediaInputType valueOf(String str) {
        return (MediaInputType) V0N.LJJJ(MediaInputType.class, str);
    }

    MediaInputType(int i) {
        this.value = i;
    }
}
