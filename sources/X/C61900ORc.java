package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.ORc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61900ORc<E> implements ListIterator<E>, InterfaceC90533gv {
    public final C61899ORb<E> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLIL.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.LJLILLLLZI > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        int i = this.LJLILLLLZI;
        C61899ORb<E> c61899ORb = this.LJLIL;
        if (i < c61899ORb.length) {
            this.LJLILLLLZI = i + 1;
            this.LJLJI = i;
            return c61899ORb.array[c61899ORb.offset + i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        int i = this.LJLILLLLZI;
        if (i > 0) {
            int i2 = i - 1;
            this.LJLILLLLZI = i2;
            this.LJLJI = i2;
            C61899ORb<E> c61899ORb = this.LJLIL;
            return c61899ORb.array[c61899ORb.offset + i2];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLILLLLZI - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.LJLJI;
        if (i != -1) {
            this.LJLIL.remove(i);
            this.LJLILLLLZI = this.LJLJI;
            this.LJLJI = -1;
            return;
        }
        "Call next() or previous() before removing element from the iterator.".toString();
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLILLLLZI;
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        C61899ORb<E> c61899ORb = this.LJLIL;
        int i = this.LJLILLLLZI;
        this.LJLILLLLZI = i + 1;
        c61899ORb.add(i, e);
        this.LJLJI = -1;
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        int i = this.LJLJI;
        if (i != -1) {
            this.LJLIL.set(i, e);
        } else {
            "Call next() or previous() before replacing element from the iterator.".toString();
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    public C61900ORc(C61899ORb<E> list, int i) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = -1;
    }
}
