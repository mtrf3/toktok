package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J8T {
    public final String LIZ;
    public final java.util.Map<String, Long> LIZIZ = new HashMap();
    public long LIZJ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("biz", this.LIZ);
            jSONObject.put("usage", this.LIZJ);
            JSONArray jSONArray = new JSONArray();
            java.util.Map<String, Long> map = this.LIZIZ;
            if (map != null && ((HashMap) map).size() > 0) {
                for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("source_id", entry.getKey());
                    jSONObject2.put("usage", entry.getValue());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("detail", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public J8T(String str) {
        this.LIZ = str;
    }

    public final JSONObject LIZIZ(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("biz", this.LIZ);
            jSONObject.put("usage", this.LIZJ);
            JSONArray jSONArray = new JSONArray();
            java.util.Map<String, Long> map = this.LIZIZ;
            if (map != null && ((HashMap) map).size() > 0) {
                for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                    if (((Long) entry.getValue()).longValue() >= j) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("source_id", entry.getKey());
                        jSONObject2.put("usage", entry.getValue());
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("detail", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
