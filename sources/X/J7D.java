package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J7D {
    public static List<JSONObject> LIZ(java.util.Map<String, java.util.Map<String, J7E>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, java.util.Map<String, J7E>> entry : map.entrySet()) {
            java.util.Map<String, J7E> value = entry.getValue();
            if (value != null && value.size() != 0) {
                for (Map.Entry<String, J7E> entry2 : value.entrySet()) {
                    String key = entry2.getKey();
                    J7E value2 = entry2.getValue();
                    if (value2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("key", entry.getKey());
                            jSONObject.put("state", key);
                            jSONObject.put("total", value2.LIZ);
                            jSONObject.put("date", value2.LIZJ);
                            long j = value2.LIZIZ;
                            if (j != -1) {
                                jSONObject.put("duration", j);
                            }
                            jSONObject.put("params_for_special", "applog_trace");
                            arrayList.add(jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
