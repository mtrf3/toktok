package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C07670Rv;
import X.C0MT;
import X.C1FJ;
import X.C1FL;
import X.C27639At1;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ListReviewData implements Parcelable {
    public static final Parcelable.Creator<ListReviewData> CREATOR = new C27639At1();

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("next_cursor")
    public final Integer nextCursor;

    @InterfaceC65349Pkn("no_allow_feedback")
    public final Boolean noAllowFeedback;

    @InterfaceC65349Pkn("product_rating")
    public final Float rating;

    @InterfaceC65349Pkn("rating_filters")
    public final List<ReviewFilterStruct> ratingFilters;

    @InterfaceC65349Pkn("ratings_link")
    public final String ratingsLink;

    @InterfaceC65349Pkn("review_aspect_percentage_cards")
    public final List<ReviewAspectPercentageCard> reviewAspectPercentageCard;

    @InterfaceC65349Pkn("review_count")
    public final Integer reviewCount;

    @InterfaceC65349Pkn("review_count_str")
    public final String reviewCountStr;

    @InterfaceC65349Pkn("review_count_str_v2")
    public final String reviewCountStrV2;

    @InterfaceC65349Pkn("review_filters")
    public final List<ReviewFilterStruct> reviewFilter;

    @InterfaceC65349Pkn("review_items")
    public final List<ReviewItemStruct> reviewItems;

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
        if (!(obj instanceof ListReviewData)) {
            return false;
        }
        ListReviewData listReviewData = (ListReviewData) obj;
        return o.LJ(this.reviewItems, listReviewData.reviewItems) && o.LJ(this.hasMore, listReviewData.hasMore) && o.LJ(this.nextCursor, listReviewData.nextCursor) && o.LJ(this.reviewFilter, listReviewData.reviewFilter) && o.LJ(this.noAllowFeedback, listReviewData.noAllowFeedback) && o.LJ(this.rating, listReviewData.rating) && o.LJ(this.topText, listReviewData.topText) && o.LJ(this.reviewAspectPercentageCard, listReviewData.reviewAspectPercentageCard) && o.LJ(this.reviewCount, listReviewData.reviewCount) && o.LJ(this.reviewCountStr, listReviewData.reviewCountStr) && o.LJ(this.reviewCountStrV2, listReviewData.reviewCountStrV2) && o.LJ(this.ratingFilters, listReviewData.ratingFilters) && o.LJ(this.ratingsLink, listReviewData.ratingsLink);
    }

    public final int hashCode() {
        List<ReviewItemStruct> list = this.reviewItems;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextCursor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewFilterStruct> list2 = this.reviewFilter;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.noAllowFeedback;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.rating;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.topText;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List<ReviewAspectPercentageCard> list3 = this.reviewAspectPercentageCard;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.reviewCount;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.reviewCountStr;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reviewCountStrV2;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ReviewFilterStruct> list4 = this.ratingFilters;
        int hashCode12 = (hashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.ratingsLink;
        return hashCode12 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListReviewData(reviewItems=");
        sb.append(this.reviewItems);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", nextCursor=");
        sb.append(this.nextCursor);
        sb.append(", reviewFilter=");
        sb.append(this.reviewFilter);
        sb.append(", noAllowFeedback=");
        sb.append(this.noAllowFeedback);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", topText=");
        sb.append(this.topText);
        sb.append(", reviewAspectPercentageCard=");
        sb.append(this.reviewAspectPercentageCard);
        sb.append(", reviewCount=");
        sb.append(this.reviewCount);
        sb.append(", reviewCountStr=");
        sb.append(this.reviewCountStr);
        sb.append(", reviewCountStrV2=");
        sb.append(this.reviewCountStrV2);
        sb.append(", ratingFilters=");
        sb.append(this.ratingFilters);
        sb.append(", ratingsLink=");
        return C07670Rv.LIZIZ(sb, this.ratingsLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<ReviewItemStruct> list = this.reviewItems;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ReviewItemStruct) LIZIZ.next()).writeToParcel(out, i);
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
        Boolean bool2 = this.noAllowFeedback;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        Float f = this.rating;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        out.writeString(this.topText);
        List<ReviewAspectPercentageCard> list3 = this.reviewAspectPercentageCard;
        if (list3 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ3 = C279017q.LIZIZ(out, 1, list3);
            while (LIZIZ3.hasNext()) {
                ((ReviewAspectPercentageCard) LIZIZ3.next()).writeToParcel(out, i);
            }
        }
        Integer num2 = this.reviewCount;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.reviewCountStr);
        out.writeString(this.reviewCountStrV2);
        List<ReviewFilterStruct> list4 = this.ratingFilters;
        if (list4 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ4 = C279017q.LIZIZ(out, 1, list4);
            while (LIZIZ4.hasNext()) {
                ((ReviewFilterStruct) LIZIZ4.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.ratingsLink);
    }

    public ListReviewData(List<ReviewItemStruct> list, Boolean bool, Integer num, List<ReviewFilterStruct> list2, Boolean bool2, Float f, String str, List<ReviewAspectPercentageCard> list3, Integer num2, String str2, String str3, List<ReviewFilterStruct> list4, String str4) {
        this.reviewItems = list;
        this.hasMore = bool;
        this.nextCursor = num;
        this.reviewFilter = list2;
        this.noAllowFeedback = bool2;
        this.rating = f;
        this.topText = str;
        this.reviewAspectPercentageCard = list3;
        this.reviewCount = num2;
        this.reviewCountStr = str2;
        this.reviewCountStrV2 = str3;
        this.ratingFilters = list4;
        this.ratingsLink = str4;
    }

    public /* synthetic */ ListReviewData(List list, Boolean bool, Integer num, List list2, Boolean bool2, Float f, String str, List list3, Integer num2, String str2, String str3, List list4, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, bool, num, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : list4, (i & 4096) == 0 ? str4 : null);
    }
}
