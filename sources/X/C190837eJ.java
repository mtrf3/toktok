package X;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7eJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190837eJ {
    public static java.util.Map<String, Object> LIZIZ(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return hashMap;
    }

    public static JSONObject LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
        return jSONObject;
    }
}
