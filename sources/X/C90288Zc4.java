package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Zc4, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90288Zc4 {
    public static java.util.Map<Integer, Integer> LIZ(Bundle bundle, String str) {
        java.util.Map map = (java.util.Map) bundle.getSerializable(str);
        if (map == null) {
            return AbstractC90390Zdi.zzc();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
