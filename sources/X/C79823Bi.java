package X;

import java.util.Iterator;

/* renamed from: X.3Bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79823Bi<T> extends AbstractC79813Bh<T> {
    public final Iterable<InterfaceC65462ha<T>> LJLIL;

    @Override // X.AbstractC79813Bh
    public final XKM<T> produceImpl(InterfaceC70422pa interfaceC70422pa) {
        MBA mba = this.context;
        int i = this.capacity;
        InterfaceC88471Ynr<C3CK<? super T>, InterfaceC67352kd<? super C76800UCe>, Object> collectToFun$kotlinx_coroutines_core = getCollectToFun$kotlinx_coroutines_core();
        final XK4 LIZJ = C78934UyQ.LIZJ(i, null, 6);
        final MBA LIZ = C84648XKa.LIZ(interfaceC70422pa, mba);
        XKO<T> xko = new XKO<T>(LIZ, LIZJ) { // from class: X.3Bj
            @Override // kotlinx.coroutines.JobSupport
            public final boolean LJJJJI(Throwable th) {
                if (th instanceof C3C2) {
                    return true;
                }
                return LJJIJIIJI(th);
            }
        };
        XKY.ATOMIC.invoke(collectToFun$kotlinx_coroutines_core, xko, xko);
        return xko;
    }

    @Override // X.AbstractC79813Bh
    public final Object collectTo(C3CK<? super T> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C79873Bn c79873Bn = new C79873Bn(c3ck);
        Iterator<InterfaceC65462ha<T>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            XKX.LIZLLL(c3ck, null, null, new C69222ne(it.next(), c79873Bn, null), 3);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC79813Bh
    public final AbstractC79813Bh<T> create(MBA mba, int i, XKI xki) {
        return new C79823Bi(this.LJLIL, mba, i, xki);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C79823Bi(Iterable<? extends InterfaceC65462ha<? extends T>> iterable, MBA mba, int i, XKI xki) {
        super(mba, i, xki);
        this.LJLIL = iterable;
    }
}
