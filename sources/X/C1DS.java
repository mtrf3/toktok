package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.1DS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DS<T> implements List<T>, InterfaceC90533gv {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ C1DU<T> LJLJI;

    @Override // java.util.List
    public final void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final T remove(int i) {
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
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super T> comparator) {
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

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.LJLILLLLZI - this.LJLIL == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        C1DU<T> c1du = this.LJLJI;
        int i = this.LJLIL;
        return new C1DR(c1du, i, i, this.LJLILLLLZI);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        C1DU<T> c1du = this.LJLJI;
        int i = this.LJLIL;
        return new C1DR(c1du, i, i, this.LJLILLLLZI);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LJLILLLLZI - this.LJLIL;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) this.LJLJI.LJLIL[i + this.LJLIL];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        if (i <= i2) {
            while (!o.LJ(this.LJLJI.LJLIL[i], obj)) {
                if (i != i2) {
                    i++;
                } else {
                    return -1;
                }
            }
            return i - this.LJLIL;
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.LJLILLLLZI;
        int i2 = this.LJLIL;
        if (i2 <= i) {
            while (!o.LJ(this.LJLJI.LJLIL[i], obj)) {
                if (i != i2) {
                    i--;
                } else {
                    return -1;
                }
            }
            return i - this.LJLIL;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        C1DU<T> c1du = this.LJLJI;
        int i2 = this.LJLIL;
        return new C1DR(c1du, i + i2, i2, this.LJLILLLLZI);
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        C1DU<T> c1du = this.LJLJI;
        int i3 = this.LJLIL;
        return new C1DS(c1du, i + i3, i3 + i2);
    }

    public C1DS(C1DU c1du, int i, int i2) {
        this.LJLJI = c1du;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
