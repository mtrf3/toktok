package com.bytedance.pipo.checkout.api.network.model.request;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StorePaymentMethodRequest extends BaseRequest {
    public final Pay storePaymentConfig;

    @Override // com.bytedance.pipo.checkout.api.network.model.request.BaseRequest
    public String getBizContent() {
        String json = GsonProtectorUtils.toJson(new Gson(), this.storePaymentConfig);
        o.LJIIIIZZ(json, "Gson().toJson(storePaymentConfig)");
        return json;
    }

    public final Pay getStorePaymentConfig() {
        return this.storePaymentConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorePaymentMethodRequest(Pay storePaymentConfig) {
        super(null, null, null, 7, null);
        o.LJIIIZ(storePaymentConfig, "storePaymentConfig");
        this.storePaymentConfig = storePaymentConfig;
    }
}
