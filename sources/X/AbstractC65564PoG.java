package X;

import defpackage.g0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: X.PoG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65564PoG<K, V> implements java.util.Map<K, V>, Serializable {
    public transient AbstractC65583PoZ<Map.Entry<K, V>> LJLIL;
    public transient AbstractC65583PoZ<K> LJLILLLLZI;
    public transient AbstractC65578PoU<V> LJLJI;
    public transient C65609Poz<K, V> LJLJJI;

    public abstract AbstractC65583PoZ<Map.Entry<K, V>> LIZ();

    public abstract AbstractC65583PoZ<K> LIZIZ();

    public abstract AbstractC65578PoU<V> LIZJ();

    public boolean LIZLLL() {
        return false;
    }

    public abstract boolean LJ();

    @Override // java.util.Map
    public abstract V get(Object obj);

    public static <K, V> C65534Pnm<K, V> builder() {
        return new C65534Pnm<>(4);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public AbstractC65583PoZ<Map.Entry<K, V>> entrySet() {
        AbstractC65583PoZ<Map.Entry<K, V>> abstractC65583PoZ = this.LJLIL;
        if (abstractC65583PoZ == null) {
            AbstractC65583PoZ<Map.Entry<K, V>> LIZ = LIZ();
            this.LJLIL = LIZ;
            return LIZ;
        }
        return abstractC65583PoZ;
    }

    @Override // java.util.Map
    public AbstractC65583PoZ<K> keySet() {
        AbstractC65583PoZ<K> abstractC65583PoZ = this.LJLILLLLZI;
        if (abstractC65583PoZ == null) {
            AbstractC65583PoZ<K> LIZIZ = LIZIZ();
            this.LJLILLLLZI = LIZIZ;
            return LIZIZ;
        }
        return abstractC65583PoZ;
    }

    @Override // java.util.Map
    public AbstractC65578PoU<V> values() {
        AbstractC65578PoU<V> abstractC65578PoU = this.LJLJI;
        if (abstractC65578PoU == null) {
            AbstractC65578PoU<V> LIZJ = LIZJ();
            this.LJLJI = LIZJ;
            return LIZJ;
        }
        return abstractC65578PoU;
    }

    public Object writeReplace() {
        return new C65533Pnl(this);
    }

    public C65609Poz<K, V> asMultimap() {
        if (isEmpty()) {
            return C65609Poz.of();
        }
        C65609Poz<K, V> c65609Poz = this.LJLJJI;
        if (c65609Poz == null) {
            C65609Poz<K, V> c65609Poz2 = new C65609Poz<>(new C65563PoF(this), size());
            this.LJLJJI = c65609Poz2;
            return c65609Poz2;
        }
        return c65609Poz;
    }

    @Override // java.util.Map
    public int hashCode() {
        return C65607Pox.LIZIZ(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        int size = size();
        g0.LJIIIIZZ(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static <K, V> AbstractC65564PoG<K, V> of() {
        return C65574PoQ.LJLJLJ;
    }

    public static <K, V> C65534Pnm<K, V> builderWithExpectedSize(int i) {
        g0.LJIIIIZZ(i, "expectedSize");
        return new C65534Pnm<>(i);
    }

    public static <K, V> AbstractC65564PoG<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC65564PoG) && !(map instanceof SortedMap)) {
            AbstractC65564PoG<K, V> abstractC65564PoG = (AbstractC65564PoG) map;
            if (!abstractC65564PoG.LJ()) {
                return abstractC65564PoG;
            }
        }
        return copyOf(map.entrySet());
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> AbstractC65564PoG<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        C65534Pnm c65534Pnm = new C65534Pnm(i);
        c65534Pnm.LIZJ(iterable);
        return c65534Pnm.LIZ();
    }

    public static <K, V> AbstractC65564PoG<K, V> of(K k, V v) {
        g0.LJII(k, v);
        return C65574PoQ.LJI(1, new Object[]{k, v});
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> AbstractC65564PoG<K, V> of(K k, V v, K k2, V v2) {
        g0.LJII(k, v);
        g0.LJII(k2, v2);
        return C65574PoQ.LJI(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> AbstractC65564PoG<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        g0.LJII(k, v);
        g0.LJII(k2, v2);
        g0.LJII(k3, v3);
        return C65574PoQ.LJI(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> AbstractC65564PoG<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        g0.LJII(k, v);
        g0.LJII(k2, v2);
        g0.LJII(k3, v3);
        g0.LJII(k4, v4);
        return C65574PoQ.LJI(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> AbstractC65564PoG<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v6) {
        g0.LJII(k, v);
        g0.LJII(k2, v2);
        g0.LJII(k3, v3);
        g0.LJII(k4, v4);
        g0.LJII(k5, v6);
        return C65574PoQ.LJI(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v6});
    }
}
