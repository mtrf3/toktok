package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.Prc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65772Prc<V> extends AbstractCollection<V> {
    public final ConcurrentMap<?, ?> LJLIL;
    public final /* synthetic */ XQ3 LJLILLLLZI;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new XQN(this.LJLILLLLZI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return XQ3.LJIIIIZZ(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLIL.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        return (E[]) XQ3.LJIIIIZZ(this).toArray(eArr);
    }

    public C65772Prc(XQ3 xq3, ConcurrentMap<?, ?> concurrentMap) {
        this.LJLILLLLZI = xq3;
        this.LJLIL = concurrentMap;
    }
}
