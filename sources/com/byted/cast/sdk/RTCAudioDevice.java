package com.byted.cast.sdk;

import X.V0N;

/* loaded from: classes29.dex */
public enum RTCAudioDevice {
    SPEAKER(0),
    EARPIECE(1),
    WIRED_HEADSET(2),
    BLUETOOTH(3),
    NONE(-1);

    public final int value;

    public int value() {
        return this.value;
    }

    public static RTCAudioDevice valueOf(String str) {
        return (RTCAudioDevice) V0N.LJJJ(RTCAudioDevice.class, str);
    }

    RTCAudioDevice(int i) {
        this.value = i;
    }
}
