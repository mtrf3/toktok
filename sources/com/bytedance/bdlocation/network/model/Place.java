package com.bytedance.bdlocation.network.model;

import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import java.util.List;

/* loaded from: classes7.dex */
public class Place {

    @InterfaceC65349Pkn("AddressLines")
    public List<String> addressLines;

    @InterfaceC65349Pkn("AdminArea")
    public String adminArea;

    @InterfaceC65349Pkn("AreasOfInterest")
    public List<String> areasOfInterest;

    @InterfaceC65349Pkn("FeatureCode")
    public String featureCode;

    @InterfaceC65349Pkn("GeoNameID")
    public String geoNameID;

    @InterfaceC65349Pkn("Locality")
    public String locality;

    @InterfaceC65349Pkn("Name")
    public String name;

    @InterfaceC65349Pkn("PostalCode")
    public String postalCode;

    @InterfaceC65349Pkn("SubAdminArea")
    public String subAdminArea;

    @InterfaceC65349Pkn("SubLocality")
    public String subLocality;

    @InterfaceC65349Pkn("SubThoroughfare")
    public String subThoroughfare;

    @InterfaceC65349Pkn("TimeZone")
    public String timeZone;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Place{addressLines=");
        LIZ.append(this.addressLines);
        LIZ.append(", adminArea='");
        Q89.LIZIZ(LIZ, this.adminArea, '\'', ", name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", areasOfInterest='");
        LIZ.append(this.areasOfInterest);
        LIZ.append('\'');
        LIZ.append(", subAdminArea='");
        Q89.LIZIZ(LIZ, this.subAdminArea, '\'', ", locality='");
        Q89.LIZIZ(LIZ, this.locality, '\'', ", subLocality='");
        Q89.LIZIZ(LIZ, this.subLocality, '\'', ", subThoroughfare='");
        Q89.LIZIZ(LIZ, this.subThoroughfare, '\'', ", postalCode='");
        Q89.LIZIZ(LIZ, this.postalCode, '\'', ", featureCode='");
        Q89.LIZIZ(LIZ, this.featureCode, '\'', ", geoNameID='");
        Q89.LIZIZ(LIZ, this.geoNameID, '\'', ", timeZone='");
        return C77800Ug8.LIZJ(LIZ, this.timeZone, '\'', '}', LIZ);
    }
}
