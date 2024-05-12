package X;

import X.AbstractC65632PpM;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: X.PqM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65694PqM<K, V> extends AbstractC65632PpM<K, V> implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient java.util.Map<K, Collection<V>> LJLJJLL;
    public transient int LJLJL;

    /* renamed from: X.PqM$c */
    /* loaded from: classes12.dex */
    public class c extends AbstractC65693PqL<K, Collection<V>> {
        public final transient java.util.Map<K, Collection<V>> LJLJI;

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            java.util.Map<K, Collection<V>> map = this.LJLJI;
            AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
            if (map == abstractC65694PqM.LJLJJLL) {
                abstractC65694PqM.clear();
            } else {
                C65631PpL.LIZIZ(new C65700PqS(this));
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.LJLJI.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return AbstractC65694PqM.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.LJLJI.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.LJLJI.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C65506PnK LIZ(Map.Entry entry) {
            Object key = entry.getKey();
            return new C65506PnK(key, AbstractC65694PqM.this.LJIIJ(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            java.util.Map<K, Collection<V>> map = this.LJLJI;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            if (this == obj || this.LJLJI.equals(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection = (Collection) C65692PqK.LIZ(obj, this.LJLJI);
            if (collection == null) {
                return null;
            }
            return AbstractC65694PqM.this.LJIIJ(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.LJLJI.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> LJII = AbstractC65694PqM.this.LJII();
            LJII.addAll(remove);
            AbstractC65694PqM.this.LJLJL -= remove.size();
            remove.clear();
            return LJII;
        }

        public c(java.util.Map<K, Collection<V>> map) {
            this.LJLJI = map;
        }
    }

    /* renamed from: X.PqM$d */
    /* loaded from: classes12.dex */
    public abstract class d<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> LJLIL;
        public K LJLILLLLZI = null;
        public Collection<V> LJLJI = null;
        public Iterator<V> LJLJJI = EnumC65677Pq5.LJLIL;

        public abstract T LIZ(K k, V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.LJLIL.hasNext() || this.LJLJJI.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.LJLJJI.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.LJLIL.next();
                this.LJLILLLLZI = next.getKey();
                Collection<V> value = next.getValue();
                this.LJLJI = value;
                this.LJLJJI = value.iterator();
            }
            return LIZ(this.LJLILLLLZI, this.LJLJJI.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.LJLJJI.remove();
            if (this.LJLJI.isEmpty()) {
                this.LJLIL.remove();
            }
            AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
            abstractC65694PqM.LJLJL--;
        }

        public d() {
            this.LJLIL = AbstractC65694PqM.this.LJLJJLL.entrySet().iterator();
        }
    }

    /* renamed from: X.PqM$e */
    /* loaded from: classes12.dex */
    public class e extends C65682PqA<K, Collection<V>> {
        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.LJLIL.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new C65701PqT(this, this.LJLIL.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C65631PpL.LIZIZ(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.LJLIL.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (this == obj || this.LJLIL.keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Collection collection = (Collection) this.LJLIL.remove(obj);
            if (collection == null) {
                return false;
            }
            int size = collection.size();
            collection.clear();
            AbstractC65694PqM.this.LJLJL -= size;
            if (size <= 0) {
                return false;
            }
            return true;
        }

        public e(java.util.Map<K, Collection<V>> map) {
            super(map);
        }
    }

    /* renamed from: X.PqM$i */
    /* loaded from: classes12.dex */
    public class i extends AbstractC65694PqM<K, V>.c implements SortedMap<K, Collection<V>> {
        public SortedSet<K> LJLJJL;

        public SortedSet<K> LIZIZ() {
            return new j(LIZLLL());
        }

        @Override // X.AbstractC65694PqM.c, java.util.AbstractMap, java.util.Map
        /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.LJLJJL;
            if (sortedSet == null) {
                SortedSet<K> LIZIZ = LIZIZ();
                this.LJLJJL = LIZIZ;
                return LIZIZ;
            }
            return sortedSet;
        }

        public SortedMap<K, Collection<V>> LIZLLL() {
            return (SortedMap) this.LJLJI;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return LIZLLL().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return LIZLLL().firstKey();
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return LIZLLL().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> headMap(K k) {
            return new i(LIZLLL().headMap(k));
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new i(LIZLLL().tailMap(k));
        }

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new i(LIZLLL().subMap(k, k2));
        }
    }

    /* renamed from: X.PqM$j */
    /* loaded from: classes12.dex */
    public class j extends AbstractC65694PqM<K, V>.e implements SortedSet<K> {
        public SortedMap<K, Collection<V>> LIZJ() {
            return (SortedMap) this.LJLIL;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return LIZJ().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return LIZJ().firstKey();
        }

        @Override // java.util.SortedSet
        public final K last() {
            return LIZJ().lastKey();
        }

        @Override // java.util.SortedSet
        public SortedSet<K> headSet(K k) {
            return new j(LIZJ().headMap(k));
        }

        @Override // java.util.SortedSet
        public SortedSet<K> tailSet(K k) {
            return new j(LIZJ().tailMap(k));
        }

        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public SortedSet<K> subSet(K k, K k2) {
            return new j(LIZJ().subMap(k, k2));
        }
    }

    /* renamed from: X.PqM$k */
    /* loaded from: classes12.dex */
    public class k extends AbstractCollection<V> {
        public final K LJLIL;
        public Collection<V> LJLILLLLZI;
        public final AbstractC65694PqM<K, V>.k LJLJI;
        public final Collection<V> LJLJJI;

        /* renamed from: X.PqM$k$a */
        /* loaded from: classes12.dex */
        public class a implements Iterator<V> {
            public final Iterator<V> LJLIL;
            public final Collection<V> LJLILLLLZI;

            public final void LIZ() {
                k.this.LJFF();
                if (k.this.LJLILLLLZI == this.LJLILLLLZI) {
                } else {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.LJLIL.remove();
                k kVar = k.this;
                AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
                abstractC65694PqM.LJLJL--;
                kVar.LJII();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                LIZ();
                return this.LJLIL.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                LIZ();
                return this.LJLIL.next();
            }

            public a() {
                Iterator<V> it;
                Collection<V> collection = k.this.LJLILLLLZI;
                this.LJLILLLLZI = collection;
                if (collection instanceof List) {
                    it = ((List) collection).listIterator();
                } else {
                    it = collection.iterator();
                }
                this.LJLIL = it;
            }

            public a(Iterator<V> it) {
                this.LJLILLLLZI = k.this.LJLILLLLZI;
                this.LJLIL = it;
            }
        }

        public final void LIZJ() {
            AbstractC65694PqM<K, V>.k kVar = this.LJLJI;
            if (kVar != null) {
                kVar.LIZJ();
            } else {
                AbstractC65694PqM.this.LJLJJLL.put(this.LJLIL, this.LJLILLLLZI);
            }
        }

        public final void LJFF() {
            Collection<V> collection;
            AbstractC65694PqM<K, V>.k kVar = this.LJLJI;
            if (kVar != null) {
                kVar.LJFF();
                if (this.LJLJI.LJLILLLLZI == this.LJLJJI) {
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.LJLILLLLZI.isEmpty() || (collection = AbstractC65694PqM.this.LJLJJLL.get(this.LJLIL)) == null) {
                    return;
                }
                this.LJLILLLLZI = collection;
            }
        }

        public final void LJII() {
            AbstractC65694PqM<K, V>.k kVar = this.LJLJI;
            if (kVar != null) {
                kVar.LJII();
            } else {
                if (!this.LJLILLLLZI.isEmpty()) {
                    return;
                }
                AbstractC65694PqM.this.LJLJJLL.remove(this.LJLIL);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.LJLILLLLZI.clear();
            AbstractC65694PqM.this.LJLJL -= size;
            LJII();
        }

        @Override // java.util.Collection
        public final int hashCode() {
            LJFF();
            return this.LJLILLLLZI.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            LJFF();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            LJFF();
            return this.LJLILLLLZI.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            LJFF();
            return this.LJLILLLLZI.toString();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            LJFF();
            boolean isEmpty = this.LJLILLLLZI.isEmpty();
            boolean add = this.LJLILLLLZI.add(v);
            if (add) {
                AbstractC65694PqM.this.LJLJL++;
                if (isEmpty) {
                    LIZJ();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.LJLILLLLZI.addAll(collection);
            if (addAll) {
                int size2 = this.LJLILLLLZI.size();
                AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
                abstractC65694PqM.LJLJL = (size2 - size) + abstractC65694PqM.LJLJL;
                if (size == 0) {
                    LIZJ();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            LJFF();
            return this.LJLILLLLZI.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            LJFF();
            return this.LJLILLLLZI.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            LJFF();
            return this.LJLILLLLZI.equals(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            LJFF();
            boolean remove = this.LJLILLLLZI.remove(obj);
            if (remove) {
                AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
                abstractC65694PqM.LJLJL--;
                LJII();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.LJLILLLLZI.removeAll(collection);
            if (removeAll) {
                int size2 = this.LJLILLLLZI.size();
                AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
                abstractC65694PqM.LJLJL = (size2 - size) + abstractC65694PqM.LJLJL;
                LJII();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.LJLILLLLZI.retainAll(collection);
            if (retainAll) {
                int size2 = this.LJLILLLLZI.size();
                AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
                abstractC65694PqM.LJLJL = (size2 - size) + abstractC65694PqM.LJLJL;
                LJII();
            }
            return retainAll;
        }

        public k(K k, Collection<V> collection, AbstractC65694PqM<K, V>.k kVar) {
            Collection<V> collection2;
            this.LJLIL = k;
            this.LJLILLLLZI = collection;
            this.LJLJI = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.LJLILLLLZI;
            }
            this.LJLJJI = collection2;
        }
    }

    public abstract Collection<V> LJII();

    /* renamed from: X.PqM$l */
    /* loaded from: classes12.dex */
    public class l extends AbstractC65694PqM<K, V>.k implements List<V> {
        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            LJFF();
            return new C65703PqV(this);
        }

        @Override // java.util.List
        public final V get(int i) {
            LJFF();
            return (V) ListProtector.get((List) this.LJLILLLLZI, i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            LJFF();
            return ((List) this.LJLILLLLZI).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            LJFF();
            return ((List) this.LJLILLLLZI).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            LJFF();
            return new C65703PqV(this, i);
        }

        @Override // java.util.List
        public final V remove(int i) {
            LJFF();
            V v = (V) ListProtector.remove((List) this.LJLILLLLZI, i);
            AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
            abstractC65694PqM.LJLJL--;
            LJII();
            return v;
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            LJFF();
            boolean isEmpty = this.LJLILLLLZI.isEmpty();
            ListProtector.add((List) this.LJLILLLLZI, i, v);
            AbstractC65694PqM.this.LJLJL++;
            if (isEmpty) {
                LIZJ();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.LJLILLLLZI).addAll(i, collection);
            if (addAll) {
                int size2 = this.LJLILLLLZI.size();
                AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
                abstractC65694PqM.LJLJL = (size2 - size) + abstractC65694PqM.LJLJL;
                if (size == 0) {
                    LIZJ();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            LJFF();
            return (V) ListProtector.set((List) this.LJLILLLLZI, i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            LJFF();
            AbstractC65694PqM abstractC65694PqM = AbstractC65694PqM.this;
            K k = this.LJLIL;
            List subList = ((List) this.LJLILLLLZI).subList(i, i2);
            AbstractC65694PqM<K, V>.k kVar = this.LJLJI;
            if (kVar == null) {
                kVar = this;
            }
            abstractC65694PqM.getClass();
            if (subList instanceof RandomAccess) {
                return new C65702PqU(abstractC65694PqM, k, subList, kVar);
            }
            return new l(k, subList, kVar);
        }

        public l(K k, List<V> list, AbstractC65694PqM<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    @Override // X.AbstractC65632PpM
    public java.util.Map<K, Collection<V>> LIZ() {
        return new c(this.LJLJJLL);
    }

    @Override // X.AbstractC65632PpM
    public final Collection<Map.Entry<K, V>> LIZIZ() {
        if (this instanceof InterfaceC65628PpI) {
            return new C65636PpQ(this);
        }
        return new AbstractC65632PpM.a();
    }

    @Override // X.AbstractC65632PpM
    public java.util.Set<K> LIZJ() {
        return new e(this.LJLJJLL);
    }

    @Override // X.AbstractC65632PpM
    public final InterfaceC65672Pq0<K> LIZLLL() {
        return new C65639PpT(this);
    }

    @Override // X.AbstractC65632PpM
    public final Collection<V> LJ() {
        return new C65635PpP(this);
    }

    @Override // X.AbstractC65632PpM
    public final Iterator<Map.Entry<K, V>> LJFF() {
        return new C65704PqW(this);
    }

    @Override // X.AbstractC65632PpM
    public final Iterator<V> LJI() {
        return new C65709Pqb(this);
    }

    @Override // X.InterfaceC65633PpN
    public final void clear() {
        Iterator<Collection<V>> it = this.LJLJJLL.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.LJLJJLL.clear();
        this.LJLJL = 0;
    }

    public Collection<V> LJIIIIZZ() {
        return (Collection<V>) LJIIIZ(LJII());
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public final Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // X.AbstractC65632PpM
    public final Collection<V> values() {
        return super.values();
    }

    @Override // X.InterfaceC65633PpN
    public final int size() {
        return this.LJLJL;
    }

    public AbstractC65694PqM(java.util.Map<K, Collection<V>> map) {
        C76917UGr.LJ(map.isEmpty());
        this.LJLJJLL = map;
    }

    public <E> Collection<E> LJIIIZ(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // X.InterfaceC65633PpN
    public final boolean containsKey(Object obj) {
        return this.LJLJJLL.containsKey(obj);
    }

    @Override // X.InterfaceC65633PpN
    public Collection<V> get(K k2) {
        Collection<V> collection = this.LJLJJLL.get(k2);
        if (collection == null) {
            collection = LJII();
        }
        return LJIIJ(k2, collection);
    }

    @Override // X.InterfaceC65633PpN
    public Collection<V> removeAll(Object obj) {
        Collection<V> remove = this.LJLJJLL.remove(obj);
        if (remove == null) {
            return LJIIIIZZ();
        }
        Collection LJII = LJII();
        LJII.addAll(remove);
        this.LJLJL -= remove.size();
        remove.clear();
        return (Collection<V>) LJIIIZ(LJII);
    }

    public Collection<V> LJIIJ(K k2, Collection<V> collection) {
        return new k(k2, collection, null);
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public boolean put(K k2, V v) {
        Collection<V> collection = this.LJLJJLL.get(k2);
        if (collection == null) {
            Collection<V> LJII = LJII();
            if (LJII.add(v)) {
                this.LJLJL++;
                this.LJLJJLL.put(k2, LJII);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(v)) {
            this.LJLJL++;
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65632PpM
    public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k2);
        }
        Collection<V> collection = this.LJLJJLL.get(k2);
        if (collection == null) {
            collection = LJII();
            this.LJLJJLL.put(k2, collection);
        }
        Collection LJII = LJII();
        LJII.addAll(collection);
        this.LJLJL -= collection.size();
        collection.clear();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                this.LJLJL++;
            }
        }
        return (Collection<V>) LJIIIZ(LJII);
    }
}
