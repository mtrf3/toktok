package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.J0u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48476J0u {
    public static JSONObject LIZ() {
        Object LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("authMap", C46716IVc.LIZ());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("config_4");
            jSONObject2.put("3", jSONArray);
            jSONObject3.put("config_4", "{\"params\":{\"configuration\":{\"is_display_name\":true,\"is_email\":true,\"is_phone_number\":true,\"is_photo_thumbnail\":true}},\"type\":\"config\"}");
            IQW.LIZ(jSONObject2, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("limitToCondition", jSONObject2);
            jSONObject4.put("conditions", jSONObject3);
            jSONObject.put("limit", jSONObject4);
            LIZ = jSONObject.put("version", "1.0");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return jSONObject;
    }
}
