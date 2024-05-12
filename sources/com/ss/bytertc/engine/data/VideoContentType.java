package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoContentType {
    NORMAL_FRAME(0),
    BLACK_FRAME(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == NORMAL_FRAME) {
            return "kVideoContentTypeNormalFrame";
        }
        return "kVideoContentTypeBlackFrame";
    }

    public int value() {
        return this.value;
    }

    public static VideoContentType fromId(int i) {
        for (VideoContentType videoContentType : values()) {
            if (videoContentType.value() == i) {
                return videoContentType;
            }
        }
        return null;
    }

    public static VideoContentType valueOf(String str) {
        return (VideoContentType) V0N.LJJJ(VideoContentType.class, str);
    }

    VideoContentType(int i) {
        this.value = i;
    }
}
