package com.ss.android.ugc.aweme.ecommerce.base.review.repo;

import X.AbstractC73672Svk;
import X.C07250Qf;
import X.C70708Rp2;
import X.C79062V1e;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public interface ReviewApi {
    public static final C70708Rp2 LIZ = C70708Rp2.LIZ;

    /* loaded from: classes13.dex */
    public static final class ListShopReviewRequest {

        @InterfaceC65349Pkn("cursor")
        public final int cursor;

        @InterfaceC65349Pkn("filter_id")
        public final String filterId;

        @InterfaceC65349Pkn("global_base_review")
        public final Boolean globalBaseReview;

        @InterfaceC65349Pkn("kol_id")
        public final String kolId;

        @InterfaceC65349Pkn("need_count")
        public final Boolean needCount;

        @InterfaceC65349Pkn("need_filter")
        public final boolean needFilter;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn("product_source_info")
        public final Integer productSourceInfo;

        @InterfaceC65349Pkn("seller_id")
        public final String sellerId;

        @InterfaceC65349Pkn("size")
        public final int size;

        @InterfaceC65349Pkn("sort_type")
        public final Integer sortType;

        @InterfaceC65349Pkn("traffic_source_list")
        public final int[] trafficSourceList;

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int LIZ = (((C07250Qf.LIZ(this.needFilter, C79062V1e.LJ(this.sellerId, this.productId.hashCode() * 31, 31), 31) + this.size) * 31) + this.cursor) * 31;
            String str = this.filterId;
            int i6 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i7 = (LIZ + i) * 31;
            String str2 = this.kolId;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            int i9 = i8 * 31;
            int[] iArr = this.trafficSourceList;
            if (iArr != null) {
                for (int i10 : iArr) {
                    i8 += i10;
                }
            } else {
                i8 = 0;
            }
            int i11 = (i9 + i8) * 31;
            Boolean bool = this.needCount;
            if (bool != null) {
                i3 = bool.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 31;
            Integer num = this.productSourceInfo;
            if (num != null) {
                i4 = num.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 31;
            Integer num2 = this.sortType;
            if (num2 != null) {
                i5 = num2.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 31;
            Boolean bool2 = this.globalBaseReview;
            if (bool2 != null) {
                i6 = bool2.hashCode();
            }
            return i14 + i6;
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!o.LJ(ListShopReviewRequest.class, cls)) {
                return false;
            }
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi.ListShopReviewRequest");
            ListShopReviewRequest listShopReviewRequest = (ListShopReviewRequest) obj;
            if (o.LJ(this.productId, listShopReviewRequest.productId) && o.LJ(this.sellerId, listShopReviewRequest.sellerId) && this.needFilter == listShopReviewRequest.needFilter && this.size == listShopReviewRequest.size && this.cursor == listShopReviewRequest.cursor && o.LJ(this.filterId, listShopReviewRequest.filterId) && o.LJ(this.kolId, listShopReviewRequest.kolId) && Arrays.equals(this.trafficSourceList, listShopReviewRequest.trafficSourceList) && o.LJ(this.needCount, listShopReviewRequest.needCount) && o.LJ(this.productSourceInfo, listShopReviewRequest.productSourceInfo) && o.LJ(this.sortType, listShopReviewRequest.sortType) && o.LJ(this.globalBaseReview, listShopReviewRequest.globalBaseReview)) {
                return true;
            }
            return false;
        }

        public ListShopReviewRequest(String productId, String sellerId, boolean z, int i, int i2, String str, String str2, int[] iArr, Boolean bool, Integer num, Integer num2, Boolean bool2) {
            o.LJIIIZ(productId, "productId");
            o.LJIIIZ(sellerId, "sellerId");
            this.productId = productId;
            this.sellerId = sellerId;
            this.needFilter = z;
            this.size = i;
            this.cursor = i2;
            this.filterId = str;
            this.kolId = str2;
            this.trafficSourceList = iArr;
            this.needCount = bool;
            this.productSourceInfo = num;
            this.sortType = num2;
            this.globalBaseReview = bool2;
        }

        public /* synthetic */ ListShopReviewRequest(String str, String str2, boolean z, int i, int i2, String str3, String str4, int[] iArr, Boolean bool, Integer num, Integer num2, Boolean bool2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, i, i2, str3, str4, iArr, bool, num, num2, (i3 & 2048) != 0 ? Boolean.FALSE : bool2);
        }
    }

    /* loaded from: classes13.dex */
    public static final class ReviewRequest {

        @InterfaceC65349Pkn("clicked_review_id")
        public final String clickedReviewId;

        @InterfaceC65349Pkn("cursor")
        public final int cursor;

        @InterfaceC65349Pkn("filter_id")
        public final String filterId;

        @InterfaceC65349Pkn("global_base_review")
        public final Boolean globalBaseReview;

        @InterfaceC65349Pkn("need_count")
        public final Boolean needCount;

        @InterfaceC65349Pkn("need_filter")
        public final boolean needFilter;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn("size")
        public final int size;

        @InterfaceC65349Pkn("sort_type")
        public final Integer sortType;

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int hashCode = this.productId.hashCode() * 31;
            String str = this.filterId;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int LIZ = C07250Qf.LIZ(this.needFilter, (((((hashCode + i) * 31) + this.size) * 31) + this.cursor) * 31, 31);
            Integer num = this.sortType;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            int i6 = (LIZ + i2) * 31;
            String str2 = this.clickedReviewId;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            Boolean bool = this.needCount;
            if (bool != null) {
                i4 = bool.hashCode();
            } else {
                i4 = 0;
            }
            int i8 = (i7 + i4) * 31;
            Boolean bool2 = this.globalBaseReview;
            if (bool2 != null) {
                i5 = bool2.hashCode();
            }
            return i8 + i5;
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!o.LJ(ReviewRequest.class, cls)) {
                return false;
            }
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi.ReviewRequest");
            ReviewRequest reviewRequest = (ReviewRequest) obj;
            if (o.LJ(this.productId, reviewRequest.productId) && o.LJ(this.filterId, reviewRequest.filterId) && this.size == reviewRequest.size && this.cursor == reviewRequest.cursor && this.needFilter == reviewRequest.needFilter && o.LJ(this.sortType, reviewRequest.sortType) && o.LJ(this.clickedReviewId, reviewRequest.clickedReviewId) && o.LJ(this.needCount, reviewRequest.needCount) && o.LJ(this.globalBaseReview, reviewRequest.globalBaseReview)) {
                return true;
            }
            return false;
        }

        public ReviewRequest(String productId, String str, int i, int i2, boolean z, Integer num, String str2, Boolean bool, Boolean bool2) {
            o.LJIIIZ(productId, "productId");
            this.productId = productId;
            this.filterId = str;
            this.size = i;
            this.cursor = i2;
            this.needFilter = z;
            this.sortType = num;
            this.clickedReviewId = str2;
            this.needCount = bool;
            this.globalBaseReview = bool2;
        }

        public /* synthetic */ ReviewRequest(String str, String str2, int i, int i2, boolean z, Integer num, String str3, Boolean bool, Boolean bool2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, i2, z, (i3 & 32) != 0 ? null : num, (i3 & 64) == 0 ? str3 : null, (i3 & 128) != 0 ? Boolean.FALSE : bool, (i3 & 256) != 0 ? Boolean.FALSE : bool2);
        }
    }

    @E4T("api/v1/review/digg")
    AbstractC73672Svk<Object> dig(@InterfaceC27211Am7 ReviewDiggRequest reviewDiggRequest);

    @E4T("api/v1/review/list")
    AbstractC73672Svk<Response<ListReviewData>> getReviewInfo(@InterfaceC27211Am7 ReviewRequest reviewRequest);

    @E4T("/api/v1/shop_review/list")
    AbstractC73672Svk<Response<ListShopReviewData>> getShopReviewInfo(@InterfaceC27211Am7 ListShopReviewRequest listShopReviewRequest);

    @E4T("api/v1/review/cancel_digg")
    AbstractC73672Svk<Object> unDig(@InterfaceC27211Am7 ReviewDiggRequest reviewDiggRequest);

    /* loaded from: classes5.dex */
    public static final class ReviewDiggRequest {

        @InterfaceC65349Pkn("main_review_id")
        public final String reviewId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewDiggRequest) && o.LJ(this.reviewId, ((ReviewDiggRequest) obj).reviewId);
        }

        public final int hashCode() {
            return this.reviewId.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ReviewDiggRequest(reviewId=");
            return q.LIZIZ(LIZ, this.reviewId, ')', LIZ);
        }

        public ReviewDiggRequest(String reviewId) {
            o.LJIIIZ(reviewId, "reviewId");
            this.reviewId = reviewId;
        }
    }
}
