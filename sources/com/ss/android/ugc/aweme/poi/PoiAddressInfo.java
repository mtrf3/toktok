package com.ss.android.ugc.aweme.poi;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiAddressInfo implements Serializable {

    @InterfaceC65349Pkn("city_code")
    public String cityCode;

    @InterfaceC65349Pkn("city_name")
    public String cityName;

    @InterfaceC65349Pkn("lat")
    public String lat;

    @InterfaceC65349Pkn("lng")
    public String lng;

    @InterfaceC65349Pkn("region_code")
    public String regionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiAddressInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PoiAddressInfo copy$default(PoiAddressInfo poiAddressInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiAddressInfo.cityName;
        }
        if ((i & 2) != 0) {
            str2 = poiAddressInfo.cityCode;
        }
        if ((i & 4) != 0) {
            str3 = poiAddressInfo.regionCode;
        }
        if ((i & 8) != 0) {
            str4 = poiAddressInfo.lng;
        }
        if ((i & 16) != 0) {
            str5 = poiAddressInfo.lat;
        }
        return poiAddressInfo.copy(str, str2, str3, str4, str5);
    }

    public final PoiAddressInfo copy(String str, String str2, String str3, String str4, String str5) {
        return new PoiAddressInfo(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAddressInfo)) {
            return false;
        }
        PoiAddressInfo poiAddressInfo = (PoiAddressInfo) obj;
        return o.LJ(this.cityName, poiAddressInfo.cityName) && o.LJ(this.cityCode, poiAddressInfo.cityCode) && o.LJ(this.regionCode, poiAddressInfo.regionCode) && o.LJ(this.lng, poiAddressInfo.lng) && o.LJ(this.lat, poiAddressInfo.lat);
    }

    public int hashCode() {
        String str = this.cityName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cityCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lng;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lat;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiAddressInfo(cityName=");
        LIZ.append(this.cityName);
        LIZ.append(", cityCode=");
        LIZ.append(this.cityCode);
        LIZ.append(", regionCode=");
        LIZ.append(this.regionCode);
        LIZ.append(", lng=");
        LIZ.append(this.lng);
        LIZ.append(", lat=");
        return q.LIZIZ(LIZ, this.lat, ')', LIZ);
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getLat() {
        return this.lat;
    }

    public final String getLng() {
        return this.lng;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public PoiAddressInfo(String str, String str2, String str3, String str4, String str5) {
        this.cityName = str;
        this.cityCode = str2;
        this.regionCode = str3;
        this.lng = str4;
        this.lat = str5;
    }

    public /* synthetic */ PoiAddressInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
