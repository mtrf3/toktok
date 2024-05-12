package X;

import com.google.gson.g;
import com.google.gson.j;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.1be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36301be implements List<Object>, InterfaceC90533gv {
    public final g LJLIL;

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Object> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Object> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        return (T[]) ORX.LIZJ(this, array);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C36291bd(this);
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator() {
        return new C36281bc(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public C36301be(g delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLIL = delegate;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List
    public final Object get(int i) {
        j LJJIIZ = this.LJLIL.LJJIIZ(i);
        if (LJJIIZ != null) {
            return C05600Jw.LIZIZ(LJJIIZ);
        }
        return null;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator(int i) {
        return new C36281bc(this, i);
    }

    @Override // java.util.List
    public final List<Object> subList(int i, int i2) {
        Iterator<j> it = this.LJLIL.iterator();
        o.LJIIIIZZ(it, "delegate.iterator()");
        return C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJLL(new C110574Vp(new C115534g9(new C77326UWk(OJ6.LJJIJLIJ(it)), true, new AqS169S0100000_3(new AnonymousClass274(i, i2), 920)), C183987Jy.LJLIL), AnonymousClass275.LJLIL)));
    }
}
