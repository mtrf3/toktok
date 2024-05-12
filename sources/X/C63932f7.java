package X;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2f7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63932f7 {
    public final java.util.Map<String, Object> LIZ = new ConcurrentHashMap();

    public final String LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final void LIZ(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        ((ConcurrentHashMap) this.LIZ).put(str, obj);
    }
}
