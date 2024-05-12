package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.C15380j0;
import X.C29959BpL;
import X.C38131Exr;
import X.C73943T0h;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class LiveGoalIndicatorWidthMethod extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public Object invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        C73943T0h.LIZ().LIZIZ(new C29959BpL(C15380j0.LIZ(jSONObject.optInt("width", C15380j0.LIZ(100.0f))), jSONObject.optLong("duration", 200L)));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        return jSONObject2;
    }
}
