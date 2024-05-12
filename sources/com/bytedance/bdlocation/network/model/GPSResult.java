package com.bytedance.bdlocation.network.model;

import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes15.dex */
public class GPSResult {

    @InterfaceC65349Pkn("Accuracy")
    public String accuracy;

    @InterfaceC65349Pkn("CoordinateSystem")
    public String coordinateSystem;

    @InterfaceC65349Pkn("Latitude")
    public double latitude;

    @InterfaceC65349Pkn("Longitude")
    public double longitude;

    @InterfaceC65349Pkn("Timestamp")
    public String timestamp;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GPSResult{accuracy='");
        Q89.LIZIZ(LIZ, this.accuracy, '\'', ", latitude=");
        LIZ.append(this.latitude);
        LIZ.append(", longitude=");
        LIZ.append(this.longitude);
        LIZ.append(", timestamp='");
        Q89.LIZIZ(LIZ, this.timestamp, '\'', ", coordinateSystem='");
        return C77800Ug8.LIZJ(LIZ, this.coordinateSystem, '\'', '}', LIZ);
    }
}
