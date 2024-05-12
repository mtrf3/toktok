package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C69624RUe;
import X.C69625RUf;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ShopReviewProductCard implements Parcelable {

    @InterfaceC65349Pkn("display_image")
    public final Image displayImage;

    @InterfaceC65349Pkn("display_origin_price")
    public final String displayOriginPrice;

    @InterfaceC65349Pkn("display_product_name")
    public final String displayProductName;

    @InterfaceC65349Pkn("display_product_type")
    public final Integer displayProductType;

    @InterfaceC65349Pkn("display_real_price")
    public final String displayRealPrice;

    @InterfaceC65349Pkn("pdp_schema")
    public final String pdpSchema;
    public static final C69625RUf Companion = new C69625RUf();
    public static final Parcelable.Creator<ShopReviewProductCard> CREATOR = new C69624RUe();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopReviewProductCard)) {
            return false;
        }
        ShopReviewProductCard shopReviewProductCard = (ShopReviewProductCard) obj;
        return o.LJ(this.displayProductName, shopReviewProductCard.displayProductName) && o.LJ(this.displayImage, shopReviewProductCard.displayImage) && o.LJ(this.displayProductType, shopReviewProductCard.displayProductType) && o.LJ(this.displayOriginPrice, shopReviewProductCard.displayOriginPrice) && o.LJ(this.displayRealPrice, shopReviewProductCard.displayRealPrice) && o.LJ(this.pdpSchema, shopReviewProductCard.pdpSchema);
    }

    public final int hashCode() {
        String str = this.displayProductName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.displayImage;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.displayProductType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.displayOriginPrice;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayRealPrice;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pdpSchema;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.displayProductName);
        out.writeParcelable(this.displayImage, i);
        Integer num = this.displayProductType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.displayOriginPrice);
        out.writeString(this.displayRealPrice);
        out.writeString(this.pdpSchema);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopReviewProductCard(displayProductName=");
        LIZ.append(this.displayProductName);
        LIZ.append(", displayImage=");
        LIZ.append(this.displayImage);
        LIZ.append(", displayProductType=");
        LIZ.append(this.displayProductType);
        LIZ.append(", displayOriginPrice=");
        LIZ.append(this.displayOriginPrice);
        LIZ.append(", displayRealPrice=");
        LIZ.append(this.displayRealPrice);
        LIZ.append(", pdpSchema=");
        return q.LIZIZ(LIZ, this.pdpSchema, ')', LIZ);
    }

    public ShopReviewProductCard(String str, Image image, Integer num, String str2, String str3, String str4) {
        this.displayProductName = str;
        this.displayImage = image;
        this.displayProductType = num;
        this.displayOriginPrice = str2;
        this.displayRealPrice = str3;
        this.pdpSchema = str4;
    }

    public /* synthetic */ ShopReviewProductCard(String str, Image image, Integer num, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, image, num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null);
    }
}
