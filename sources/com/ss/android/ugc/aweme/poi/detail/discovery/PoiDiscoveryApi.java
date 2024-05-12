package com.ss.android.ugc.aweme.poi.detail.discovery;

import X.AbstractC73672Svk;
import X.C48339Iy7;
import X.C84844XRo;
import X.C85254Xd4;
import X.E4Q;
import X.InterfaceC57784Mm4;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public interface PoiDiscoveryApi {
    public static final C84844XRo LIZ = C84844XRo.LIZ;

    @E4Q("/tiktok/poi/card_feed/get/v1")
    AbstractC73672Svk<PoiDiscoveryCardListResponse> getPoiDiscoveryCardList(@InterfaceC64989Pez("poi_id") String str, @InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("tab_code") String str2);

    /* loaded from: classes16.dex */
    public static final class PoiCategory implements InterfaceC57784Mm4 {
        public final String LJLIL;
        public final int LJLILLLLZI;
        public final int LJLJI;
        public final boolean LJLJJI;

        @InterfaceC65349Pkn("tab_code")
        public final String tabCode;

        @InterfaceC65349Pkn("tab_name")
        public final String tabName;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiCategory)) {
                return false;
            }
            PoiCategory poiCategory = (PoiCategory) obj;
            return o.LJ(this.tabCode, poiCategory.tabCode) && o.LJ(this.tabName, poiCategory.tabName) && o.LJ(this.LJLIL, poiCategory.LJLIL) && this.LJLILLLLZI == poiCategory.LJLILLLLZI && this.LJLJI == poiCategory.LJLJI && this.LJLJJI == poiCategory.LJLJJI;
        }

        @Override // X.InterfaceC57784Mm4
        public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.tabCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tabName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.LJLIL;
            int hashCode3 = (((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LJLILLLLZI) * 31) + this.LJLJI) * 31;
            boolean z = this.LJLJJI;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiCategory(tabCode=");
            LIZ.append(this.tabCode);
            LIZ.append(", tabName=");
            LIZ.append(this.tabName);
            LIZ.append(", poiId=");
            LIZ.append(this.LJLIL);
            LIZ.append(", tabIndex=");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append(", totalTabCnt=");
            LIZ.append(this.LJLJI);
            LIZ.append(", isReload=");
            return C48339Iy7.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
        }

        @Override // X.InterfaceC57784Mm4
        public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return o.LJ(interfaceC57784Mm4, this);
        }

        @Override // X.InterfaceC57784Mm4
        public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return o.LJ(interfaceC57784Mm4, this);
        }

        public PoiCategory(String str, String str2, String str3, int i, int i2, boolean z) {
            this.tabCode = str;
            this.tabName = str2;
            this.LJLIL = str3;
            this.LJLILLLLZI = i;
            this.LJLJI = i2;
            this.LJLJJI = z;
        }

        public static PoiCategory LIZ(PoiCategory poiCategory, String str, int i, int i2, boolean z, int i3) {
            String str2;
            boolean z2 = z;
            int i4 = i2;
            String str3 = str;
            int i5 = i;
            String str4 = null;
            if ((i3 & 1) != 0) {
                str2 = poiCategory.tabCode;
            } else {
                str2 = null;
            }
            if ((i3 & 2) != 0) {
                str4 = poiCategory.tabName;
            }
            if ((i3 & 4) != 0) {
                str3 = poiCategory.LJLIL;
            }
            if ((i3 & 8) != 0) {
                i5 = poiCategory.LJLILLLLZI;
            }
            if ((i3 & 16) != 0) {
                i4 = poiCategory.LJLJI;
            }
            if ((i3 & 32) != 0) {
                z2 = poiCategory.LJLJJI;
            }
            poiCategory.getClass();
            return new PoiCategory(str2, str4, str3, i5, i4, z2);
        }

        public /* synthetic */ PoiCategory(String str, String str2, String str3, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z);
        }
    }

    /* loaded from: classes10.dex */
    public static final class PoiDiscoveryCardListResponse extends BaseResponse {

        @InterfaceC65349Pkn("current_tab_code")
        public final String currentTabCode;

        @InterfaceC65349Pkn("dynamic_map_window")
        public final MapBounds dynamicMapWindow;

        @InterfaceC65349Pkn("in_poi_region")
        public final Boolean inPoiRegion;

        @InterfaceC65349Pkn("poi_category_list")
        public final List<PoiCategory> poiCategoryList;

        @InterfaceC65349Pkn("poi_list")
        public final List<PoiDiscoveryCard> poiList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDiscoveryCardListResponse)) {
                return false;
            }
            PoiDiscoveryCardListResponse poiDiscoveryCardListResponse = (PoiDiscoveryCardListResponse) obj;
            return o.LJ(this.poiCategoryList, poiDiscoveryCardListResponse.poiCategoryList) && o.LJ(this.poiList, poiDiscoveryCardListResponse.poiList) && o.LJ(this.dynamicMapWindow, poiDiscoveryCardListResponse.dynamicMapWindow) && o.LJ(this.inPoiRegion, poiDiscoveryCardListResponse.inPoiRegion) && o.LJ(this.currentTabCode, poiDiscoveryCardListResponse.currentTabCode);
        }

        public final int hashCode() {
            List<PoiCategory> list = this.poiCategoryList;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<PoiDiscoveryCard> list2 = this.poiList;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            MapBounds mapBounds = this.dynamicMapWindow;
            int hashCode3 = (hashCode2 + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
            Boolean bool = this.inPoiRegion;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.currentTabCode;
            return hashCode4 + (str != null ? str.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiDiscoveryCardListResponse(poiCategoryList=");
            LIZ.append(this.poiCategoryList);
            LIZ.append(", poiList=");
            LIZ.append(this.poiList);
            LIZ.append(", dynamicMapWindow=");
            LIZ.append(this.dynamicMapWindow);
            LIZ.append(", inPoiRegion=");
            LIZ.append(this.inPoiRegion);
            LIZ.append(", currentTabCode=");
            return q.LIZIZ(LIZ, this.currentTabCode, ')', LIZ);
        }

        public PoiDiscoveryCardListResponse(List<PoiCategory> list, List<PoiDiscoveryCard> list2, MapBounds mapBounds, Boolean bool, String str) {
            this.poiCategoryList = list;
            this.poiList = list2;
            this.dynamicMapWindow = mapBounds;
            this.inPoiRegion = bool;
            this.currentTabCode = str;
        }

        public /* synthetic */ PoiDiscoveryCardListResponse(List list, List list2, MapBounds mapBounds, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) == 0 ? mapBounds : null, bool, str);
        }
    }

    /* loaded from: classes16.dex */
    public static final class PoiDiscoveryCard implements InterfaceC57784Mm4 {
        public final String LJLIL;
        public final String LJLILLLLZI;
        public final boolean LJLJI;
        public final C85254Xd4 LJLJJI;

        @InterfaceC65349Pkn("city_code")
        public final String cityCode;

        @InterfaceC65349Pkn("collect_info")
        public final String collectInfo;

        @InterfaceC65349Pkn("is_claimed")
        public final Boolean isClaimed;

        @InterfaceC65349Pkn("poi_backend_type")
        public final String poiBackendType;

        @InterfaceC65349Pkn("detail_page_poi_display")
        public final String poiDisplay;

        @InterfaceC65349Pkn("poi_distance_for_show")
        public final String poiDistanceForShow;

        @InterfaceC65349Pkn("poi_id")
        public final String poiId;

        @InterfaceC65349Pkn("poi_name")
        public final String poiName;

        @InterfaceC65349Pkn("real_time_fav_cnt")
        public final Long realTimeFavCnt;

        @InterfaceC65349Pkn("region_code")
        public final String regionCode;

        @InterfaceC65349Pkn("schema")
        public final String schema;

        @InterfaceC65349Pkn("type_level")
        public final String typeLevel;

        @InterfaceC65349Pkn("video_list")
        public final List<Aweme> videoList;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiDiscoveryCard() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDiscoveryCard)) {
                return false;
            }
            PoiDiscoveryCard poiDiscoveryCard = (PoiDiscoveryCard) obj;
            return o.LJ(this.poiId, poiDiscoveryCard.poiId) && o.LJ(this.schema, poiDiscoveryCard.schema) && o.LJ(this.poiName, poiDiscoveryCard.poiName) && o.LJ(this.collectInfo, poiDiscoveryCard.collectInfo) && o.LJ(this.videoList, poiDiscoveryCard.videoList) && o.LJ(this.realTimeFavCnt, poiDiscoveryCard.realTimeFavCnt) && o.LJ(this.poiDisplay, poiDiscoveryCard.poiDisplay) && o.LJ(this.poiDistanceForShow, poiDiscoveryCard.poiDistanceForShow) && o.LJ(this.typeLevel, poiDiscoveryCard.typeLevel) && o.LJ(this.poiBackendType, poiDiscoveryCard.poiBackendType) && o.LJ(this.regionCode, poiDiscoveryCard.regionCode) && o.LJ(this.cityCode, poiDiscoveryCard.cityCode) && o.LJ(this.isClaimed, poiDiscoveryCard.isClaimed) && o.LJ(this.LJLIL, poiDiscoveryCard.LJLIL) && o.LJ(this.LJLILLLLZI, poiDiscoveryCard.LJLILLLLZI) && this.LJLJI == poiDiscoveryCard.LJLJI && o.LJ(this.LJLJJI, poiDiscoveryCard.LJLJJI);
        }

        @Override // X.InterfaceC57784Mm4
        public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.poiId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.schema;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.poiName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.collectInfo;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<Aweme> list = this.videoList;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Long l = this.realTimeFavCnt;
            int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            String str5 = this.poiDisplay;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.poiDistanceForShow;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.typeLevel;
            int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.poiBackendType;
            int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.regionCode;
            int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.cityCode;
            int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Boolean bool = this.isClaimed;
            int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str11 = this.LJLIL;
            int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.LJLILLLLZI;
            int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
            boolean z = this.LJLJI;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode15 + i) * 31;
            C85254Xd4 c85254Xd4 = this.LJLJJI;
            return i2 + (c85254Xd4 != null ? c85254Xd4.hashCode() : 0);
        }

        public final String toString() {
            return "PoiDiscoveryCard(poiId=" + this.poiId + ", schema=" + this.schema + ", poiName=" + this.poiName + ", collectInfo=" + this.collectInfo + ", videoList=" + this.videoList + ", realTimeFavCnt=" + this.realTimeFavCnt + ", poiDisplay=" + this.poiDisplay + ", poiDistanceForShow=" + this.poiDistanceForShow + ", typeLevel=" + this.typeLevel + ", poiBackendType=" + this.poiBackendType + ", regionCode=" + this.regionCode + ", cityCode=" + this.cityCode + ", isClaimed=" + this.isClaimed + ", pagePoiId=" + this.LJLIL + ", tabCode=" + this.LJLILLLLZI + ", showSkeleton=" + this.LJLJI + ", playControlData=" + this.LJLJJI + ')';
        }

        @Override // X.InterfaceC57784Mm4
        public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return o.LJ(interfaceC57784Mm4, this);
        }

        @Override // X.InterfaceC57784Mm4
        public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return o.LJ(interfaceC57784Mm4, this);
        }

        public static PoiDiscoveryCard LIZ(PoiDiscoveryCard poiDiscoveryCard, String str, String str2, C85254Xd4 c85254Xd4) {
            String str3 = poiDiscoveryCard.poiId;
            String str4 = poiDiscoveryCard.schema;
            String str5 = poiDiscoveryCard.poiName;
            String str6 = poiDiscoveryCard.collectInfo;
            List<Aweme> list = poiDiscoveryCard.videoList;
            Long l = poiDiscoveryCard.realTimeFavCnt;
            String str7 = poiDiscoveryCard.poiDisplay;
            String str8 = poiDiscoveryCard.poiDistanceForShow;
            String str9 = poiDiscoveryCard.typeLevel;
            String str10 = poiDiscoveryCard.poiBackendType;
            String str11 = poiDiscoveryCard.regionCode;
            String str12 = poiDiscoveryCard.cityCode;
            Boolean bool = poiDiscoveryCard.isClaimed;
            boolean z = poiDiscoveryCard.LJLJI;
            poiDiscoveryCard.getClass();
            return new PoiDiscoveryCard(str3, str4, str5, str6, list, l, str7, str8, str9, str10, str11, str12, bool, str, str2, z, c85254Xd4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PoiDiscoveryCard(String str, String str2, String str3, String str4, List<? extends Aweme> list, Long l, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, boolean z, C85254Xd4 c85254Xd4) {
            this.poiId = str;
            this.schema = str2;
            this.poiName = str3;
            this.collectInfo = str4;
            this.videoList = list;
            this.realTimeFavCnt = l;
            this.poiDisplay = str5;
            this.poiDistanceForShow = str6;
            this.typeLevel = str7;
            this.poiBackendType = str8;
            this.regionCode = str9;
            this.cityCode = str10;
            this.isClaimed = bool;
            this.LJLIL = str11;
            this.LJLILLLLZI = str12;
            this.LJLJI = z;
            this.LJLJJI = c85254Xd4;
        }

        public /* synthetic */ PoiDiscoveryCard(String str, String str2, String str3, String str4, List list, Long l, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, boolean z, C85254Xd4 c85254Xd4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : bool, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? false : z, (i & 65536) != 0 ? null : c85254Xd4);
        }
    }
}
