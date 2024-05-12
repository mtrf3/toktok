package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.EBz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36027EBz<K, V> implements java.util.Set<Map.Entry<K, V>> {
    public final /* synthetic */ java.util.Set LJLIL;

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C36026EBy(this.LJLIL.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.LJLIL.toArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == C36017EBp.NULL) {
                array[i] = null;
            }
        }
        return array;
    }

    public C36027EBz(java.util.Set set) {
        this.LJLIL = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.LJLIL.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        return this.LJLIL.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        java.util.Set set = this.LJLIL;
        if (obj == null) {
            obj = C36017EBp.NULL;
        }
        return set.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.LJLIL.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LJLIL.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.LJLIL.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.LJLIL.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.LJLIL.toArray(tArr);
    }
}
