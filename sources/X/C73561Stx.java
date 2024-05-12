package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Stx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73561Stx<T> extends AbstractC73672Svk<T> {
    public final Future<? extends T> LJLIL;
    public final long LJLILLLLZI = 0;
    public final TimeUnit LJLJI = null;

    public C73561Stx(C76L c76l) {
        this.LJLIL = c76l;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        T t;
        C73560Stw c73560Stw = new C73560Stw(interfaceC116954iR);
        interfaceC116954iR.onSubscribe(c73560Stw);
        if (!c73560Stw.isDisposed()) {
            try {
                TimeUnit timeUnit = this.LJLJI;
                if (timeUnit != null) {
                    t = this.LJLIL.get(this.LJLILLLLZI, timeUnit);
                } else {
                    t = this.LJLIL.get();
                }
                C73320Sq4.LIZ(t, "Future returned null");
                c73560Stw.complete(t);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                if (!c73560Stw.isDisposed()) {
                    interfaceC116954iR.onError(th);
                }
            }
        }
    }
}
