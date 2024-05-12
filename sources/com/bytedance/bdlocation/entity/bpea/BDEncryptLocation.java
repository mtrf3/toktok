package com.bytedance.bdlocation.entity.bpea;

/* loaded from: classes16.dex */
public class BDEncryptLocation {
    public String mLatitude;
    public String mLongitude;

    public String getLatitude() {
        return this.mLatitude;
    }

    public String getLongitude() {
        return this.mLongitude;
    }

    public void setLatitude(String str) {
        this.mLatitude = str;
    }

    public void setLongitude(String str) {
        this.mLongitude = str;
    }

    public BDEncryptLocation(String str, String str2) {
        this.mLatitude = str;
        this.mLongitude = str2;
    }
}
