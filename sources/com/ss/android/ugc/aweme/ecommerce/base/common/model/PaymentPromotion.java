package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C1FJ;
import X.C27339AoB;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentPromotion implements Parcelable {
    public static final Parcelable.Creator<PaymentPromotion> CREATOR = new C27339AoB();

    @InterfaceC65349Pkn("amount")
    public final String amount;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("promotion_id")
    public final String promotionId;

    @InterfaceC65349Pkn("reduction_type")
    public final Integer reductionType;

    @InterfaceC65349Pkn("sponsor")
    public final Integer sponsor;

    public static /* synthetic */ PaymentPromotion copy$default(PaymentPromotion paymentPromotion, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentPromotion.promotionId;
        }
        if ((i & 2) != 0) {
            str2 = paymentPromotion.currency;
        }
        if ((i & 4) != 0) {
            str3 = paymentPromotion.amount;
        }
        if ((i & 8) != 0) {
            num = paymentPromotion.reductionType;
        }
        if ((i & 16) != 0) {
            num2 = paymentPromotion.sponsor;
        }
        return paymentPromotion.copy(str, str2, str3, num, num2);
    }

    public final PaymentPromotion copy(String str, String str2, String str3, Integer num, Integer num2) {
        return new PaymentPromotion(str, str2, str3, num, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPromotion)) {
            return false;
        }
        PaymentPromotion paymentPromotion = (PaymentPromotion) obj;
        return o.LJ(this.promotionId, paymentPromotion.promotionId) && o.LJ(this.currency, paymentPromotion.currency) && o.LJ(this.amount, paymentPromotion.amount) && o.LJ(this.reductionType, paymentPromotion.reductionType) && o.LJ(this.sponsor, paymentPromotion.sponsor);
    }

    public int hashCode() {
        String str = this.promotionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.reductionType;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sponsor;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentPromotion(promotionId=");
        LIZ.append(this.promotionId);
        LIZ.append(", currency=");
        LIZ.append(this.currency);
        LIZ.append(", amount=");
        LIZ.append(this.amount);
        LIZ.append(", reductionType=");
        LIZ.append(this.reductionType);
        LIZ.append(", sponsor=");
        return s0.LIZJ(LIZ, this.sponsor, ')', LIZ);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final Integer getReductionType() {
        return this.reductionType;
    }

    public final Integer getSponsor() {
        return this.sponsor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.promotionId);
        out.writeString(this.currency);
        out.writeString(this.amount);
        Integer num = this.reductionType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.sponsor;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
    }

    public PaymentPromotion(String str, String str2, String str3, Integer num, Integer num2) {
        this.promotionId = str;
        this.currency = str2;
        this.amount = str3;
        this.reductionType = num;
        this.sponsor = num2;
    }
}
