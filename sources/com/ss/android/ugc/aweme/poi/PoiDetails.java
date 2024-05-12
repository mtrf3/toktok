package com.ss.android.ugc.aweme.poi;

import X.C07670Rv;
import X.C61447O9r;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetails implements Serializable {

    @InterfaceC65349Pkn("city_code")
    public final String cityCode;

    @InterfaceC65349Pkn("city_level")
    public final String cityLevel;

    @InterfaceC65349Pkn("city_name")
    public final String cityName;

    @InterfaceC65349Pkn("collect_info")
    public final String collectInfo;

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("geo_name_ids")
    public final String geoNameIds;

    @InterfaceC65349Pkn("is_locality")
    public final String isLocality;

    @InterfaceC65349Pkn("locality_level")
    public final String localityLevel;

    @InterfaceC65349Pkn("poi_mapkit_collect")
    public final String poiMapkitCollect;

    @InterfaceC65349Pkn("province_code")
    public final String provinceCode;

    @InterfaceC65349Pkn("tt_type_code")
    public final String ttTypeCode;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("type_code")
    public final String typeCode;

    @InterfaceC65349Pkn("type_level")
    public final String typeLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiDetails() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PoiDetails copy$default(PoiDetails poiDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        if ((i & 1) != 0) {
            str15 = poiDetails.cityCode;
        }
        if ((i & 2) != 0) {
            str16 = poiDetails.cityLevel;
        }
        if ((i & 4) != 0) {
            str17 = poiDetails.cityName;
        }
        if ((i & 8) != 0) {
            str18 = poiDetails.collectInfo;
        }
        if ((i & 16) != 0) {
            str19 = poiDetails.countryCode;
        }
        if ((i & 32) != 0) {
            str20 = poiDetails.isLocality;
        }
        if ((i & 64) != 0) {
            str21 = poiDetails.localityLevel;
        }
        if ((i & 128) != 0) {
            str22 = poiDetails.poiMapkitCollect;
        }
        if ((i & 256) != 0) {
            str23 = poiDetails.provinceCode;
        }
        if ((i & 512) != 0) {
            str24 = poiDetails.type;
        }
        if ((i & 1024) != 0) {
            str25 = poiDetails.typeCode;
        }
        if ((i & 2048) != 0) {
            str26 = poiDetails.typeLevel;
        }
        if ((i & 4096) != 0) {
            str27 = poiDetails.ttTypeCode;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str28 = poiDetails.geoNameIds;
        }
        return poiDetails.copy(str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28);
    }

    public final PoiDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        return new PoiDetails(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDetails)) {
            return false;
        }
        PoiDetails poiDetails = (PoiDetails) obj;
        return o.LJ(this.cityCode, poiDetails.cityCode) && o.LJ(this.cityLevel, poiDetails.cityLevel) && o.LJ(this.cityName, poiDetails.cityName) && o.LJ(this.collectInfo, poiDetails.collectInfo) && o.LJ(this.countryCode, poiDetails.countryCode) && o.LJ(this.isLocality, poiDetails.isLocality) && o.LJ(this.localityLevel, poiDetails.localityLevel) && o.LJ(this.poiMapkitCollect, poiDetails.poiMapkitCollect) && o.LJ(this.provinceCode, poiDetails.provinceCode) && o.LJ(this.type, poiDetails.type) && o.LJ(this.typeCode, poiDetails.typeCode) && o.LJ(this.typeLevel, poiDetails.typeLevel) && o.LJ(this.ttTypeCode, poiDetails.ttTypeCode) && o.LJ(this.geoNameIds, poiDetails.geoNameIds);
    }

    public int hashCode() {
        String str = this.cityCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cityLevel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cityName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.collectInfo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countryCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.isLocality;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.localityLevel;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.poiMapkitCollect;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.provinceCode;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.type;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.typeCode;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.typeLevel;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.ttTypeCode;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.geoNameIds;
        return hashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    public final String poiTypeName() {
        String str = this.typeLevel;
        if (str != null) {
            switch (str.hashCode()) {
                case C61447O9r.LJIIJ:
                    if (str.equals("1")) {
                        return "regional";
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return "store";
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return "independent";
                    }
                    break;
            }
        }
        return "";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PoiDetails(cityCode=");
        sb.append(this.cityCode);
        sb.append(", cityLevel=");
        sb.append(this.cityLevel);
        sb.append(", cityName=");
        sb.append(this.cityName);
        sb.append(", collectInfo=");
        sb.append(this.collectInfo);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", isLocality=");
        sb.append(this.isLocality);
        sb.append(", localityLevel=");
        sb.append(this.localityLevel);
        sb.append(", poiMapkitCollect=");
        sb.append(this.poiMapkitCollect);
        sb.append(", provinceCode=");
        sb.append(this.provinceCode);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", typeCode=");
        sb.append(this.typeCode);
        sb.append(", typeLevel=");
        sb.append(this.typeLevel);
        sb.append(", ttTypeCode=");
        sb.append(this.ttTypeCode);
        sb.append(", geoNameIds=");
        return C07670Rv.LIZIZ(sb, this.geoNameIds, ')');
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getCityLevel() {
        return this.cityLevel;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getGeoNameIds() {
        return this.geoNameIds;
    }

    public final String getLocalityLevel() {
        return this.localityLevel;
    }

    public final String getPoiMapkitCollect() {
        return this.poiMapkitCollect;
    }

    public final String getProvinceCode() {
        return this.provinceCode;
    }

    public final String getTtTypeCode() {
        return this.ttTypeCode;
    }

    public final String getType() {
        return this.type;
    }

    public final String getTypeCode() {
        return this.typeCode;
    }

    public final String getTypeLevel() {
        return this.typeLevel;
    }

    public final String isLocality() {
        return this.isLocality;
    }

    public PoiDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.cityCode = str;
        this.cityLevel = str2;
        this.cityName = str3;
        this.collectInfo = str4;
        this.countryCode = str5;
        this.isLocality = str6;
        this.localityLevel = str7;
        this.poiMapkitCollect = str8;
        this.provinceCode = str9;
        this.type = str10;
        this.typeCode = str11;
        this.typeLevel = str12;
        this.ttTypeCode = str13;
        this.geoNameIds = str14;
    }

    public /* synthetic */ PoiDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & FileUtils.BUFFER_SIZE) == 0 ? str14 : null);
    }
}
