package com.ss.android.ugc.aweme.poi.reviews;

import X.AbstractC73672Svk;
import X.C07670Rv;
import X.C199057rZ;
import X.C1NE;
import X.C31461Li;
import X.C78920UyC;
import X.E4Q;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC57784Mm4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.InterfaceC67352kd;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public interface PoiReviewsApi {
    public static final C199057rZ LIZ = C199057rZ.LIZ;

    /* loaded from: classes4.dex */
    public static final class PoiReviewModel implements InterfaceC57784Mm4 {
        public final boolean LJLIL;
        public final boolean LJLILLLLZI;
        public final String LJLJI;

        @InterfaceC65349Pkn("author")
        public final PoiReviewUserModel author;

        @InterfaceC65349Pkn("basic_info")
        public final PoiReviewBasicInfoModel basicInfo;

        @InterfaceC65349Pkn("content")
        public final PoiReviewContentModel content;

        @InterfaceC65349Pkn("poi_id")
        public final String poiId;

        @InterfaceC65349Pkn("review_id")
        public final String reviewId;

        @InterfaceC65349Pkn("server_param")
        public final String serverParam;

        @InterfaceC65349Pkn("statistics")
        public final PoiReviewStatisticsModel statistics;

        @InterfaceC65349Pkn("review_status")
        public final PoiReviewStatusModel status;

        @InterfaceC65349Pkn("user_status")
        public final PoiReviewUserStatusModel userStatus;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PoiReviewModel() {
            /*
                r15 = this;
                r1 = 0
                r10 = 0
                r13 = 4095(0xfff, float:5.738E-42)
                r0 = r15
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r1
                r8 = r1
                r9 = r1
                r11 = r10
                r12 = r1
                r14 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewModel)) {
                return false;
            }
            PoiReviewModel poiReviewModel = (PoiReviewModel) obj;
            return o.LJ(this.poiId, poiReviewModel.poiId) && o.LJ(this.reviewId, poiReviewModel.reviewId) && o.LJ(this.author, poiReviewModel.author) && o.LJ(this.content, poiReviewModel.content) && o.LJ(this.basicInfo, poiReviewModel.basicInfo) && o.LJ(this.statistics, poiReviewModel.statistics) && o.LJ(this.userStatus, poiReviewModel.userStatus) && o.LJ(this.status, poiReviewModel.status) && o.LJ(this.serverParam, poiReviewModel.serverParam) && this.LJLIL == poiReviewModel.LJLIL && this.LJLILLLLZI == poiReviewModel.LJLILLLLZI && o.LJ(this.LJLJI, poiReviewModel.LJLJI);
        }

        @Override // X.InterfaceC57784Mm4
        public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.poiId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.reviewId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PoiReviewUserModel poiReviewUserModel = this.author;
            int hashCode3 = (hashCode2 + (poiReviewUserModel == null ? 0 : poiReviewUserModel.hashCode())) * 31;
            PoiReviewContentModel poiReviewContentModel = this.content;
            int hashCode4 = (hashCode3 + (poiReviewContentModel == null ? 0 : poiReviewContentModel.hashCode())) * 31;
            PoiReviewBasicInfoModel poiReviewBasicInfoModel = this.basicInfo;
            int hashCode5 = (hashCode4 + (poiReviewBasicInfoModel == null ? 0 : poiReviewBasicInfoModel.hashCode())) * 31;
            PoiReviewStatisticsModel poiReviewStatisticsModel = this.statistics;
            int hashCode6 = (hashCode5 + (poiReviewStatisticsModel == null ? 0 : poiReviewStatisticsModel.hashCode())) * 31;
            PoiReviewUserStatusModel poiReviewUserStatusModel = this.userStatus;
            int hashCode7 = (hashCode6 + (poiReviewUserStatusModel == null ? 0 : poiReviewUserStatusModel.hashCode())) * 31;
            PoiReviewStatusModel poiReviewStatusModel = this.status;
            int hashCode8 = (hashCode7 + (poiReviewStatusModel == null ? 0 : poiReviewStatusModel.hashCode())) * 31;
            String str3 = this.serverParam;
            int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            boolean z = this.LJLIL;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (((hashCode9 + i) * 31) + (this.LJLILLLLZI ? 1 : 0)) * 31;
            String str4 = this.LJLJI;
            return i2 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PoiReviewModel(poiId=");
            sb.append(this.poiId);
            sb.append(", reviewId=");
            sb.append(this.reviewId);
            sb.append(", author=");
            sb.append(this.author);
            sb.append(", content=");
            sb.append(this.content);
            sb.append(", basicInfo=");
            sb.append(this.basicInfo);
            sb.append(", statistics=");
            sb.append(this.statistics);
            sb.append(", userStatus=");
            sb.append(this.userStatus);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", serverParam=");
            sb.append(this.serverParam);
            sb.append(", expanded=");
            sb.append(this.LJLIL);
            sb.append(", wantTranslate=");
            sb.append(this.LJLILLLLZI);
            sb.append(", translatedContent=");
            return C07670Rv.LIZIZ(sb, this.LJLJI, ')');
        }

        @Override // X.InterfaceC57784Mm4
        public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
            return o.LJ(interfaceC57784Mm4, this);
        }

        @Override // X.InterfaceC57784Mm4
        public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
            PoiReviewModel poiReviewModel;
            String str = this.reviewId;
            if (str == null) {
                return false;
            }
            String str2 = null;
            if ((interfaceC57784Mm4 instanceof PoiReviewModel) && (poiReviewModel = (PoiReviewModel) interfaceC57784Mm4) != null) {
                str2 = poiReviewModel.reviewId;
            }
            return o.LJ(str, str2);
        }

        public static PoiReviewModel LIZ(PoiReviewModel poiReviewModel, PoiReviewStatisticsModel poiReviewStatisticsModel, PoiReviewUserStatusModel poiReviewUserStatusModel, boolean z, boolean z2, String str, int i) {
            String str2;
            String str3;
            PoiReviewUserModel poiReviewUserModel;
            PoiReviewContentModel poiReviewContentModel;
            PoiReviewBasicInfoModel poiReviewBasicInfoModel;
            PoiReviewStatusModel poiReviewStatusModel;
            String str4 = str;
            boolean z3 = z2;
            PoiReviewStatisticsModel poiReviewStatisticsModel2 = poiReviewStatisticsModel;
            boolean z4 = z;
            PoiReviewUserStatusModel poiReviewUserStatusModel2 = poiReviewUserStatusModel;
            String str5 = null;
            if ((i & 1) != 0) {
                str2 = poiReviewModel.poiId;
            } else {
                str2 = null;
            }
            if ((i & 2) != 0) {
                str3 = poiReviewModel.reviewId;
            } else {
                str3 = null;
            }
            if ((i & 4) != 0) {
                poiReviewUserModel = poiReviewModel.author;
            } else {
                poiReviewUserModel = null;
            }
            if ((i & 8) != 0) {
                poiReviewContentModel = poiReviewModel.content;
            } else {
                poiReviewContentModel = null;
            }
            if ((i & 16) != 0) {
                poiReviewBasicInfoModel = poiReviewModel.basicInfo;
            } else {
                poiReviewBasicInfoModel = null;
            }
            if ((i & 32) != 0) {
                poiReviewStatisticsModel2 = poiReviewModel.statistics;
            }
            if ((i & 64) != 0) {
                poiReviewUserStatusModel2 = poiReviewModel.userStatus;
            }
            if ((i & 128) != 0) {
                poiReviewStatusModel = poiReviewModel.status;
            } else {
                poiReviewStatusModel = null;
            }
            if ((i & 256) != 0) {
                str5 = poiReviewModel.serverParam;
            }
            if ((i & 512) != 0) {
                z4 = poiReviewModel.LJLIL;
            }
            if ((i & 1024) != 0) {
                z3 = poiReviewModel.LJLILLLLZI;
            }
            if ((i & 2048) != 0) {
                str4 = poiReviewModel.LJLJI;
            }
            poiReviewModel.getClass();
            return new PoiReviewModel(str2, str3, poiReviewUserModel, poiReviewContentModel, poiReviewBasicInfoModel, poiReviewStatisticsModel2, poiReviewUserStatusModel2, poiReviewStatusModel, str5, z4, z3, str4);
        }

        public PoiReviewModel(String str, String str2, PoiReviewUserModel poiReviewUserModel, PoiReviewContentModel poiReviewContentModel, PoiReviewBasicInfoModel poiReviewBasicInfoModel, PoiReviewStatisticsModel poiReviewStatisticsModel, PoiReviewUserStatusModel poiReviewUserStatusModel, PoiReviewStatusModel poiReviewStatusModel, String str3, boolean z, boolean z2, String str4) {
            this.poiId = str;
            this.reviewId = str2;
            this.author = poiReviewUserModel;
            this.content = poiReviewContentModel;
            this.basicInfo = poiReviewBasicInfoModel;
            this.statistics = poiReviewStatisticsModel;
            this.userStatus = poiReviewUserStatusModel;
            this.status = poiReviewStatusModel;
            this.serverParam = str3;
            this.LJLIL = z;
            this.LJLILLLLZI = z2;
            this.LJLJI = str4;
        }

        public /* synthetic */ PoiReviewModel(String str, String str2, PoiReviewUserModel poiReviewUserModel, PoiReviewContentModel poiReviewContentModel, PoiReviewBasicInfoModel poiReviewBasicInfoModel, PoiReviewStatisticsModel poiReviewStatisticsModel, PoiReviewUserStatusModel poiReviewUserStatusModel, PoiReviewStatusModel poiReviewStatusModel, String str3, boolean z, boolean z2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : poiReviewUserModel, (i & 8) != 0 ? null : poiReviewContentModel, (i & 16) != 0 ? null : poiReviewBasicInfoModel, (i & 32) != 0 ? null : poiReviewStatisticsModel, (i & 64) != 0 ? null : poiReviewUserStatusModel, (i & 128) != 0 ? null : poiReviewStatusModel, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false, (i & 2048) == 0 ? str4 : null);
        }
    }

    @E8M("/tiktok/poi/review/interact/v1")
    @InterfaceC195757mF
    Object doPoiReviewInteract(@InterfaceC64985Pev("poi_id") String str, @InterfaceC64985Pev("review_id") String str2, @InterfaceC64985Pev("interaction") int i, @InterfaceC64985Pev("server_param") String str3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E4Q("/tiktok/poi/review/get/v1")
    AbstractC73672Svk<PoiReviewListResponse> getPoiReviewsList(@InterfaceC64989Pez("poi_id") String str, @InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("cursor") long j);

    @E8M("/aweme/v1/content/translation/")
    @InterfaceC195757mF
    AbstractC73672Svk<TranslationResponse> getTranslation(@InterfaceC64985Pev("trg_lang") String str, @InterfaceC64985Pev("content") String str2, @InterfaceC64986Pew("scene") Integer num);

    @E8M("/tiktok/poi/review/eligible/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<PoiReviewEligibleResponse> isReviewEligible(@InterfaceC64985Pev("poi_id") String str, @InterfaceC64985Pev("post_source") int i);

    /* loaded from: classes4.dex */
    public static final class ImageDataModel {

        @InterfaceC65349Pkn("crop_image")
        public final UrlModel cropImage;

        @InterfaceC65349Pkn("origin_image")
        public final UrlModel originImage;

        /* JADX WARN: Multi-variable type inference failed */
        public ImageDataModel() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageDataModel)) {
                return false;
            }
            ImageDataModel imageDataModel = (ImageDataModel) obj;
            return o.LJ(this.originImage, imageDataModel.originImage) && o.LJ(this.cropImage, imageDataModel.cropImage);
        }

        public final int hashCode() {
            UrlModel urlModel = this.originImage;
            int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
            UrlModel urlModel2 = this.cropImage;
            return hashCode + (urlModel2 != null ? urlModel2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImageDataModel(originImage=");
            LIZ.append(this.originImage);
            LIZ.append(", cropImage=");
            return C31461Li.LIZLLL(LIZ, this.cropImage, ')', LIZ);
        }

        public ImageDataModel(UrlModel urlModel, UrlModel urlModel2) {
            this.originImage = urlModel;
            this.cropImage = urlModel2;
        }

        public /* synthetic */ ImageDataModel(UrlModel urlModel, UrlModel urlModel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? null : urlModel2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PoiReviewBasicInfoModel {

        @InterfaceC65349Pkn("create_time")
        public final Long createTime;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiReviewBasicInfoModel() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReviewBasicInfoModel) && o.LJ(this.createTime, ((PoiReviewBasicInfoModel) obj).createTime);
        }

        public final int hashCode() {
            Long l = this.createTime;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewBasicInfoModel(createTime=");
            return JBR.LJ(LIZ, this.createTime, ')', LIZ);
        }

        public PoiReviewBasicInfoModel(Long l) {
            this.createTime = l;
        }

        public /* synthetic */ PoiReviewBasicInfoModel(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l);
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiReviewContentModel {

        @InterfaceC65349Pkn("image_data")
        public final List<ImageDataModel> images;

        @InterfaceC65349Pkn("rating")
        public final Double rating;

        @InterfaceC65349Pkn("text")
        public final String text;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiReviewContentModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewContentModel)) {
                return false;
            }
            PoiReviewContentModel poiReviewContentModel = (PoiReviewContentModel) obj;
            return o.LJ(this.rating, poiReviewContentModel.rating) && o.LJ(this.text, poiReviewContentModel.text) && o.LJ(this.images, poiReviewContentModel.images);
        }

        public final int hashCode() {
            Double d = this.rating;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<ImageDataModel> list = this.images;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewContentModel(rating=");
            LIZ.append(this.rating);
            LIZ.append(", text=");
            LIZ.append(this.text);
            LIZ.append(", images=");
            return C1NE.LIZIZ(LIZ, this.images, ')', LIZ);
        }

        public PoiReviewContentModel(Double d, String str, List<ImageDataModel> list) {
            this.rating = d;
            this.text = str;
            this.images = list;
        }

        public /* synthetic */ PoiReviewContentModel(Double d, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiReviewEligibleResponse extends BaseResponse {

        @InterfaceC65349Pkn("collect_info")
        public final String collectInfo;

        @InterfaceC65349Pkn("eligible")
        public final Boolean eligible;

        @InterfaceC65349Pkn("poi_name")
        public final String poiName;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewEligibleResponse)) {
                return false;
            }
            PoiReviewEligibleResponse poiReviewEligibleResponse = (PoiReviewEligibleResponse) obj;
            return o.LJ(this.eligible, poiReviewEligibleResponse.eligible) && o.LJ(this.poiName, poiReviewEligibleResponse.poiName) && o.LJ(this.collectInfo, poiReviewEligibleResponse.collectInfo);
        }

        public final int hashCode() {
            Boolean bool = this.eligible;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.poiName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.collectInfo;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewEligibleResponse(eligible=");
            LIZ.append(this.eligible);
            LIZ.append(", poiName=");
            LIZ.append(this.poiName);
            LIZ.append(", collectInfo=");
            return q.LIZIZ(LIZ, this.collectInfo, ')', LIZ);
        }

        public PoiReviewEligibleResponse(Boolean bool, String str, String str2) {
            this.eligible = bool;
            this.poiName = str;
            this.collectInfo = str2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiReviewListResponse extends BaseResponse {

        @InterfaceC65349Pkn("collect_info")
        public final String collectInfo;

        @InterfaceC65349Pkn("cursor")
        public final Long cursor;

        @InterfaceC65349Pkn("eligible_to_post")
        public final Boolean eligible;

        @InterfaceC65349Pkn("folded_cursor")
        public final Long foldedCursor;

        @InterfaceC65349Pkn("folded_has_more")
        public final Boolean foldedHasMore;

        @InterfaceC65349Pkn("has_more")
        public final Boolean hasMore;

        @InterfaceC65349Pkn("review_summary")
        public final PoiReviewSummaryModel reviewSummary;

        @InterfaceC65349Pkn("reviews")
        public final List<PoiReviewModel> reviews;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewListResponse)) {
                return false;
            }
            PoiReviewListResponse poiReviewListResponse = (PoiReviewListResponse) obj;
            return o.LJ(this.reviews, poiReviewListResponse.reviews) && o.LJ(this.reviewSummary, poiReviewListResponse.reviewSummary) && o.LJ(this.cursor, poiReviewListResponse.cursor) && o.LJ(this.hasMore, poiReviewListResponse.hasMore) && o.LJ(this.foldedCursor, poiReviewListResponse.foldedCursor) && o.LJ(this.foldedHasMore, poiReviewListResponse.foldedHasMore) && o.LJ(this.collectInfo, poiReviewListResponse.collectInfo) && o.LJ(this.eligible, poiReviewListResponse.eligible);
        }

        public final int hashCode() {
            List<PoiReviewModel> list = this.reviews;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            PoiReviewSummaryModel poiReviewSummaryModel = this.reviewSummary;
            int hashCode2 = (hashCode + (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode())) * 31;
            Long l = this.cursor;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Boolean bool = this.hasMore;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l2 = this.foldedCursor;
            int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Boolean bool2 = this.foldedHasMore;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.collectInfo;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool3 = this.eligible;
            return hashCode7 + (bool3 != null ? bool3.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewListResponse(reviews=");
            LIZ.append(this.reviews);
            LIZ.append(", reviewSummary=");
            LIZ.append(this.reviewSummary);
            LIZ.append(", cursor=");
            LIZ.append(this.cursor);
            LIZ.append(", hasMore=");
            LIZ.append(this.hasMore);
            LIZ.append(", foldedCursor=");
            LIZ.append(this.foldedCursor);
            LIZ.append(", foldedHasMore=");
            LIZ.append(this.foldedHasMore);
            LIZ.append(", collectInfo=");
            LIZ.append(this.collectInfo);
            LIZ.append(", eligible=");
            return C78920UyC.LIZIZ(LIZ, this.eligible, ')', LIZ);
        }

        public PoiReviewListResponse(List<PoiReviewModel> list, PoiReviewSummaryModel poiReviewSummaryModel, Long l, Boolean bool, Long l2, Boolean bool2, String str, Boolean bool3) {
            this.reviews = list;
            this.reviewSummary = poiReviewSummaryModel;
            this.cursor = l;
            this.hasMore = bool;
            this.foldedCursor = l2;
            this.foldedHasMore = bool2;
            this.collectInfo = str;
            this.eligible = bool3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ PoiReviewListResponse(java.util.List r11, com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewSummaryModel r12, java.lang.Long r13, java.lang.Boolean r14, java.lang.Long r15, java.lang.Boolean r16, java.lang.String r17, java.lang.Boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
            /*
                r10 = this;
                r5 = r14
                r4 = r13
                r7 = r16
                r8 = r17
                r3 = r19
                r2 = r3 & 4
                r0 = 0
                java.lang.Long r6 = java.lang.Long.valueOf(r0)
                if (r2 == 0) goto L13
                r4 = r6
            L13:
                r0 = r3 & 8
                if (r0 == 0) goto L19
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
            L19:
                r0 = r3 & 16
                if (r0 == 0) goto L37
            L1d:
                r0 = r3 & 32
                if (r0 == 0) goto L23
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
            L23:
                r0 = r3 & 64
                r9 = 0
                if (r0 == 0) goto L29
                r8 = r9
            L29:
                r0 = r3 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L34
            L2d:
                r3 = r12
                r1 = r10
                r2 = r11
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            L34:
                r9 = r18
                goto L2d
            L37:
                r6 = r15
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewListResponse.<init>(java.util.List, com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi$PoiReviewSummaryModel, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiReviewStatisticsModel {

        @InterfaceC65349Pkn("like_count")
        public final Long likeCount;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiReviewStatisticsModel() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReviewStatisticsModel) && o.LJ(this.likeCount, ((PoiReviewStatisticsModel) obj).likeCount);
        }

        public final int hashCode() {
            Long l = this.likeCount;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewStatisticsModel(likeCount=");
            return JBR.LJ(LIZ, this.likeCount, ')', LIZ);
        }

        public PoiReviewStatisticsModel(Long l) {
            this.likeCount = l;
        }

        public /* synthetic */ PoiReviewStatisticsModel(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PoiReviewStatusModel {

        @InterfaceC65349Pkn("status")
        public final Integer status;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiReviewStatusModel() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReviewStatusModel) && o.LJ(this.status, ((PoiReviewStatusModel) obj).status);
        }

        public final int hashCode() {
            Integer num = this.status;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewStatusModel(status=");
            return s0.LIZJ(LIZ, this.status, ')', LIZ);
        }

        public PoiReviewStatusModel(Integer num) {
            this.status = num;
        }

        public /* synthetic */ PoiReviewStatusModel(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiReviewUserModel {

        @InterfaceC65349Pkn("avatar_168")
        public final UrlModel avatar168;

        @InterfaceC65349Pkn("avatar_300")
        public final UrlModel avatar300;

        @InterfaceC65349Pkn("avatar_larger")
        public final UrlModel avatarLarger;

        @InterfaceC65349Pkn("avatar_medium")
        public final UrlModel avatarMedium;

        @InterfaceC65349Pkn("avatar_thumb")
        public final UrlModel avatarThumb;

        @InterfaceC65349Pkn("nickname")
        public final String nickname;

        @InterfaceC65349Pkn("unique_id")
        public final String uniqueId;

        @InterfaceC65349Pkn("user_id")
        public final String userId;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiReviewUserModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewUserModel)) {
                return false;
            }
            PoiReviewUserModel poiReviewUserModel = (PoiReviewUserModel) obj;
            return o.LJ(this.userId, poiReviewUserModel.userId) && o.LJ(this.nickname, poiReviewUserModel.nickname) && o.LJ(this.uniqueId, poiReviewUserModel.uniqueId) && o.LJ(this.avatarThumb, poiReviewUserModel.avatarThumb) && o.LJ(this.avatarMedium, poiReviewUserModel.avatarMedium) && o.LJ(this.avatarLarger, poiReviewUserModel.avatarLarger) && o.LJ(this.avatar168, poiReviewUserModel.avatar168) && o.LJ(this.avatar300, poiReviewUserModel.avatar300);
        }

        public final int hashCode() {
            String str = this.userId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.nickname;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uniqueId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            UrlModel urlModel = this.avatarThumb;
            int hashCode4 = (hashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            UrlModel urlModel2 = this.avatarMedium;
            int hashCode5 = (hashCode4 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
            UrlModel urlModel3 = this.avatarLarger;
            int hashCode6 = (hashCode5 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
            UrlModel urlModel4 = this.avatar168;
            int hashCode7 = (hashCode6 + (urlModel4 == null ? 0 : urlModel4.hashCode())) * 31;
            UrlModel urlModel5 = this.avatar300;
            return hashCode7 + (urlModel5 != null ? urlModel5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewUserModel(userId=");
            LIZ.append(this.userId);
            LIZ.append(", nickname=");
            LIZ.append(this.nickname);
            LIZ.append(", uniqueId=");
            LIZ.append(this.uniqueId);
            LIZ.append(", avatarThumb=");
            LIZ.append(this.avatarThumb);
            LIZ.append(", avatarMedium=");
            LIZ.append(this.avatarMedium);
            LIZ.append(", avatarLarger=");
            LIZ.append(this.avatarLarger);
            LIZ.append(", avatar168=");
            LIZ.append(this.avatar168);
            LIZ.append(", avatar300=");
            return C31461Li.LIZLLL(LIZ, this.avatar300, ')', LIZ);
        }

        public PoiReviewUserModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5) {
            this.userId = str;
            this.nickname = str2;
            this.uniqueId = str3;
            this.avatarThumb = urlModel;
            this.avatarMedium = urlModel2;
            this.avatarLarger = urlModel3;
            this.avatar168 = urlModel4;
            this.avatar300 = urlModel5;
        }

        public /* synthetic */ PoiReviewUserModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : urlModel, (i & 16) != 0 ? null : urlModel2, (i & 32) != 0 ? null : urlModel3, (i & 64) != 0 ? null : urlModel4, (i & 128) == 0 ? urlModel5 : null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiReviewUserStatusModel {

        @InterfaceC65349Pkn("disliked")
        public final Boolean disliked;

        @InterfaceC65349Pkn("liked")
        public final Boolean liked;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiReviewUserStatusModel() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewUserStatusModel)) {
                return false;
            }
            PoiReviewUserStatusModel poiReviewUserStatusModel = (PoiReviewUserStatusModel) obj;
            return o.LJ(this.liked, poiReviewUserStatusModel.liked) && o.LJ(this.disliked, poiReviewUserStatusModel.disliked);
        }

        public final int hashCode() {
            Boolean bool = this.liked;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.disliked;
            return hashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewUserStatusModel(liked=");
            LIZ.append(this.liked);
            LIZ.append(", disliked=");
            return C78920UyC.LIZIZ(LIZ, this.disliked, ')', LIZ);
        }

        public PoiReviewUserStatusModel(Boolean bool, Boolean bool2) {
            this.liked = bool;
            this.disliked = bool2;
        }

        public /* synthetic */ PoiReviewUserStatusModel(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TranslationResponse {

        @InterfaceC65349Pkn("status_code")
        public final Integer statusCode;

        @InterfaceC65349Pkn("translated_content")
        public final String translatedContent;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TranslationResponse)) {
                return false;
            }
            TranslationResponse translationResponse = (TranslationResponse) obj;
            return o.LJ(this.statusCode, translationResponse.statusCode) && o.LJ(this.translatedContent, translationResponse.translatedContent);
        }

        public final int hashCode() {
            Integer num = this.statusCode;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.translatedContent;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TranslationResponse(statusCode=");
            LIZ.append(this.statusCode);
            LIZ.append(", translatedContent=");
            return q.LIZIZ(LIZ, this.translatedContent, ')', LIZ);
        }

        public TranslationResponse(Integer num, String str) {
            this.statusCode = num;
            this.translatedContent = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiReviewSummaryModel {

        @InterfaceC65349Pkn("score")
        public final Double score;

        @InterfaceC65349Pkn("total_count")
        public final Long totalCount;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiReviewSummaryModel() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewSummaryModel)) {
                return false;
            }
            PoiReviewSummaryModel poiReviewSummaryModel = (PoiReviewSummaryModel) obj;
            return o.LJ(this.totalCount, poiReviewSummaryModel.totalCount) && o.LJ(this.score, poiReviewSummaryModel.score);
        }

        public final int hashCode() {
            Long l = this.totalCount;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Double d = this.score;
            return hashCode + (d != null ? d.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReviewSummaryModel(totalCount=");
            LIZ.append(this.totalCount);
            LIZ.append(", score=");
            LIZ.append(this.score);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public PoiReviewSummaryModel(Long l, Double d) {
            this.totalCount = l;
            this.score = d;
        }

        public /* synthetic */ PoiReviewSummaryModel(Long l, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : d);
        }
    }
}
