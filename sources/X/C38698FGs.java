package X;

import Y.ARunnableS7S1100000_6;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FGs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38698FGs {
    public static final C38699FGt LIZ = new C38699FGt();

    public static void LIZ(Integer num, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "abtest_ab_sdk");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, num);
            jSONObject.put("client_layer_info", jSONObject2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C38696FGq.LIZ(new ARunnableS7S1100000_6(jSONObject, 15));
    }
}
