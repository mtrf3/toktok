package com.bytedance.pipo.checkout.api.network.model.request;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIBasicInfoRequest extends BaseRequest {
    public final PIBasicInfo piBasicInfo;

    @Override // com.bytedance.pipo.checkout.api.network.model.request.BaseRequest
    public String getBizContent() {
        String json = GsonProtectorUtils.toJson(new Gson(), this.piBasicInfo);
        o.LJIIIIZZ(json, "Gson().toJson(piBasicInfo)");
        return json;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIBasicInfoRequest(PIBasicInfo piBasicInfo) {
        super(null, null, null, 7, null);
        o.LJIIIZ(piBasicInfo, "piBasicInfo");
        this.piBasicInfo = piBasicInfo;
    }
}
