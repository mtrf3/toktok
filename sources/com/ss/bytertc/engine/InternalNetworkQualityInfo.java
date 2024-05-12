package com.ss.bytertc.engine;

import X.X1D;

/* loaded from: classes33.dex */
public class InternalNetworkQualityInfo {
    public double fractionLost;
    public int rtt;
    public int rxNetQuality;
    public int totalBandwidth;
    public int txNetQuality;
    public String uid;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uid=");
        LIZ.append(this.uid);
        LIZ.append(",fractionLost=");
        LIZ.append(this.fractionLost);
        LIZ.append(",rtt=");
        LIZ.append(this.rtt);
        LIZ.append(",totalBandwidth=");
        LIZ.append(this.totalBandwidth);
        LIZ.append(",txNetQuality=");
        LIZ.append(this.txNetQuality);
        LIZ.append(",rxNetQuality=");
        LIZ.append(this.rxNetQuality);
        return X1D.LIZIZ(LIZ);
    }

    public InternalNetworkQualityInfo(double d, int i, int i2, int i3, int i4) {
        this.uid = "";
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txNetQuality = i3;
        this.rxNetQuality = i4;
    }

    public InternalNetworkQualityInfo(String str, double d, int i, int i2, int i3, int i4) {
        this.uid = str;
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txNetQuality = i3;
        this.rxNetQuality = i4;
    }

    public static InternalNetworkQualityInfo create(String str, double d, int i, int i2, int i3, int i4) {
        return new InternalNetworkQualityInfo(str, d, i, i2, i3, i4);
    }
}
