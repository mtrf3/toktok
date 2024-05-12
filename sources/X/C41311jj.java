package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41311jj<K, V> implements java.util.Map<K, V>, C0O9, EHO {
    public C1IT LJLIL = new C1IT(C78880UxY.LJJLJLI());
    public final C2BC LJLILLLLZI = new C2BC(this);
    public final C2BD LJLJI = new AbstractC48201uq<K, V, K>(this) { // from class: X.2BD
        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            C41311jj<K, V> c41311jj = this.LJLIL;
            return new C1IJ(c41311jj, c41311jj.LIZ().LIZJ.entrySet().iterator());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(this);
            o.LJIIIZ(this, "map");
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            C0OH.LIZ();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection elements) {
            o.LJIIIZ(elements, "elements");
            C0OH.LIZ();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return this.LJLIL.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> elements) {
            o.LJIIIZ(elements, "elements");
            if (elements.isEmpty()) {
                return true;
            }
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                if (!this.LJLIL.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            if (this.LJLIL.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> elements) {
            o.LJIIIZ(elements, "elements");
            Iterator<? extends Object> it = elements.iterator();
            while (true) {
                boolean z = false;
                while (it.hasNext()) {
                    if (this.LJLIL.remove(it.next()) != null || z) {
                        z = true;
                    }
                }
                return z;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> elements) {
            InterfaceC37431dT<K, ? extends V> interfaceC37431dT;
            int i;
            boolean z;
            C0OA LJIIIIZZ;
            o.LJIIIZ(elements, "elements");
            java.util.Set LLJJ = ORZ.LLJJ(elements);
            C41311jj<K, V> c41311jj = this.LJLIL;
            boolean z2 = false;
            do {
                synchronized (C0OH.LIZ) {
                    C1IT c1it = c41311jj.LJLIL;
                    o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    C1IT c1it2 = (C1IT) C0OF.LJI(c1it);
                    interfaceC37431dT = c1it2.LIZJ;
                    i = c1it2.LIZLLL;
                }
                o.LJI(interfaceC37431dT);
                C44551ox builder = interfaceC37431dT.builder();
                Object it = c41311jj.LJLILLLLZI.iterator();
                while (true) {
                    z = true;
                    if (!((C0O7) it).hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) ((C1IH) it).next();
                    if (!LLJJ.contains(entry.getKey())) {
                        builder.remove(entry.getKey());
                        z2 = true;
                    }
                }
                C44541ow<K, V> LIZ = builder.LIZ();
                if (o.LJ(LIZ, interfaceC37431dT)) {
                    break;
                }
                synchronized (C0OH.LIZ) {
                    C1IT c1it3 = c41311jj.LJLIL;
                    o.LJII(c1it3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (C0OF.LIZJ) {
                        LJIIIIZZ = C0OF.LJIIIIZZ();
                        C1IT c1it4 = (C1IT) C0OF.LJIJI(c1it3, c41311jj, LJIIIIZZ);
                        if (c1it4.LIZLLL == i) {
                            c1it4.LIZJ(LIZ);
                            c1it4.LIZLLL++;
                        } else {
                            z = false;
                        }
                    }
                    C0OF.LJIIL(LJIIIIZZ, c41311jj);
                }
            } while (!z);
            return z2;
        }
    };
    public final C2BE LJLJJI = new AbstractC48201uq<K, V, V>(this) { // from class: X.2BE
        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            C41311jj<K, V> c41311jj = this.LJLIL;
            return new C1IL(c41311jj, c41311jj.LIZ().LIZJ.entrySet().iterator());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(this);
            o.LJIIIZ(this, "map");
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            C0OH.LIZ();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection elements) {
            o.LJIIIZ(elements, "elements");
            C0OH.LIZ();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return this.LJLIL.containsValue(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> elements) {
            o.LJIIIZ(elements, "elements");
            if (elements.isEmpty()) {
                return true;
            }
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                if (!this.LJLIL.containsValue(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            Object obj2;
            C41311jj<K, V> c41311jj = this.LJLIL;
            Object it = c41311jj.LJLILLLLZI.iterator();
            while (true) {
                if (((C0O7) it).hasNext()) {
                    obj2 = ((C1IH) it).next();
                    if (o.LJ(((Map.Entry) obj2).getValue(), obj)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj2;
            if (entry != null) {
                c41311jj.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> elements) {
            InterfaceC37431dT<K, ? extends V> interfaceC37431dT;
            int i;
            boolean z;
            C0OA LJIIIIZZ;
            o.LJIIIZ(elements, "elements");
            java.util.Set LLJJ = ORZ.LLJJ(elements);
            C41311jj<K, V> c41311jj = this.LJLIL;
            boolean z2 = false;
            do {
                synchronized (C0OH.LIZ) {
                    C1IT c1it = c41311jj.LJLIL;
                    o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    C1IT c1it2 = (C1IT) C0OF.LJI(c1it);
                    interfaceC37431dT = c1it2.LIZJ;
                    i = c1it2.LIZLLL;
                }
                o.LJI(interfaceC37431dT);
                C44551ox builder = interfaceC37431dT.builder();
                Object it = c41311jj.LJLILLLLZI.iterator();
                while (true) {
                    z = true;
                    if (!((C0O7) it).hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) ((C1IH) it).next();
                    if (LLJJ.contains(entry.getValue())) {
                        builder.remove(entry.getKey());
                        z2 = true;
                    }
                }
                C44541ow<K, V> LIZ = builder.LIZ();
                if (o.LJ(LIZ, interfaceC37431dT)) {
                    break;
                }
                synchronized (C0OH.LIZ) {
                    C1IT c1it3 = c41311jj.LJLIL;
                    o.LJII(c1it3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (C0OF.LIZJ) {
                        LJIIIIZZ = C0OF.LJIIIIZZ();
                        C1IT c1it4 = (C1IT) C0OF.LJIJI(c1it3, c41311jj, LJIIIIZZ);
                        if (c1it4.LIZLLL == i) {
                            c1it4.LIZJ(LIZ);
                            c1it4.LIZLLL++;
                        } else {
                            z = false;
                        }
                    }
                    C0OF.LJIIL(LJIIIIZZ, c41311jj);
                }
            } while (!z);
            return z2;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> elements) {
            InterfaceC37431dT<K, ? extends V> interfaceC37431dT;
            int i;
            boolean z;
            C0OA LJIIIIZZ;
            o.LJIIIZ(elements, "elements");
            java.util.Set LLJJ = ORZ.LLJJ(elements);
            C41311jj<K, V> c41311jj = this.LJLIL;
            boolean z2 = false;
            do {
                synchronized (C0OH.LIZ) {
                    C1IT c1it = c41311jj.LJLIL;
                    o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    C1IT c1it2 = (C1IT) C0OF.LJI(c1it);
                    interfaceC37431dT = c1it2.LIZJ;
                    i = c1it2.LIZLLL;
                }
                o.LJI(interfaceC37431dT);
                C44551ox builder = interfaceC37431dT.builder();
                Object it = c41311jj.LJLILLLLZI.iterator();
                while (true) {
                    z = true;
                    if (!((C0O7) it).hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) ((C1IH) it).next();
                    if (!LLJJ.contains(entry.getValue())) {
                        builder.remove(entry.getKey());
                        z2 = true;
                    }
                }
                C44541ow<K, V> LIZ = builder.LIZ();
                if (o.LJ(LIZ, interfaceC37431dT)) {
                    break;
                }
                synchronized (C0OH.LIZ) {
                    C1IT c1it3 = c41311jj.LJLIL;
                    o.LJII(c1it3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (C0OF.LIZJ) {
                        LJIIIIZZ = C0OF.LJIIIIZZ();
                        C1IT c1it4 = (C1IT) C0OF.LJIJI(c1it3, c41311jj, LJIIIIZZ);
                        if (c1it4.LIZLLL == i) {
                            c1it4.LIZJ(LIZ);
                            c1it4.LIZLLL++;
                        } else {
                            z = false;
                        }
                    }
                    C0OF.LJIIL(LJIIIIZZ, c41311jj);
                }
            } while (!z);
            return z2;
        }
    };

    @Override // X.C0O9
    public final /* synthetic */ C0OB LJIIIZ(C0OB c0ob, C0OB c0ob2, C0OB c0ob3) {
        return null;
    }

    public final C1IT<K, V> LIZ() {
        C1IT c1it = this.LJLIL;
        o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C1IT) C0OF.LJIILLIIL(c1it, this);
    }

    @Override // java.util.Map
    public final void clear() {
        C0OA LJIIIIZZ;
        C1IT c1it = this.LJLIL;
        o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C1IT c1it2 = (C1IT) C0OF.LJI(c1it);
        C44541ow LJJLJLI = C78880UxY.LJJLJLI();
        if (LJJLJLI != c1it2.LIZJ) {
            synchronized (C0OH.LIZ) {
                C1IT c1it3 = this.LJLIL;
                o.LJII(c1it3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IT c1it4 = (C1IT) C0OF.LJIJI(c1it3, this, LJIIIIZZ);
                    c1it4.LIZJ = LJJLJLI;
                    c1it4.LIZLLL++;
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return LIZ().LIZJ.isEmpty();
    }

    @Override // java.util.Map
    public final int size() {
        return LIZ().LIZJ.size();
    }

    @Override // X.C0O9
    public final C0OB LJII() {
        return this.LJLIL;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<K, V>> entrySet() {
        return this.LJLILLLLZI;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return this.LJLJI;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return this.LJLJJI;
    }

    @Override // X.C0O9
    public final void LJIIIIZZ(C0OB c0ob) {
        this.LJLIL = (C1IT) c0ob;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return LIZ().LIZJ.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return LIZ().LIZJ.containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return LIZ().LIZJ.get(obj);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> from) {
        InterfaceC37431dT<K, ? extends V> interfaceC37431dT;
        int i;
        C0OA LJIIIIZZ;
        boolean z;
        o.LJIIIZ(from, "from");
        do {
            Object obj = C0OH.LIZ;
            synchronized (obj) {
                C1IT c1it = this.LJLIL;
                o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C1IT c1it2 = (C1IT) C0OF.LJI(c1it);
                interfaceC37431dT = c1it2.LIZJ;
                i = c1it2.LIZLLL;
            }
            o.LJI(interfaceC37431dT);
            C44551ox builder = interfaceC37431dT.builder();
            builder.putAll(from);
            C44541ow<K, V> LIZ = builder.LIZ();
            if (!o.LJ(LIZ, interfaceC37431dT)) {
                synchronized (obj) {
                    C1IT c1it3 = this.LJLIL;
                    o.LJII(c1it3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (C0OF.LIZJ) {
                        LJIIIIZZ = C0OF.LJIIIIZZ();
                        C1IT c1it4 = (C1IT) C0OF.LJIJI(c1it3, this, LJIIIIZZ);
                        if (c1it4.LIZLLL == i) {
                            c1it4.LIZJ(LIZ);
                            z = true;
                            c1it4.LIZLLL++;
                        } else {
                            z = false;
                        }
                    }
                    C0OF.LJIIL(LJIIIIZZ, this);
                }
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        InterfaceC37431dT<K, ? extends V> interfaceC37431dT;
        int i;
        V v;
        C0OA LJIIIIZZ;
        boolean z;
        do {
            Object obj2 = C0OH.LIZ;
            synchronized (obj2) {
                C1IT c1it = this.LJLIL;
                o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C1IT c1it2 = (C1IT) C0OF.LJI(c1it);
                interfaceC37431dT = c1it2.LIZJ;
                i = c1it2.LIZLLL;
            }
            o.LJI(interfaceC37431dT);
            C44551ox builder = interfaceC37431dT.builder();
            v = (V) builder.remove(obj);
            C44541ow<K, V> LIZ = builder.LIZ();
            if (o.LJ(LIZ, interfaceC37431dT)) {
                break;
            }
            synchronized (obj2) {
                C1IT c1it3 = this.LJLIL;
                o.LJII(c1it3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IT c1it4 = (C1IT) C0OF.LJIJI(c1it3, this, LJIIIIZZ);
                    if (c1it4.LIZLLL == i) {
                        c1it4.LIZJ(LIZ);
                        z = true;
                        c1it4.LIZLLL++;
                    } else {
                        z = false;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return v;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        InterfaceC37431dT<K, ? extends V> interfaceC37431dT;
        int i;
        V v2;
        C0OA LJIIIIZZ;
        boolean z;
        do {
            Object obj = C0OH.LIZ;
            synchronized (obj) {
                C1IT c1it = this.LJLIL;
                o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C1IT c1it2 = (C1IT) C0OF.LJI(c1it);
                interfaceC37431dT = c1it2.LIZJ;
                i = c1it2.LIZLLL;
            }
            o.LJI(interfaceC37431dT);
            C44551ox builder = interfaceC37431dT.builder();
            v2 = (V) builder.put(k, v);
            C44541ow<K, V> LIZ = builder.LIZ();
            if (o.LJ(LIZ, interfaceC37431dT)) {
                break;
            }
            synchronized (obj) {
                C1IT c1it3 = this.LJLIL;
                o.LJII(c1it3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IT c1it4 = (C1IT) C0OF.LJIJI(c1it3, this, LJIIIIZZ);
                    if (c1it4.LIZLLL == i) {
                        c1it4.LIZJ(LIZ);
                        z = true;
                        c1it4.LIZLLL++;
                    } else {
                        z = false;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, this);
            }
        } while (!z);
        return v2;
    }
}
