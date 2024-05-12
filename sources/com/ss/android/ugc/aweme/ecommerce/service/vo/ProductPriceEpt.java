package com.ss.android.ugc.aweme.ecommerce.service.vo;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.RW3;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductPriceEpt implements Parcelable {
    public static final Parcelable.Creator<ProductPriceEpt> CREATOR = new RW3();

    @InterfaceC65349Pkn("discount")
    public final String discount;

    @InterfaceC65349Pkn("need_icon")
    public final Boolean needIcon;

    @InterfaceC65349Pkn("original_price")
    public final String originPrice;

    @InterfaceC65349Pkn("real_price")
    public final String realPrice;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPriceEpt)) {
            return false;
        }
        ProductPriceEpt productPriceEpt = (ProductPriceEpt) obj;
        return o.LJ(this.originPrice, productPriceEpt.originPrice) && o.LJ(this.realPrice, productPriceEpt.realPrice) && o.LJ(this.discount, productPriceEpt.discount) && o.LJ(this.needIcon, productPriceEpt.needIcon);
    }

    public final int hashCode() {
        String str = this.originPrice;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.realPrice;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.needIcon;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        out.writeString(this.originPrice);
        out.writeString(this.realPrice);
        out.writeString(this.discount);
        Boolean bool = this.needIcon;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductPriceEpt(originPrice=");
        LIZ.append(this.originPrice);
        LIZ.append(", realPrice=");
        LIZ.append(this.realPrice);
        LIZ.append(", discount=");
        LIZ.append(this.discount);
        LIZ.append(", needIcon=");
        return C78920UyC.LIZIZ(LIZ, this.needIcon, ')', LIZ);
    }

    public ProductPriceEpt(String str, String str2, String str3, Boolean bool) {
        this.originPrice = str;
        this.realPrice = str2;
        this.discount = str3;
        this.needIcon = bool;
    }
}
