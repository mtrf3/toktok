package X;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.F0s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38282F0s {
    public static void LIZ(JSONObject jSONObject, C38281F0r c38281F0r) {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    c38281F0r.LIZ(((Integer) obj).intValue(), next);
                } else if (obj instanceof Long) {
                    c38281F0r.LIZIZ(((Long) obj).longValue(), next);
                } else if (obj instanceof Double) {
                    c38281F0r.LIZJ(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    c38281F0r.LIZLLL(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    LIZ((JSONObject) obj, c38281F0r);
                }
            }
        }
    }

    public static void LIZIZ(Context context, JSONObject jSONObject) {
        Activity LJIJJ;
        try {
            if (!(context instanceof Activity) || (LJIJJ = C45804HyK.LJIJJ(context)) == null || !V1B.LJJZZI(LJIJJ, true)) {
                return;
            }
            String optString = jSONObject.optString("type");
            if (C38354F3m.LJ(optString) || optString.indexOf(58) >= 0) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sslocal://");
            LIZ.append(optString);
            C38281F0r c38281F0r = new C38281F0r(X1D.LIZIZ(LIZ));
            LIZ(jSONObject.optJSONObject("args"), c38281F0r);
            FX2.LIZIZ(LJIJJ, c38281F0r.LJ(), null);
        } catch (Exception unused) {
        }
    }
}
