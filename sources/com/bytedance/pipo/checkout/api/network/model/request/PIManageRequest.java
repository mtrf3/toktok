package com.bytedance.pipo.checkout.api.network.model.request;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIManageRequest extends BaseRequest {
    public final PIManageConfigure piManageConfigure;

    @Override // com.bytedance.pipo.checkout.api.network.model.request.BaseRequest
    public String getBizContent() {
        String json = GsonProtectorUtils.toJson(new Gson(), this.piManageConfigure);
        o.LJIIIIZZ(json, "Gson().toJson(piManageConfigure)");
        return json;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIManageRequest(PIManageConfigure piManageConfigure) {
        super(null, null, null, 7, null);
        o.LJIIIZ(piManageConfigure, "piManageConfigure");
        this.piManageConfigure = piManageConfigure;
    }
}
