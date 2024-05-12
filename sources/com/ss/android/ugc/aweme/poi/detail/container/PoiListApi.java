package com.ss.android.ugc.aweme.poi.detail.container;

import X.AbstractC73672Svk;
import X.C07670Rv;
import X.C16880lQ;
import X.C189927cq;
import X.C189987cw;
import X.C1NE;
import X.C78685UuP;
import X.E4Q;
import X.E4T;
import X.EnumC189997cx;
import X.InterfaceC195787mI;
import X.InterfaceC195797mJ;
import X.InterfaceC57784Mm4;
import X.InterfaceC64985Pev;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.OwnerInfoModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface PoiListApi {
    public static final C189927cq LIZ = C189927cq.LIZ;

    /* loaded from: classes4.dex */
    public static final class PoiDetailResponse extends BaseResponse {

        @InterfaceC65349Pkn("formatted_address")
        public final String address;

        @InterfaceC65349Pkn("average_price")
        public final String averagePrice;

        @InterfaceC65349Pkn("booking_info")
        public final PoiBookingInfo bookingInfo;

        @InterfaceC65349Pkn("category_name")
        public final String categoryName;

        @InterfaceC65349Pkn("city_code")
        public final String cityCode;

        @InterfaceC65349Pkn("claim_store_status")
        public final Boolean claimStoreStatus;

        @InterfaceC65349Pkn("collect_info")
        public final String collectInfo;

        @InterfaceC65349Pkn("cover")
        public final UrlModel cover;

        @InterfaceC65349Pkn("dynamic_map_params")
        public final DynamicMapParams dynamicMapParams;

        @InterfaceC65349Pkn("edit_poi_status")
        public final Boolean editPoiStatus;

        @InterfaceC65349Pkn("father_poi")
        public final FatherPoiModel fatherPoi;

        @InterfaceC65349Pkn("follow_owner_status")
        public final Boolean followOwnerStatus;

        @InterfaceC65349Pkn("have_region_discovery")
        public final Boolean haveRegionDiscovery;

        @InterfaceC65349Pkn("is_ba_account")
        public final Boolean isBaAccount;

        @InterfaceC65349Pkn("is_collected")
        public final boolean isCollected;

        @InterfaceC65349Pkn("log_pb")
        public final LogPbBean logPb;

        @InterfaceC65349Pkn("poi_name")
        public final String name;

        @InterfaceC65349Pkn("owner_info")
        public final OwnerInfoModel ownerInfo;

        @InterfaceC65349Pkn("poi_info_source")
        public final String poiInfoSource;

        @InterfaceC65349Pkn("location")
        public final PoiLocation poiLocation;

        @InterfaceC65349Pkn("poi_review_summary")
        public final PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;

        @InterfaceC65349Pkn("real_time_fav_cnt")
        public final Long realFavoriteCnt;

        @InterfaceC65349Pkn("region_code")
        public final String regionCode;

        @InterfaceC65349Pkn("share_info")
        public final ShareInfo shareInfo;

        @InterfaceC65349Pkn("store_info")
        public final StoreInfoModel storeInfo;

        @InterfaceC65349Pkn("type_level")
        public final String typeLevel;

        @InterfaceC65349Pkn("video_count")
        public final Long videoCount;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDetailResponse)) {
                return false;
            }
            PoiDetailResponse poiDetailResponse = (PoiDetailResponse) obj;
            return o.LJ(this.name, poiDetailResponse.name) && o.LJ(this.address, poiDetailResponse.address) && o.LJ(this.videoCount, poiDetailResponse.videoCount) && o.LJ(this.cover, poiDetailResponse.cover) && this.isCollected == poiDetailResponse.isCollected && o.LJ(this.collectInfo, poiDetailResponse.collectInfo) && o.LJ(this.poiInfoSource, poiDetailResponse.poiInfoSource) && o.LJ(this.cityCode, poiDetailResponse.cityCode) && o.LJ(this.regionCode, poiDetailResponse.regionCode) && o.LJ(this.logPb, poiDetailResponse.logPb) && o.LJ(this.typeLevel, poiDetailResponse.typeLevel) && o.LJ(this.fatherPoi, poiDetailResponse.fatherPoi) && o.LJ(this.storeInfo, poiDetailResponse.storeInfo) && o.LJ(this.ownerInfo, poiDetailResponse.ownerInfo) && o.LJ(this.poiLocation, poiDetailResponse.poiLocation) && o.LJ(this.editPoiStatus, poiDetailResponse.editPoiStatus) && o.LJ(this.dynamicMapParams, poiDetailResponse.dynamicMapParams) && o.LJ(this.claimStoreStatus, poiDetailResponse.claimStoreStatus) && o.LJ(this.isBaAccount, poiDetailResponse.isBaAccount) && o.LJ(this.categoryName, poiDetailResponse.categoryName) && o.LJ(this.averagePrice, poiDetailResponse.averagePrice) && o.LJ(this.followOwnerStatus, poiDetailResponse.followOwnerStatus) && o.LJ(this.shareInfo, poiDetailResponse.shareInfo) && o.LJ(this.poiReviewSummaryModel, poiDetailResponse.poiReviewSummaryModel) && o.LJ(this.realFavoriteCnt, poiDetailResponse.realFavoriteCnt) && o.LJ(this.bookingInfo, poiDetailResponse.bookingInfo) && o.LJ(this.haveRegionDiscovery, poiDetailResponse.haveRegionDiscovery);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.address;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.videoCount;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            UrlModel urlModel = this.cover;
            int hashCode4 = (hashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            boolean z = this.isCollected;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode4 + i) * 31;
            String str3 = this.collectInfo;
            int hashCode5 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.poiInfoSource;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cityCode;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.regionCode;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            LogPbBean logPbBean = this.logPb;
            int hashCode9 = (hashCode8 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
            String str7 = this.typeLevel;
            int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            FatherPoiModel fatherPoiModel = this.fatherPoi;
            int hashCode11 = (hashCode10 + (fatherPoiModel == null ? 0 : fatherPoiModel.hashCode())) * 31;
            StoreInfoModel storeInfoModel = this.storeInfo;
            int hashCode12 = (hashCode11 + (storeInfoModel == null ? 0 : storeInfoModel.hashCode())) * 31;
            OwnerInfoModel ownerInfoModel = this.ownerInfo;
            int hashCode13 = (hashCode12 + (ownerInfoModel == null ? 0 : ownerInfoModel.hashCode())) * 31;
            PoiLocation poiLocation = this.poiLocation;
            int hashCode14 = (hashCode13 + (poiLocation == null ? 0 : poiLocation.hashCode())) * 31;
            Boolean bool = this.editPoiStatus;
            int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
            DynamicMapParams dynamicMapParams = this.dynamicMapParams;
            int hashCode16 = (hashCode15 + (dynamicMapParams == null ? 0 : dynamicMapParams.hashCode())) * 31;
            Boolean bool2 = this.claimStoreStatus;
            int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isBaAccount;
            int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str8 = this.categoryName;
            int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.averagePrice;
            int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool4 = this.followOwnerStatus;
            int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            ShareInfo shareInfo = this.shareInfo;
            int hashCode22 = (hashCode21 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31;
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.poiReviewSummaryModel;
            int hashCode23 = (hashCode22 + (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode())) * 31;
            Long l2 = this.realFavoriteCnt;
            int hashCode24 = (hashCode23 + (l2 == null ? 0 : l2.hashCode())) * 31;
            PoiBookingInfo poiBookingInfo = this.bookingInfo;
            int hashCode25 = (hashCode24 + (poiBookingInfo == null ? 0 : poiBookingInfo.hashCode())) * 31;
            Boolean bool5 = this.haveRegionDiscovery;
            return hashCode25 + (bool5 != null ? bool5.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            return "PoiDetailResponse(name=" + this.name + ", address=" + this.address + ", videoCount=" + this.videoCount + ", cover=" + this.cover + ", isCollected=" + this.isCollected + ", collectInfo=" + this.collectInfo + ", poiInfoSource=" + this.poiInfoSource + ", cityCode=" + this.cityCode + ", regionCode=" + this.regionCode + ", logPb=" + this.logPb + ", typeLevel=" + this.typeLevel + ", fatherPoi=" + this.fatherPoi + ", storeInfo=" + this.storeInfo + ", ownerInfo=" + this.ownerInfo + ", poiLocation=" + this.poiLocation + ", editPoiStatus=" + this.editPoiStatus + ", dynamicMapParams=" + this.dynamicMapParams + ", claimStoreStatus=" + this.claimStoreStatus + ", isBaAccount=" + this.isBaAccount + ", categoryName=" + this.categoryName + ", averagePrice=" + this.averagePrice + ", followOwnerStatus=" + this.followOwnerStatus + ", shareInfo=" + this.shareInfo + ", poiReviewSummaryModel=" + this.poiReviewSummaryModel + ", realFavoriteCnt=" + this.realFavoriteCnt + ", bookingInfo=" + this.bookingInfo + ", haveRegionDiscovery=" + this.haveRegionDiscovery + ')';
        }

        public final String LJI() {
            List<PoiBookingProviderInfo> providers;
            PoiBookingInfo poiBookingInfo = this.bookingInfo;
            if (poiBookingInfo != null && (providers = poiBookingInfo.getProviders()) != null) {
                ArrayList arrayList = new ArrayList();
                for (PoiBookingProviderInfo poiBookingProviderInfo : providers) {
                    PoiBookingProviderInfo poiBookingProviderInfo2 = poiBookingProviderInfo;
                    if (poiBookingProviderInfo2.getProvider() != null && poiBookingProviderInfo2.getUrl() != null) {
                        arrayList.add(poiBookingProviderInfo);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((PoiBookingProviderInfo) it.next()).getProvider());
                }
                String LLD = ORZ.LLD(arrayList2, ",", null, null, null, 62);
                if (LLD != null) {
                    return LLD;
                }
            }
            return "";
        }

        public final boolean LJII() {
            List<PoiBookingProviderInfo> providers;
            PoiBookingInfo poiBookingInfo = this.bookingInfo;
            if (poiBookingInfo == null || (providers = poiBookingInfo.getProviders()) == null) {
                return false;
            }
            for (PoiBookingProviderInfo poiBookingProviderInfo : providers) {
                Integer provider = poiBookingProviderInfo.getProvider();
                if (provider != null && provider.intValue() == 1) {
                    if (poiBookingProviderInfo == null) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        public final boolean LJIIIIZZ() {
            OwnerInfoModel ownerInfoModel = this.ownerInfo;
            if (ownerInfoModel != null && C78685UuP.LJJJZ(ownerInfoModel.getUid())) {
                return true;
            }
            return false;
        }

        public final String LJIIIZ() {
            C189987cw c189987cw = EnumC189997cx.Companion;
            String str = this.typeLevel;
            boolean LJIIIIZZ = LJIIIIZZ();
            c189987cw.getClass();
            EnumC189997cx LIZ = C189987cw.LIZ(str, LJIIIIZZ);
            if (LIZ == EnumC189997cx.CLAIMED_STORE || LIZ == EnumC189997cx.UN_CLAIMED_STORE) {
                if (LJIIIIZZ()) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "";
        }

        public final Boolean LJIIJ() {
            C189987cw c189987cw = EnumC189997cx.Companion;
            String str = this.typeLevel;
            boolean LJIIIIZZ = LJIIIIZZ();
            c189987cw.getClass();
            EnumC189997cx LIZ = C189987cw.LIZ(str, LJIIIIZZ);
            if (LIZ == EnumC189997cx.CLAIMED_STORE || LIZ == EnumC189997cx.UN_CLAIMED_STORE) {
                return Boolean.valueOf(LJIIIIZZ());
            }
            return null;
        }

        public final String LJIIJJI() {
            C189987cw c189987cw = EnumC189997cx.Companion;
            String str = this.typeLevel;
            boolean LJIIIIZZ = LJIIIIZZ();
            c189987cw.getClass();
            return C189987cw.LIZ(str, LJIIIIZZ).getTypeName();
        }

        public static PoiDetailResponse LJ(PoiDetailResponse poiDetailResponse, String str, boolean z, int i) {
            String str2;
            Long l;
            UrlModel urlModel;
            String str3;
            String str4;
            String str5;
            String str6;
            LogPbBean logPbBean;
            String str7;
            FatherPoiModel fatherPoiModel;
            StoreInfoModel storeInfoModel;
            OwnerInfoModel ownerInfoModel;
            PoiLocation poiLocation;
            Boolean bool;
            DynamicMapParams dynamicMapParams;
            Boolean bool2;
            Boolean bool3;
            String str8;
            String str9;
            Boolean bool4;
            ShareInfo shareInfo;
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
            Long l2;
            PoiBookingInfo poiBookingInfo;
            String str10 = str;
            boolean z2 = z;
            if ((i & 1) != 0) {
                str10 = poiDetailResponse.name;
            }
            Boolean bool5 = null;
            if ((i & 2) != 0) {
                str2 = poiDetailResponse.address;
            } else {
                str2 = null;
            }
            if ((i & 4) != 0) {
                l = poiDetailResponse.videoCount;
            } else {
                l = null;
            }
            if ((i & 8) != 0) {
                urlModel = poiDetailResponse.cover;
            } else {
                urlModel = null;
            }
            if ((i & 16) != 0) {
                z2 = poiDetailResponse.isCollected;
            }
            if ((i & 32) != 0) {
                str3 = poiDetailResponse.collectInfo;
            } else {
                str3 = null;
            }
            if ((i & 64) != 0) {
                str4 = poiDetailResponse.poiInfoSource;
            } else {
                str4 = null;
            }
            if ((i & 128) != 0) {
                str5 = poiDetailResponse.cityCode;
            } else {
                str5 = null;
            }
            if ((i & 256) != 0) {
                str6 = poiDetailResponse.regionCode;
            } else {
                str6 = null;
            }
            if ((i & 512) != 0) {
                logPbBean = poiDetailResponse.logPb;
            } else {
                logPbBean = null;
            }
            if ((i & 1024) != 0) {
                str7 = poiDetailResponse.typeLevel;
            } else {
                str7 = null;
            }
            if ((i & 2048) != 0) {
                fatherPoiModel = poiDetailResponse.fatherPoi;
            } else {
                fatherPoiModel = null;
            }
            if ((i & 4096) != 0) {
                storeInfoModel = poiDetailResponse.storeInfo;
            } else {
                storeInfoModel = null;
            }
            if ((i & FileUtils.BUFFER_SIZE) != 0) {
                ownerInfoModel = poiDetailResponse.ownerInfo;
            } else {
                ownerInfoModel = null;
            }
            if ((i & 16384) != 0) {
                poiLocation = poiDetailResponse.poiLocation;
            } else {
                poiLocation = null;
            }
            if ((32768 & i) != 0) {
                bool = poiDetailResponse.editPoiStatus;
            } else {
                bool = null;
            }
            if ((65536 & i) != 0) {
                dynamicMapParams = poiDetailResponse.dynamicMapParams;
            } else {
                dynamicMapParams = null;
            }
            if ((131072 & i) != 0) {
                bool2 = poiDetailResponse.claimStoreStatus;
            } else {
                bool2 = null;
            }
            if ((262144 & i) != 0) {
                bool3 = poiDetailResponse.isBaAccount;
            } else {
                bool3 = null;
            }
            if ((524288 & i) != 0) {
                str8 = poiDetailResponse.categoryName;
            } else {
                str8 = null;
            }
            if ((1048576 & i) != 0) {
                str9 = poiDetailResponse.averagePrice;
            } else {
                str9 = null;
            }
            if ((2097152 & i) != 0) {
                bool4 = poiDetailResponse.followOwnerStatus;
            } else {
                bool4 = null;
            }
            if ((4194304 & i) != 0) {
                shareInfo = poiDetailResponse.shareInfo;
            } else {
                shareInfo = null;
            }
            if ((8388608 & i) != 0) {
                poiReviewSummaryModel = poiDetailResponse.poiReviewSummaryModel;
            } else {
                poiReviewSummaryModel = null;
            }
            if ((16777216 & i) != 0) {
                l2 = poiDetailResponse.realFavoriteCnt;
            } else {
                l2 = null;
            }
            if ((33554432 & i) != 0) {
                poiBookingInfo = poiDetailResponse.bookingInfo;
            } else {
                poiBookingInfo = null;
            }
            if ((i & 67108864) != 0) {
                bool5 = poiDetailResponse.haveRegionDiscovery;
            }
            return new PoiDetailResponse(str10, str2, l, urlModel, z2, str3, str4, str5, str6, logPbBean, str7, fatherPoiModel, storeInfoModel, ownerInfoModel, poiLocation, bool, dynamicMapParams, bool2, bool3, str8, str9, bool4, shareInfo, poiReviewSummaryModel, l2, poiBookingInfo, bool5);
        }

        public PoiDetailResponse(String str, String str2, Long l, UrlModel urlModel, boolean z, String str3, String str4, String str5, String str6, LogPbBean logPbBean, String str7, FatherPoiModel fatherPoiModel, StoreInfoModel storeInfoModel, OwnerInfoModel ownerInfoModel, PoiLocation poiLocation, Boolean bool, DynamicMapParams dynamicMapParams, Boolean bool2, Boolean bool3, String str8, String str9, Boolean bool4, ShareInfo shareInfo, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, Long l2, PoiBookingInfo poiBookingInfo, Boolean bool5) {
            this.name = str;
            this.address = str2;
            this.videoCount = l;
            this.cover = urlModel;
            this.isCollected = z;
            this.collectInfo = str3;
            this.poiInfoSource = str4;
            this.cityCode = str5;
            this.regionCode = str6;
            this.logPb = logPbBean;
            this.typeLevel = str7;
            this.fatherPoi = fatherPoiModel;
            this.storeInfo = storeInfoModel;
            this.ownerInfo = ownerInfoModel;
            this.poiLocation = poiLocation;
            this.editPoiStatus = bool;
            this.dynamicMapParams = dynamicMapParams;
            this.claimStoreStatus = bool2;
            this.isBaAccount = bool3;
            this.categoryName = str8;
            this.averagePrice = str9;
            this.followOwnerStatus = bool4;
            this.shareInfo = shareInfo;
            this.poiReviewSummaryModel = poiReviewSummaryModel;
            this.realFavoriteCnt = l2;
            this.bookingInfo = poiBookingInfo;
            this.haveRegionDiscovery = bool5;
        }

        public /* synthetic */ PoiDetailResponse(String str, String str2, Long l, UrlModel urlModel, boolean z, String str3, String str4, String str5, String str6, LogPbBean logPbBean, String str7, FatherPoiModel fatherPoiModel, StoreInfoModel storeInfoModel, OwnerInfoModel ownerInfoModel, PoiLocation poiLocation, Boolean bool, DynamicMapParams dynamicMapParams, Boolean bool2, Boolean bool3, String str8, String str9, Boolean bool4, ShareInfo shareInfo, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, Long l2, PoiBookingInfo poiBookingInfo, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, l, (i & 8) != 0 ? null : urlModel, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : logPbBean, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : fatherPoiModel, (i & 4096) != 0 ? null : storeInfoModel, (i & FileUtils.BUFFER_SIZE) != 0 ? null : ownerInfoModel, (i & 16384) != 0 ? null : poiLocation, (32768 & i) != 0 ? null : bool, (65536 & i) != 0 ? null : dynamicMapParams, (131072 & i) != 0 ? null : bool2, (262144 & i) != 0 ? null : bool3, (524288 & i) != 0 ? null : str8, (1048576 & i) != 0 ? null : str9, (2097152 & i) != 0 ? null : bool4, (4194304 & i) != 0 ? null : shareInfo, (8388608 & i) != 0 ? null : poiReviewSummaryModel, (16777216 & i) != 0 ? null : l2, (33554432 & i) != 0 ? null : poiBookingInfo, (i & 67108864) == 0 ? bool5 : null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiYMALModel implements InterfaceC57784Mm4 {

        @InterfaceC65349Pkn("basic_info")
        public final PoiBasicInfo basicInfo;

        @InterfaceC65349Pkn("sub_tags")
        public final List<String> subTags;

        @InterfaceC65349Pkn("track_info")
        public final String trackInfo;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiYMALModel)) {
                return false;
            }
            PoiYMALModel poiYMALModel = (PoiYMALModel) obj;
            return o.LJ(this.basicInfo, poiYMALModel.basicInfo) && o.LJ(this.subTags, poiYMALModel.subTags) && o.LJ(this.trackInfo, poiYMALModel.trackInfo);
        }

        @Override // X.InterfaceC57784Mm4
        public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return null;
        }

        public final int hashCode() {
            PoiBasicInfo poiBasicInfo = this.basicInfo;
            int hashCode = (poiBasicInfo == null ? 0 : poiBasicInfo.hashCode()) * 31;
            List<String> list = this.subTags;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackInfo;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final Boolean LIZ() {
            if (this.trackInfo == null) {
                return null;
            }
            try {
                return Boolean.valueOf(new JSONObject(this.trackInfo).optBoolean("is_claimed"));
            } catch (Exception unused) {
                return null;
            }
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiYMALModel(basicInfo=");
            LIZ.append(this.basicInfo);
            LIZ.append(", subTags=");
            LIZ.append(this.subTags);
            LIZ.append(", trackInfo=");
            return q.LIZIZ(LIZ, this.trackInfo, ')', LIZ);
        }

        @Override // X.InterfaceC57784Mm4
        public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return o.LJ(interfaceC57784Mm4, this);
        }

        @Override // X.InterfaceC57784Mm4
        public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
            String str;
            PoiYMALModel poiYMALModel;
            PoiBasicInfo poiBasicInfo;
            PoiBasicInfo poiBasicInfo2 = this.basicInfo;
            String str2 = null;
            if (poiBasicInfo2 != null) {
                str = poiBasicInfo2.id;
            } else {
                str = null;
            }
            if ((interfaceC57784Mm4 instanceof PoiYMALModel) && (poiYMALModel = (PoiYMALModel) interfaceC57784Mm4) != null && (poiBasicInfo = poiYMALModel.basicInfo) != null) {
                str2 = poiBasicInfo.id;
            }
            return o.LJ(str, str2);
        }

        public PoiYMALModel(PoiBasicInfo poiBasicInfo, List<String> list, String str) {
            this.basicInfo = poiBasicInfo;
            this.subTags = list;
            this.trackInfo = str;
        }
    }

    @InterfaceC195787mI
    @E4T("/tiktok/poi/collect/v1")
    AbstractC73672Svk<BaseResponse> collectPoi(@InterfaceC64985Pev("poi_id") String str, @InterfaceC64985Pev("action") int i);

    @E4Q("/tiktok/poi/get/v1")
    AbstractC73672Svk<PoiDetailResponse> getPoiDetail(@InterfaceC64989Pez("poi_id") String str);

    @E4Q("/tiktok/poi/video/list/v1")
    AbstractC73672Svk<PoiVideoListResponse> getPoiVideoList(@InterfaceC64989Pez("poi_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("search_id") String str2);

    @InterfaceC195787mI
    @E4T
    AbstractC73672Svk<SearchMix> getPoiVideoListBySearchApi(@InterfaceC195797mJ String str, @InterfaceC64987Pex("offset") long j, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("search_source") String str2, @InterfaceC64987Pex("is_filter_search") int i2, @InterfaceC64987Pex("poi_id") String str3, @InterfaceC64987Pex("search_id") String str4);

    @E4Q("/tiktok/poi/ymal/get/v1")
    AbstractC73672Svk<PoiYMALResponse> getPoiYMAL(@InterfaceC64989Pez("poi_id") String str);

    /* loaded from: classes4.dex */
    public static final class PoiLocation {

        @InterfaceC65349Pkn("lat")
        public final double lat;

        @InterfaceC65349Pkn("lng")
        public final double lng;

        public static /* synthetic */ PoiLocation copy$default(PoiLocation poiLocation, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = poiLocation.lat;
            }
            if ((i & 2) != 0) {
                d2 = poiLocation.lng;
            }
            return poiLocation.copy(d, d2);
        }

        public final PoiLocation copy(double d, double d2) {
            return new PoiLocation(d, d2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiLocation)) {
                return false;
            }
            PoiLocation poiLocation = (PoiLocation) obj;
            return Double.compare(this.lat, poiLocation.lat) == 0 && Double.compare(this.lng, poiLocation.lng) == 0;
        }

        public int hashCode() {
            return C16880lQ.LLJI(this.lng) + (C16880lQ.LLJI(this.lat) * 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiLocation(lat=");
            LIZ.append(this.lat);
            LIZ.append(", lng=");
            return C07670Rv.LIZ(LIZ, this.lng, ')', LIZ);
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLng() {
            return this.lng;
        }

        public PoiLocation(double d, double d2) {
            this.lat = d;
            this.lng = d2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PoiYMALResponse extends BaseResponse {

        @InterfaceC65349Pkn("pois")
        public final List<PoiYMALModel> ymalModels;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiYMALResponse) && o.LJ(this.ymalModels, ((PoiYMALResponse) obj).ymalModels);
        }

        public final int hashCode() {
            List<PoiYMALModel> list = this.ymalModels;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiYMALResponse(ymalModels=");
            return C1NE.LIZIZ(LIZ, this.ymalModels, ')', LIZ);
        }

        public PoiYMALResponse(List<PoiYMALModel> list) {
            this.ymalModels = list;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PoiVideoListResponse extends BaseResponse {

        @InterfaceC65349Pkn("aweme_list")
        public final List<Aweme> awemes;

        @InterfaceC65349Pkn("cursor")
        public final Long cursor;

        @InterfaceC65349Pkn("has_more")
        public final Integer hasMore;

        @InterfaceC65349Pkn("log_pb")
        public final LogPbBean logPb;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiVideoListResponse)) {
                return false;
            }
            PoiVideoListResponse poiVideoListResponse = (PoiVideoListResponse) obj;
            return o.LJ(this.awemes, poiVideoListResponse.awemes) && o.LJ(this.cursor, poiVideoListResponse.cursor) && o.LJ(this.hasMore, poiVideoListResponse.hasMore) && o.LJ(this.logPb, poiVideoListResponse.logPb);
        }

        public final int hashCode() {
            List<Aweme> list = this.awemes;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Long l = this.cursor;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.hasMore;
            return this.logPb.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiVideoListResponse(awemes=");
            LIZ.append(this.awemes);
            LIZ.append(", cursor=");
            LIZ.append(this.cursor);
            LIZ.append(", hasMore=");
            LIZ.append(this.hasMore);
            LIZ.append(", logPb=");
            LIZ.append(this.logPb);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PoiVideoListResponse(List<? extends Aweme> list, Long l, Integer num, LogPbBean logPb) {
            o.LJIIIZ(logPb, "logPb");
            this.awemes = list;
            this.cursor = l;
            this.hasMore = num;
            this.logPb = logPb;
        }
    }
}
