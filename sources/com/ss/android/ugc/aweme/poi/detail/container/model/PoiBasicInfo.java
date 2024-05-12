package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiBasicInfo {

    @InterfaceC65349Pkn("formatted_address")
    public final String address;

    @InterfaceC65349Pkn("category_name")
    public final String categoryName;

    @InterfaceC65349Pkn("city_code")
    public final String cityCode;

    @InterfaceC65349Pkn("collect_info")
    public final String collectInfo;

    @InterfaceC65349Pkn("cover")
    public final UrlModel cover;

    @InterfaceC65349Pkn("father_poi")
    public final FatherPoiModel fatherPoi;

    @InterfaceC65349Pkn("poi_id")
    public final String id;

    @InterfaceC65349Pkn("is_collected")
    public final Boolean isCollected;

    @InterfaceC65349Pkn("poi_name")
    public final String name;

    @InterfaceC65349Pkn("poi_info_source")
    public final String poiInfoSource;

    @InterfaceC65349Pkn("location")
    public final PoiListApi.PoiLocation poiLocation;

    @InterfaceC65349Pkn("region_code")
    public final String regionCode;

    @InterfaceC65349Pkn("type_level")
    public final String typeLevel;

    @InterfaceC65349Pkn("video_count")
    public final Long videoCount;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiBasicInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiBasicInfo)) {
            return false;
        }
        PoiBasicInfo poiBasicInfo = (PoiBasicInfo) obj;
        return o.LJ(this.id, poiBasicInfo.id) && o.LJ(this.name, poiBasicInfo.name) && o.LJ(this.address, poiBasicInfo.address) && o.LJ(this.videoCount, poiBasicInfo.videoCount) && o.LJ(this.cover, poiBasicInfo.cover) && o.LJ(this.isCollected, poiBasicInfo.isCollected) && o.LJ(this.collectInfo, poiBasicInfo.collectInfo) && o.LJ(this.typeLevel, poiBasicInfo.typeLevel) && o.LJ(this.fatherPoi, poiBasicInfo.fatherPoi) && o.LJ(this.cityCode, poiBasicInfo.cityCode) && o.LJ(this.regionCode, poiBasicInfo.regionCode) && o.LJ(this.poiInfoSource, poiBasicInfo.poiInfoSource) && o.LJ(this.poiLocation, poiBasicInfo.poiLocation) && o.LJ(this.categoryName, poiBasicInfo.categoryName);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.videoCount;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int hashCode5 = (hashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.collectInfo;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.typeLevel;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        FatherPoiModel fatherPoiModel = this.fatherPoi;
        int hashCode9 = (hashCode8 + (fatherPoiModel == null ? 0 : fatherPoiModel.hashCode())) * 31;
        String str6 = this.cityCode;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.regionCode;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.poiInfoSource;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        PoiListApi.PoiLocation poiLocation = this.poiLocation;
        int hashCode13 = (hashCode12 + (poiLocation == null ? 0 : poiLocation.hashCode())) * 31;
        String str9 = this.categoryName;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiBasicInfo(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", videoCount=");
        sb.append(this.videoCount);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", isCollected=");
        sb.append(this.isCollected);
        sb.append(", collectInfo=");
        sb.append(this.collectInfo);
        sb.append(", typeLevel=");
        sb.append(this.typeLevel);
        sb.append(", fatherPoi=");
        sb.append(this.fatherPoi);
        sb.append(", cityCode=");
        sb.append(this.cityCode);
        sb.append(", regionCode=");
        sb.append(this.regionCode);
        sb.append(", poiInfoSource=");
        sb.append(this.poiInfoSource);
        sb.append(", poiLocation=");
        sb.append(this.poiLocation);
        sb.append(", categoryName=");
        return C07670Rv.LIZIZ(sb, this.categoryName, ')');
    }

    public PoiBasicInfo(String str, String str2, String str3, Long l, UrlModel urlModel, Boolean bool, String str4, String str5, FatherPoiModel fatherPoiModel, String str6, String str7, String str8, PoiListApi.PoiLocation poiLocation, String str9) {
        this.id = str;
        this.name = str2;
        this.address = str3;
        this.videoCount = l;
        this.cover = urlModel;
        this.isCollected = bool;
        this.collectInfo = str4;
        this.typeLevel = str5;
        this.fatherPoi = fatherPoiModel;
        this.cityCode = str6;
        this.regionCode = str7;
        this.poiInfoSource = str8;
        this.poiLocation = poiLocation;
        this.categoryName = str9;
    }

    public /* synthetic */ PoiBasicInfo(String str, String str2, String str3, Long l, UrlModel urlModel, Boolean bool, String str4, String str5, FatherPoiModel fatherPoiModel, String str6, String str7, String str8, PoiListApi.PoiLocation poiLocation, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : urlModel, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : fatherPoiModel, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : poiLocation, (i & FileUtils.BUFFER_SIZE) == 0 ? str9 : null);
    }
}
