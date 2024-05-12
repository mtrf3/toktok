package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class LogPbBean implements Serializable {

    @InterfaceC65349Pkn("impr_id")
    public String imprId;

    public String toJsonString() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(this.imprId)) {
                str = "";
            } else {
                str = this.imprId;
            }
            jSONObject.put("impr_id", str);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public String getImprId() {
        return this.imprId;
    }

    public void setImprId(String str) {
        this.imprId = str;
    }
}
