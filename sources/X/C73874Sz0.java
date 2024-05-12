package X;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.Sz0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73874Sz0<T, U> extends AbstractC73638SvC<U> implements L7V<U> {
    public final InterfaceC115714gR<T> LJLIL;
    public final Callable<? extends U> LJLILLLLZI;
    public final InterfaceC73459SsJ<? super U, ? super T> LJLJI;

    @Override // X.L7V
    public final AbstractC73672Svk<U> LIZIZ() {
        return new C73875Sz1(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    public C73874Sz0(AbstractC73672Svk abstractC73672Svk) {
        Callable<? extends U> callable = new Callable() { // from class: X.6uV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ArrayList();
            }
        };
        C79081V1x c79081V1x = C79081V1x.LJLJJI;
        this.LJLIL = abstractC73672Svk;
        this.LJLILLLLZI = callable;
        this.LJLJI = c79081V1x;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super U> interfaceC73463SsN) {
        try {
            U call = this.LJLILLLLZI.call();
            C73320Sq4.LIZ(call, "The initialSupplier returned a null value");
            this.LJLIL.LIZ(new C73873Syz(interfaceC73463SsN, call, this.LJLJI));
        } catch (Throwable th) {
            EnumC73538Sta.error(th, interfaceC73463SsN);
        }
    }
}
