package com.ss.android.ugc.aweme.ecommerce.service.vo;

import X.InterfaceC65349Pkn;
import X.RW2;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductBaseEpt implements Parcelable {
    public static final Parcelable.Creator<ProductBaseEpt> CREATOR = new RW2();

    @InterfaceC65349Pkn("desc_detail")
    public final String details;

    @InterfaceC65349Pkn("price")
    public final ProductPriceEpt priceInfo;

    @InterfaceC65349Pkn("sold_count")
    public final String sales;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBaseEpt)) {
            return false;
        }
        ProductBaseEpt productBaseEpt = (ProductBaseEpt) obj;
        return o.LJ(this.title, productBaseEpt.title) && o.LJ(this.details, productBaseEpt.details) && o.LJ(this.sales, productBaseEpt.sales) && o.LJ(this.priceInfo, productBaseEpt.priceInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.details;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sales;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProductPriceEpt productPriceEpt = this.priceInfo;
        return hashCode3 + (productPriceEpt != null ? productPriceEpt.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductBaseEpt(title=");
        LIZ.append(this.title);
        LIZ.append(", details=");
        LIZ.append(this.details);
        LIZ.append(", sales=");
        LIZ.append(this.sales);
        LIZ.append(", priceInfo=");
        LIZ.append(this.priceInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.details);
        out.writeString(this.sales);
        ProductPriceEpt productPriceEpt = this.priceInfo;
        if (productPriceEpt == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productPriceEpt.writeToParcel(out, i);
        }
    }

    public ProductBaseEpt(String str, String str2, String str3, ProductPriceEpt productPriceEpt) {
        this.title = str;
        this.details = str2;
        this.sales = str3;
        this.priceInfo = productPriceEpt;
    }
}
