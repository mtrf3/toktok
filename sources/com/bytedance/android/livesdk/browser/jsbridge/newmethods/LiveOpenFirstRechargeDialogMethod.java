package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.C32008ChI;
import X.C38131Exr;
import X.C73943T0h;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class LiveOpenFirstRechargeDialogMethod extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public Object invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject != null) {
            str = optJSONObject.optString("charge_reason");
            str3 = optJSONObject.optString("first_recharge_scenario");
            str4 = optJSONObject.optString("gift_enter_from");
            str2 = optJSONObject.optString("notification_type");
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        C73943T0h.LIZ().LIZIZ(new C32008ChI(str, str3, str4, str2));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        return jSONObject2;
    }
}
