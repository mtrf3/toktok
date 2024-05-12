package com.ss.bytertc.engine.device;

import X.X1D;

/* loaded from: classes33.dex */
public class MediaDeviceInfo {
    public DeviceError error;
    public String message;
    public DeviceState state;
    public DeviceType type;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[type=");
        LIZ.append(this.type);
        LIZ.append(", state=");
        LIZ.append(this.state);
        LIZ.append(", error=");
        LIZ.append(this.error);
        LIZ.append(", msg=");
        LIZ.append(this.message);
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public MediaDeviceInfo(DeviceType deviceType, DeviceState deviceState, DeviceError deviceError, String str) {
        this.type = deviceType;
        this.state = deviceState;
        this.error = deviceError;
        this.message = str;
    }
}
