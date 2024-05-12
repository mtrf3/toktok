package com.byted.cast.common.bean;

import X.X1D;

/* loaded from: classes29.dex */
public class DeviceOfflineDetectSettings {
    public long detectIntervalMills;
    public boolean enableDetect;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeviceOfflineDetectSettings{enableDetect=");
        LIZ.append(this.enableDetect);
        LIZ.append(", detectIntervalMills=");
        LIZ.append(this.detectIntervalMills);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public DeviceOfflineDetectSettings() {
    }

    public long getDetectIntervalMills() {
        return this.detectIntervalMills;
    }

    public boolean isEnableDetect() {
        return this.enableDetect;
    }

    public void setDetectIntervalMills(long j) {
        this.detectIntervalMills = j;
    }

    public void setEnableDetect(boolean z) {
        this.enableDetect = z;
    }

    public DeviceOfflineDetectSettings(boolean z, long j) {
        this.enableDetect = z;
        this.detectIntervalMills = j;
    }
}
