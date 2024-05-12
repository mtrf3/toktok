package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35981b8 implements Iterator<Object>, InterfaceC90533gv {
    public final C35871ax LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public final int LJLJJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLJI < this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C35871ax c35871ax = this.LJLIL;
        if (c35871ax.LJLJL == this.LJLJJI) {
            int i = this.LJLJI;
            this.LJLJI = C78847Ux1.LIZLLL(i, c35871ax.LJLIL) + i;
            return new C35891az(i, this.LJLJJI, this.LJLIL);
        }
        throw new ConcurrentModificationException();
    }

    public C35981b8(int i, int i2, C35871ax table) {
        o.LJIIIZ(table, "table");
        this.LJLIL = table;
        this.LJLILLLLZI = i2;
        this.LJLJI = i;
        this.LJLJJI = table.LJLJL;
        if (!table.LJLJJLL) {
        } else {
            throw new ConcurrentModificationException();
        }
    }
}
