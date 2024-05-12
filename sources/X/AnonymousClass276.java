package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.276, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass276<T> implements List<T>, ORO {
    public final C25710zf<T> LJLIL;

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
    public final void clear() {
        this.LJLIL.LJII();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.LJIIJ();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C36451bt(this, 0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C36451bt(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LJLIL.LJLJI;
    }

    public AnonymousClass276(C25710zf<T> vector) {
        o.LJIIIZ(vector, "vector");
        this.LJLIL = vector;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        this.LJLIL.LIZLLL(t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        C25710zf<T> c25710zf = this.LJLIL;
        c25710zf.getClass();
        return c25710zf.LJFF(c25710zf.LJLJI, elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLIL.LJIIIIZZ(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        C25710zf<T> c25710zf = this.LJLIL;
        c25710zf.getClass();
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!c25710zf.LJIIIIZZ(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        C79146V4k.LJIILJJIL(i, this);
        return this.LJLIL.LJLIL[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        C25710zf<T> c25710zf = this.LJLIL;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            T[] tArr = c25710zf.LJLIL;
            o.LJII(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            while (!o.LJ(obj, tArr[i2])) {
                i2++;
                if (i2 >= i) {
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C25710zf<T> c25710zf = this.LJLIL;
        int i = c25710zf.LJLJI;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        T[] tArr = c25710zf.LJLIL;
        o.LJII(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        while (!o.LJ(obj, tArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C36451bt(this, i);
    }

    @Override // java.util.List
    public final T remove(int i) {
        C79146V4k.LJIILJJIL(i, this);
        return this.LJLIL.LJIILJJIL(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        C25710zf<T> c25710zf = this.LJLIL;
        c25710zf.getClass();
        if (elements.isEmpty()) {
            return false;
        }
        int i = c25710zf.LJLJI;
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            c25710zf.LJIIL(it.next());
        }
        if (i == c25710zf.LJLJI) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        C25710zf<T> c25710zf = this.LJLIL;
        c25710zf.getClass();
        int i = c25710zf.LJLJI;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(c25710zf.LJLIL[i2])) {
                c25710zf.LJIILJJIL(i2);
            }
        }
        if (i != c25710zf.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LJLIL.LJIIL(obj);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.LJLIL.LIZJ(i, t);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        return this.LJLIL.LJFF(i, elements);
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        C79146V4k.LJIILJJIL(i, this);
        T[] tArr = this.LJLIL.LJLIL;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        C79146V4k.LJIILL(i, i2, this);
        return new AnonymousClass277(this, i, i2);
    }
}
