package X;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.TeV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75151TeV {
    public volatile boolean LIZ;
    public final CopyOnWriteArrayList<String> LIZIZ = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();

    public final java.util.Map<String, Long> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = this.LIZIZ.size();
        for (int i = 1; i < size; i++) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("step");
                LIZ.append(i);
                LIZ.append(' ');
                LIZ.append(this.LIZIZ.get(i));
                LIZ.append(" cost ms ");
                linkedHashMap.put(X1D.LIZIZ(LIZ), Long.valueOf(LIZIZ(i)));
            } catch (Throwable unused) {
            }
        }
        return linkedHashMap;
    }

    public final long LIZIZ(int i) {
        Long l;
        if (i <= 0 || (l = this.LIZJ.get(this.LIZIZ.get(i))) == null) {
            return -9999L;
        }
        long longValue = l.longValue();
        int i2 = i - 1;
        while (i2 >= 0) {
            String str = this.LIZIZ.get(i2);
            o.LJIIIIZZ(str, "stepsAll[lastStepIndex]");
            Long l2 = this.LIZJ.get(str);
            i2--;
            if (l2 != null) {
                return longValue - l2.longValue();
            }
        }
        return -9999L;
    }

    public final void LIZJ(String key) {
        o.LJIIIZ(key, "key");
        if (!C30922CBq.LIZIZ || this.LIZ) {
            return;
        }
        this.LIZIZ.add(key);
        if (!this.LIZJ.containsKey(key)) {
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(hashCode());
            LIZ.append(" reach at ");
            LIZ.append(key);
            LIZ.append(' ');
            LIZ.append(System.currentTimeMillis());
            String LIZIZ = X1D.LIZIZ(LIZ);
            LJIILIIL.getClass();
            C0NE.LJII("ApplyDetailMonitor", LIZIZ);
            this.LIZJ.put(key, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        C28733BPl LJIILIIL2 = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(hashCode());
        LIZ2.append(" ignore reach ");
        LIZ2.append(key);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LJIILIIL2.getClass();
        C0NE.LJII("ApplyDetailMonitor", LIZIZ2);
    }
}
