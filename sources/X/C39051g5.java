package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;
import kotlin.jvm.internal.o;

/* renamed from: X.1g5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39051g5 implements Collection<Object>, InterfaceC90533gv {
    public final java.util.Set<Object> LJLIL = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLIL.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.containsAll(elements);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super Object> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        return (T[]) ORX.LIZJ(this, array);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.LJLIL.iterator();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    public C39051g5(int i) {
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.LJLIL.add(obj);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.LJLIL.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> slotIds) {
        o.LJIIIZ(slotIds, "slotIds");
        return this.LJLIL.remove(slotIds);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> slotIds) {
        o.LJIIIZ(slotIds, "slotIds");
        return this.LJLIL.retainAll(slotIds);
    }
}
