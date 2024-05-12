package com.ss.bytertc.engine.device;

import X.V0N;

/* loaded from: classes33.dex */
public enum DeviceType {
    MICROPHONE(0),
    SPEAKER(1),
    CAMERA(2);

    public int type;

    public int getId() {
        return this.type;
    }

    public static DeviceType fromId(int i) {
        for (DeviceType deviceType : values()) {
            if (deviceType.getId() == i) {
                return deviceType;
            }
        }
        return null;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) V0N.LJJJ(DeviceType.class, str);
    }

    DeviceType(int i) {
        this.type = i;
    }
}
