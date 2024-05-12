package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BtP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30211BtP {
    public static final java.util.Map<String, Object> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, Long> LIZIZ = new LinkedHashMap();
    public static long LIZJ = -1;
    public static long LIZLLL = -1;

    public static final void LIZ(long j, String button) {
        long j2;
        o.LJIIIZ(button, "button");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("button", button);
        java.util.Map<String, Long> map = LIZIZ;
        if (map.containsKey(button)) {
            Object obj = ((LinkedHashMap) map).get(button);
            o.LJI(obj);
            j2 = j - ((Number) obj).longValue();
            map.remove(button);
        } else {
            j2 = -1;
        }
        linkedHashMap.put("duration", Long.valueOf(j2));
        LIZIZ("button_load_finished", linkedHashMap);
    }

    public static void LIZIZ(String str, java.util.Map map) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("livesdk_toolbar_");
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        C0K2.LJII(0, LIZIZ2, map);
        map.put("event_name", LIZIZ2);
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_room", map);
    }
}
