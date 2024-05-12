package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.4xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126394xf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(HashMap hashMap) {
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap.clear();
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof Number) || ((Number) value).floatValue() != 0.0f) {
                if (value != null) {
                    o.LJIIIIZZ(key, "key");
                    hashMap.put(key, value);
                }
            }
        }
    }

    public static void LIZ(java.util.Map map, java.util.Map map2) {
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Number) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if (value instanceof String) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if ((value instanceof float[]) && ((float[]) value).length < 16) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if ((value instanceof double[]) && ((double[]) value).length < 16) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if ((value instanceof int[]) && ((int[]) value).length < 16) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if ((value instanceof long[]) && ((long[]) value).length < 16) {
                        ((HashMap) map).put(entry.getKey(), value);
                    }
                }
            }
        }
    }
}
