package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.30v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C770930v {
    public final String LIZ;
    public final java.util.Map<String, String> LIZIZ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("active", 1);
            java.util.Map<String, String> map = this.LIZIZ;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Module: ");
        LIZ.append(this.LIZ);
        LIZ.append(" : ");
        LIZ.append(this.LIZIZ.toString());
        return X1D.LIZIZ(LIZ);
    }

    public C770930v(String str, java.util.Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
