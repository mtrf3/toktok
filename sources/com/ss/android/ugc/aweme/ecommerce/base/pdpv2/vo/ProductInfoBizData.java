package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C0MT;
import X.C1FJ;
import X.C1FL;
import X.C27718AuI;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductInfoBizData implements Parcelable {
    public static final Parcelable.Creator<ProductInfoBizData> CREATOR = new C27718AuI();

    @InterfaceC65349Pkn("free_shipping")
    public final Boolean freeShipping;

    @InterfaceC65349Pkn("price")
    public final ProductPrice price;

    @InterfaceC65349Pkn("promotion_logos")
    public final PromotionLogo promotionLogo;

    @InterfaceC65349Pkn("rating")
    public final Float rating;

    @InterfaceC65349Pkn("save_status")
    public final Integer saveStatus;

    @InterfaceC65349Pkn("sold_count")
    public final Integer soldCount;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("view_count")
    public final Integer viewCount;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductInfoBizData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfoBizData)) {
            return false;
        }
        ProductInfoBizData productInfoBizData = (ProductInfoBizData) obj;
        return o.LJ(this.title, productInfoBizData.title) && o.LJ(this.price, productInfoBizData.price) && o.LJ(this.soldCount, productInfoBizData.soldCount) && o.LJ(this.rating, productInfoBizData.rating) && o.LJ(this.promotionLogo, productInfoBizData.promotionLogo) && o.LJ(this.freeShipping, productInfoBizData.freeShipping) && o.LJ(this.viewCount, productInfoBizData.viewCount) && o.LJ(this.saveStatus, productInfoBizData.saveStatus);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ProductPrice productPrice = this.price;
        int hashCode2 = (hashCode + (productPrice == null ? 0 : productPrice.hashCode())) * 31;
        Integer num = this.soldCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.rating;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        PromotionLogo promotionLogo = this.promotionLogo;
        int hashCode5 = (hashCode4 + (promotionLogo == null ? 0 : promotionLogo.hashCode())) * 31;
        Boolean bool = this.freeShipping;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.viewCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.saveStatus;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductInfoBizData(title=");
        LIZ.append(this.title);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", soldCount=");
        LIZ.append(this.soldCount);
        LIZ.append(", rating=");
        LIZ.append(this.rating);
        LIZ.append(", promotionLogo=");
        LIZ.append(this.promotionLogo);
        LIZ.append(", freeShipping=");
        LIZ.append(this.freeShipping);
        LIZ.append(", viewCount=");
        LIZ.append(this.viewCount);
        LIZ.append(", saveStatus=");
        return s0.LIZJ(LIZ, this.saveStatus, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        ProductPrice productPrice = this.price;
        if (productPrice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productPrice.writeToParcel(out, i);
        }
        Integer num = this.soldCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Float f = this.rating;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        PromotionLogo promotionLogo = this.promotionLogo;
        if (promotionLogo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            promotionLogo.writeToParcel(out, i);
        }
        Boolean bool = this.freeShipping;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Integer num2 = this.viewCount;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.saveStatus;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
    }

    public ProductInfoBizData(String str, ProductPrice productPrice, Integer num, Float f, PromotionLogo promotionLogo, Boolean bool, Integer num2, Integer num3) {
        this.title = str;
        this.price = productPrice;
        this.soldCount = num;
        this.rating = f;
        this.promotionLogo = promotionLogo;
        this.freeShipping = bool;
        this.viewCount = num2;
        this.saveStatus = num3;
    }

    public /* synthetic */ ProductInfoBizData(String str, ProductPrice productPrice, Integer num, Float f, PromotionLogo promotionLogo, Boolean bool, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : productPrice, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : promotionLogo, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : num2, (i & 128) == 0 ? num3 : null);
    }
}
