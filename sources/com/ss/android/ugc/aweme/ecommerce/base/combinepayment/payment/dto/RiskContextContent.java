package com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RiskContextContent {

    @InterfaceC65349Pkn("country_or_region")
    public final String countryOrRegion;

    @InterfaceC65349Pkn("merchant_user_id")
    public final String merchantUserId;

    @InterfaceC65349Pkn("nonce")
    public final String nonce;

    @InterfaceC65349Pkn("payment_elements")
    public final Map<String, String> paymentElements;

    @InterfaceC65349Pkn("payment_method_id")
    public final String paymentMethodId;

    @InterfaceC65349Pkn("payment_method_token")
    public final String paymentMethodToken;

    @InterfaceC65349Pkn("pre_risk_id")
    public final String preRiskId;

    @InterfaceC65349Pkn("risk_info")
    public final m riskInfo;

    @InterfaceC65349Pkn("scenario")
    public final String scenario;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RiskContextContent copy$default(RiskContextContent riskContextContent, String str, String str2, String str3, String str4, String str5, String str6, Map map, m mVar, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskContextContent.preRiskId;
        }
        if ((i & 2) != 0) {
            str2 = riskContextContent.countryOrRegion;
        }
        if ((i & 4) != 0) {
            str3 = riskContextContent.merchantUserId;
        }
        if ((i & 8) != 0) {
            str4 = riskContextContent.scenario;
        }
        if ((i & 16) != 0) {
            str5 = riskContextContent.paymentMethodId;
        }
        if ((i & 32) != 0) {
            str6 = riskContextContent.paymentMethodToken;
        }
        if ((i & 64) != 0) {
            map = riskContextContent.paymentElements;
        }
        if ((i & 128) != 0) {
            mVar = riskContextContent.riskInfo;
        }
        if ((i & 256) != 0) {
            str7 = riskContextContent.nonce;
        }
        return riskContextContent.copy(str, str2, str3, str4, str5, str6, map, mVar, str7);
    }

    public final RiskContextContent copy(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, m mVar, String str7) {
        return new RiskContextContent(str, str2, str3, str4, str5, str6, map, mVar, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskContextContent)) {
            return false;
        }
        RiskContextContent riskContextContent = (RiskContextContent) obj;
        return o.LJ(this.preRiskId, riskContextContent.preRiskId) && o.LJ(this.countryOrRegion, riskContextContent.countryOrRegion) && o.LJ(this.merchantUserId, riskContextContent.merchantUserId) && o.LJ(this.scenario, riskContextContent.scenario) && o.LJ(this.paymentMethodId, riskContextContent.paymentMethodId) && o.LJ(this.paymentMethodToken, riskContextContent.paymentMethodToken) && o.LJ(this.paymentElements, riskContextContent.paymentElements) && o.LJ(this.riskInfo, riskContextContent.riskInfo) && o.LJ(this.nonce, riskContextContent.nonce);
    }

    public int hashCode() {
        String str = this.preRiskId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryOrRegion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantUserId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scenario;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentMethodId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentMethodToken;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.paymentElements;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        m mVar = this.riskInfo;
        int hashCode8 = (hashCode7 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str7 = this.nonce;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RiskContextContent(preRiskId=");
        LIZ.append(this.preRiskId);
        LIZ.append(", countryOrRegion=");
        LIZ.append(this.countryOrRegion);
        LIZ.append(", merchantUserId=");
        LIZ.append(this.merchantUserId);
        LIZ.append(", scenario=");
        LIZ.append(this.scenario);
        LIZ.append(", paymentMethodId=");
        LIZ.append(this.paymentMethodId);
        LIZ.append(", paymentMethodToken=");
        LIZ.append(this.paymentMethodToken);
        LIZ.append(", paymentElements=");
        LIZ.append(this.paymentElements);
        LIZ.append(", riskInfo=");
        LIZ.append(this.riskInfo);
        LIZ.append(", nonce=");
        return q.LIZIZ(LIZ, this.nonce, ')', LIZ);
    }

    public final String getCountryOrRegion() {
        return this.countryOrRegion;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final Map<String, String> getPaymentElements() {
        return this.paymentElements;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public final String getPreRiskId() {
        return this.preRiskId;
    }

    public final m getRiskInfo() {
        return this.riskInfo;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public RiskContextContent(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, m mVar, String str7) {
        this.preRiskId = str;
        this.countryOrRegion = str2;
        this.merchantUserId = str3;
        this.scenario = str4;
        this.paymentMethodId = str5;
        this.paymentMethodToken = str6;
        this.paymentElements = map;
        this.riskInfo = mVar;
        this.nonce = str7;
    }
}
