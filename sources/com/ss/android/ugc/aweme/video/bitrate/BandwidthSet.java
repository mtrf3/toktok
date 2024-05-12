package com.ss.android.ugc.aweme.video.bitrate;

import X.C07670Rv;
import X.InterfaceC46947Ibf;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes9.dex */
public class BandwidthSet implements InterfaceC46947Ibf {

    @InterfaceC65349Pkn("bitrate")
    public double bitRate;

    @InterfaceC65349Pkn("speed")
    public double speed;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BandwidthSet{speed=");
        LIZ.append(this.speed);
        LIZ.append(", bitRate=");
        return C07670Rv.LIZ(LIZ, this.bitRate, '}', LIZ);
    }

    @Override // X.InterfaceC46947Ibf
    public double getBitrate() {
        return this.bitRate;
    }

    @Override // X.InterfaceC46947Ibf
    public double getSpeed() {
        return this.speed;
    }

    public void setBitRate(long j) {
        this.bitRate = j;
    }

    public void setSpeed(int i) {
        this.speed = i;
    }
}
