package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Pay {

    @InterfaceC65349Pkn("amount")
    public String amount;

    @InterfaceC65349Pkn("charge_id")
    public String chargeId;

    @InterfaceC65349Pkn("configuration")
    public Configuration configuration;

    @InterfaceC65349Pkn("country_or_region")
    public String countryOrRegion;

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("deeplink")
    public String deeplink;

    @InterfaceC65349Pkn("idempotency_key")
    public String idempotencyKey;

    @InterfaceC65349Pkn("is_agreement")
    public Boolean isAgreement;

    @InterfaceC65349Pkn("merchant_user_id")
    public String merchantUserId;

    @InterfaceC65349Pkn("nonce")
    public String nonce;

    @InterfaceC65349Pkn("notification_url")
    public String notificationUrl;

    @InterfaceC65349Pkn("payment_method")
    public PaymentMethod paymentMethod;

    @InterfaceC65349Pkn("payment_reference")
    public String paymentReference;

    @InterfaceC65349Pkn("product_code")
    public String productCode;

    @InterfaceC65349Pkn("return_url")
    public String returnUrl;

    @InterfaceC65349Pkn("risk_info")
    public String riskInfo;

    @InterfaceC65349Pkn("store_payment_method")
    public Boolean storePaymentMethod;

    /* JADX WARN: Multi-variable type inference failed */
    public Pay() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Pay copy$default(Pay pay, String str, String str2, Configuration configuration, String str3, PaymentMethod paymentMethod, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool2, int i, Object obj) {
        String str14 = str;
        String str15 = str2;
        String str16 = str4;
        PaymentMethod paymentMethod2 = paymentMethod;
        Configuration configuration2 = configuration;
        String str17 = str3;
        Boolean bool3 = bool;
        String str18 = str7;
        String str19 = str5;
        String str20 = str6;
        String str21 = str10;
        String str22 = str8;
        String str23 = str11;
        String str24 = str9;
        Boolean bool4 = bool2;
        String str25 = str12;
        String str26 = str13;
        if ((i & 1) != 0) {
            str14 = pay.amount;
        }
        if ((i & 2) != 0) {
            str15 = pay.chargeId;
        }
        if ((i & 4) != 0) {
            configuration2 = pay.configuration;
        }
        if ((i & 8) != 0) {
            str17 = pay.currency;
        }
        if ((i & 16) != 0) {
            paymentMethod2 = pay.paymentMethod;
        }
        if ((i & 32) != 0) {
            str16 = pay.paymentReference;
        }
        if ((i & 64) != 0) {
            str19 = pay.returnUrl;
        }
        if ((i & 128) != 0) {
            str20 = pay.deeplink;
        }
        if ((i & 256) != 0) {
            str18 = pay.riskInfo;
        }
        if ((i & 512) != 0) {
            bool3 = pay.storePaymentMethod;
        }
        if ((i & 1024) != 0) {
            str22 = pay.nonce;
        }
        if ((i & 2048) != 0) {
            str24 = pay.merchantUserId;
        }
        if ((i & 4096) != 0) {
            str21 = pay.idempotencyKey;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str23 = pay.productCode;
        }
        if ((i & 16384) != 0) {
            str25 = pay.notificationUrl;
        }
        if ((32768 & i) != 0) {
            str26 = pay.countryOrRegion;
        }
        if ((i & 65536) != 0) {
            bool4 = pay.isAgreement;
        }
        PaymentMethod paymentMethod3 = paymentMethod2;
        return pay.copy(str14, str15, configuration2, str17, paymentMethod3, str16, str19, str20, str18, bool3, str22, str24, str21, str23, str25, str26, bool4);
    }

    public final Pay copy(String str, String str2, Configuration configuration, String str3, PaymentMethod paymentMethod, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool2) {
        return new Pay(str, str2, configuration, str3, paymentMethod, str4, str5, str6, str7, bool, str8, str9, str10, str11, str12, str13, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pay)) {
            return false;
        }
        Pay pay = (Pay) obj;
        return o.LJ(this.amount, pay.amount) && o.LJ(this.chargeId, pay.chargeId) && o.LJ(this.configuration, pay.configuration) && o.LJ(this.currency, pay.currency) && o.LJ(this.paymentMethod, pay.paymentMethod) && o.LJ(this.paymentReference, pay.paymentReference) && o.LJ(this.returnUrl, pay.returnUrl) && o.LJ(this.deeplink, pay.deeplink) && o.LJ(this.riskInfo, pay.riskInfo) && o.LJ(this.storePaymentMethod, pay.storePaymentMethod) && o.LJ(this.nonce, pay.nonce) && o.LJ(this.merchantUserId, pay.merchantUserId) && o.LJ(this.idempotencyKey, pay.idempotencyKey) && o.LJ(this.productCode, pay.productCode) && o.LJ(this.notificationUrl, pay.notificationUrl) && o.LJ(this.countryOrRegion, pay.countryOrRegion) && o.LJ(this.isAgreement, pay.isAgreement);
    }

    public int hashCode() {
        String str = this.amount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chargeId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Configuration configuration = this.configuration;
        int hashCode3 = (hashCode2 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int hashCode5 = (hashCode4 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        String str4 = this.paymentReference;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.returnUrl;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deeplink;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.riskInfo;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.storePaymentMethod;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.nonce;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.merchantUserId;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.idempotencyKey;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.productCode;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.notificationUrl;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.countryOrRegion;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.isAgreement;
        return hashCode16 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "Pay(amount=" + ((Object) this.amount) + ", chargeId=" + ((Object) this.chargeId) + ", configuration=" + this.configuration + ", currency=" + ((Object) this.currency) + ", paymentMethod=" + this.paymentMethod + ", paymentReference=" + ((Object) this.paymentReference) + ", returnUrl=" + ((Object) this.returnUrl) + ", deeplink=" + ((Object) this.deeplink) + ", riskInfo=" + ((Object) this.riskInfo) + ", storePaymentMethod=" + this.storePaymentMethod + ", nonce=" + ((Object) this.nonce) + ", merchantUserId=" + ((Object) this.merchantUserId) + ", idempotencyKey=" + ((Object) this.idempotencyKey) + ", productCode=" + ((Object) this.productCode) + ", notificationUrl=" + ((Object) this.notificationUrl) + ", countryOrRegion=" + ((Object) this.countryOrRegion) + ", isAgreement=" + this.isAgreement + ')';
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getChargeId() {
        return this.chargeId;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final String getCountryOrRegion() {
        return this.countryOrRegion;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getNotificationUrl() {
        return this.notificationUrl;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentReference() {
        return this.paymentReference;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final String getRiskInfo() {
        return this.riskInfo;
    }

    public final Boolean getStorePaymentMethod() {
        return this.storePaymentMethod;
    }

    public final Boolean isAgreement() {
        return this.isAgreement;
    }

    public final void setAgreement(Boolean bool) {
        this.isAgreement = bool;
    }

    public final void setAmount(String str) {
        this.amount = str;
    }

    public final void setChargeId(String str) {
        this.chargeId = str;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public final void setCountryOrRegion(String str) {
        this.countryOrRegion = str;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    public final void setIdempotencyKey(String str) {
        this.idempotencyKey = str;
    }

    public final void setMerchantUserId(String str) {
        this.merchantUserId = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setNotificationUrl(String str) {
        this.notificationUrl = str;
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public final void setPaymentReference(String str) {
        this.paymentReference = str;
    }

    public final void setProductCode(String str) {
        this.productCode = str;
    }

    public final void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final void setRiskInfo(String str) {
        this.riskInfo = str;
    }

    public final void setStorePaymentMethod(Boolean bool) {
        this.storePaymentMethod = bool;
    }

    public Pay(String str, String str2, Configuration configuration, String str3, PaymentMethod paymentMethod, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool2) {
        this.amount = str;
        this.chargeId = str2;
        this.configuration = configuration;
        this.currency = str3;
        this.paymentMethod = paymentMethod;
        this.paymentReference = str4;
        this.returnUrl = str5;
        this.deeplink = str6;
        this.riskInfo = str7;
        this.storePaymentMethod = bool;
        this.nonce = str8;
        this.merchantUserId = str9;
        this.idempotencyKey = str10;
        this.productCode = str11;
        this.notificationUrl = str12;
        this.countryOrRegion = str13;
        this.isAgreement = bool2;
    }

    public /* synthetic */ Pay(String str, String str2, Configuration configuration, String str3, PaymentMethod paymentMethod, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new Configuration(null, null, null, null, null, null, 63, null) : configuration, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? new PaymentMethod(null, null, null, null, null, null, 63, null) : paymentMethod, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : str13, (i & 65536) != 0 ? null : bool2);
    }
}
