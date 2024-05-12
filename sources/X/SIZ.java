package X;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ujb.s;

/* loaded from: classes13.dex */
public final class SIZ {
    public static int LIZIZ;
    public static int LIZ = 15;
    public static final ConcurrentHashMap<String, OSZ<Boolean, Long>> LIZJ = new ConcurrentHashMap<>();
    public static final C0R2 LIZLLL = new C0R2(0);

    public static float LIZ(long j) {
        if (LIZIZ == 0) {
            return 0.0f;
        }
        ConcurrentHashMap<String, OSZ<Boolean, Long>> concurrentHashMap = LIZJ;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return ((float) (System.currentTimeMillis() - j)) / LIZIZ;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, OSZ<Boolean, Long>> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().getFirst().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((Number) ((OSZ) ((Map.Entry) it.next()).getValue()).getSecond()).longValue();
        }
        return (float) (j2 / LIZJ.size());
    }

    public static void LIZIZ(List list, TEZ tez) {
        int size;
        ArrayList LJ = AnonymousClass391.LJ(list, "list");
        for (Object obj : list) {
            String id = ((Effect) obj).getId();
            if (id != null && s.LJJJLZIJ(id, "title", false)) {
                LJ.add(obj);
            }
        }
        int size2 = LJ.size();
        int size3 = list.size() - size2;
        int i = LIZIZ;
        if (size3 < i) {
            size = list.size();
        } else {
            if (i == 0) {
                int size4 = list.size() - size2;
                i = LIZ;
                if (size4 < i) {
                    size = list.size();
                }
            }
            tez.LJJIJLIJ(i);
            LIZIZ = tez.LJIILLIIL();
        }
        i = size - size2;
        tez.LJJIJLIJ(i);
        LIZIZ = tez.LJIILLIIL();
    }
}
