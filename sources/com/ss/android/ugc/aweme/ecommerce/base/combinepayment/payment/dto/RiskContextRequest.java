package com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RiskContextRequest {

    @InterfaceC65349Pkn("biz_content")
    public final String bizContent;

    @InterfaceC65349Pkn("merchant_id")
    public final String merchantId;

    @InterfaceC65349Pkn("request_time")
    public final String requestTime;

    @InterfaceC65349Pkn("sign")
    public final String sign;

    public static /* synthetic */ RiskContextRequest copy$default(RiskContextRequest riskContextRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskContextRequest.bizContent;
        }
        if ((i & 2) != 0) {
            str2 = riskContextRequest.merchantId;
        }
        if ((i & 4) != 0) {
            str3 = riskContextRequest.requestTime;
        }
        if ((i & 8) != 0) {
            str4 = riskContextRequest.sign;
        }
        return riskContextRequest.copy(str, str2, str3, str4);
    }

    public final RiskContextRequest copy(String str, String str2, String str3, String str4) {
        return new RiskContextRequest(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskContextRequest)) {
            return false;
        }
        RiskContextRequest riskContextRequest = (RiskContextRequest) obj;
        return o.LJ(this.bizContent, riskContextRequest.bizContent) && o.LJ(this.merchantId, riskContextRequest.merchantId) && o.LJ(this.requestTime, riskContextRequest.requestTime) && o.LJ(this.sign, riskContextRequest.sign);
    }

    public int hashCode() {
        String str = this.bizContent;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestTime;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sign;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RiskContextRequest(bizContent=");
        LIZ.append(this.bizContent);
        LIZ.append(", merchantId=");
        LIZ.append(this.merchantId);
        LIZ.append(", requestTime=");
        LIZ.append(this.requestTime);
        LIZ.append(", sign=");
        return q.LIZIZ(LIZ, this.sign, ')', LIZ);
    }

    public final String getBizContent() {
        return this.bizContent;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getRequestTime() {
        return this.requestTime;
    }

    public final String getSign() {
        return this.sign;
    }

    public RiskContextRequest(String str, String str2, String str3, String str4) {
        this.bizContent = str;
        this.merchantId = str2;
        this.requestTime = str3;
        this.sign = str4;
    }

    public /* synthetic */ RiskContextRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
