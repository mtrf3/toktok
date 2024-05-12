package com.bytedance.bdlocation.network.model;

import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes15.dex */
public class BdLBSResult {

    @InterfaceC65349Pkn("BaseResp")
    public BaseResp baseResp;

    @InterfaceC65349Pkn("DeviceIdLocation")
    public LocationResult deviceIdLocation;

    @InterfaceC65349Pkn("GPSLocation")
    public LocationResult gpsLocation;

    @InterfaceC65349Pkn("IPLocation")
    public LocationResult ipLocation;

    @InterfaceC65349Pkn("Location")
    public LocationResult location;

    @InterfaceC65349Pkn("UserSelectedLocation")
    public LocationResult userSelectedLocation;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BdLBSResult{location=");
        LIZ.append(this.location);
        LIZ.append(", ipLocation=");
        LIZ.append(this.ipLocation);
        LIZ.append(", deviceIdLocation=");
        LIZ.append(this.deviceIdLocation);
        LIZ.append(", userSelectedLocation=");
        LIZ.append(this.userSelectedLocation);
        LIZ.append(", gpsLocation=");
        LIZ.append(this.gpsLocation);
        LIZ.append(", baseResp=");
        LIZ.append(this.baseResp);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
