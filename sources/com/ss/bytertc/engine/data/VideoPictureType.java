package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoPictureType {
    VIDEO_PICTURE_TYPE_UNKNOWN(0),
    VIDEO_PICTURE_TYPE_I(1),
    VIDEO_PICTURE_TYPE_P(2),
    VIDEO_PICTURE_TYPE_B(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoPictureType fromId(int i) {
        for (VideoPictureType videoPictureType : values()) {
            if (videoPictureType.value() == i) {
                return videoPictureType;
            }
        }
        return null;
    }

    public static VideoPictureType valueOf(String str) {
        return (VideoPictureType) V0N.LJJJ(VideoPictureType.class, str);
    }

    VideoPictureType(int i) {
        this.value = i;
    }
}
