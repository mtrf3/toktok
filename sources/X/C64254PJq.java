package X;

import android.provider.Settings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PJq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64254PJq {
    public static JSONObject LIZ;

    public static JSONObject LIZIZ() {
        if (LIZ == null) {
            try {
                LIZ = new JSONObject(Settings.Global.getString(PK0.LIZ.getContentResolver(), "bytest_automation_info"));
            } catch (JSONException unused) {
                LIZ = new JSONObject();
            } catch (Throwable unused2) {
            }
        }
        return LIZ;
    }

    public static void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            LIZIZ();
            JSONObject jSONObject2 = LIZ;
            if (jSONObject2 != null) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
                if (!PJC.LJII(optJSONObject)) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                    if (optJSONObject2 == null) {
                        optJSONObject2 = new JSONObject();
                        try {
                            jSONObject.put("filters", optJSONObject2);
                        } catch (JSONException unused) {
                        }
                    }
                    PKN.LJI(optJSONObject2, optJSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
