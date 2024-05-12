package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EbK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36734EbK {
    public final String LIZ;
    public final EP1 LIZIZ;
    public final EP2 LIZJ;
    public final java.util.Map<String, C36755Ebf> LIZLLL;

    public C36734EbK() {
        throw null;
    }

    public C36734EbK(JSONObject jSONObject) {
        EP1 ep1;
        Iterator<String> keys;
        String optString = jSONObject.optString("project");
        o.LJFF(optString, "config.optString(\"project\")");
        o.LJFF(jSONObject.optString("version"), "config.optString(\"version\")");
        JSONObject optJSONObject = jSONObject.optJSONObject("occasions");
        if (optJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys2 = optJSONObject.keys();
            o.LJFF(keys2, "keys()");
            while (keys2.hasNext()) {
                String key = keys2.next();
                o.LJFF(key, "key");
                linkedHashMap.put(key, C36748EbY.LIZJ(optJSONObject.optJSONArray(key)));
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("rules");
        if (optJSONObject2 != null) {
            ep1 = new EP1(optJSONObject2);
        } else {
            ep1 = null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("restful_rules");
        EP2 ep2 = optJSONObject3 != null ? new EP2(optJSONObject3) : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject optJSONObject4 = jSONObject.optJSONObject("prefetch_apis");
        if (optJSONObject4 != null && (keys = optJSONObject4.keys()) != null) {
            while (keys.hasNext()) {
                String apiName = keys.next();
                JSONObject optJSONObject5 = optJSONObject4.optJSONObject(apiName);
                if (optJSONObject5 != null) {
                    o.LJFF(apiName, "apiName");
                    linkedHashMap2.put(apiName, new C36755Ebf(optJSONObject5));
                }
            }
        }
        this.LIZ = optString;
        this.LIZIZ = ep1;
        this.LIZJ = ep2;
        this.LIZLLL = linkedHashMap2;
    }
}
