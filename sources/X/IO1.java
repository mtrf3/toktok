package X;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IO1 {
    public void addAll(JSONObject jSONObject, HashMap<String, ?> hashMap) {
        try {
            for (String str : hashMap.keySet()) {
                jSONObject.put(str, hashMap.get(str));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void add(JSONObject jSONObject, String str, float f) {
        try {
            jSONObject.put(str, f);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void add(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void add(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void add(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
