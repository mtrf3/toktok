package X;

import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JVW {
    public static JVZ LIZ;

    public static void LIZ(int i) {
        JVZ jvz = LIZ;
        if (jvz == null || !jvz.LJIIIIZZ.containsKey(Integer.valueOf(i))) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long remove = jvz.LJIIIIZZ.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.longValue();
        }
        if (jvz.LJIIJ && jvz.LJIIIIZZ.isEmpty()) {
            jvz.LJI = currentTimeMillis - jvz.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_lynx", jvz.LJII);
            jSONObject.put("bind_cost", jvz.LIZJ);
            jSONObject.put("sub_bind_cost", jvz.LIZLLL);
            jSONObject.put("sub_card_type", jvz.LJ);
            jSONObject.put("sub_cost", currentTimeMillis - jvz.LJFF);
            jSONObject.put("cost", jvz.LJI);
            FMX.LJIILLIIL("search_user_card_monitor", jSONObject);
            LIZ = null;
        }
    }

    public static void LIZIZ(int i) {
        JVZ jvz = LIZ;
        if (jvz != null) {
            long currentTimeMillis = System.currentTimeMillis();
            jvz.LJIIIIZZ.put(Integer.valueOf(i), Long.valueOf(currentTimeMillis));
            if (jvz.LJFF == 0) {
                jvz.LJFF = currentTimeMillis;
            }
        }
    }

    public static void LIZJ(int i) {
        long j;
        JVZ jvz = LIZ;
        if (jvz == null || !jvz.LJIIIIZZ.containsKey(Integer.valueOf(i))) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((LinkedHashMap) jvz.LJIIIIZZ).get(Integer.valueOf(i));
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentTimeMillis - j;
        jvz.LJIIIZ.put(Integer.valueOf(i), Long.valueOf(j2));
        jvz.LIZLLL += j2;
    }
}
