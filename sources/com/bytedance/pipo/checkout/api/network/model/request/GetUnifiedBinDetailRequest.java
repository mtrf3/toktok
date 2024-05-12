package com.bytedance.pipo.checkout.api.network.model.request;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class GetUnifiedBinDetailRequest extends BaseRequest {
    public final GetUnifiedBinDetail request;

    @Override // com.bytedance.pipo.checkout.api.network.model.request.BaseRequest
    public String getBizContent() {
        String json = GsonProtectorUtils.toJson(new Gson(), this.request);
        o.LJIIIIZZ(json, "Gson().toJson(request)");
        return json;
    }

    public final GetUnifiedBinDetail getRequest() {
        return this.request;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUnifiedBinDetailRequest(GetUnifiedBinDetail request) {
        super(null, null, null, 7, null);
        o.LJIIIZ(request, "request");
        this.request = request;
    }
}
