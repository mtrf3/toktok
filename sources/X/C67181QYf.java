package X;

import Y.ARunnableS17S0201000_14;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.QYf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67181QYf implements QYK, PMT {
    public final java.util.Map<Class<?>, ConcurrentHashMap<InterfaceC67182QYg<Object>, Executor>> LIZ = new HashMap();
    public Queue<C2311095e<?>> LIZIZ = new ArrayDeque();
    public final Executor LIZJ;

    public C67181QYf(Executor executor) {
        this.LIZJ = executor;
    }

    public final synchronized java.util.Set<Map.Entry<InterfaceC67182QYg<Object>, Executor>> LIZJ(C2311095e<?> c2311095e) {
        java.util.Set<Map.Entry<InterfaceC67182QYg<Object>, Executor>> entrySet;
        java.util.Map<Class<?>, ConcurrentHashMap<InterfaceC67182QYg<Object>, Executor>> map = this.LIZ;
        c2311095e.getClass();
        java.util.Map map2 = (java.util.Map) ((HashMap) map).get(null);
        if (map2 == null) {
            entrySet = Collections.emptySet();
        } else {
            entrySet = map2.entrySet();
        }
        return entrySet;
    }

    public final void LIZLLL(C2311095e<?> c2311095e) {
        c2311095e.getClass();
        synchronized (this) {
            Queue<C2311095e<?>> queue = this.LIZIZ;
            if (queue != null) {
                queue.add(c2311095e);
                return;
            }
            for (Map.Entry<InterfaceC67182QYg<Object>, Executor> entry : LIZJ(c2311095e)) {
                entry.getValue().execute(new ARunnableS17S0201000_14(1, entry, c2311095e, 10));
            }
        }
    }

    @Override // X.QYK
    public final void LIZ(Class cls, QYE qye) {
        LIZIZ(cls, this.LIZJ, qye);
    }

    @Override // X.QYK
    public final synchronized <T> void LIZIZ(Class<T> cls, Executor executor, InterfaceC67182QYg<? super T> interfaceC67182QYg) {
        executor.getClass();
        if (!((HashMap) this.LIZ).containsKey(cls)) {
            ((HashMap) this.LIZ).put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) ((HashMap) this.LIZ).get(cls)).put(interfaceC67182QYg, executor);
    }
}
