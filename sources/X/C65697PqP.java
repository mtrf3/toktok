package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PqP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65697PqP<K, V> extends AbstractC65694PqM<K, V>.i implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ AbstractC65694PqM LJLJL;

    @Override // X.AbstractC65694PqM.i
    public final SortedSet LIZIZ() {
        return new C65698PqQ(this.LJLJL, LIZLLL());
    }

    @Override // X.AbstractC65694PqM.i
    /* renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> LIZLLL() {
        return (NavigableMap) ((SortedMap) this.LJLJI);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> descendingMap() {
        return new C65697PqP(this.LJLJL, LIZLLL().descendingMap());
    }

    @Override // X.AbstractC65694PqM.i
    /* renamed from: LIZJ */
    public final SortedSet keySet() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> descendingKeySet() {
        return ((C65697PqP) descendingMap()).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> firstEntry() {
        Map.Entry<K, Collection<V>> firstEntry = LIZLLL().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return LIZ(firstEntry);
    }

    @Override // X.AbstractC65694PqM.i, X.AbstractC65694PqM.c, java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> lastEntry() {
        Map.Entry<K, Collection<V>> lastEntry = LIZLLL().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return LIZ(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> pollFirstEntry() {
        return LJ(((C65699PqR) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> pollLastEntry() {
        return LJ(((C65699PqR) ((AbstractC65693PqL) descendingMap()).entrySet()).iterator());
    }

    public final C65506PnK LJ(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection<V> LJII = this.LJLJL.LJII();
        LJII.addAll((Collection) entry.getValue());
        it.remove();
        return new C65506PnK(entry.getKey(), this.LJLJL.LJIIIZ(LJII));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
        Map.Entry<K, Collection<V>> ceilingEntry = LIZLLL().ceilingEntry(k);
        if (ceilingEntry == null) {
            return null;
        }
        return LIZ(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final K ceilingKey(K k) {
        return LIZLLL().ceilingKey(k);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> floorEntry(K k) {
        Map.Entry<K, Collection<V>> floorEntry = LIZLLL().floorEntry(k);
        if (floorEntry == null) {
            return null;
        }
        return LIZ(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final K floorKey(K k) {
        return LIZLLL().floorKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65694PqM.i, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> higherEntry(K k) {
        Map.Entry<K, Collection<V>> higherEntry = LIZLLL().higherEntry(k);
        if (higherEntry == null) {
            return null;
        }
        return LIZ(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final K higherKey(K k) {
        return LIZLLL().higherKey(k);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
        Map.Entry<K, Collection<V>> lowerEntry = LIZLLL().lowerEntry(k);
        if (lowerEntry == null) {
            return null;
        }
        return LIZ(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final K lowerKey(K k) {
        return LIZLLL().lowerKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65694PqM.i, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65697PqP(AbstractC65694PqM abstractC65694PqM, NavigableMap<K, Collection<V>> navigableMap) {
        super(navigableMap);
        this.LJLJL = abstractC65694PqM;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
        return new C65697PqP(this.LJLJL, LIZLLL().headMap(k, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65694PqM.i, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
        return new C65697PqP(this.LJLJL, LIZLLL().tailMap(k, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
        return new C65697PqP(this.LJLJL, LIZLLL().subMap(k, z, k2, z2));
    }
}
