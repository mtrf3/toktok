package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.FWn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39109FWn implements Runnable {
    public static final RunnableC39109FWn LJLIL = new RunnableC39109FWn();

    public static void LIZ() {
        Iterator<String> it = C56672Kh.LIZ().LJJIJIIJIL.iterator();
        while (it.hasNext()) {
            String next = it.next();
            java.util.Map<String, Integer> map = C39110FWo.LIZLLL;
            if (!map.containsKey(next)) {
                map.put(next, 0);
            }
            java.util.Map<String, Long> map2 = C39110FWo.LJ;
            if (!map2.containsKey(next)) {
                map2.put(next, 0L);
            }
            java.util.Map<String, Long> map3 = C39110FWo.LJFF;
            if (!map3.containsKey(next)) {
                map3.put(next, 0L);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_new_user", C36152EGu.LJ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(next);
            LIZ.append("num");
            jSONObject.put(X1D.LIZIZ(LIZ), ((LinkedHashMap) map).get(next));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(next);
            LIZ2.append("cpuTime");
            jSONObject.put(X1D.LIZIZ(LIZ2), ((LinkedHashMap) map2).get(next));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(next);
            LIZ3.append("wallTime");
            jSONObject.put(X1D.LIZIZ(LIZ3), ((LinkedHashMap) map3).get(next));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("metric", jSONObject);
            C35810E3q.LJIIIIZZ();
            C09900aA.LJFF("coldstart_msg_info", null, jSONObject2);
        }
        C39110FWo.LIZ = 0;
        C39110FWo.LIZIZ = 0L;
        C39110FWo.LIZJ = 0L;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
