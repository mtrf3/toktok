package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.4g8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115524g8<T> implements Iterator<T>, InterfaceC90533gv {
    public final Iterator<T> LJLIL;
    public int LJLILLLLZI = -1;
    public T LJLJI;
    public final /* synthetic */ C115534g9<T> LJLJJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void LIZ() {
        while (this.LJLIL.hasNext()) {
            T next = this.LJLIL.next();
            if (this.LJLJJI.LIZJ.invoke(next).booleanValue() == this.LJLJJI.LIZIZ) {
                this.LJLJI = next;
                this.LJLILLLLZI = 1;
                return;
            }
        }
        this.LJLILLLLZI = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI == -1) {
            LIZ();
        }
        if (this.LJLILLLLZI == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.LJLILLLLZI == -1) {
            LIZ();
        }
        if (this.LJLILLLLZI != 0) {
            T t = this.LJLJI;
            this.LJLJI = null;
            this.LJLILLLLZI = -1;
            return t;
        }
        throw new NoSuchElementException();
    }

    public C115524g8(C115534g9<T> c115534g9) {
        this.LJLJJI = c115534g9;
        this.LJLIL = c115534g9.LIZ.iterator();
    }
}
