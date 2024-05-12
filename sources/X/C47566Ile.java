package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ile, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47566Ile {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static java.util.Map<String, Object> LJ;
    public static java.util.Map<String, Object> LJFF;

    public static java.util.Map<String, String> LIZ(java.util.Map<String, Object> map) {
        if (map != null && map.size() > 0) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            return hashMap;
        }
        return null;
    }
}
