package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1IF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IF<T> implements ListIterator<T>, InterfaceC90533gv {
    public final C48211ur<T> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public final void LIZ() {
        if (this.LJLIL.LIZJ() == this.LJLJI) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLIL.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.LJLILLLLZI >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLILLLLZI + 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        LIZ();
        int i = this.LJLILLLLZI + 1;
        C0OG.LIZ(i, this.LJLIL.size());
        T t = this.LJLIL.get(i);
        this.LJLILLLLZI = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        LIZ();
        C0OG.LIZ(this.LJLILLLLZI, this.LJLIL.size());
        this.LJLILLLLZI--;
        return this.LJLIL.get(this.LJLILLLLZI);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        LIZ();
        this.LJLIL.remove(this.LJLILLLLZI);
        this.LJLILLLLZI--;
        this.LJLJI = this.LJLIL.LIZJ();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLILLLLZI;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        LIZ();
        this.LJLIL.add(this.LJLILLLLZI + 1, t);
        this.LJLILLLLZI++;
        this.LJLJI = this.LJLIL.LIZJ();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        LIZ();
        this.LJLIL.set(this.LJLILLLLZI, t);
        this.LJLJI = this.LJLIL.LIZJ();
    }

    public C1IF(C48211ur<T> list, int i) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = i - 1;
        this.LJLJI = list.LIZJ();
    }
}
