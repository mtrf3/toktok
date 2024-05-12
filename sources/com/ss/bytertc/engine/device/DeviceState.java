package com.ss.bytertc.engine.device;

import X.V0N;

/* loaded from: classes33.dex */
public enum DeviceState {
    INIT(0),
    START(1),
    STOP(2),
    REMOVE(3);

    public int type;

    public int getId() {
        return this.type;
    }

    public static DeviceState fromId(int i) {
        for (DeviceState deviceState : values()) {
            if (deviceState.getId() == i) {
                return deviceState;
            }
        }
        return null;
    }

    public static DeviceState valueOf(String str) {
        return (DeviceState) V0N.LJJJ(DeviceState.class, str);
    }

    DeviceState(int i) {
        this.type = i;
    }
}
