package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class BNQ {
    public boolean LIZ;
    public final java.util.Map<String, JSONObject> LIZIZ = new HashMap();

    public final JSONObject LIZIZ() {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.LIZ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("default", i);
            for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static BNQ LIZ(JSONObject jSONObject) {
        JSONObject optJSONObject;
        BNQ bnq = new BNQ();
        boolean z = true;
        if (jSONObject.optInt("default", 1) != 1) {
            z = false;
        }
        bnq.LIZ = z;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.equals(next, "default") && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                ((HashMap) bnq.LIZIZ).put(next, optJSONObject);
            }
        }
        return bnq;
    }
}
