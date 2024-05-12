package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.BdR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29221BdR extends AbstractC38127Exn<JSONObject, JSONObject> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        int i;
        JSONObject jSONObject2 = jSONObject;
        boolean equals = TextUtils.equals(jSONObject2.optString("type", ""), "all");
        JSONObject jSONObject3 = new JSONObject();
        if (equals) {
            i = F9J.LIZIZ(c38131Exr.LIZ, 0, "js_kv_methods_20191113").edit().clear().commit();
        } else {
            i = F9J.LIZIZ(c38131Exr.LIZ, 0, "js_kv_methods_20191113").edit().remove(jSONObject2.optString("key")).commit();
        }
        jSONObject3.put("code", i);
        return jSONObject3;
    }
}
