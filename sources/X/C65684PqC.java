package X;

import defpackage.g0;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.PqC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65684PqC<E> extends AbstractC65685PqD<InterfaceC65712Pqe<E>> {
    public InterfaceC65712Pqe<E> LJLIL;
    public final /* synthetic */ Iterator LJLILLLLZI;
    public final /* synthetic */ C65649Ppd LJLJI;

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.LJLIL != null) {
            z = true;
        } else {
            z = false;
        }
        g0.LJIIJ(z);
        this.LJLJI.setCount(this.LJLIL.LIZLLL(), 0);
        this.LJLIL = null;
    }

    @Override // X.AbstractC65685PqD, java.util.Iterator
    public final Object next() {
        InterfaceC65712Pqe<E> interfaceC65712Pqe = (InterfaceC65712Pqe) super.next();
        this.LJLIL = interfaceC65712Pqe;
        return interfaceC65712Pqe;
    }

    @Override // X.AbstractC65561PoD
    public final Object LJII() {
        return this.LJLILLLLZI;
    }

    public C65684PqC(C65649Ppd c65649Ppd, C65556Po8 c65556Po8) {
        this.LJLJI = c65649Ppd;
        this.LJLILLLLZI = c65556Po8;
    }
}
