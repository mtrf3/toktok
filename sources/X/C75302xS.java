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

/* renamed from: X.2xS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75302xS {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static Object LIZ(Object obj) {
        Object obj2;
        Object linkedHashMap;
        if (obj == null) {
            return null;
        }
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dealing with ");
        LIZ.append(obj);
        LIZ.append('[');
        LIZ.append(obj.getClass());
        LIZ.append(']');
        c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.D, "LynxInitData");
        if (obj instanceof List) {
            linkedHashMap = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                linkedHashMap.add(LIZ(it.next()));
            }
        } else if (obj instanceof java.util.Map) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                if (entry.getKey() instanceof String) {
                    Object key = entry.getKey();
                    if (key != null) {
                        linkedHashMap.put(key, LIZ(entry.getValue()));
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    C39048FUe c39048FUe2 = C39048FUe.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("unsupported value ");
                    LIZ2.append(entry);
                    c39048FUe2.LIZ(X1D.LIZIZ(LIZ2), EnumC39866Fkk.E, "LynxInitData");
                }
            }
        } else if (obj instanceof Bundle) {
            linkedHashMap = new LinkedHashMap();
            Bundle bundle = (Bundle) obj;
            java.util.Set<String> keySet = bundle.keySet();
            o.LJFF(keySet, "value.keySet()");
            for (String it2 : keySet) {
                o.LJFF(it2, "it");
                linkedHashMap.put(it2, LIZ(C16880lQ.LLJJIII(bundle, it2)));
            }
        } else if (obj instanceof JSONObject) {
            linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            o.LJFF(keys, "value.keys()");
            while (keys.hasNext()) {
                String it3 = keys.next();
                o.LJFF(it3, "it");
                linkedHashMap.put(it3, LIZ(jSONObject.get(it3)));
            }
        } else {
            if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.isNull(i)) {
                        obj2 = null;
                    } else {
                        obj2 = jSONArray.get(i);
                    }
                    arrayList.add(LIZ(obj2));
                }
                return arrayList;
            }
            return obj;
        }
        return linkedHashMap;
    }
}
