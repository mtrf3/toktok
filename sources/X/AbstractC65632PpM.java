package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PpM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65632PpM<K, V> implements InterfaceC65633PpN<K, V> {
    public transient Collection<Map.Entry<K, V>> LJLIL;
    public transient java.util.Set<K> LJLILLLLZI;
    public transient InterfaceC65672Pq0<K> LJLJI;
    public transient Collection<V> LJLJJI;
    public transient java.util.Map<K, Collection<V>> LJLJJL;

    /* renamed from: X.PpM$a */
    /* loaded from: classes12.dex */
    public class a extends AbstractC65634PpO<K, V> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC65632PpM.this.LJFF();
        }

        public a() {
        }
    }

    public abstract java.util.Map<K, Collection<V>> LIZ();

    public abstract Collection<Map.Entry<K, V>> LIZIZ();

    public abstract java.util.Set<K> LIZJ();

    public abstract InterfaceC65672Pq0<K> LIZLLL();

    public abstract Collection<V> LJ();

    public abstract Iterator<Map.Entry<K, V>> LJFF();

    @Override // X.InterfaceC65633PpN
    public java.util.Map<K, Collection<V>> asMap() {
        java.util.Map<K, Collection<V>> map = this.LJLJJL;
        if (map == null) {
            java.util.Map<K, Collection<V>> LIZ = LIZ();
            this.LJLJJL = LIZ;
            return LIZ;
        }
        return map;
    }

    @Override // X.InterfaceC65633PpN
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.LJLIL;
        if (collection == null) {
            Collection<Map.Entry<K, V>> LIZIZ = LIZIZ();
            this.LJLIL = LIZIZ;
            return LIZIZ;
        }
        return collection;
    }

    @Override // X.InterfaceC65633PpN
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.LJLILLLLZI;
        if (set == null) {
            java.util.Set<K> LIZJ = LIZJ();
            this.LJLILLLLZI = LIZJ;
            return LIZJ;
        }
        return set;
    }

    public InterfaceC65672Pq0<K> keys() {
        InterfaceC65672Pq0<K> interfaceC65672Pq0 = this.LJLJI;
        if (interfaceC65672Pq0 == null) {
            InterfaceC65672Pq0<K> LIZLLL = LIZLLL();
            this.LJLJI = LIZLLL;
            return LIZLLL;
        }
        return interfaceC65672Pq0;
    }

    public Collection<V> values() {
        Collection<V> collection = this.LJLJJI;
        if (collection == null) {
            Collection<V> LJ = LJ();
            this.LJLJJI = LJ;
            return LJ;
        }
        return collection;
    }

    public Iterator<V> LJI() {
        return new C65642PpW(entries().iterator());
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // X.InterfaceC65633PpN
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return asMap().toString();
    }

    public boolean containsValue(Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC65633PpN) {
            return asMap().equals(((InterfaceC65633PpN) obj).asMap());
        }
        return false;
    }

    public boolean putAll(InterfaceC65633PpN<? extends K, ? extends V> interfaceC65633PpN) {
        boolean z = false;
        for (Map.Entry<? extends K, ? extends V> entry : interfaceC65633PpN.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    @Override // X.InterfaceC65633PpN
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC65633PpN
    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            if (!collection.isEmpty() && get(k).addAll(collection)) {
                return true;
            }
            return false;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (it.hasNext() && C65631PpL.LIZ(get(k), it)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC65633PpN
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        iterable.getClass();
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }
}
