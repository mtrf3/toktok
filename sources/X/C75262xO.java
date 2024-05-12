package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75262xO {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public static Object LIZ(Object obj) {
        Object arrayList;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(LIZ(it.next()));
            }
        } else if (obj instanceof java.util.Map) {
            arrayList = new LinkedHashMap();
            for (Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                if (entry.getKey() instanceof String) {
                    Object key = entry.getKey();
                    if (key != null) {
                        arrayList.put(key, LIZ(entry.getValue()));
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                    }
                }
            }
        } else if (obj instanceof Bundle) {
            arrayList = new LinkedHashMap();
            Bundle bundle = (Bundle) obj;
            java.util.Set<String> keySet = bundle.keySet();
            o.LJFF(keySet, "value.keySet()");
            for (String it2 : keySet) {
                o.LJFF(it2, "it");
                arrayList.put(it2, LIZ(C16880lQ.LLJJIII(bundle, it2)));
            }
        } else if (obj instanceof JSONObject) {
            arrayList = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            o.LJFF(keys, "value.keys()");
            while (keys.hasNext()) {
                String it3 = keys.next();
                o.LJFF(it3, "it");
                arrayList.put(it3, LIZ(jSONObject.get(it3)));
            }
        } else if (obj instanceof JSONArray) {
            arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(LIZ(jSONArray.get(i)));
            }
        } else {
            return obj;
        }
        return arrayList;
    }
}
