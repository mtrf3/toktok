package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C28007Ayx;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SkuPrice implements Parcelable {
    public static final Parcelable.Creator<SkuPrice> CREATOR = new C28007Ayx();

    @InterfaceC65349Pkn("discount")
    public final String discount;

    @InterfaceC65349Pkn("original_price")
    public final String originalPrice;

    @InterfaceC65349Pkn("original_price_value")
    public final String originalPriceVal;

    @InterfaceC65349Pkn("real_price")
    public final Price realPrice;

    /* JADX WARN: Multi-variable type inference failed */
    public SkuPrice() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuPrice)) {
            return false;
        }
        SkuPrice skuPrice = (SkuPrice) obj;
        return o.LJ(this.realPrice, skuPrice.realPrice) && o.LJ(this.originalPrice, skuPrice.originalPrice) && o.LJ(this.discount, skuPrice.discount) && o.LJ(this.originalPriceVal, skuPrice.originalPriceVal);
    }

    public final int hashCode() {
        Price price = this.realPrice;
        int hashCode = (price == null ? 0 : price.hashCode()) * 31;
        String str = this.originalPrice;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discount;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originalPriceVal;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Price price = this.realPrice;
        if (price == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            price.writeToParcel(out, i);
        }
        out.writeString(this.originalPrice);
        out.writeString(this.discount);
        out.writeString(this.originalPriceVal);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuPrice(realPrice=");
        LIZ.append(this.realPrice);
        LIZ.append(", originalPrice=");
        LIZ.append(this.originalPrice);
        LIZ.append(", discount=");
        LIZ.append(this.discount);
        LIZ.append(", originalPriceVal=");
        return q.LIZIZ(LIZ, this.originalPriceVal, ')', LIZ);
    }

    public SkuPrice(Price price, String str, String str2, String str3) {
        this.realPrice = price;
        this.originalPrice = str;
        this.discount = str2;
        this.originalPriceVal = str3;
    }

    public /* synthetic */ SkuPrice(Price price, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : price, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
