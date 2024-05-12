package com.ss.android.ugc.aweme.video.bitrate;

import X.InterfaceC46969Ic1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes9.dex */
public class GearSet implements InterfaceC46969Ic1 {

    @InterfaceC65349Pkn("bit_rate")
    public int bitRate;

    @InterfaceC65349Pkn("network_lower")
    public int networkLower;

    @InterfaceC65349Pkn("network_upper")
    public int networkUpper;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GearSet{networkUpper=");
        LIZ.append(this.networkUpper);
        LIZ.append(", networkLower=");
        LIZ.append(this.networkLower);
        LIZ.append(", bitRate=");
        return b0.LIZJ(LIZ, this.bitRate, '}', LIZ);
    }

    @Override // X.InterfaceC46969Ic1
    public int getBitRate() {
        return this.bitRate;
    }

    @Override // X.InterfaceC46969Ic1
    public int getNetworkLower() {
        return this.networkLower;
    }

    @Override // X.InterfaceC46969Ic1
    public int getNetworkUpper() {
        return this.networkUpper;
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setNetworkLower(int i) {
        this.networkLower = i;
    }

    public void setNetworkUpper(int i) {
        this.networkUpper = i;
    }
}
