package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FL;
import X.C69631RUl;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductPrice implements Parcelable {
    public static final Parcelable.Creator<ProductPrice> CREATOR = new C69631RUl();

    @InterfaceC65349Pkn("discount")
    public final String discount;

    @InterfaceC65349Pkn("is_interval_price")
    public final Boolean isIntervalPrice;

    @InterfaceC65349Pkn("need_icon")
    public final Boolean needIcon;

    @InterfaceC65349Pkn("original_price")
    public final String originPrice;

    @InterfaceC65349Pkn("panel_schema")
    public final String panelSchema;

    @InterfaceC65349Pkn("price_prefix")
    public final String pricePrefix;

    @InterfaceC65349Pkn("real_price")
    public final String realPrice;

    @InterfaceC65349Pkn("show_hot_zone")
    public final Boolean showHotZone;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPrice)) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) obj;
        return o.LJ(this.originPrice, productPrice.originPrice) && o.LJ(this.realPrice, productPrice.realPrice) && o.LJ(this.discount, productPrice.discount) && o.LJ(this.needIcon, productPrice.needIcon) && o.LJ(this.isIntervalPrice, productPrice.isIntervalPrice) && o.LJ(this.showHotZone, productPrice.showHotZone) && o.LJ(this.pricePrefix, productPrice.pricePrefix) && o.LJ(this.panelSchema, productPrice.panelSchema);
    }

    public final int hashCode() {
        String str = this.originPrice;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.realPrice;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.needIcon;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isIntervalPrice;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showHotZone;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.pricePrefix;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.panelSchema;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductPrice(originPrice=");
        LIZ.append(this.originPrice);
        LIZ.append(", realPrice=");
        LIZ.append(this.realPrice);
        LIZ.append(", discount=");
        LIZ.append(this.discount);
        LIZ.append(", needIcon=");
        LIZ.append(this.needIcon);
        LIZ.append(", isIntervalPrice=");
        LIZ.append(this.isIntervalPrice);
        LIZ.append(", showHotZone=");
        LIZ.append(this.showHotZone);
        LIZ.append(", pricePrefix=");
        LIZ.append(this.pricePrefix);
        LIZ.append(", panelSchema=");
        return q.LIZIZ(LIZ, this.panelSchema, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.originPrice);
        out.writeString(this.realPrice);
        out.writeString(this.discount);
        Boolean bool = this.needIcon;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.isIntervalPrice;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        Boolean bool3 = this.showHotZone;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        out.writeString(this.pricePrefix);
        out.writeString(this.panelSchema);
    }

    public ProductPrice(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5) {
        this.originPrice = str;
        this.realPrice = str2;
        this.discount = str3;
        this.needIcon = bool;
        this.isIntervalPrice = bool2;
        this.showHotZone = bool3;
        this.pricePrefix = str4;
        this.panelSchema = str5;
    }

    public /* synthetic */ ProductPrice(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bool, bool2, bool3, str4, (i & 128) != 0 ? null : str5);
    }
}
