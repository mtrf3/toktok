package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Ef9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36971Ef9<T> implements Iterator<T>, InterfaceC90533gv {
    public final Iterator<T> LJLIL;
    public int LJLILLLLZI = -1;
    public T LJLJI;
    public final /* synthetic */ C36972EfA<T> LJLJJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void LIZ() {
        if (this.LJLIL.hasNext()) {
            T next = this.LJLIL.next();
            if (this.LJLJJI.LIZIZ.invoke(next).booleanValue()) {
                this.LJLILLLLZI = 1;
                this.LJLJI = next;
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

    public C36971Ef9(C36972EfA<T> c36972EfA) {
        this.LJLJJI = c36972EfA;
        this.LJLIL = c36972EfA.LIZ.iterator();
    }
}
