package com.bytedance.bdlocation.network.model;

import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes7.dex */
public class PlaceInfo {

    @InterfaceC65349Pkn("ASCIName")
    public String asciName;

    @InterfaceC65349Pkn("Code")
    public String code;

    @InterfaceC65349Pkn("GeoNameID")
    public long geoNameID;

    @InterfaceC65349Pkn("LocalID")
    public String localID;

    @InterfaceC65349Pkn("MetropolitanCode")
    public String metropolitanCode;

    @InterfaceC65349Pkn("Name")
    public String name;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaceInfo{code='");
        Q89.LIZIZ(LIZ, this.code, '\'', ", geoNameID=");
        LIZ.append(this.geoNameID);
        LIZ.append(", asciName='");
        Q89.LIZIZ(LIZ, this.asciName, '\'', ", name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", localID='");
        Q89.LIZIZ(LIZ, this.localID, '\'', ", metropolitanCode='");
        return C77800Ug8.LIZJ(LIZ, this.metropolitanCode, '\'', '}', LIZ);
    }
}
