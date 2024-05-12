package com.bytedance.bdlocation.entity.gis;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.bdlocation.network.model.BaseResp;
import com.bytedance.bdlocation.network.model.LocationResult;

/* loaded from: classes15.dex */
public class BdGisResult {

    @InterfaceC65349Pkn("BaseResp")
    public BaseResp baseResp;

    @InterfaceC65349Pkn("IsDisputed")
    public boolean isDisputed;

    @InterfaceC65349Pkn("location")
    public LocationResult location;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BdGisResult{location=");
        LIZ.append(this.location);
        LIZ.append(", isDisputed=");
        LIZ.append(this.isDisputed);
        LIZ.append(", baseResp=");
        LIZ.append(this.baseResp);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
