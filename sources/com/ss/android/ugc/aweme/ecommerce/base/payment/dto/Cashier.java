package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Cashier {

    @InterfaceC65349Pkn("address")
    public AddressForPay address;

    @InterfaceC65349Pkn("country_or_region")
    public final String countryOrRegion;

    @InterfaceC65349Pkn("env")
    public final String env;

    @InterfaceC65349Pkn("idc")
    public final String idc;

    @InterfaceC65349Pkn("locale")
    public final String locale;

    @InterfaceC65349Pkn("merchant_id")
    public final String merchantId;

    @InterfaceC65349Pkn("merchant_user_id")
    public final String merchantUserId;

    @InterfaceC65349Pkn("nonce")
    public final String nonce;

    @InterfaceC65349Pkn("notification_url")
    public final String notificationUrl;

    @InterfaceC65349Pkn("origin_key")
    public final String originKey;

    @InterfaceC65349Pkn("payment_params")
    public final PaymentParams paymentParams;

    @InterfaceC65349Pkn("ret_code")
    public final String retCode;

    @InterfaceC65349Pkn("risk_info")
    public final String riskInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cashier)) {
            return false;
        }
        Cashier cashier = (Cashier) obj;
        return o.LJ(this.idc, cashier.idc) && o.LJ(this.merchantId, cashier.merchantId) && o.LJ(this.merchantUserId, cashier.merchantUserId) && o.LJ(this.env, cashier.env) && o.LJ(this.nonce, cashier.nonce) && o.LJ(this.originKey, cashier.originKey) && o.LJ(this.locale, cashier.locale) && o.LJ(this.notificationUrl, cashier.notificationUrl) && o.LJ(this.countryOrRegion, cashier.countryOrRegion) && o.LJ(this.paymentParams, cashier.paymentParams) && o.LJ(this.riskInfo, cashier.riskInfo) && o.LJ(this.retCode, cashier.retCode) && o.LJ(this.address, cashier.address);
    }

    public final int hashCode() {
        String str = this.idc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantUserId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.env;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nonce;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.originKey;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.locale;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.notificationUrl;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.countryOrRegion;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        PaymentParams paymentParams = this.paymentParams;
        int hashCode10 = (hashCode9 + (paymentParams == null ? 0 : paymentParams.hashCode())) * 31;
        String str10 = this.riskInfo;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.retCode;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        AddressForPay addressForPay = this.address;
        return hashCode12 + (addressForPay != null ? addressForPay.hashCode() : 0);
    }

    public final String toString() {
        return "Cashier(idc=" + this.idc + ", merchantId=" + this.merchantId + ", merchantUserId=" + this.merchantUserId + ", env=" + this.env + ", nonce=" + this.nonce + ", originKey=" + this.originKey + ", locale=" + this.locale + ", notificationUrl=" + this.notificationUrl + ", countryOrRegion=" + this.countryOrRegion + ", paymentParams=" + this.paymentParams + ", riskInfo=" + this.riskInfo + ", retCode=" + this.retCode + ", address=" + this.address + ')';
    }

    public Cashier(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, PaymentParams paymentParams, String str10, String str11, AddressForPay addressForPay) {
        this.idc = str;
        this.merchantId = str2;
        this.merchantUserId = str3;
        this.env = str4;
        this.nonce = str5;
        this.originKey = str6;
        this.locale = str7;
        this.notificationUrl = str8;
        this.countryOrRegion = str9;
        this.paymentParams = paymentParams;
        this.riskInfo = str10;
        this.retCode = str11;
        this.address = addressForPay;
    }
}
