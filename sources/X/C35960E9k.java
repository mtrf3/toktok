package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.E9k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35960E9k {
    public final java.util.Map<String, java.util.Map<String, String>> LIZ = new HashMap();

    public final C35959E9j LIZ() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            hashMap.put(entry.getKey(), Collections.unmodifiableMap(new HashMap((java.util.Map) entry.getValue())));
        }
        return new C35959E9j(Collections.unmodifiableMap(hashMap));
    }

    public final void LIZIZ(String str, String str2, String str3) {
        if (!((HashMap) this.LIZ).containsKey(str2)) {
            ((HashMap) this.LIZ).put(str2, new HashMap());
        }
        ((java.util.Map) ((HashMap) this.LIZ).get(str2)).put(str, str3);
    }
}
