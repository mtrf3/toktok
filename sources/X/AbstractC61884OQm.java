package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.OQm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61884OQm<E> extends OQZ<E> implements List<E> {
    public static final /* synthetic */ int LJLIL = 0;

    /* renamed from: X.OQm$b */
    /* loaded from: classes11.dex */
    public class b implements Iterator<E>, InterfaceC90533gv {
        public int LJLIL;

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.LJLIL < AbstractC61884OQm.this.LIZJ()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (hasNext()) {
                AbstractC61884OQm<E> abstractC61884OQm = AbstractC61884OQm.this;
                int i = this.LJLIL;
                this.LJLIL = i + 1;
                return abstractC61884OQm.get(i);
            }
            throw new NoSuchElementException();
        }

        public b() {
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public ListIterator<E> listIterator() {
        return new C61885OQn(this, 0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        Iterator<E> it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            E next = it.next();
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        o.LJIIIZ(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!o.LJ(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public int indexOf(E e) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(it.next(), e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (o.LJ(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator(int i) {
        return new C61885OQn(this, i);
    }

    public List<E> subList(int i, int i2) {
        return new C61883OQl(this, i, i2);
    }
}
