package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.E9j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35959E9j {
    public final java.util.Map<String, java.util.Map<String, String>> LIZ;

    public final java.util.Map<String, java.util.Set<String>> LIZ(Collection<String> collection) {
        java.util.Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        for (String str : this.LIZ.keySet()) {
            if (this.LIZ.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, String> entry : this.LIZ.get(str).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                unmodifiableSet = Collections.emptySet();
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }
}
