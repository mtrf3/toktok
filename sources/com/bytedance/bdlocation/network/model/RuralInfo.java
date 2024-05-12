package com.bytedance.bdlocation.network.model;

import X.C62850Ola;
import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes7.dex */
public class RuralInfo {

    @InterfaceC65349Pkn("ASCIName")
    public String asciName;

    @InterfaceC65349Pkn("Code")
    public String code;

    @InterfaceC65349Pkn("GeoNameID")
    public long geoNameID;

    @InterfaceC65349Pkn("LocalID")
    public String localID;

    @InterfaceC65349Pkn("Name")
    public String name;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Town{code=");
        Q89.LIZIZ(LIZ, this.code, '\'', ", geoNameID='");
        C62850Ola.LJIIIIZZ(LIZ, this.geoNameID, '\'', ", asciName='");
        Q89.LIZIZ(LIZ, this.asciName, '\'', ", name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", localID='");
        return C77800Ug8.LIZJ(LIZ, this.localID, '\'', '}', LIZ);
    }
}
