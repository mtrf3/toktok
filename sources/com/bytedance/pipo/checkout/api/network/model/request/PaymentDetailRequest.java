package com.bytedance.pipo.checkout.api.network.model.request;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentDetailRequest extends BaseRequest {
    public final PaymentDetail detailInfo;

    @Override // com.bytedance.pipo.checkout.api.network.model.request.BaseRequest
    public String getBizContent() {
        String json = GsonProtectorUtils.toJson(new Gson(), this.detailInfo);
        o.LJIIIIZZ(json, "Gson().toJson(detailInfo)");
        return json;
    }

    public final PaymentDetail getDetailInfo() {
        return this.detailInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDetailRequest(PaymentDetail detailInfo) {
        super(null, null, null, 7, null);
        o.LJIIIZ(detailInfo, "detailInfo");
        this.detailInfo = detailInfo;
    }
}
