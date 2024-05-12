package X;

import java.util.concurrent.Callable;

/* renamed from: X.SvV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73657SvV extends AbstractC73547Stj {
    public final Callable<?> LJLIL;

    public C73657SvV(Callable<?> callable) {
        this.LJLIL = callable;
    }

    @Override // X.AbstractC73547Stj
    public final void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2) {
        C73660SvY c73660SvY = new C73660SvY(C73674Svm.LIZIZ);
        interfaceC73442Ss2.onSubscribe(c73660SvY);
        try {
            this.LJLIL.call();
            if (!c73660SvY.isDisposed()) {
                interfaceC73442Ss2.onComplete();
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            if (!c73660SvY.isDisposed()) {
                interfaceC73442Ss2.onError(th);
            } else {
                C73548Stk.LIZIZ(th);
            }
        }
    }
}
