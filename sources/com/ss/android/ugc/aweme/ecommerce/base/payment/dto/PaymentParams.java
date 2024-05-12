package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PaymentParams {

    @InterfaceC65349Pkn("amount")
    public final String amount;

    @InterfaceC65349Pkn("amount_before_payment_promotion")
    public final String amountBeforePaymentPromotion;

    @InterfaceC65349Pkn("charge_id")
    public final String chargeId;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("payment_reference")
    public final String paymentReference;

    @InterfaceC65349Pkn("sub_merchant_id")
    public final String subMerchantId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentParams)) {
            return false;
        }
        PaymentParams paymentParams = (PaymentParams) obj;
        return o.LJ(this.amount, paymentParams.amount) && o.LJ(this.chargeId, paymentParams.chargeId) && o.LJ(this.currency, paymentParams.currency) && o.LJ(this.paymentReference, paymentParams.paymentReference) && o.LJ(this.subMerchantId, paymentParams.subMerchantId) && o.LJ(this.amountBeforePaymentPromotion, paymentParams.amountBeforePaymentPromotion);
    }

    public final int hashCode() {
        String str = this.amount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chargeId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentReference;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subMerchantId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.amountBeforePaymentPromotion;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentParams(amount=");
        LIZ.append(this.amount);
        LIZ.append(", chargeId=");
        LIZ.append(this.chargeId);
        LIZ.append(", currency=");
        LIZ.append(this.currency);
        LIZ.append(", paymentReference=");
        LIZ.append(this.paymentReference);
        LIZ.append(", subMerchantId=");
        LIZ.append(this.subMerchantId);
        LIZ.append(", amountBeforePaymentPromotion=");
        return q.LIZIZ(LIZ, this.amountBeforePaymentPromotion, ')', LIZ);
    }

    public PaymentParams(String str, String str2, String str3, String str4, String str5, String str6) {
        this.amount = str;
        this.chargeId = str2;
        this.currency = str3;
        this.paymentReference = str4;
        this.subMerchantId = str5;
        this.amountBeforePaymentPromotion = str6;
    }
}
