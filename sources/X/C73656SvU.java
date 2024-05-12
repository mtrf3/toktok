package X;

import java.util.concurrent.Callable;

/* renamed from: X.SvU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73656SvU<T> extends AbstractC73638SvC<T> {
    public final Callable<? extends T> LJLIL;

    public C73656SvU(Callable<? extends T> callable) {
        this.LJLIL = callable;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        C73660SvY c73660SvY = new C73660SvY(C73674Svm.LIZIZ);
        interfaceC73463SsN.onSubscribe(c73660SvY);
        if (c73660SvY.isDisposed()) {
            return;
        }
        try {
            T call = this.LJLIL.call();
            C73320Sq4.LIZ(call, "The callable returned a null value");
            if (!c73660SvY.isDisposed()) {
                interfaceC73463SsN.onSuccess(call);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            if (!c73660SvY.isDisposed()) {
                interfaceC73463SsN.onError(th);
            } else {
                C73548Stk.LIZIZ(th);
            }
        }
    }
}
