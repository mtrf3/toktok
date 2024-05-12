package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C1FJ;
import X.C1FL;
import X.C1NE;
import X.C27640At2;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ListShopReviewData implements Parcelable {
    public static final Parcelable.Creator<ListShopReviewData> CREATOR = new C27640At2();

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("next_cursor")
    public final Integer nextCursor;

    @InterfaceC65349Pkn("rating_filters")
    public final List<ReviewFilterStruct> ratingFilters;

    @InterfaceC65349Pkn("review_count")
    public final Integer reviewCount;

    @InterfaceC65349Pkn("review_count_str")
    public final String reviewCountStr;

    @InterfaceC65349Pkn("review_count_str_v2")
    public final String reviewCountStrV2;

    @InterfaceC65349Pkn("review_filters")
    public final List<ReviewFilterStruct> reviewFilter;

    @InterfaceC65349Pkn("review_items")
    public final List<ShopReviewItemStruct> reviewItems;

    @InterfaceC65349Pkn("top_text")
    public final String topText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListShopReviewData)) {
            return false;
        }
        ListShopReviewData listShopReviewData = (ListShopReviewData) obj;
        return o.LJ(this.reviewItems, listShopReviewData.reviewItems) && o.LJ(this.hasMore, listShopReviewData.hasMore) && o.LJ(this.nextCursor, listShopReviewData.nextCursor) && o.LJ(this.reviewFilter, listShopReviewData.reviewFilter) && o.LJ(this.topText, listShopReviewData.topText) && o.LJ(this.reviewCount, listShopReviewData.reviewCount) && o.LJ(this.reviewCountStr, listShopReviewData.reviewCountStr) && o.LJ(this.reviewCountStrV2, listShopReviewData.reviewCountStrV2) && o.LJ(this.ratingFilters, listShopReviewData.ratingFilters);
    }

    public final int hashCode() {
        List<ShopReviewItemStruct> list = this.reviewItems;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextCursor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewFilterStruct> list2 = this.reviewFilter;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.topText;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.reviewCount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.reviewCountStr;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reviewCountStrV2;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ReviewFilterStruct> list3 = this.ratingFilters;
        return hashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ListShopReviewData(reviewItems=");
        LIZ.append(this.reviewItems);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", nextCursor=");
        LIZ.append(this.nextCursor);
        LIZ.append(", reviewFilter=");
        LIZ.append(this.reviewFilter);
        LIZ.append(", topText=");
        LIZ.append(this.topText);
        LIZ.append(", reviewCount=");
        LIZ.append(this.reviewCount);
        LIZ.append(", reviewCountStr=");
        LIZ.append(this.reviewCountStr);
        LIZ.append(", reviewCountStrV2=");
        LIZ.append(this.reviewCountStrV2);
        LIZ.append(", ratingFilters=");
        return C1NE.LIZIZ(LIZ, this.ratingFilters, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<ShopReviewItemStruct> list = this.reviewItems;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ShopReviewItemStruct) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Boolean bool = this.hasMore;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Integer num = this.nextCursor;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        List<ReviewFilterStruct> list2 = this.reviewFilter;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((ReviewFilterStruct) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.topText);
        Integer num2 = this.reviewCount;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.reviewCountStr);
        out.writeString(this.reviewCountStrV2);
        List<ReviewFilterStruct> list3 = this.ratingFilters;
        if (list3 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ3 = C279017q.LIZIZ(out, 1, list3);
        while (LIZIZ3.hasNext()) {
            ((ReviewFilterStruct) LIZIZ3.next()).writeToParcel(out, i);
        }
    }

    public ListShopReviewData(List<ShopReviewItemStruct> list, Boolean bool, Integer num, List<ReviewFilterStruct> list2, String str, Integer num2, String str2, String str3, List<ReviewFilterStruct> list3) {
        this.reviewItems = list;
        this.hasMore = bool;
        this.nextCursor = num;
        this.reviewFilter = list2;
        this.topText = str;
        this.reviewCount = num2;
        this.reviewCountStr = str2;
        this.reviewCountStrV2 = str3;
        this.ratingFilters = list3;
    }

    public /* synthetic */ ListShopReviewData(List list, Boolean bool, Integer num, List list2, String str, Integer num2, String str2, String str3, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, bool, num, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) == 0 ? list3 : null);
    }
}
