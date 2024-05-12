package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentDetail {

    @InterfaceC65349Pkn("charge_id")
    public String chargeId;

    @InterfaceC65349Pkn("configuration")
    public Configuration configuration;

    @InterfaceC65349Pkn("is_agreement")
    public Boolean isAgreement;

    @InterfaceC65349Pkn("merchant_order_id")
    public String merchantOrderId;

    @InterfaceC65349Pkn("merchant_user_id")
    public String merchantUserId;

    @InterfaceC65349Pkn("nonce")
    public String nonce;

    @InterfaceC65349Pkn("payment_reference")
    public String paymentReference;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentDetail() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaymentDetail copy$default(PaymentDetail paymentDetail, String str, Boolean bool, String str2, String str3, Configuration configuration, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentDetail.chargeId;
        }
        if ((i & 2) != 0) {
            bool = paymentDetail.isAgreement;
        }
        if ((i & 4) != 0) {
            str2 = paymentDetail.merchantOrderId;
        }
        if ((i & 8) != 0) {
            str3 = paymentDetail.paymentReference;
        }
        if ((i & 16) != 0) {
            configuration = paymentDetail.configuration;
        }
        if ((i & 32) != 0) {
            str4 = paymentDetail.merchantUserId;
        }
        if ((i & 64) != 0) {
            str5 = paymentDetail.nonce;
        }
        return paymentDetail.copy(str, bool, str2, str3, configuration, str4, str5);
    }

    public final PaymentDetail copy(String str, Boolean bool, String str2, String str3, Configuration configuration, String str4, String str5) {
        return new PaymentDetail(str, bool, str2, str3, configuration, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDetail)) {
            return false;
        }
        PaymentDetail paymentDetail = (PaymentDetail) obj;
        return o.LJ(this.chargeId, paymentDetail.chargeId) && o.LJ(this.isAgreement, paymentDetail.isAgreement) && o.LJ(this.merchantOrderId, paymentDetail.merchantOrderId) && o.LJ(this.paymentReference, paymentDetail.paymentReference) && o.LJ(this.configuration, paymentDetail.configuration) && o.LJ(this.merchantUserId, paymentDetail.merchantUserId) && o.LJ(this.nonce, paymentDetail.nonce);
    }

    public int hashCode() {
        String str = this.chargeId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isAgreement;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.merchantOrderId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentReference;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Configuration configuration = this.configuration;
        int hashCode5 = (hashCode4 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        String str4 = this.merchantUserId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nonce;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentDetail(chargeId=");
        LIZ.append((Object) this.chargeId);
        LIZ.append(", isAgreement=");
        LIZ.append(this.isAgreement);
        LIZ.append(", merchantOrderId=");
        LIZ.append((Object) this.merchantOrderId);
        LIZ.append(", paymentReference=");
        LIZ.append((Object) this.paymentReference);
        LIZ.append(", configuration=");
        LIZ.append(this.configuration);
        LIZ.append(", merchantUserId=");
        LIZ.append((Object) this.merchantUserId);
        LIZ.append(", nonce=");
        LIZ.append((Object) this.nonce);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getChargeId() {
        return this.chargeId;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final String getMerchantOrderId() {
        return this.merchantOrderId;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPaymentReference() {
        return this.paymentReference;
    }

    public final Boolean isAgreement() {
        return this.isAgreement;
    }

    public final void setAgreement(Boolean bool) {
        this.isAgreement = bool;
    }

    public final void setChargeId(String str) {
        this.chargeId = str;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public final void setMerchantOrderId(String str) {
        this.merchantOrderId = str;
    }

    public final void setMerchantUserId(String str) {
        this.merchantUserId = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setPaymentReference(String str) {
        this.paymentReference = str;
    }

    public PaymentDetail(String str, Boolean bool, String str2, String str3, Configuration configuration, String str4, String str5) {
        this.chargeId = str;
        this.isAgreement = bool;
        this.merchantOrderId = str2;
        this.paymentReference = str3;
        this.configuration = configuration;
        this.merchantUserId = str4;
        this.nonce = str5;
    }

    public /* synthetic */ PaymentDetail(String str, Boolean bool, String str2, String str3, Configuration configuration, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : configuration, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? str5 : null);
    }
}
