package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C0MT;
import X.C1FJ;
import X.C1NE;
import X.C27634Asw;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDetailReview implements Parcelable {
    public static final Parcelable.Creator<ProductDetailReview> CREATOR = new C27634Asw();

    @InterfaceC65349Pkn("product_rating")
    public final Float rating;

    @InterfaceC65349Pkn("review_aspect_percentage_cards")
    public final List<ReviewAspectPercentageCard> reviewAspectPercentageCards;

    @InterfaceC65349Pkn("review_count")
    public final Integer reviewCount;

    @InterfaceC65349Pkn("review_count_str")
    public final String reviewCountStr;

    @InterfaceC65349Pkn("review_count_str_v2")
    public final String reviewCountStrV2;

    @InterfaceC65349Pkn("review_filters")
    public final List<ReviewFilterStruct> reviewFilters;

    @InterfaceC65349Pkn("review_image_items")
    public final List<ReviewImageItem> reviewImageItems;

    @InterfaceC65349Pkn("review_items")
    public final List<ReviewItemStruct> reviewItems;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailReview)) {
            return false;
        }
        ProductDetailReview productDetailReview = (ProductDetailReview) obj;
        return o.LJ(this.rating, productDetailReview.rating) && o.LJ(this.reviewCount, productDetailReview.reviewCount) && o.LJ(this.reviewItems, productDetailReview.reviewItems) && o.LJ(this.reviewImageItems, productDetailReview.reviewImageItems) && o.LJ(this.reviewFilters, productDetailReview.reviewFilters) && o.LJ(this.reviewCountStr, productDetailReview.reviewCountStr) && o.LJ(this.reviewCountStrV2, productDetailReview.reviewCountStrV2) && o.LJ(this.reviewAspectPercentageCards, productDetailReview.reviewAspectPercentageCards);
    }

    public final int hashCode() {
        Float f = this.rating;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.reviewCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewItemStruct> list = this.reviewItems;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ReviewImageItem> list2 = this.reviewImageItems;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ReviewFilterStruct> list3 = this.reviewFilters;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.reviewCountStr;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reviewCountStrV2;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ReviewAspectPercentageCard> list4 = this.reviewAspectPercentageCards;
        return hashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductDetailReview(rating=");
        LIZ.append(this.rating);
        LIZ.append(", reviewCount=");
        LIZ.append(this.reviewCount);
        LIZ.append(", reviewItems=");
        LIZ.append(this.reviewItems);
        LIZ.append(", reviewImageItems=");
        LIZ.append(this.reviewImageItems);
        LIZ.append(", reviewFilters=");
        LIZ.append(this.reviewFilters);
        LIZ.append(", reviewCountStr=");
        LIZ.append(this.reviewCountStr);
        LIZ.append(", reviewCountStrV2=");
        LIZ.append(this.reviewCountStrV2);
        LIZ.append(", reviewAspectPercentageCards=");
        return C1NE.LIZIZ(LIZ, this.reviewAspectPercentageCards, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Float f = this.rating;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        Integer num = this.reviewCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        List<ReviewItemStruct> list = this.reviewItems;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ReviewItemStruct) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        List<ReviewImageItem> list2 = this.reviewImageItems;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((ReviewImageItem) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        List<ReviewFilterStruct> list3 = this.reviewFilters;
        if (list3 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ3 = C279017q.LIZIZ(out, 1, list3);
            while (LIZIZ3.hasNext()) {
                ((ReviewFilterStruct) LIZIZ3.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.reviewCountStr);
        out.writeString(this.reviewCountStrV2);
        List<ReviewAspectPercentageCard> list4 = this.reviewAspectPercentageCards;
        if (list4 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ4 = C279017q.LIZIZ(out, 1, list4);
        while (LIZIZ4.hasNext()) {
            ((ReviewAspectPercentageCard) LIZIZ4.next()).writeToParcel(out, i);
        }
    }

    public ProductDetailReview(Float f, Integer num, List<ReviewItemStruct> list, List<ReviewImageItem> list2, List<ReviewFilterStruct> list3, String str, String str2, List<ReviewAspectPercentageCard> list4) {
        this.rating = f;
        this.reviewCount = num;
        this.reviewItems = list;
        this.reviewImageItems = list2;
        this.reviewFilters = list3;
        this.reviewCountStr = str;
        this.reviewCountStrV2 = str2;
        this.reviewAspectPercentageCards = list4;
    }

    public /* synthetic */ ProductDetailReview(Float f, Integer num, List list, List list2, List list3, String str, String str2, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, num, list, list2, list3, str, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? list4 : null);
    }
}
