package com.ss.android.ugc.aweme.placediscovery2.model;

import X.C08880Wm;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DiscoveryPoi implements Serializable {

    @InterfaceC65349Pkn("average_price")
    public String averagePrice;

    @InterfaceC65349Pkn("category_name")
    public String categoryName;

    @InterfaceC65349Pkn("city_code")
    public String cityCode;

    @InterfaceC65349Pkn("collect_info")
    public String collectInfo;

    @InterfaceC65349Pkn("estimated_distance_for_show")
    public String estimatedDistanceForShow;

    @InterfaceC65349Pkn("exact_distance_for_show")
    public String exactDistanceForShow;

    @InterfaceC65349Pkn("formatted_address")
    public String formattedAddress;

    @InterfaceC65349Pkn("is_claimed")
    public final boolean isClaimed;

    @InterfaceC65349Pkn("is_collected")
    public Boolean isCollected;

    @InterfaceC65349Pkn("location")
    public Location location;

    @InterfaceC65349Pkn("poi_id")
    public String poiId;

    @InterfaceC65349Pkn("poi_name")
    public String poiName;

    @InterfaceC65349Pkn("poi_title_img")
    public String poiTitleImg;

    @InterfaceC65349Pkn("region_code")
    public String regionCode;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("time_for_show")
    public String timeForShow;

    @InterfaceC65349Pkn("type_level")
    public String typeLevel;

    @InterfaceC65349Pkn("video_count")
    public Integer videoCount;

    @InterfaceC65349Pkn("video_count_for_show")
    public String videoCountForShow;

    @InterfaceC65349Pkn("video_list")
    public ArrayList<Object> videoList;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoveryPoi() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 1048575, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DiscoveryPoi copy$default(DiscoveryPoi discoveryPoi, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, ArrayList arrayList, String str12, String str13, String str14, Location location, String str15, boolean z, int i, Object obj) {
        String str16 = str6;
        String str17 = str2;
        String str18 = str;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        Integer num2 = num;
        ArrayList arrayList2 = arrayList;
        String str22 = str8;
        String str23 = str7;
        String str24 = str9;
        String str25 = str10;
        Boolean bool2 = bool;
        String str26 = str11;
        boolean z2 = z;
        String str27 = str13;
        String str28 = str14;
        String str29 = str12;
        String str30 = str15;
        Location location2 = location;
        if ((i & 1) != 0) {
            str18 = discoveryPoi.poiId;
        }
        if ((i & 2) != 0) {
            str17 = discoveryPoi.schema;
        }
        if ((i & 4) != 0) {
            str19 = discoveryPoi.poiName;
        }
        if ((i & 8) != 0) {
            str20 = discoveryPoi.categoryName;
        }
        if ((i & 16) != 0) {
            str21 = discoveryPoi.averagePrice;
        }
        if ((i & 32) != 0) {
            num2 = discoveryPoi.videoCount;
        }
        if ((i & 64) != 0) {
            str16 = discoveryPoi.videoCountForShow;
        }
        if ((i & 128) != 0) {
            str23 = discoveryPoi.timeForShow;
        }
        if ((i & 256) != 0) {
            str22 = discoveryPoi.exactDistanceForShow;
        }
        if ((i & 512) != 0) {
            str24 = discoveryPoi.estimatedDistanceForShow;
        }
        if ((i & 1024) != 0) {
            str25 = discoveryPoi.formattedAddress;
        }
        if ((i & 2048) != 0) {
            bool2 = discoveryPoi.isCollected;
        }
        if ((i & 4096) != 0) {
            str26 = discoveryPoi.collectInfo;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            arrayList2 = discoveryPoi.videoList;
        }
        if ((i & 16384) != 0) {
            str29 = discoveryPoi.regionCode;
        }
        if ((32768 & i) != 0) {
            str27 = discoveryPoi.cityCode;
        }
        if ((65536 & i) != 0) {
            str28 = discoveryPoi.typeLevel;
        }
        if ((131072 & i) != 0) {
            location2 = discoveryPoi.location;
        }
        if ((262144 & i) != 0) {
            str30 = discoveryPoi.poiTitleImg;
        }
        if ((i & 524288) != 0) {
            z2 = discoveryPoi.isClaimed;
        }
        return discoveryPoi.copy(str18, str17, str19, str20, str21, num2, str16, str23, str22, str24, str25, bool2, str26, arrayList2, str29, str27, str28, location2, str30, z2);
    }

    public final DiscoveryPoi copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, ArrayList<Object> videoList, String str12, String str13, String str14, Location location, String str15, boolean z) {
        o.LJIIIZ(videoList, "videoList");
        return new DiscoveryPoi(str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, bool, str11, videoList, str12, str13, str14, location, str15, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryPoi)) {
            return false;
        }
        DiscoveryPoi discoveryPoi = (DiscoveryPoi) obj;
        return o.LJ(this.poiId, discoveryPoi.poiId) && o.LJ(this.schema, discoveryPoi.schema) && o.LJ(this.poiName, discoveryPoi.poiName) && o.LJ(this.categoryName, discoveryPoi.categoryName) && o.LJ(this.averagePrice, discoveryPoi.averagePrice) && o.LJ(this.videoCount, discoveryPoi.videoCount) && o.LJ(this.videoCountForShow, discoveryPoi.videoCountForShow) && o.LJ(this.timeForShow, discoveryPoi.timeForShow) && o.LJ(this.exactDistanceForShow, discoveryPoi.exactDistanceForShow) && o.LJ(this.estimatedDistanceForShow, discoveryPoi.estimatedDistanceForShow) && o.LJ(this.formattedAddress, discoveryPoi.formattedAddress) && o.LJ(this.isCollected, discoveryPoi.isCollected) && o.LJ(this.collectInfo, discoveryPoi.collectInfo) && o.LJ(this.videoList, discoveryPoi.videoList) && o.LJ(this.regionCode, discoveryPoi.regionCode) && o.LJ(this.cityCode, discoveryPoi.cityCode) && o.LJ(this.typeLevel, discoveryPoi.typeLevel) && o.LJ(this.location, discoveryPoi.location) && o.LJ(this.poiTitleImg, discoveryPoi.poiTitleImg) && this.isClaimed == discoveryPoi.isClaimed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.poiId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.categoryName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.averagePrice;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.videoCount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.videoCountForShow;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.timeForShow;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.exactDistanceForShow;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.estimatedDistanceForShow;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.formattedAddress;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.collectInfo;
        int hashCode13 = (this.videoList.hashCode() + ((hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31)) * 31;
        String str12 = this.regionCode;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cityCode;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.typeLevel;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Location location = this.location;
        int hashCode17 = (hashCode16 + (location == null ? 0 : location.hashCode())) * 31;
        String str15 = this.poiTitleImg;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
        boolean z = this.isClaimed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode18 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryPoi(poiId=");
        sb.append(this.poiId);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", poiName=");
        sb.append(this.poiName);
        sb.append(", categoryName=");
        sb.append(this.categoryName);
        sb.append(", averagePrice=");
        sb.append(this.averagePrice);
        sb.append(", videoCount=");
        sb.append(this.videoCount);
        sb.append(", videoCountForShow=");
        sb.append(this.videoCountForShow);
        sb.append(", timeForShow=");
        sb.append(this.timeForShow);
        sb.append(", exactDistanceForShow=");
        sb.append(this.exactDistanceForShow);
        sb.append(", estimatedDistanceForShow=");
        sb.append(this.estimatedDistanceForShow);
        sb.append(", formattedAddress=");
        sb.append(this.formattedAddress);
        sb.append(", isCollected=");
        sb.append(this.isCollected);
        sb.append(", collectInfo=");
        sb.append(this.collectInfo);
        sb.append(", videoList=");
        sb.append(this.videoList);
        sb.append(", regionCode=");
        sb.append(this.regionCode);
        sb.append(", cityCode=");
        sb.append(this.cityCode);
        sb.append(", typeLevel=");
        sb.append(this.typeLevel);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", poiTitleImg=");
        sb.append(this.poiTitleImg);
        sb.append(", isClaimed=");
        return C08880Wm.LIZJ(sb, this.isClaimed, ')');
    }

    public final String getAveragePrice() {
        return this.averagePrice;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final String getEstimatedDistanceForShow() {
        return this.estimatedDistanceForShow;
    }

    public final String getExactDistanceForShow() {
        return this.exactDistanceForShow;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public final String getPoiTitleImg() {
        return this.poiTitleImg;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTimeForShow() {
        return this.timeForShow;
    }

    public final String getTypeLevel() {
        return this.typeLevel;
    }

    public final Integer getVideoCount() {
        return this.videoCount;
    }

    public final String getVideoCountForShow() {
        return this.videoCountForShow;
    }

    public final ArrayList<Object> getVideoList() {
        return this.videoList;
    }

    public final boolean isClaimed() {
        return this.isClaimed;
    }

    public final Boolean isCollected() {
        return this.isCollected;
    }

    public final void setAveragePrice(String str) {
        this.averagePrice = str;
    }

    public final void setCategoryName(String str) {
        this.categoryName = str;
    }

    public final void setCityCode(String str) {
        this.cityCode = str;
    }

    public final void setCollectInfo(String str) {
        this.collectInfo = str;
    }

    public final void setCollected(Boolean bool) {
        this.isCollected = bool;
    }

    public final void setEstimatedDistanceForShow(String str) {
        this.estimatedDistanceForShow = str;
    }

    public final void setExactDistanceForShow(String str) {
        this.exactDistanceForShow = str;
    }

    public final void setFormattedAddress(String str) {
        this.formattedAddress = str;
    }

    public final void setLocation(Location location) {
        this.location = location;
    }

    public final void setPoiId(String str) {
        this.poiId = str;
    }

    public final void setPoiName(String str) {
        this.poiName = str;
    }

    public final void setPoiTitleImg(String str) {
        this.poiTitleImg = str;
    }

    public final void setRegionCode(String str) {
        this.regionCode = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTimeForShow(String str) {
        this.timeForShow = str;
    }

    public final void setTypeLevel(String str) {
        this.typeLevel = str;
    }

    public final void setVideoCount(Integer num) {
        this.videoCount = num;
    }

    public final void setVideoCountForShow(String str) {
        this.videoCountForShow = str;
    }

    public final void setVideoList(ArrayList<Object> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.videoList = arrayList;
    }

    public DiscoveryPoi(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, ArrayList<Object> videoList, String str12, String str13, String str14, Location location, String str15, boolean z) {
        o.LJIIIZ(videoList, "videoList");
        this.poiId = str;
        this.schema = str2;
        this.poiName = str3;
        this.categoryName = str4;
        this.averagePrice = str5;
        this.videoCount = num;
        this.videoCountForShow = str6;
        this.timeForShow = str7;
        this.exactDistanceForShow = str8;
        this.estimatedDistanceForShow = str9;
        this.formattedAddress = str10;
        this.isCollected = bool;
        this.collectInfo = str11;
        this.videoList = videoList;
        this.regionCode = str12;
        this.cityCode = str13;
        this.typeLevel = str14;
        this.location = location;
        this.poiTitleImg = str15;
        this.isClaimed = z;
    }

    public /* synthetic */ DiscoveryPoi(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, ArrayList arrayList, String str12, String str13, String str14, Location location, String str15, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str11, (i & FileUtils.BUFFER_SIZE) != 0 ? new ArrayList() : arrayList, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : str13, (65536 & i) != 0 ? null : str14, (131072 & i) != 0 ? new Location(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, 3, null) : location, (262144 & i) != 0 ? null : str15, (i & 524288) != 0 ? false : z);
    }
}
