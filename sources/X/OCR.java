package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OCR {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final OCP LIZLLL;

    public final void LIZ(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObjectProtectorUtils.getInt(jSONObject, "JSSDK");
        this.LIZ = JSONObjectProtectorUtils.getString(jSONObject, "func");
        this.LIZIZ = JSONObjectProtectorUtils.getString(jSONObject, "params");
        JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
        this.LIZJ = JSONObjectProtectorUtils.getString(jSONObject, "__callback_id");
    }

    public OCR(OCP ocp, String str) {
        this.LIZLLL = ocp;
        try {
            LIZ(str);
        } catch (JSONException e) {
            C61349O5x.LIZIZ(e);
        }
    }

    public final void LIZLLL(int i, JSONObject jSONObject) {
        OCP ocp = this.LIZLLL;
        if (ocp == null) {
            return;
        }
        try {
            ocp.LIZ(LIZJ(i, jSONObject, this).toString());
        } catch (JSONException unused) {
        }
    }

    public static String LIZIZ(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("func", str);
            jSONObject2.put("__msg_type", "call");
            jSONObject2.put("data", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("__params", jSONObject2);
            jSONObject3.put("__callback_id", str2);
            return jSONObject3.toString();
        } catch (JSONException e) {
            if (C61349O5x.LIZ < 3) {
                C16880lQ.LLLLIIL(e);
            }
            return null;
        }
    }

    public static JSONObject LIZJ(int i, JSONObject jSONObject, OCR ocr) {
        JSONObject LIZLLL = C770830u.LIZLLL("code", i);
        LIZLLL.put("func", ocr.LIZ);
        LIZLLL.put("__msg_type", "callback");
        Object obj = jSONObject;
        if (jSONObject == null) {
            obj = "{}";
        }
        LIZLLL.put("data", obj);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("__params", LIZLLL);
        jSONObject2.put("__callback_id", ocr.LIZJ);
        return jSONObject2;
    }
}
