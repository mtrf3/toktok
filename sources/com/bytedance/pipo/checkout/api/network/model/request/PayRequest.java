package com.bytedance.pipo.checkout.api.network.model.request;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PayRequest extends BaseRequest {
    public final Pay payInfo;

    @Override // com.bytedance.pipo.checkout.api.network.model.request.BaseRequest
    public String getBizContent() {
        String json = GsonProtectorUtils.toJson(new Gson(), this.payInfo);
        o.LJIIIIZZ(json, "Gson().toJson(payInfo)");
        return json;
    }

    public final Pay getPayInfo() {
        return this.payInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayRequest(Pay payInfo) {
        super(null, null, null, 7, null);
        o.LJIIIZ(payInfo, "payInfo");
        this.payInfo = payInfo;
    }
}
