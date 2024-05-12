package X;

import defpackage.g0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Ppe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65650Ppe<E> implements Iterator<E> {
    public final InterfaceC65672Pq0<E> LJLIL;
    public final Iterator<InterfaceC65712Pqe<E>> LJLILLLLZI;
    public InterfaceC65712Pqe<E> LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLJJI > 0 || this.LJLILLLLZI.hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        g0.LJIIJ(this.LJLJJLL);
        if (this.LJLJJL == 1) {
            this.LJLILLLLZI.remove();
        } else {
            this.LJLIL.remove(this.LJLJI.LIZLLL());
        }
        this.LJLJJL--;
        this.LJLJJLL = false;
    }

    @Override // java.util.Iterator
    public final E next() {
        if (hasNext()) {
            if (this.LJLJJI == 0) {
                InterfaceC65712Pqe<E> next = this.LJLILLLLZI.next();
                this.LJLJI = next;
                int count = next.getCount();
                this.LJLJJI = count;
                this.LJLJJL = count;
            }
            this.LJLJJI--;
            this.LJLJJLL = true;
            return this.LJLJI.LIZLLL();
        }
        throw new NoSuchElementException();
    }

    public C65650Ppe(InterfaceC65672Pq0<E> interfaceC65672Pq0, Iterator<InterfaceC65712Pqe<E>> it) {
        this.LJLIL = interfaceC65672Pq0;
        this.LJLILLLLZI = it;
    }
}
