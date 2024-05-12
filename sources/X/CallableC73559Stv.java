package X;

import java.util.concurrent.Callable;

/* renamed from: X.Stv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC73559Stv<T> extends AbstractC73672Svk<T> implements Callable<T> {
    public final Callable<? extends T> LJLIL;

    @Override // java.util.concurrent.Callable
    public final T call() {
        T call = this.LJLIL.call();
        C73320Sq4.LIZ(call, "The callable returned a null value");
        return call;
    }

    public CallableC73559Stv(Callable<? extends T> callable) {
        this.LJLIL = callable;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73560Stw c73560Stw = new C73560Stw(interfaceC116954iR);
        interfaceC116954iR.onSubscribe(c73560Stw);
        if (c73560Stw.isDisposed()) {
            return;
        }
        try {
            T call = this.LJLIL.call();
            C73320Sq4.LIZ(call, "Callable returned null");
            c73560Stw.complete(call);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            if (!c73560Stw.isDisposed()) {
                interfaceC116954iR.onError(th);
            } else {
                C73548Stk.LIZIZ(th);
            }
        }
    }
}
