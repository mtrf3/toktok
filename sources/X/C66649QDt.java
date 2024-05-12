package X;

import org.json.JSONObject;

/* renamed from: X.QDt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66649QDt {
    public static JSONObject LIZ;

    public static JSONObject LIZ(int i, int i2, String str) {
        JSONObject jSONObject = LIZ;
        if (jSONObject != null) {
            jSONObject.put("errorCode", i);
        }
        JSONObject jSONObject2 = LIZ;
        if (jSONObject2 != null) {
            jSONObject2.put("detailCode", i2);
        }
        JSONObject jSONObject3 = LIZ;
        if (jSONObject3 != null) {
            jSONObject3.put("errMessage", str);
        }
        return LIZ;
    }
}
