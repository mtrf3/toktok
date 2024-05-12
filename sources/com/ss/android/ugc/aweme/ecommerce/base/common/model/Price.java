package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C1FJ;
import X.C1NE;
import X.C27336Ao8;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Price implements Parcelable, Serializable {
    public static final Parcelable.Creator<Price> CREATOR = new C27336Ao8();

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("fee_tags")
    public final List<FeeTag> feeTags;

    @InterfaceC65349Pkn("payment_methods_promotions")
    public final List<PaymentPromotion> paymentPromotions;

    @InterfaceC65349Pkn("price_str")
    public final String priceStr;

    @InterfaceC65349Pkn("price_text_color")
    public final Integer priceTextColor;

    @InterfaceC65349Pkn("price_val")
    public final String priceVal;

    @InterfaceC65349Pkn("promotions")
    public final List<Promotion> promotions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Price copy$default(Price price, String str, String str2, String str3, List list, Integer num, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = price.priceStr;
        }
        if ((i & 2) != 0) {
            str2 = price.priceVal;
        }
        if ((i & 4) != 0) {
            str3 = price.currency;
        }
        if ((i & 8) != 0) {
            list = price.promotions;
        }
        if ((i & 16) != 0) {
            num = price.priceTextColor;
        }
        if ((i & 32) != 0) {
            list2 = price.feeTags;
        }
        if ((i & 64) != 0) {
            list3 = price.paymentPromotions;
        }
        return price.copy(str, str2, str3, list, num, list2, list3);
    }

    public final Price copy(String str, String str2, String str3, List<Promotion> list, Integer num, List<FeeTag> list2, List<PaymentPromotion> list3) {
        return new Price(str, str2, str3, list, num, list2, list3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return o.LJ(this.priceStr, price.priceStr) && o.LJ(this.priceVal, price.priceVal) && o.LJ(this.currency, price.currency) && o.LJ(this.promotions, price.promotions) && o.LJ(this.priceTextColor, price.priceTextColor) && o.LJ(this.feeTags, price.feeTags) && o.LJ(this.paymentPromotions, price.paymentPromotions);
    }

    public int hashCode() {
        String str = this.priceStr;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.priceVal;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Promotion> list = this.promotions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.priceTextColor;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<FeeTag> list2 = this.feeTags;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PaymentPromotion> list3 = this.paymentPromotions;
        return hashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Price(priceStr=");
        LIZ.append(this.priceStr);
        LIZ.append(", priceVal=");
        LIZ.append(this.priceVal);
        LIZ.append(", currency=");
        LIZ.append(this.currency);
        LIZ.append(", promotions=");
        LIZ.append(this.promotions);
        LIZ.append(", priceTextColor=");
        LIZ.append(this.priceTextColor);
        LIZ.append(", feeTags=");
        LIZ.append(this.feeTags);
        LIZ.append(", paymentPromotions=");
        return C1NE.LIZIZ(LIZ, this.paymentPromotions, ')', LIZ);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<FeeTag> getFeeTags() {
        return this.feeTags;
    }

    public final List<PaymentPromotion> getPaymentPromotions() {
        return this.paymentPromotions;
    }

    public final String getPriceStr() {
        return this.priceStr;
    }

    public final Integer getPriceTextColor() {
        return this.priceTextColor;
    }

    public final String getPriceVal() {
        return this.priceVal;
    }

    public final List<Promotion> getPromotions() {
        return this.promotions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.priceStr);
        out.writeString(this.priceVal);
        out.writeString(this.currency);
        List<Promotion> list = this.promotions;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((Promotion) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Integer num = this.priceTextColor;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        List<FeeTag> list2 = this.feeTags;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((FeeTag) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        List<PaymentPromotion> list3 = this.paymentPromotions;
        if (list3 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ3 = C279017q.LIZIZ(out, 1, list3);
        while (LIZIZ3.hasNext()) {
            ((PaymentPromotion) LIZIZ3.next()).writeToParcel(out, i);
        }
    }

    public Price(String str, String str2, String str3, List<Promotion> list, Integer num, List<FeeTag> list2, List<PaymentPromotion> list3) {
        this.priceStr = str;
        this.priceVal = str2;
        this.currency = str3;
        this.promotions = list;
        this.priceTextColor = num;
        this.feeTags = list2;
        this.paymentPromotions = list3;
    }

    public /* synthetic */ Price(String str, String str2, String str3, List list, Integer num, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i & 16) != 0 ? 0 : num, list2, list3);
    }
}
