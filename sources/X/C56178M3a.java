package X;

import java.util.LinkedHashMap;

/* renamed from: X.M3a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56178M3a {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(M3Z m3z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", m3z.LIZ);
        Long l = m3z.LIZIZ;
        if (l != null) {
            linkedHashMap.put("value_int1", String.valueOf(l.longValue()));
        }
        Long l2 = m3z.LIZJ;
        if (l2 != null) {
            linkedHashMap.put("value_int2", String.valueOf(l2.longValue()));
        }
        String str = m3z.LIZLLL;
        if (str != null) {
            linkedHashMap.put("value_str", str);
        }
        FMX.LJIIL("location_power_track", linkedHashMap);
    }
}
