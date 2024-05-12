package com.byted.cast.common.ble;

import X.X1D;

/* loaded from: classes29.dex */
public class BleData {
    public int ip;
    public int netMask;
    public int port;
    public int portMirror;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BleData{ip:");
        LIZ.append(BleUtils.getStringIp(this.ip));
        LIZ.append(", netMask:");
        LIZ.append(BleUtils.getStringIp(this.netMask));
        LIZ.append(", port:");
        LIZ.append(this.port);
        LIZ.append(", portMirror:");
        LIZ.append(this.portMirror);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public BleData() {
    }

    public int getIp() {
        return this.ip;
    }

    public int getNetMask() {
        return this.netMask;
    }

    public int getPort() {
        return this.port;
    }

    public int getPortMirror() {
        return this.portMirror;
    }

    public void setIp(int i) {
        this.ip = i;
    }

    public void setNetMask(int i) {
        this.netMask = i;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setPortMirror(int i) {
        this.portMirror = i;
    }

    public BleData(int i, int i2, int i3, int i4) {
        this.ip = i;
        this.netMask = i2;
        this.port = i3;
        this.portMirror = i4;
    }
}
