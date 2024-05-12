package X;

import java.util.concurrent.Callable;

/* renamed from: X.SvT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC73655SvT<T> extends AbstractC73635Sv9<T> implements Callable<T> {
    public final Callable<? extends T> LJLIL;

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.LJLIL.call();
    }

    public CallableC73655SvT(Callable<? extends T> callable) {
        this.LJLIL = callable;
    }

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7) {
        C73660SvY c73660SvY = new C73660SvY(C73674Svm.LIZIZ);
        interfaceC73509St7.onSubscribe(c73660SvY);
        if (!c73660SvY.isDisposed()) {
            try {
                T call = this.LJLIL.call();
                if (!c73660SvY.isDisposed()) {
                    if (call == null) {
                        interfaceC73509St7.onComplete();
                    } else {
                        interfaceC73509St7.onSuccess(call);
                    }
                }
            } catch (Throwable th) {
                V0N.LJJIL(th);
                if (!c73660SvY.isDisposed()) {
                    interfaceC73509St7.onError(th);
                } else {
                    C73548Stk.LIZIZ(th);
                }
            }
        }
    }
}
