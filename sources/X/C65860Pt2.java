package X;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Pt2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65860Pt2<V> extends AbstractC65774Pre<V> {
    public final C65864Pt6<?, V> LJLIL;

    @Override // X.AbstractC65774Pre
    public final int LIZJ() {
        return this.LJLIL.size();
    }

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
        return this.LJLIL.valuesIterator$kotlin_stdlib();
    }

    public C65860Pt2(C65864Pt6<?, V> backing) {
        o.LJIIIZ(backing, "backing");
        this.LJLIL = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> elements) {
        o.LJIIIZ(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLIL.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LJLIL.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
