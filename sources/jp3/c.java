package jp3;

import X.C16880lQ;
import X.C63854P4g;
import X.C78866UxK;
import X.P4Q;
import X.X1D;
import com.bytedance.ies.common.IESAppLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class c {
    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        LIZIZ(str, str2, jSONObject, true, false);
    }

    public static void LIZJ(String str, JSONObject jSONObject, String str2, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEventReport ");
        LIZ.append(str);
        LIZ.append(": ");
        LIZ.append(jSONObject);
        P4Q.LIZ("ApplogUtils", X1D.LIZIZ(LIZ));
        C78866UxK.LJIJ("ApplogUtils-onEventReport");
        if (str2.equals("business")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ApiName", str);
                jSONObject2.put("ApiParam", jSONObject.toString());
                jSONObject2.put("ApiResult", jSONObject2.opt("resultCode"));
                IESAppLogger.sharedInstance().appLogOnEvent("vesdk_api", jSONObject2, "business", z);
            } catch (JSONException e) {
                P4Q.LIZIZ(C63854P4g.class, "JSON error", e);
            }
        } else {
            IESAppLogger.sharedInstance().appLogOnEvent(str, jSONObject, str2, z);
        }
        C78866UxK.LJJIIJ();
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("sdkVersion", "15.0.0.74-mt");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (z2) {
            LIZJ(str, jSONObject, str2, true);
        }
        if (z) {
            LIZJ(str, jSONObject, str2, false);
        }
    }
}
