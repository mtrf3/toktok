package X;

import X.AbstractC65694PqM;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: X.PqQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65698PqQ<K> extends AbstractC65694PqM<K, V>.j implements NavigableSet<K> {
    public final /* synthetic */ AbstractC65694PqM LJLJJI;

    @Override // X.AbstractC65694PqM.j
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> LIZJ() {
        return (NavigableMap) ((SortedMap) this.LJLIL);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> descendingSet() {
        return new C65698PqQ(this.LJLJJI, LIZJ().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Iterator<K> descendingIterator() {
        return ((AbstractC65694PqM.e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final K pollFirst() {
        C65701PqT c65701PqT = (C65701PqT) iterator();
        if (c65701PqT.hasNext()) {
            K k = (K) c65701PqT.next();
            c65701PqT.remove();
            return k;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final K pollLast() {
        Iterator<K> descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            K next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final K ceiling(K k) {
        return LIZJ().ceilingKey(k);
    }

    @Override // java.util.NavigableSet
    public final K floor(K k) {
        return LIZJ().floorKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65694PqM.j, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final K higher(K k) {
        return LIZJ().higherKey(k);
    }

    @Override // java.util.NavigableSet
    public final K lower(K k) {
        return LIZJ().lowerKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65694PqM.j, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65698PqQ(AbstractC65694PqM abstractC65694PqM, NavigableMap<K, Collection<V>> navigableMap) {
        super(navigableMap);
        this.LJLJJI = abstractC65694PqM;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> headSet(K k, boolean z) {
        return new C65698PqQ(this.LJLJJI, LIZJ().headMap(k, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65694PqM.j, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> tailSet(K k, boolean z) {
        return new C65698PqQ(this.LJLJJI, LIZJ().tailMap(k, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
        return new C65698PqQ(this.LJLJJI, LIZJ().subMap(k, z, k2, z2));
    }
}
