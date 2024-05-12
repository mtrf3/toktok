package com.ss.android.ugc.aweme.poi;

import X.C07670Rv;
import X.C191867fy;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiAnchorData implements Serializable {
    public static final C191867fy Companion = new C191867fy();
    public static final HashMap<String, PoiAnchorData> store = new HashMap<>();

    @InterfaceC65349Pkn("collect_info")
    public final String collectInfo;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("from_group_id")
    public final String fromGroupId;

    @InterfaceC65349Pkn("icon")
    public final UrlModel icon;

    @InterfaceC65349Pkn("city_name")
    public final String poiCity;

    @InterfaceC65349Pkn("city_code")
    public final String poiCityCode;

    @InterfaceC65349Pkn("poi_device_samecity")
    public final Integer poiDeviceSameCity;

    @InterfaceC65349Pkn("poi_id")
    public final String poiId;

    @InterfaceC65349Pkn("poi_info_source")
    public final String poiInfoSource;

    @InterfaceC65349Pkn("keyword")
    public final String poiName;

    @InterfaceC65349Pkn("region_code")
    public final String poiRegionCode;

    @InterfaceC65349Pkn("video_count")
    public final Long videoCount;

    public static /* synthetic */ PoiAnchorData copy$default(PoiAnchorData poiAnchorData, String str, String str2, String str3, String str4, Integer num, String str5, Long l, String str6, String str7, String str8, UrlModel urlModel, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiAnchorData.poiId;
        }
        if ((i & 2) != 0) {
            str2 = poiAnchorData.poiName;
        }
        if ((i & 4) != 0) {
            str3 = poiAnchorData.poiCity;
        }
        if ((i & 8) != 0) {
            str4 = poiAnchorData.description;
        }
        if ((i & 16) != 0) {
            num = poiAnchorData.poiDeviceSameCity;
        }
        if ((i & 32) != 0) {
            str5 = poiAnchorData.poiCityCode;
        }
        if ((i & 64) != 0) {
            l = poiAnchorData.videoCount;
        }
        if ((i & 128) != 0) {
            str6 = poiAnchorData.poiRegionCode;
        }
        if ((i & 256) != 0) {
            str7 = poiAnchorData.poiInfoSource;
        }
        if ((i & 512) != 0) {
            str8 = poiAnchorData.fromGroupId;
        }
        if ((i & 1024) != 0) {
            urlModel = poiAnchorData.icon;
        }
        if ((i & 2048) != 0) {
            str9 = poiAnchorData.collectInfo;
        }
        return poiAnchorData.copy(str, str2, str3, str4, num, str5, l, str6, str7, str8, urlModel, str9);
    }

    public final PoiAnchorData copy(String poiId, String str, String str2, String str3, Integer num, String str4, Long l, String str5, String str6, String str7, UrlModel urlModel, String str8) {
        o.LJIIIZ(poiId, "poiId");
        return new PoiAnchorData(poiId, str, str2, str3, num, str4, l, str5, str6, str7, urlModel, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAnchorData)) {
            return false;
        }
        PoiAnchorData poiAnchorData = (PoiAnchorData) obj;
        return o.LJ(this.poiId, poiAnchorData.poiId) && o.LJ(this.poiName, poiAnchorData.poiName) && o.LJ(this.poiCity, poiAnchorData.poiCity) && o.LJ(this.description, poiAnchorData.description) && o.LJ(this.poiDeviceSameCity, poiAnchorData.poiDeviceSameCity) && o.LJ(this.poiCityCode, poiAnchorData.poiCityCode) && o.LJ(this.videoCount, poiAnchorData.videoCount) && o.LJ(this.poiRegionCode, poiAnchorData.poiRegionCode) && o.LJ(this.poiInfoSource, poiAnchorData.poiInfoSource) && o.LJ(this.fromGroupId, poiAnchorData.fromGroupId) && o.LJ(this.icon, poiAnchorData.icon) && o.LJ(this.collectInfo, poiAnchorData.collectInfo);
    }

    public int hashCode() {
        int hashCode = this.poiId.hashCode() * 31;
        String str = this.poiName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.poiCity;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.poiDeviceSameCity;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.poiCityCode;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.videoCount;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.poiRegionCode;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.poiInfoSource;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fromGroupId;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        UrlModel urlModel = this.icon;
        int hashCode11 = (hashCode10 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str8 = this.collectInfo;
        return hashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PoiAnchorData(poiId=");
        sb.append(this.poiId);
        sb.append(", poiName=");
        sb.append(this.poiName);
        sb.append(", poiCity=");
        sb.append(this.poiCity);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", poiDeviceSameCity=");
        sb.append(this.poiDeviceSameCity);
        sb.append(", poiCityCode=");
        sb.append(this.poiCityCode);
        sb.append(", videoCount=");
        sb.append(this.videoCount);
        sb.append(", poiRegionCode=");
        sb.append(this.poiRegionCode);
        sb.append(", poiInfoSource=");
        sb.append(this.poiInfoSource);
        sb.append(", fromGroupId=");
        sb.append(this.fromGroupId);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", collectInfo=");
        return C07670Rv.LIZIZ(sb, this.collectInfo, ')');
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFromGroupId() {
        return this.fromGroupId;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getPoiCity() {
        return this.poiCity;
    }

    public final String getPoiCityCode() {
        return this.poiCityCode;
    }

    public final Integer getPoiDeviceSameCity() {
        return this.poiDeviceSameCity;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final String getPoiInfoSource() {
        return this.poiInfoSource;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public final String getPoiRegionCode() {
        return this.poiRegionCode;
    }

    public final Long getVideoCount() {
        return this.videoCount;
    }

    public PoiAnchorData(String poiId, String str, String str2, String str3, Integer num, String str4, Long l, String str5, String str6, String str7, UrlModel urlModel, String str8) {
        o.LJIIIZ(poiId, "poiId");
        this.poiId = poiId;
        this.poiName = str;
        this.poiCity = str2;
        this.description = str3;
        this.poiDeviceSameCity = num;
        this.poiCityCode = str4;
        this.videoCount = l;
        this.poiRegionCode = str5;
        this.poiInfoSource = str6;
        this.fromGroupId = str7;
        this.icon = urlModel;
        this.collectInfo = str8;
    }

    public /* synthetic */ PoiAnchorData(String str, String str2, String str3, String str4, Integer num, String str5, Long l, String str6, String str7, String str8, UrlModel urlModel, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : urlModel, (i & 2048) == 0 ? str9 : null);
    }
}
