package com.bytedance.hmp;

import X.V0N;

/* loaded from: classes34.dex */
public enum DeviceType {
    kCPU(0),
    kCUDA(1);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) V0N.LJJJ(DeviceType.class, str);
    }

    DeviceType(int i) {
        this.value = i;
    }
}
