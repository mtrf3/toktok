package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS14S2200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fng, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40048Fng {
    public static final java.util.Map<String, java.util.Map<String, String>> LIZ = Collections.synchronizedMap(new LinkedHashMap());

    public static void LIZ(String str, String str2, String value) {
        o.LJIIJ(value, "value");
        java.util.Map<String, java.util.Map<String, String>> map = LIZ;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
            java.util.Map<String, String> map2 = map.get(str);
            if (map2 != null) {
                map2.put("navigation_id", str);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        java.util.Map<String, String> map3 = map.get(str);
        if (map3 != null) {
            map3.put(str2, value);
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    public static void LIZIZ(String str, String str2, java.util.Map map, java.util.Map map2) {
        C38192Eyq.LIZIZ(new AqS14S2200000_6(str, str2, map, map2, 1));
    }

    public static /* synthetic */ void LIZJ(String str, String str2, java.util.Map map, java.util.Map map2, int i) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            map2 = null;
        }
        LIZIZ(str, str2, map, map2);
    }
}
