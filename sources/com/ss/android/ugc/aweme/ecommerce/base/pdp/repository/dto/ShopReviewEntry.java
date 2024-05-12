package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C27635Asx;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopReviewEntry implements Parcelable {
    public static final Parcelable.Creator<ShopReviewEntry> CREATOR = new C27635Asx();

    @InterfaceC65349Pkn("review_count")
    public final Integer reviewCount;

    @InterfaceC65349Pkn("review_count_str")
    public final String reviewCountStr;

    @InterfaceC65349Pkn("review_filters")
    public final List<ReviewFilterStruct> reviewFilters;

    @InterfaceC65349Pkn("shop_schema")
    public final String shopSchema;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopReviewEntry)) {
            return false;
        }
        ShopReviewEntry shopReviewEntry = (ShopReviewEntry) obj;
        return o.LJ(this.reviewCount, shopReviewEntry.reviewCount) && o.LJ(this.reviewCountStr, shopReviewEntry.reviewCountStr) && o.LJ(this.reviewFilters, shopReviewEntry.reviewFilters) && o.LJ(this.shopSchema, shopReviewEntry.shopSchema);
    }

    public final int hashCode() {
        Integer num = this.reviewCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.reviewCountStr;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ReviewFilterStruct> list = this.reviewFilters;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.shopSchema;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopReviewEntry(reviewCount=");
        LIZ.append(this.reviewCount);
        LIZ.append(", reviewCountStr=");
        LIZ.append(this.reviewCountStr);
        LIZ.append(", reviewFilters=");
        LIZ.append(this.reviewFilters);
        LIZ.append(", shopSchema=");
        return q.LIZIZ(LIZ, this.shopSchema, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.reviewCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.reviewCountStr);
        List<ReviewFilterStruct> list = this.reviewFilters;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ReviewFilterStruct) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.shopSchema);
    }

    public ShopReviewEntry(Integer num, String str, List<ReviewFilterStruct> list, String str2) {
        this.reviewCount = num;
        this.reviewCountStr = str;
        this.reviewFilters = list;
        this.shopSchema = str2;
    }

    public /* synthetic */ ShopReviewEntry(Integer num, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, list, (i & 8) != 0 ? null : str2);
    }
}
