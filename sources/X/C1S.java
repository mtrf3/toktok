package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class C1S {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static final java.util.Map<String, Object> LIZJ = new LinkedHashMap();

    public static void LIZ(String str, java.util.Map map) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("livesdk_broadcast_endpage_");
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        C0K2.LJII(0, LIZIZ2, map);
        map.put("event_name", LIZIZ2);
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_live_anchor_end", map);
    }

    public static void LIZIZ(int i, String str) {
        long j;
        if (LIZIZ <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        long j2 = LIZIZ;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j2 != -1 && elapsedRealtime > j2) {
            j = elapsedRealtime - j2;
        } else {
            j = -1;
        }
        linkedHashMap.put("duration", Long.valueOf(j));
        if (str == null) {
            str = "unknow";
        }
        linkedHashMap.put("container_type", str);
        linkedHashMap.put("load_result", Integer.valueOf(i));
        LIZ("spark_loaded", linkedHashMap);
        Long l = -1L;
        if (l != null) {
            l.longValue();
            LIZIZ = l.longValue();
        }
    }
}
