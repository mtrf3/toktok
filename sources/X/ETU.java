package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ETU {
    public static JSONObject LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        o.LJFF(keys, "source2.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        Iterator<String> keys2 = jSONObject.keys();
        o.LJFF(keys2, "source.keys()");
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            Object obj = jSONObject.get(next2);
            o.LJFF(obj, "source.get(key)");
            if (!jSONObject3.has(next2)) {
                jSONObject3.put(next2, obj);
            }
        }
        return jSONObject3;
    }
}
