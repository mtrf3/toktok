package X;

import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class CYA {
    public static final java.util.Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;

    public static void LIZ(int i, String str, java.util.Map map) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("livesdk_online_audience_rank_");
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        C0K2.LJII(i, LIZIZ2, map);
        map.put("event_name", LIZIZ2);
        if (i == 0) {
            C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_online_audience", map);
        } else {
            C28733BPl.LJIILIIL().LJ("ttlive_online_audience", map);
        }
    }
}
