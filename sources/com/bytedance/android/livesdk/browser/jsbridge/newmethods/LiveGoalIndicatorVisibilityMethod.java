package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.C29958BpK;
import X.C38131Exr;
import X.C73943T0h;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class LiveGoalIndicatorVisibilityMethod extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public Object invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        C73943T0h.LIZ().LIZIZ(new C29958BpK(jSONObject.optBoolean("visible", false)));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        return jSONObject2;
    }
}
