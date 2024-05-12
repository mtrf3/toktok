package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0M7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M7<T> implements Iterator<T> {
    public final int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public final /* synthetic */ C0M9 LJLJJL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLJI < this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.LJLJJI) {
            int i = this.LJLJI - 1;
            this.LJLJI = i;
            this.LJLILLLLZI--;
            this.LJLJJI = false;
            this.LJLJJL.LJII(i);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T t = (T) this.LJLJJL.LIZIZ(this.LJLJI, this.LJLIL);
            this.LJLJI++;
            this.LJLJJI = true;
            return t;
        }
        throw new NoSuchElementException();
    }

    public C0M7(C0M9 c0m9, int i) {
        this.LJLJJL = c0m9;
        this.LJLIL = i;
        this.LJLILLLLZI = c0m9.LIZLLL();
    }
}
