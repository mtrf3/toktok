package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.E9h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC35957E9h<K, V> implements java.util.Map<K, V>, InterfaceC90533gv {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return new C28V((C44541ow) this);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((C44541ow) this).LJLILLLLZI == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return new C28W((C44541ow) this);
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((C44541ow) this).LJLILLLLZI;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        final C44541ow c44541ow = (C44541ow) this;
        return new OQZ<V>(c44541ow) { // from class: X.1p1
            public final C44541ow<K, V> LJLIL;

            @Override // X.OQZ
            public final int LIZJ() {
                C44541ow<K, V> c44541ow2 = this.LJLIL;
                c44541ow2.getClass();
                return c44541ow2.LJLILLLLZI;
            }

            @Override // java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                final C14U<K, V> c14u = this.LJLIL.LJLIL;
                return new AbstractC38681fU<K, V, V>(c14u) { // from class: X.1p2
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r4 = this;
                            java.lang.String r0 = "node"
                            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                            r3 = 8
                            X.1fW[] r2 = new X.AbstractC38701fW[r3]
                            r1 = 0
                        La:
                            X.1p6 r0 = new X.1p6
                            r0.<init>()
                            r2[r1] = r0
                            int r1 = r1 + 1
                            if (r1 >= r3) goto L16
                            goto La
                        L16:
                            r4.<init>(r5, r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C44601p2.<init>(X.14U):void");
                    }
                };
            }

            {
                o.LJIIIZ(c44541ow, "map");
                this.LJLIL = c44541ow;
            }

            @Override // X.OQZ, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LJLIL.containsValue(obj);
            }
        };
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final String toString() {
        return ORZ.LLD(entrySet(), ", ", "{", "}", new AqS172S0100000_6((AbstractC35957E9h) this, 147), 24);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        java.util.Set<Map.Entry<K, V>> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = entrySet.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next().getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        C44541ow c44541ow = (C44541ow) this;
        java.util.Map map = (java.util.Map) obj;
        if (c44541ow.LJLILLLLZI != map.size()) {
            return false;
        }
        java.util.Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry<K, V> entry : entrySet) {
            if (entry != null) {
                K key = entry.getKey();
                V value = entry.getValue();
                Object obj2 = c44541ow.get(key);
                if (o.LJ(value, obj2) && (obj2 != null || c44541ow.containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }
}
