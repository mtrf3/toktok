package X;

import Y.ARunnableS30S0200000_11;
import Y.ARunnableS5S0201000_2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QYy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67200QYy extends QZV implements QZD {
    public static final QZ3 LJI = new C6Y7() { // from class: X.QZ3
        @Override // X.C6Y7
        public final Object get() {
            return Collections.emptySet();
        }
    };
    public final List<C6Y7<QZ4>> LIZLLL;
    public final C67181QYf LJ;
    public final java.util.Map<QZT<?>, C6Y7<?>> LIZ = new HashMap();
    public final java.util.Map<Class<?>, C6Y7<?>> LIZIZ = new HashMap();
    public final java.util.Map<Class<?>, C67201QYz<?>> LIZJ = new HashMap();
    public final AtomicReference<Boolean> LJFF = new AtomicReference<>();

    public final void LJIJJ() {
        for (QZT qzt : ((HashMap) this.LIZ).keySet()) {
            for (QZW qzw : qzt.LIZIZ) {
                if (qzw.LIZIZ == 2 && !((HashMap) this.LIZJ).containsKey(qzw.LIZ)) {
                    ((HashMap) this.LIZJ).put(qzw.LIZ, new C67201QYz(Collections.emptySet()));
                } else if (((HashMap) this.LIZIZ).containsKey(qzw.LIZ)) {
                    continue;
                } else {
                    int i = qzw.LIZIZ;
                    if (i == 1) {
                        throw new QZ8(C16880lQ.LLLZ("Unsatisfied dependency for component %s: %s", new Object[]{qzt, qzw.LIZ}));
                    }
                    if (i != 2) {
                        ((HashMap) this.LIZIZ).put(qzw.LIZ, new C6Y3());
                    }
                }
            }
        }
    }

    public final List<Runnable> LJIL() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            QZT qzt = (QZT) entry.getKey();
            if (qzt.LIZLLL != 0) {
                Object value = entry.getValue();
                for (Object obj : qzt.LIZ) {
                    if (!hashMap.containsKey(obj)) {
                        hashMap.put(obj, new HashSet());
                    }
                    ((java.util.Set) hashMap.get(obj)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!((HashMap) this.LIZJ).containsKey(entry2.getKey())) {
                ((HashMap) this.LIZJ).put(entry2.getKey(), new C67201QYz((Collection) entry2.getValue()));
            } else {
                C67201QYz c67201QYz = (C67201QYz) ((HashMap) this.LIZJ).get(entry2.getKey());
                Iterator it = ((java.util.Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ARunnableS30S0200000_11((C6Y7) it.next(), c67201QYz, 66));
                }
            }
        }
        return arrayList;
    }

    @Override // X.QZQ
    public final synchronized <T> C6Y7<java.util.Set<T>> LIZJ(Class<T> cls) {
        C67201QYz c67201QYz = (C67201QYz) ((HashMap) this.LIZJ).get(cls);
        if (c67201QYz != null) {
            return c67201QYz;
        }
        return LJI;
    }

    @Override // X.QZQ
    public final synchronized <T> C6Y7<T> LJ(Class<T> cls) {
        return (C6Y7) ((HashMap) this.LIZIZ).get(cls);
    }

    public final List<Runnable> LJIJJLI(List<QZT<?>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            QZT qzt = (QZT) it.next();
            if (qzt.LIZLLL == 0) {
                Object obj = ((HashMap) this.LIZ).get(qzt);
                for (Object obj2 : qzt.LIZ) {
                    if (!((HashMap) this.LIZIZ).containsKey(obj2)) {
                        ((HashMap) this.LIZIZ).put(obj2, obj);
                    } else {
                        arrayList.add(new ARunnableS5S0201000_2(0, (C6Y7) ((HashMap) this.LIZIZ).get(obj2), obj, 4));
                    }
                }
            }
        }
        return arrayList;
    }

    public final void LJIJI(java.util.Map<QZT<?>, C6Y7<?>> map, boolean z) {
        Queue<C2311095e<?>> queue;
        for (Map.Entry<QZT<?>, C6Y7<?>> entry : map.entrySet()) {
            QZT<?> key = entry.getKey();
            C6Y7<?> value = entry.getValue();
            int i = key.LIZJ;
            if (i == 1 || (i == 2 && z)) {
                value.get();
            }
        }
        C67181QYf c67181QYf = this.LJ;
        synchronized (c67181QYf) {
            queue = c67181QYf.LIZIZ;
            if (queue != null) {
                c67181QYf.LIZIZ = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<C2311095e<?>> it = queue.iterator();
            while (it.hasNext()) {
                c67181QYf.LIZLLL(it.next());
            }
        }
    }

    public C67200QYy(Executor executor, Iterable iterable, Collection collection) {
        C67181QYf c67181QYf = new C67181QYf(executor);
        this.LJ = c67181QYf;
        ArrayList arrayList = new ArrayList();
        arrayList.add(QZT.LIZIZ(c67181QYf, C67181QYf.class, QYK.class, PMT.class));
        arrayList.add(QZT.LIZIZ(this, QZD.class, new Class[0]));
        Iterator it = ((ArrayList) collection).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) iterable).iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.LIZLLL = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    QZ4 qz4 = (QZ4) ((C6Y7) it3.next()).get();
                    if (qz4 != null) {
                        arrayList.addAll(qz4.getComponents());
                        it3.remove();
                    }
                } catch (QZ2 unused) {
                    it3.remove();
                }
            }
            if (((HashMap) this.LIZ).isEmpty()) {
                QZB.LIZ(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(((HashMap) this.LIZ).keySet());
                arrayList4.addAll(arrayList);
                QZB.LIZ(arrayList4);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                final QZT qzt = (QZT) it4.next();
                ((HashMap) this.LIZ).put(qzt, new QZ0(new C6Y7() { // from class: X.QZS
                    @Override // X.C6Y7
                    public final Object get() {
                        C67200QYy c67200QYy = C67200QYy.this;
                        QZT qzt2 = qzt;
                        c67200QYy.getClass();
                        return qzt2.LJ.LIZ(new QZO(qzt2, c67200QYy));
                    }
                }));
            }
            arrayList3.addAll(LJIJJLI(arrayList));
            arrayList3.addAll(LJIL());
            LJIJJ();
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.LJFF.get();
        if (bool != null) {
            LJIJI(this.LIZ, bool.booleanValue());
        }
    }
}
