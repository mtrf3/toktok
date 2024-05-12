package com.bytedance.pipo.checkout.api.network.model.request;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes20.dex */
public abstract class BaseRequest {
    public String merchantId;
    public String requestTime;
    public String sign;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public abstract String getBizContent();

    public final Map<String, String> buildParamsMap() {
        HashMap hashMap = new HashMap();
        String str = this.merchantId;
        if (str != null) {
            hashMap.put("merchant_id", str);
        }
        String str2 = this.requestTime;
        if (str2 != null) {
            hashMap.put("request_time", str2);
        }
        String str3 = this.sign;
        if (str3 != null) {
            hashMap.put("sign", str3);
        }
        hashMap.put("biz_content", getBizContent());
        return hashMap;
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

    public final void setMerchantId(String str) {
        this.merchantId = str;
    }

    public final void setRequestTime(String str) {
        this.requestTime = str;
    }

    public final void setSign(String str) {
        this.sign = str;
    }

    public BaseRequest(String str, String str2, String str3) {
        this.merchantId = str;
        this.requestTime = str2;
        this.sign = str3;
    }

    public /* synthetic */ BaseRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
