package com.bytedance.pipo.checkout.api.network.model.response;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes20.dex */
public class BasicResponse {
    public final String rawStr;
    public String responseStr;

    public final String getRawStr() {
        return this.rawStr;
    }

    public final String getResponseStr() {
        return this.responseStr;
    }

    public BasicResponse(String rawStr) {
        o.LJIIIZ(rawStr, "rawStr");
        this.rawStr = rawStr;
        this.responseStr = new JSONObject(rawStr).optString("response");
    }

    public final void setResponseStr(String str) {
        this.responseStr = str;
    }
}
