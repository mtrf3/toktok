package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8HX, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8HX extends FUA {
    public static final C8HY LIZLLL = new C8HY();

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C09900aA.LJ(str, jSONObject);
    }
}
