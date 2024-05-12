package X;

import java.util.Iterator;

/* renamed from: X.Sw5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73693Sw5<T> extends AbstractC73672Svk<T> {
    public final Iterable<? extends T> LJLIL;

    public C73693Sw5(Iterable<? extends T> iterable) {
        this.LJLIL = iterable;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        try {
            Iterator<? extends T> it = this.LJLIL.iterator();
            try {
                if (!it.hasNext()) {
                    EnumC73538Sta.complete(interfaceC116954iR);
                    return;
                }
                C73694Sw6 c73694Sw6 = new C73694Sw6(interfaceC116954iR, it);
                interfaceC116954iR.onSubscribe(c73694Sw6);
                if (c73694Sw6.LJLJJI) {
                    return;
                }
                while (!c73694Sw6.LJLJI) {
                    try {
                        T next = c73694Sw6.LJLILLLLZI.next();
                        C73320Sq4.LIZ(next, "The iterator returned a null value");
                        c73694Sw6.LJLIL.onNext(next);
                        if (c73694Sw6.LJLJI) {
                            return;
                        }
                        try {
                            if (!c73694Sw6.LJLILLLLZI.hasNext()) {
                                if (c73694Sw6.LJLJI) {
                                    return;
                                }
                                c73694Sw6.LJLIL.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            V0N.LJJIL(th);
                            c73694Sw6.LJLIL.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        V0N.LJJIL(th2);
                        c73694Sw6.LJLIL.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                V0N.LJJIL(th3);
                EnumC73538Sta.error(th3, interfaceC116954iR);
            }
        } catch (Throwable th4) {
            V0N.LJJIL(th4);
            EnumC73538Sta.error(th4, interfaceC116954iR);
        }
    }
}
