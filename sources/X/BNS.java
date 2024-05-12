package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BNS {
    public final JSONObject LIZ;
    public final java.util.Map<String, String> LIZIZ;
    public final java.util.Map<String, String> LIZJ;

    public BNS(String str) {
        if (str != null) {
            try {
                this.LIZ = new JSONObject(str);
                this.LIZIZ = LIZ("custom_error_tracking");
                this.LIZJ = LIZ("click_type");
            } catch (JSONException unused) {
            }
        }
    }

    public final java.util.Map<String, String> LIZ(String str) {
        if (this.LIZ.has(str)) {
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(this.LIZ, str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next, ""));
                }
                return hashMap;
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }
}
