package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalNetworkQualityInfo;

/* loaded from: classes33.dex */
public class NetworkQualityStats {
    public double fractionLost;
    public int rtt;
    public int rxQuality;
    public int totalBandwidth;
    public int txQuality;
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
        LIZ.append(",txQuality=");
        LIZ.append(this.txQuality);
        LIZ.append(",rxQuality=");
        LIZ.append(this.rxQuality);
        return X1D.LIZIZ(LIZ);
    }

    public NetworkQualityStats(InternalNetworkQualityInfo internalNetworkQualityInfo) {
        this.uid = internalNetworkQualityInfo.uid;
        this.fractionLost = internalNetworkQualityInfo.fractionLost;
        this.rtt = internalNetworkQualityInfo.rtt;
        this.totalBandwidth = internalNetworkQualityInfo.totalBandwidth;
        this.txQuality = internalNetworkQualityInfo.txNetQuality;
        this.rxQuality = internalNetworkQualityInfo.rxNetQuality;
    }

    public NetworkQualityStats(String str, double d, int i, int i2, int i3, int i4) {
        this.uid = str;
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txQuality = i3;
        this.rxQuality = i4;
    }
}
