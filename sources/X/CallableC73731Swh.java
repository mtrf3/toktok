package X;

import java.util.concurrent.Callable;

/* renamed from: X.Swh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC73731Swh<T> extends AbstractC73745Swv<T> implements Callable<T> {
    public final Callable<? extends T> LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final T call() {
        T call = this.LJLILLLLZI.call();
        C73320Sq4.LIZ(call, "The callable returned a null value");
        return call;
    }

    public CallableC73731Swh(Callable<? extends T> callable) {
        this.LJLILLLLZI = callable;
    }

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        C73733Swj c73733Swj = new C73733Swj(interfaceC73740Swq);
        interfaceC73740Swq.onSubscribe(c73733Swj);
        try {
            T call = this.LJLILLLLZI.call();
            C73320Sq4.LIZ(call, "The callable returned a null value");
            c73733Swj.complete(call);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            if (c73733Swj.isCancelled()) {
                C73548Stk.LIZIZ(th);
            } else {
                interfaceC73740Swq.onError(th);
            }
        }
    }
}
