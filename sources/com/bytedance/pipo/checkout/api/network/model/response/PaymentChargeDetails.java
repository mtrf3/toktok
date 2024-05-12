package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentChargeDetails {

    @InterfaceC65349Pkn("billing_address")
    public BillingAddress billingAddress;

    @InterfaceC65349Pkn("charge_amount")
    public String chargeAmount;

    @InterfaceC65349Pkn("charge_currency")
    public String chargeCurrency;

    @InterfaceC65349Pkn("charge_id")
    public String chargeId;

    @InterfaceC65349Pkn("is_payment_method_token")
    public Boolean isPaymentMethodToken;

    @InterfaceC65349Pkn("payer_name")
    public String payerName;

    @InterfaceC65349Pkn("payment_method_details")
    public String paymentMethodDetails;

    @InterfaceC65349Pkn("payment_method_token")
    public String paymentMethodToken;

    @InterfaceC65349Pkn("status")
    public String status;

    @InterfaceC65349Pkn("status_code")
    public String statusCode;

    @InterfaceC65349Pkn("store_payment_method")
    public Boolean storePaymentMethod;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentChargeDetails() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaymentChargeDetails copy$default(PaymentChargeDetails paymentChargeDetails, String str, String str2, String str3, String str4, String str5, String str6, BillingAddress billingAddress, String str7, Boolean bool, Boolean bool2, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentChargeDetails.chargeAmount;
        }
        if ((i & 2) != 0) {
            str2 = paymentChargeDetails.chargeCurrency;
        }
        if ((i & 4) != 0) {
            str3 = paymentChargeDetails.chargeId;
        }
        if ((i & 8) != 0) {
            str4 = paymentChargeDetails.paymentMethodDetails;
        }
        if ((i & 16) != 0) {
            str5 = paymentChargeDetails.paymentMethodToken;
        }
        if ((i & 32) != 0) {
            str6 = paymentChargeDetails.status;
        }
        if ((i & 64) != 0) {
            billingAddress = paymentChargeDetails.billingAddress;
        }
        if ((i & 128) != 0) {
            str7 = paymentChargeDetails.payerName;
        }
        if ((i & 256) != 0) {
            bool = paymentChargeDetails.isPaymentMethodToken;
        }
        if ((i & 512) != 0) {
            bool2 = paymentChargeDetails.storePaymentMethod;
        }
        if ((i & 1024) != 0) {
            str8 = paymentChargeDetails.statusCode;
        }
        return paymentChargeDetails.copy(str, str2, str3, str4, str5, str6, billingAddress, str7, bool, bool2, str8);
    }

    public final PaymentChargeDetails copy(String str, String str2, String str3, String str4, String str5, String str6, BillingAddress billingAddress, String str7, Boolean bool, Boolean bool2, String str8) {
        return new PaymentChargeDetails(str, str2, str3, str4, str5, str6, billingAddress, str7, bool, bool2, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentChargeDetails)) {
            return false;
        }
        PaymentChargeDetails paymentChargeDetails = (PaymentChargeDetails) obj;
        return o.LJ(this.chargeAmount, paymentChargeDetails.chargeAmount) && o.LJ(this.chargeCurrency, paymentChargeDetails.chargeCurrency) && o.LJ(this.chargeId, paymentChargeDetails.chargeId) && o.LJ(this.paymentMethodDetails, paymentChargeDetails.paymentMethodDetails) && o.LJ(this.paymentMethodToken, paymentChargeDetails.paymentMethodToken) && o.LJ(this.status, paymentChargeDetails.status) && o.LJ(this.billingAddress, paymentChargeDetails.billingAddress) && o.LJ(this.payerName, paymentChargeDetails.payerName) && o.LJ(this.isPaymentMethodToken, paymentChargeDetails.isPaymentMethodToken) && o.LJ(this.storePaymentMethod, paymentChargeDetails.storePaymentMethod) && o.LJ(this.statusCode, paymentChargeDetails.statusCode);
    }

    public int hashCode() {
        String str = this.chargeAmount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chargeCurrency;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chargeId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentMethodDetails;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentMethodToken;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BillingAddress billingAddress = this.billingAddress;
        int hashCode7 = (hashCode6 + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31;
        String str7 = this.payerName;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isPaymentMethodToken;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.storePaymentMethod;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.statusCode;
        return hashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "PaymentChargeDetails(chargeAmount=" + ((Object) this.chargeAmount) + ", chargeCurrency=" + ((Object) this.chargeCurrency) + ", chargeId=" + ((Object) this.chargeId) + ", paymentMethodDetails=" + ((Object) this.paymentMethodDetails) + ", paymentMethodToken=" + ((Object) this.paymentMethodToken) + ", status=" + ((Object) this.status) + ", billingAddress=" + this.billingAddress + ", payerName=" + ((Object) this.payerName) + ", isPaymentMethodToken=" + this.isPaymentMethodToken + ", storePaymentMethod=" + this.storePaymentMethod + ", statusCode=" + ((Object) this.statusCode) + ')';
    }

    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final String getChargeAmount() {
        return this.chargeAmount;
    }

    public final String getChargeCurrency() {
        return this.chargeCurrency;
    }

    public final String getChargeId() {
        return this.chargeId;
    }

    public final String getPayerName() {
        return this.payerName;
    }

    public final String getPaymentMethodDetails() {
        return this.paymentMethodDetails;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final Boolean getStorePaymentMethod() {
        return this.storePaymentMethod;
    }

    public final Boolean isPaymentMethodToken() {
        return this.isPaymentMethodToken;
    }

    public final void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public final void setChargeAmount(String str) {
        this.chargeAmount = str;
    }

    public final void setChargeCurrency(String str) {
        this.chargeCurrency = str;
    }

    public final void setChargeId(String str) {
        this.chargeId = str;
    }

    public final void setPayerName(String str) {
        this.payerName = str;
    }

    public final void setPaymentMethodDetails(String str) {
        this.paymentMethodDetails = str;
    }

    public final void setPaymentMethodToken(Boolean bool) {
        this.isPaymentMethodToken = bool;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setStorePaymentMethod(Boolean bool) {
        this.storePaymentMethod = bool;
    }

    public final void setPaymentMethodToken(String str) {
        this.paymentMethodToken = str;
    }

    public PaymentChargeDetails(String str, String str2, String str3, String str4, String str5, String str6, BillingAddress billingAddress, String str7, Boolean bool, Boolean bool2, String str8) {
        this.chargeAmount = str;
        this.chargeCurrency = str2;
        this.chargeId = str3;
        this.paymentMethodDetails = str4;
        this.paymentMethodToken = str5;
        this.status = str6;
        this.billingAddress = billingAddress;
        this.payerName = str7;
        this.isPaymentMethodToken = bool;
        this.storePaymentMethod = bool2;
        this.statusCode = str8;
    }

    public /* synthetic */ PaymentChargeDetails(String str, String str2, String str3, String str4, String str5, String str6, BillingAddress billingAddress, String str7, Boolean bool, Boolean bool2, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : billingAddress, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) == 0 ? str8 : null);
    }
}
