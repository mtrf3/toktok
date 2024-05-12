package com.bytedance.pipo.checkout.api.network.model.request;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CashierBasicInfoRequest extends BaseRequest {
    public final CashierBasicInfo cashierInfo;

    @Override // com.bytedance.pipo.checkout.api.network.model.request.BaseRequest
    public String getBizContent() {
        String json = GsonProtectorUtils.toJson(new Gson(), this.cashierInfo);
        o.LJIIIIZZ(json, "Gson().toJson(cashierInfo)");
        return json;
    }

    public final CashierBasicInfo getCashierInfo() {
        return this.cashierInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashierBasicInfoRequest(CashierBasicInfo cashierInfo) {
        super(null, null, null, 7, null);
        o.LJIIIZ(cashierInfo, "cashierInfo");
        this.cashierInfo = cashierInfo;
    }
}
