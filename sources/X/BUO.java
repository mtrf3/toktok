package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BUO extends AbstractC38127Exn<JSONObject, JSONObject> {
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        if (TextUtils.equals(jSONObject2.optString("type", ""), "all")) {
            java.util.Map<String, ?> all = F9J.LIZIZ(c38131Exr.LIZ, 0, "js_kv_methods_20191113").getAll();
            JSONObject jSONObject4 = new JSONObject();
            if (all != null && !all.isEmpty()) {
                for (String str : all.keySet()) {
                    if (str != null) {
                        jSONObject4.put(str.toString(), F9J.LIZIZ(c38131Exr.LIZ, 0, "js_kv_methods_20191113").getString(str.toString(), ""));
                    }
                }
            }
            jSONObject3.put("value", jSONObject4);
        } else {
            jSONObject3.put("value", F9J.LIZIZ(c38131Exr.LIZ, 0, "js_kv_methods_20191113").getString(jSONObject2.optString("key"), ""));
        }
        jSONObject3.put("code", 1);
        return jSONObject3;
    }
}
