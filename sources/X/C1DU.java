package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.o;

/* renamed from: X.1DU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DU<T> implements List<T>, InterfaceC90533gv {
    public Object[] LJLIL = new Object[16];
    public long[] LJLILLLLZI = new long[16];
    public int LJLJI = -1;
    public int LJLJJI;

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
        this.LJLJI = -1;
        LJIIIIZZ();
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

    public final long LIZJ() {
        long LJIIIIZZ = C78857UxB.LJIIIIZZ(Float.POSITIVE_INFINITY, false);
        int i = this.LJLJI + 1;
        int LJJI = C47261Igj.LJJI(this);
        if (i <= LJJI) {
            while (true) {
                long j = this.LJLILLLLZI[i];
                if (C47261Igj.LJIIL(j, LJIIIIZZ) < 0) {
                    LJIIIIZZ = j;
                }
                if (Float.intBitsToFloat((int) (LJIIIIZZ >> 32)) < 0.0f && C47261Igj.LJJIIZ(LJIIIIZZ)) {
                    return LJIIIIZZ;
                }
                if (i == LJJI) {
                    break;
                }
                i++;
            }
        }
        return LJIIIIZZ;
    }

    public final void LJIIIIZZ() {
        int i = this.LJLJI + 1;
        int LJJI = C47261Igj.LJJI(this);
        if (i <= LJJI) {
            while (true) {
                this.LJLIL[i] = null;
                if (i == LJJI) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.LJLJJI = this.LJLJI + 1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.LJLJJI == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C1DR(this, 0, 7);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C1DR(this, 0, 7);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.LJLJJI;
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
        return (T) this.LJLIL[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int LJJI = C47261Igj.LJJI(this);
        if (LJJI >= 0) {
            int i = 0;
            while (!o.LJ(this.LJLIL[i], obj)) {
                if (i != LJJI) {
                    i++;
                } else {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        for (int LJJI = C47261Igj.LJJI(this); -1 < LJJI; LJJI--) {
            if (o.LJ(this.LJLIL[LJJI], obj)) {
                return LJJI;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C1DR(this, i, 6);
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        return new C1DS(this, i, i2);
    }

    public final void LJII(T t, float f, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i = this.LJLJI;
        int i2 = i + 1;
        this.LJLJI = i2;
        Object[] objArr = this.LJLIL;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            this.LJLIL = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.LJLILLLLZI, length);
            o.LJIIIIZZ(copyOf2, "copyOf(this, newSize)");
            this.LJLILLLLZI = copyOf2;
        }
        Object[] objArr2 = this.LJLIL;
        int i3 = this.LJLJI;
        objArr2[i3] = t;
        this.LJLILLLLZI[i3] = C78857UxB.LJIIIIZZ(f, z);
        LJIIIIZZ();
        interfaceC65784Pro.invoke();
        this.LJLJI = i;
    }
}
