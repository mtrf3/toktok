package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.Prd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65773Prd<V> extends AbstractCollection<V> {
    public final ConcurrentMap<?, ?> LJLIL;
    public final /* synthetic */ ConcurrentMapC84812XQi LJLILLLLZI;

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
        return new C84807XQd(this.LJLILLLLZI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return ConcurrentMapC84812XQi.LJIIIIZZ(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLIL.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        return (E[]) ConcurrentMapC84812XQi.LJIIIIZZ(this).toArray(eArr);
    }

    public C65773Prd(ConcurrentMapC84812XQi concurrentMapC84812XQi, ConcurrentMap<?, ?> concurrentMap) {
        this.LJLILLLLZI = concurrentMapC84812XQi;
        this.LJLIL = concurrentMap;
    }
}
