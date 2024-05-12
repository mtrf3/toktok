package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C69664RVs;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ShopReviewItemStruct implements Parcelable {
    public static final Parcelable.Creator<ShopReviewItemStruct> CREATOR = new C69664RVs();

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("product_card")
    public final ShopReviewProductCard productCard;

    @InterfaceC65349Pkn("review_item")
    public final ReviewItemStruct reviewItemStruct;

    /* JADX WARN: Multi-variable type inference failed */
    public ShopReviewItemStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopReviewItemStruct)) {
            return false;
        }
        ShopReviewItemStruct shopReviewItemStruct = (ShopReviewItemStruct) obj;
        return o.LJ(this.reviewItemStruct, shopReviewItemStruct.reviewItemStruct) && o.LJ(this.productCard, shopReviewItemStruct.productCard) && o.LJ(this.daInfo, shopReviewItemStruct.daInfo);
    }

    public final int hashCode() {
        ReviewItemStruct reviewItemStruct = this.reviewItemStruct;
        int hashCode = (reviewItemStruct == null ? 0 : reviewItemStruct.hashCode()) * 31;
        ShopReviewProductCard shopReviewProductCard = this.productCard;
        int hashCode2 = (hashCode + (shopReviewProductCard == null ? 0 : shopReviewProductCard.hashCode())) * 31;
        String str = this.daInfo;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        ReviewItemStruct reviewItemStruct = this.reviewItemStruct;
        if (reviewItemStruct == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            reviewItemStruct.writeToParcel(out, i);
        }
        ShopReviewProductCard shopReviewProductCard = this.productCard;
        if (shopReviewProductCard == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shopReviewProductCard.writeToParcel(out, i);
        }
        out.writeString(this.daInfo);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopReviewItemStruct(reviewItemStruct=");
        LIZ.append(this.reviewItemStruct);
        LIZ.append(", productCard=");
        LIZ.append(this.productCard);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public ShopReviewItemStruct(ReviewItemStruct reviewItemStruct, ShopReviewProductCard shopReviewProductCard, String str) {
        this.reviewItemStruct = reviewItemStruct;
        this.productCard = shopReviewProductCard;
        this.daInfo = str;
    }

    public /* synthetic */ ShopReviewItemStruct(ReviewItemStruct reviewItemStruct, ShopReviewProductCard shopReviewProductCard, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : reviewItemStruct, (i & 2) != 0 ? null : shopReviewProductCard, (i & 4) != 0 ? null : str);
    }
}
