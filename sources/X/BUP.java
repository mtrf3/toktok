package X;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BUP extends AbstractC38127Exn<JSONObject, JSONObject> {
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        JSONObject jSONObject2 = jSONObject;
        F9J.LIZIZ(c38131Exr.LIZ, 0, "js_kv_methods_20191113").edit().putString(jSONObject2.optString("key"), jSONObject2.optString("value")).apply();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 1);
        return jSONObject3;
    }
}
