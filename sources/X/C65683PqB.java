package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.PqB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65683PqB<E> extends AbstractC65557Po9<E> {
    public int LJLIL;
    public E LJLILLLLZI;
    public final /* synthetic */ Iterator LJLJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL > 0 || this.LJLJI.hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final E next() {
        if (this.LJLIL <= 0) {
            InterfaceC65712Pqe interfaceC65712Pqe = (InterfaceC65712Pqe) this.LJLJI.next();
            this.LJLILLLLZI = (E) interfaceC65712Pqe.LIZLLL();
            this.LJLIL = interfaceC65712Pqe.getCount();
        }
        this.LJLIL--;
        return this.LJLILLLLZI;
    }

    public C65683PqB(AbstractC65557Po9 abstractC65557Po9) {
        this.LJLJI = abstractC65557Po9;
    }
}
