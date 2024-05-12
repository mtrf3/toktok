package X;

import Y.ARunnableS42S0100000_6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AqS158S0100000_8;

/* renamed from: X.J5k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48596J5k extends AbstractC48600J5o {
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 518));

    public final C48598J5m LJI() {
        return (C48598J5m) this.LIZIZ.getValue();
    }

    @Override // X.AbstractC48600J5o
    public boolean LIZ(String str) {
        C48598J5m LJI = LJI();
        if (str == null) {
            LJI.getClass();
        } else if (LJI.LIZ.containsKey(str) || LJI.LIZIZ.containsKey(str)) {
            return true;
        }
        return false;
    }

    public void LJIIIIZZ(ConcurrentHashMap<String, String> concurrentHashMap) {
        for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
            LJII(entry.getKey(), entry.getValue());
        }
    }

    public void LJII(String str, String str2) {
        ScheduledExecutorService LIZ;
        if (str != null && LJI().LJ(str, str2)) {
            C48599J5n LIZ2 = C48537J3d.LIZ();
            LIZ2.getClass();
            if (LIZ2.LJFF.isEmpty()) {
                return;
            }
            LIZ2.LJI.readLock().lock();
            try {
                Iterator<InterfaceC35582Dxq> it = LIZ2.LJFF.iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    InterfaceC35582Dxq next = it.next();
                    if (next.LIZ()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next);
                    }
                }
                if (arrayList == null || (LIZ = C48602J5q.LIZ()) == null) {
                    return;
                }
                LIZ.execute(new ARunnableS42S0100000_6(arrayList, str, 85));
            } finally {
                LIZ2.LJI.readLock().unlock();
            }
        }
    }
}
