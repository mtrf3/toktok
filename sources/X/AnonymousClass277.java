package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.277, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass277<T> implements List<T>, ORO {
    public final List<T> LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;

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
        int i = this.LJLJI - 1;
        int i2 = this.LJLILLLLZI;
        if (i2 <= i) {
            while (true) {
                ListProtector.remove(this.LJLIL, i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.LJLJI = this.LJLILLLLZI;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.LJLJI == this.LJLILLLLZI) {
            return true;
        }
        return false;
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
        return this.LJLJI - this.LJLILLLLZI;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        List<T> list = this.LJLIL;
        int i = this.LJLJI;
        this.LJLJI = i + 1;
        ListProtector.add(list, i, t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.addAll(this.LJLJI, elements);
        this.LJLJI = elements.size() + this.LJLJI;
        if (elements.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.LJLJI;
        for (int i2 = this.LJLILLLLZI; i2 < i; i2++) {
            if (o.LJ(ListProtector.get(this.LJLIL, i2), obj)) {
                return true;
            }
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
        C79146V4k.LJIILJJIL(i, this);
        return (T) ListProtector.get(this.LJLIL, i + this.LJLILLLLZI);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.LJLJI;
        for (int i2 = this.LJLILLLLZI; i2 < i; i2++) {
            if (o.LJ(ListProtector.get(this.LJLIL, i2), obj)) {
                return i2 - this.LJLILLLLZI;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.LJLJI - 1;
        int i2 = this.LJLILLLLZI;
        if (i2 <= i) {
            while (!o.LJ(ListProtector.get(this.LJLIL, i), obj)) {
                if (i != i2) {
                    i--;
                } else {
                    return -1;
                }
            }
            return i - this.LJLILLLLZI;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C36451bt(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.LJLJI;
        for (int i2 = this.LJLILLLLZI; i2 < i; i2++) {
            if (o.LJ(ListProtector.get(this.LJLIL, i2), obj)) {
                ListProtector.remove(this.LJLIL, i2);
                this.LJLJI--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        int i = this.LJLJI;
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (i != this.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        int i = this.LJLJI;
        int i2 = i - 1;
        int i3 = this.LJLILLLLZI;
        if (i3 <= i2) {
            while (true) {
                if (!elements.contains(ListProtector.get(this.LJLIL, i2))) {
                    ListProtector.remove(this.LJLIL, i2);
                    this.LJLJI--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        if (i != this.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final T remove(int i) {
        C79146V4k.LJIILJJIL(i, this);
        this.LJLJI--;
        return (T) ListProtector.remove(this.LJLIL, i + this.LJLILLLLZI);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        ListProtector.add(this.LJLIL, i + this.LJLILLLLZI, t);
        this.LJLJI++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        this.LJLIL.addAll(i + this.LJLILLLLZI, elements);
        this.LJLJI = elements.size() + this.LJLJI;
        if (elements.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        C79146V4k.LJIILJJIL(i, this);
        return (T) ListProtector.set(this.LJLIL, i + this.LJLILLLLZI, t);
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        C79146V4k.LJIILL(i, i2, this);
        return new AnonymousClass277(this, i, i2);
    }

    public AnonymousClass277(List<T> list, int i, int i2) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
