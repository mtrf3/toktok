package com.bytedance.bdlocation.entity.bpea;

/* loaded from: classes16.dex */
public class BDDecryptLocation {
    public double mLatitude;
    public double mLongitude;

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public void setLatitude(double d) {
        this.mLatitude = d;
    }

    public void setLongitude(double d) {
        this.mLongitude = d;
    }

    public BDDecryptLocation(double d, double d2) {
        this.mLatitude = d;
        this.mLongitude = d2;
    }
}
