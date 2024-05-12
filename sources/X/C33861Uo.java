package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.o;

/* renamed from: X.1Uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33861Uo implements Collection<C16030k3>, InterfaceC90533gv {
    public static final /* synthetic */ int LJLJI = 0;
    public final List<C16030k3> LJLIL;
    public final int LJLILLLLZI;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C16030k3 c16030k3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C16030k3> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super C16030k3> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
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
    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C16030k3> iterator() {
        return this.LJLIL.iterator();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocaleList(localeList=");
        return C1NE.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.LJLILLLLZI;
    }

    public C33861Uo(List<C16030k3> list) {
        this.LJLIL = list;
        this.LJLILLLLZI = ((ArrayList) list).size();
    }

    @Override // java.util.Collection
    public final boolean contains(Object element) {
        if (!(element instanceof C16030k3)) {
            return false;
        }
        o.LJIIIZ(element, "element");
        return this.LJLIL.contains(element);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.containsAll(elements);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C33861Uo) && o.LJ(this.LJLIL, ((C33861Uo) obj).LJLIL)) {
            return true;
        }
        return false;
    }
}
