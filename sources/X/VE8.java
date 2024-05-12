package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VE8 {
    public final java.util.Map<Integer, VE9> LIZ = new HashMap();
    public final java.util.Map<Integer, VE9> LIZIZ = new HashMap();

    public final synchronized boolean LIZIZ() {
        return ((HashMap) this.LIZIZ).isEmpty();
    }

    public final synchronized void LIZLLL() {
        ((HashMap) this.LIZ).clear();
        ((HashMap) this.LIZIZ).clear();
    }

    public final synchronized String LJ(int i) {
        Iterator it;
        JSONArray jSONArray = new JSONArray();
        if (i == 0) {
            it = ((HashMap) this.LIZ).entrySet().iterator();
        } else if (i == 1) {
            it = ((HashMap) this.LIZIZ).entrySet().iterator();
        } else {
            it = null;
        }
        if (it == null) {
            return null;
        }
        while (it.hasNext()) {
            VE9 ve9 = (VE9) ((Map.Entry) it.next()).getValue();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", ve9.LIZ);
                jSONObject.put("start", ve9.LIZIZ);
                jSONObject.put("duration", ve9.LIZJ);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray.toString();
    }

    public final synchronized void LIZ(int i, VE9 ve9) {
        ((HashMap) this.LIZIZ).put(Integer.valueOf(i), ve9);
    }

    public final synchronized void LIZJ(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                ((HashMap) this.LIZIZ).remove(Integer.valueOf(i2));
            }
        } else {
            ((HashMap) this.LIZ).remove(Integer.valueOf(i2));
        }
    }
}
