package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2lO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67822lO {
    public static java.util.Map<String, String> LIZ(java.util.Map<String, String> map, java.util.Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            T2R.LJIILLIIL(key, "additional parameter keys cannot be null");
            T2R.LJIILLIIL(value, "additional parameter values cannot be null");
            Object[] objArr = {key};
            if (!set.contains(key)) {
                linkedHashMap.put(key, value);
            } else {
                throw new IllegalArgumentException(C16880lQ.LLLZ("Parameter %s is directly supported via the authorization request builder, use the builder method instead", objArr));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
