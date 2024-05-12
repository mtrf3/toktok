package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.InterfaceC65349Pkn;
import X.RXP;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuBizExtra implements Parcelable {
    public static final Parcelable.Creator<SkuBizExtra> CREATOR = new RXP();

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("original_price_max")
    public final String originalPriceMax;

    @InterfaceC65349Pkn("original_price_min")
    public final String originalPriceMin;

    @InterfaceC65349Pkn("sale_price_max")
    public final String salePriceMax;

    @InterfaceC65349Pkn("sale_price_min")
    public final String salePriceMin;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuBizExtra)) {
            return false;
        }
        SkuBizExtra skuBizExtra = (SkuBizExtra) obj;
        return o.LJ(this.currency, skuBizExtra.currency) && o.LJ(this.originalPriceMax, skuBizExtra.originalPriceMax) && o.LJ(this.originalPriceMin, skuBizExtra.originalPriceMin) && o.LJ(this.salePriceMax, skuBizExtra.salePriceMax) && o.LJ(this.salePriceMin, skuBizExtra.salePriceMin);
    }

    public final int hashCode() {
        String str = this.currency;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originalPriceMax;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originalPriceMin;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.salePriceMax;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.salePriceMin;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.currency);
        out.writeString(this.originalPriceMax);
        out.writeString(this.originalPriceMin);
        out.writeString(this.salePriceMax);
        out.writeString(this.salePriceMin);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuBizExtra(currency=");
        LIZ.append(this.currency);
        LIZ.append(", originalPriceMax=");
        LIZ.append(this.originalPriceMax);
        LIZ.append(", originalPriceMin=");
        LIZ.append(this.originalPriceMin);
        LIZ.append(", salePriceMax=");
        LIZ.append(this.salePriceMax);
        LIZ.append(", salePriceMin=");
        return q.LIZIZ(LIZ, this.salePriceMin, ')', LIZ);
    }

    public SkuBizExtra(String str, String str2, String str3, String str4, String str5) {
        this.currency = str;
        this.originalPriceMax = str2;
        this.originalPriceMin = str3;
        this.salePriceMax = str4;
        this.salePriceMin = str5;
    }

    public /* synthetic */ SkuBizExtra(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3, str4, str5);
    }
}
