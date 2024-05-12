package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q4S {
    public static String LIZ(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }
}
