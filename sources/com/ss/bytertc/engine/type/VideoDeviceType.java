package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoDeviceType {
    VIDEO_DEVICE_TYPE_UNKNOWN(-1),
    VIDEO_DEVICE_TYPE_RENDER_DEVICE(0),
    VIDEO_DEVICE_TYPE_CAPTURE_DEVICE(1),
    VIDEO_DEVICE_TYPE_SCREEN_CAPTURE_DEVICE(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static VideoDeviceType fromId(int i) {
        for (VideoDeviceType videoDeviceType : values()) {
            if (videoDeviceType.value() == i) {
                return videoDeviceType;
            }
        }
        return VIDEO_DEVICE_TYPE_UNKNOWN;
    }

    public static VideoDeviceType valueOf(String str) {
        return (VideoDeviceType) V0N.LJJJ(VideoDeviceType.class, str);
    }

    VideoDeviceType(int i) {
        this.value = i;
    }
}
