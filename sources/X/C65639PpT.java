package X;

import defpackage.g0;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.PpT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65639PpT<K, V> extends AbstractC65653Pph<K> {
    public final InterfaceC65633PpN<K, V> LJLJI;

    @Override // X.AbstractC65653Pph
    public final int LJFF() {
        return this.LJLJI.asMap().size();
    }

    @Override // X.AbstractC65653Pph
    public final Iterator<K> LJII() {
        throw new AssertionError("should never be called");
    }

    @Override // X.AbstractC65653Pph
    public final Iterator<InterfaceC65712Pqe<K>> LJIIIIZZ() {
        return new C65640PpU(this.LJLJI.asMap().entrySet().iterator());
    }

    @Override // X.AbstractC65653Pph, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.LJLJI.clear();
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public final java.util.Set<K> elementSet() {
        return this.LJLJI.keySet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
        return new C65641PpV(this.LJLJI.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public final int size() {
        return this.LJLJI.size();
    }

    public C65639PpT(InterfaceC65633PpN<K, V> interfaceC65633PpN) {
        this.LJLJI = interfaceC65633PpN;
    }

    @Override // X.AbstractC65653Pph, java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public final boolean contains(Object obj) {
        return this.LJLJI.containsKey(obj);
    }

    @Override // X.InterfaceC65672Pq0
    public final int count(Object obj) {
        Collection collection = (Collection) C65692PqK.LIZ(obj, this.LJLJI.asMap());
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    @Override // X.AbstractC65653Pph, X.InterfaceC65672Pq0
    public final int remove(Object obj, int i) {
        g0.LJIIIIZZ(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        Collection collection = (Collection) C65692PqK.LIZ(obj, this.LJLJI.asMap());
        if (collection == null) {
            return 0;
        }
        int size = collection.size();
        if (i >= size) {
            collection.clear();
        } else {
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
        }
        return size;
    }
}
