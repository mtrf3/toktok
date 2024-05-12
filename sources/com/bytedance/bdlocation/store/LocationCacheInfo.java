package com.bytedance.bdlocation.store;

import X.X1D;
import com.bytedance.bdlocation.BDExtraLatLng;
import com.bytedance.bdlocation.BDLocation;

/* loaded from: classes16.dex */
public class LocationCacheInfo {
    public BDExtraLatLng mExtraLatLng;
    public BDLocation mLatestLocation;
    public BDLocation mMockLocation;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationCacheInfo{, mLatestLocation=");
        LIZ.append(this.mLatestLocation);
        LIZ.append(", mMockLocation=");
        LIZ.append(this.mMockLocation);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public BDExtraLatLng getExtraLatLng() {
        return this.mExtraLatLng;
    }

    public BDLocation getLatestLocation() {
        return this.mLatestLocation;
    }

    public BDLocation getMockLocation() {
        return this.mMockLocation;
    }

    public void setExtraLatLng(BDExtraLatLng bDExtraLatLng) {
        this.mExtraLatLng = bDExtraLatLng;
    }

    public void setLatestLocation(BDLocation bDLocation) {
        this.mLatestLocation = bDLocation;
    }

    public void setMockLocation(BDLocation bDLocation) {
        this.mMockLocation = bDLocation;
    }
}
