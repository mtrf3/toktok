package X;

import com.bytedance.helios.api.config.ApiStatistics;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import ujb.o;
import ujb.s;

/* renamed from: X.Pwc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66082Pwc implements Runnable {
    public final /* synthetic */ int LJLIL;

    public RunnableC66082Pwc(int i) {
        this.LJLIL = i;
    }

    public final void LIZ() {
        InterfaceC66048Pw4 interfaceC66048Pw4;
        if (((ApiStatistics) ListProtector.get(C66083Pwd.LIZJ, this.LJLIL)).cached && (interfaceC66048Pw4 = C66083Pwd.LIZIZ) != null) {
            String LIZIZ = C66083Pwd.LIZIZ(((ApiStatistics) ListProtector.get(C66083Pwd.LIZJ, this.LJLIL)).type, Integer.valueOf(this.LJLIL));
            java.util.Map<String, ?> all = interfaceC66048Pw4.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if (o.LJJJLIIL(entry.getKey(), LIZIZ, false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.Set keySet = linkedHashMap.keySet();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LIZIZ);
                    LIZ.append("##");
                    linkedHashMap2.put(s.LJJLL(X1D.LIZIZ(LIZ), str), entry2.getValue());
                }
                C66083Pwd.LIZLLL(((ApiStatistics) ListProtector.get(C66083Pwd.LIZJ, this.LJLIL)).type, linkedHashMap2);
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    C66083Pwd.LIZIZ.remove((String) it.next());
                }
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ORZ.LJLLLLLL(this.LJLIL, C66083Pwd.LIZ);
        if (concurrentHashMap != null) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(C51029K0z.LJJIIZ(concurrentHashMap.size()));
            for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                linkedHashMap3.put(entry3.getKey(), Long.valueOf(((AtomicLong) entry3.getValue()).get()));
            }
            C66083Pwd.LIZLLL(((ApiStatistics) ListProtector.get(C66083Pwd.LIZJ, this.LJLIL)).type, linkedHashMap3);
            concurrentHashMap.clear();
        }
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
