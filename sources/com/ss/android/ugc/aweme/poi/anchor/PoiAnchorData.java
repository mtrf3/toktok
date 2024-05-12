package com.ss.android.ugc.aweme.poi.anchor;

import X.C189987cw;
import X.C190827eI;
import X.EnumC189997cx;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiAnchorData implements Serializable {
    public static final C190827eI Companion = new C190827eI();
    public static final HashMap<String, PoiAnchorData> store = new HashMap<>();

    @InterfaceC65349Pkn("collect_info")
    public final String collectInfo;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("entrance_enter_method")
    public final String entranceEnterMethod;

    @InterfaceC65349Pkn("entrance_enter_page")
    public final String entranceEnterPage;

    @InterfaceC65349Pkn("fallback_address")
    public final String fallbackAddress;

    @InterfaceC65349Pkn("from_group_id")
    public final String fromGroupId;

    @InterfaceC65349Pkn("icon")
    public final UrlModel icon;

    @InterfaceC65349Pkn("is_claimed")
    public final Boolean isClaimed;

    @InterfaceC65349Pkn("poi_detail_is_collected")
    public final boolean isCollected;

    @InterfaceC65349Pkn("city_name")
    public final String poiCity;

    @InterfaceC65349Pkn("city_code")
    public final String poiCityCode;

    @InterfaceC65349Pkn("poi_detail_type")
    public final String poiDetailType;

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

    @InterfaceC65349Pkn("previous_page")
    public final String previousPage;

    @InterfaceC65349Pkn("search_extra_params")
    public final Map<String, String> searchExtraParams;

    @InterfaceC65349Pkn("search_params")
    public final Map<String, String> searchParams;

    @InterfaceC65349Pkn("type_level")
    public final String typeLevel;

    @InterfaceC65349Pkn("video_count")
    public final Long videoCount;

    public static /* synthetic */ PoiAnchorData copy$default(PoiAnchorData poiAnchorData, String str, String str2, String str3, String str4, Integer num, String str5, Long l, String str6, String str7, String str8, UrlModel urlModel, String str9, String str10, String str11, Boolean bool, boolean z, String str12, String str13, String str14, String str15, Map map, Map map2, int i, Object obj) {
        Integer num2 = num;
        String str16 = str4;
        String str17 = str3;
        String str18 = str;
        String str19 = str2;
        String str20 = str11;
        String str21 = str10;
        String str22 = str9;
        Long l2 = l;
        String str23 = str5;
        String str24 = str6;
        String str25 = str7;
        String str26 = str8;
        UrlModel urlModel2 = urlModel;
        Map map3 = map2;
        boolean z2 = z;
        Map map4 = map;
        Boolean bool2 = bool;
        String str27 = str12;
        String str28 = str13;
        String str29 = str14;
        String str30 = str15;
        if ((i & 1) != 0) {
            str18 = poiAnchorData.poiId;
        }
        if ((i & 2) != 0) {
            str19 = poiAnchorData.poiName;
        }
        if ((i & 4) != 0) {
            str17 = poiAnchorData.poiCity;
        }
        if ((i & 8) != 0) {
            str16 = poiAnchorData.description;
        }
        if ((i & 16) != 0) {
            num2 = poiAnchorData.poiDeviceSameCity;
        }
        if ((i & 32) != 0) {
            str23 = poiAnchorData.poiCityCode;
        }
        if ((i & 64) != 0) {
            l2 = poiAnchorData.videoCount;
        }
        if ((i & 128) != 0) {
            str24 = poiAnchorData.poiRegionCode;
        }
        if ((i & 256) != 0) {
            str25 = poiAnchorData.poiInfoSource;
        }
        if ((i & 512) != 0) {
            str26 = poiAnchorData.fromGroupId;
        }
        if ((i & 1024) != 0) {
            urlModel2 = poiAnchorData.icon;
        }
        if ((i & 2048) != 0) {
            str22 = poiAnchorData.collectInfo;
        }
        if ((i & 4096) != 0) {
            str21 = poiAnchorData.poiDetailType;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str20 = poiAnchorData.typeLevel;
        }
        if ((i & 16384) != 0) {
            bool2 = poiAnchorData.isClaimed;
        }
        if ((32768 & i) != 0) {
            z2 = poiAnchorData.isCollected;
        }
        if ((65536 & i) != 0) {
            str27 = poiAnchorData.entranceEnterPage;
        }
        if ((131072 & i) != 0) {
            str28 = poiAnchorData.entranceEnterMethod;
        }
        if ((262144 & i) != 0) {
            str29 = poiAnchorData.previousPage;
        }
        if ((524288 & i) != 0) {
            str30 = poiAnchorData.fallbackAddress;
        }
        if ((1048576 & i) != 0) {
            map4 = poiAnchorData.searchParams;
        }
        if ((i & 2097152) != 0) {
            map3 = poiAnchorData.searchExtraParams;
        }
        String str31 = str26;
        UrlModel urlModel3 = urlModel2;
        String str32 = str22;
        String str33 = str21;
        return poiAnchorData.copy(str18, str19, str17, str16, num2, str23, l2, str24, str25, str31, urlModel3, str32, str33, str20, bool2, z2, str27, str28, str29, str30, map4, map3);
    }

    public final PoiAnchorData copy(String poiId, String str, String str2, String str3, Integer num, String str4, Long l, String str5, String str6, String str7, UrlModel urlModel, String str8, String str9, String str10, Boolean bool, boolean z, String str11, String str12, String str13, String str14, Map<String, String> map, Map<String, String> map2) {
        o.LJIIIZ(poiId, "poiId");
        return new PoiAnchorData(poiId, str, str2, str3, num, str4, l, str5, str6, str7, urlModel, str8, str9, str10, bool, z, str11, str12, str13, str14, map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAnchorData)) {
            return false;
        }
        PoiAnchorData poiAnchorData = (PoiAnchorData) obj;
        return o.LJ(this.poiId, poiAnchorData.poiId) && o.LJ(this.poiName, poiAnchorData.poiName) && o.LJ(this.poiCity, poiAnchorData.poiCity) && o.LJ(this.description, poiAnchorData.description) && o.LJ(this.poiDeviceSameCity, poiAnchorData.poiDeviceSameCity) && o.LJ(this.poiCityCode, poiAnchorData.poiCityCode) && o.LJ(this.videoCount, poiAnchorData.videoCount) && o.LJ(this.poiRegionCode, poiAnchorData.poiRegionCode) && o.LJ(this.poiInfoSource, poiAnchorData.poiInfoSource) && o.LJ(this.fromGroupId, poiAnchorData.fromGroupId) && o.LJ(this.icon, poiAnchorData.icon) && o.LJ(this.collectInfo, poiAnchorData.collectInfo) && o.LJ(this.poiDetailType, poiAnchorData.poiDetailType) && o.LJ(this.typeLevel, poiAnchorData.typeLevel) && o.LJ(this.isClaimed, poiAnchorData.isClaimed) && this.isCollected == poiAnchorData.isCollected && o.LJ(this.entranceEnterPage, poiAnchorData.entranceEnterPage) && o.LJ(this.entranceEnterMethod, poiAnchorData.entranceEnterMethod) && o.LJ(this.previousPage, poiAnchorData.previousPage) && o.LJ(this.fallbackAddress, poiAnchorData.fallbackAddress) && o.LJ(this.searchParams, poiAnchorData.searchParams) && o.LJ(this.searchExtraParams, poiAnchorData.searchExtraParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.poiDetailType;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.typeLevel;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.isClaimed;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.isCollected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode15 + i) * 31;
        String str11 = this.entranceEnterPage;
        int hashCode16 = (i2 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.entranceEnterMethod;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.previousPage;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fallbackAddress;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Map<String, String> map = this.searchParams;
        int hashCode20 = (hashCode19 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.searchExtraParams;
        return hashCode20 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "PoiAnchorData(poiId=" + this.poiId + ", poiName=" + this.poiName + ", poiCity=" + this.poiCity + ", description=" + this.description + ", poiDeviceSameCity=" + this.poiDeviceSameCity + ", poiCityCode=" + this.poiCityCode + ", videoCount=" + this.videoCount + ", poiRegionCode=" + this.poiRegionCode + ", poiInfoSource=" + this.poiInfoSource + ", fromGroupId=" + this.fromGroupId + ", icon=" + this.icon + ", collectInfo=" + this.collectInfo + ", poiDetailType=" + this.poiDetailType + ", typeLevel=" + this.typeLevel + ", isClaimed=" + this.isClaimed + ", isCollected=" + this.isCollected + ", entranceEnterPage=" + this.entranceEnterPage + ", entranceEnterMethod=" + this.entranceEnterMethod + ", previousPage=" + this.previousPage + ", fallbackAddress=" + this.fallbackAddress + ", searchParams=" + this.searchParams + ", searchExtraParams=" + this.searchExtraParams + ')';
    }

    public final String getPoiDetailTypeFromLevelType() {
        String str = this.typeLevel;
        if (str == null) {
            return this.poiDetailType;
        }
        EnumC189997cx.Companion.getClass();
        return C189987cw.LIZ(str, false).getTypeName();
    }

    public final String isClaimedStr() {
        Boolean bool = this.isClaimed;
        if (bool != null) {
            if (bool.booleanValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return null;
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEntranceEnterMethod() {
        return this.entranceEnterMethod;
    }

    public final String getEntranceEnterPage() {
        return this.entranceEnterPage;
    }

    public final String getFallbackAddress() {
        return this.fallbackAddress;
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

    public final String getPoiDetailType() {
        return this.poiDetailType;
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

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final Map<String, String> getSearchExtraParams() {
        return this.searchExtraParams;
    }

    public final Map<String, String> getSearchParams() {
        return this.searchParams;
    }

    public final String getTypeLevel() {
        return this.typeLevel;
    }

    public final Long getVideoCount() {
        return this.videoCount;
    }

    public final Boolean isClaimed() {
        return this.isClaimed;
    }

    public final boolean isCollected() {
        return this.isCollected;
    }

    public final PoiAnchorData updatePoiDetailCollect(boolean z) {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, null, null, null, null, null, null, 4161535, null);
    }

    public final PoiAnchorData updatePoiDetailData(String str, Boolean bool) {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, str, null, bool, false, null, null, null, null, null, null, 4173823, null);
    }

    public final PoiAnchorData updateSearchMobToPoiDetailData(String str, String str2, String str3, Map<String, String> map) {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, str, str2, str3, null, map, null, 2686975, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r1 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData updateInfoFromPoiDetail(java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37) {
        /*
            r32 = this;
            r4 = r33
            r7 = r32
            java.lang.String r1 = r7.collectInfo
            if (r1 == 0) goto L66
            if (r4 == 0) goto L96
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r7.collectInfo     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            java.util.Map r6 = X.C190837eJ.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r3 = r5.keys()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "detailJsonObject.keys()"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)     // Catch: java.lang.Throwable -> L4f
        L23:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L42
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L4f
            boolean r0 = X.C78685UuP.LJJJZ(r2)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L23
            java.lang.Object r1 = r5.opt(r2)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L23
            r0 = r6
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L4f
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L4f
            goto L23
        L42:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L4f
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L4f
            goto L57
        L4f:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L57:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L5e
            r1 = 0
        L5e:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L96
            java.lang.String r1 = r7.collectInfo
            if (r1 != 0) goto L96
        L66:
            r8 = 0
            r23 = 0
            r30 = 4187487(0x3fe55f, float:5.867919E-39)
            r13 = r34
            r20 = r35
            r15 = r36
            r17 = r37
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r16 = r8
            r18 = r8
            r19 = r4
            r21 = r8
            r22 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r27 = r8
            r28 = r8
            r29 = r8
            r31 = r8
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r0 = copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
        L96:
            r4 = r1
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData.updateInfoFromPoiDetail(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData");
    }

    public PoiAnchorData(String poiId, String str, String str2, String str3, Integer num, String str4, Long l, String str5, String str6, String str7, UrlModel urlModel, String str8, String str9, String str10, Boolean bool, boolean z, String str11, String str12, String str13, String str14, Map<String, String> map, Map<String, String> map2) {
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
        this.poiDetailType = str9;
        this.typeLevel = str10;
        this.isClaimed = bool;
        this.isCollected = z;
        this.entranceEnterPage = str11;
        this.entranceEnterMethod = str12;
        this.previousPage = str13;
        this.fallbackAddress = str14;
        this.searchParams = map;
        this.searchExtraParams = map2;
    }

    public /* synthetic */ PoiAnchorData(String str, String str2, String str3, String str4, Integer num, String str5, Long l, String str6, String str7, String str8, UrlModel urlModel, String str9, String str10, String str11, Boolean bool, boolean z, String str12, String str13, String str14, String str15, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : urlModel, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str11, (i & 16384) != 0 ? null : bool, (32768 & i) != 0 ? false : z, (65536 & i) != 0 ? null : str12, (131072 & i) != 0 ? null : str13, (262144 & i) != 0 ? null : str14, (524288 & i) != 0 ? null : str15, (1048576 & i) != 0 ? null : map, (i & 2097152) == 0 ? map2 : null);
    }
}
