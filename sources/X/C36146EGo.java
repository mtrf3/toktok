package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EGo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36146EGo {
    public static final String LIZ(String sdk_extra) {
        JSONArray optJSONArray;
        boolean z;
        o.LJIIIZ(sdk_extra, "sdk_extra");
        try {
            JSONObject optJSONObject = new JSONObject(sdk_extra).optJSONObject("setting");
            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("effect_adjust_params")) != null) {
                JSONObject jSONObject = new JSONObject();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
                    String optString = jSONObject2.optString("effect_key");
                    double optDouble = jSONObject2.optDouble("default");
                    if (optString != null && optString.length() != 0) {
                        z = false;
                        if (!z && !Double.isNaN(optDouble)) {
                            jSONObject.put(optString, optDouble);
                        }
                    }
                    z = true;
                    if (!z) {
                        jSONObject.put(optString, optDouble);
                    }
                }
                return jSONObject.toString();
            }
            return null;
        } catch (JSONException unused) {
            return "{}";
        }
    }
}
