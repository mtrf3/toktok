package com.bytedance.bdlocation.network.model;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.bytedance.bdlocation.entity.PoiInfoEntity;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes15.dex */
public class LocationResult {

    @InterfaceC65349Pkn("AoiInfos")
    public List<PoiInfoEntity> aoiList;

    @InterfaceC65349Pkn("City")
    public PlaceInfo city;

    @InterfaceC65349Pkn("Continent")
    public PlaceInfo continent;

    @InterfaceC65349Pkn("Country")
    public PlaceInfo country;

    @InterfaceC65349Pkn("District")
    public PlaceInfo district;

    @InterfaceC65349Pkn("GPS")
    public GPSResult gps;

    @InterfaceC65349Pkn("IsDisputed")
    public boolean isDisputed;

    @InterfaceC65349Pkn("ISP")
    public String isp;

    @InterfaceC65349Pkn("LocateMethod")
    public String locateMethod;

    @InterfaceC65349Pkn("Place")
    public Place place;

    @InterfaceC65349Pkn("PoiInfos")
    public List<PoiInfoEntity> poiList;

    @InterfaceC65349Pkn("Subdivisions")
    public PlaceInfo[] subdivisions;

    @InterfaceC65349Pkn("Timestamp")
    public String timestamp;

    @InterfaceC65349Pkn("Town")
    public RuralInfo town;

    @InterfaceC65349Pkn("Village")
    public RuralInfo village;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationResult{continent=");
        LIZ.append(this.continent);
        LIZ.append(", country=");
        LIZ.append(this.country);
        LIZ.append(", subdivisions=");
        LIZ.append(Arrays.toString(this.subdivisions));
        LIZ.append(", city=");
        LIZ.append(this.city);
        LIZ.append(", district=");
        LIZ.append(this.district);
        LIZ.append(", place=");
        LIZ.append(this.place);
        LIZ.append(", gps=");
        LIZ.append(this.gps);
        LIZ.append(", isp='");
        Q89.LIZIZ(LIZ, this.isp, '\'', ", locateMethod='");
        Q89.LIZIZ(LIZ, this.locateMethod, '\'', ", isDisputed='");
        LIZ.append(this.isDisputed);
        LIZ.append('\'');
        LIZ.append(", timestamp='");
        Q89.LIZIZ(LIZ, this.timestamp, '\'', ", town'");
        LIZ.append(this.town);
        LIZ.append('\'');
        LIZ.append(", PoiInfos'");
        LIZ.append(this.poiList);
        LIZ.append('\'');
        LIZ.append(", AoiInfos'");
        LIZ.append(this.aoiList);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
