package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes16.dex */
public class XKN<E> extends XKZ<C76800UCe> implements InterfaceC78936UyS<E> {
    public final InterfaceC78936UyS<E> LJLJI;

    @Override // X.C3T4
    public final boolean LJII() {
        return this.LJLJI.LJII();
    }

    @Override // X.XKM
    public final Object LJIIIIZZ(InterfaceC67352kd<? super E> interfaceC67352kd) {
        return this.LJLJI.LJIIIIZZ(interfaceC67352kd);
    }

    @Override // X.C3T4
    public final Object LJIIIZ(E e, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return this.LJLJI.LJIIIZ(e, interfaceC67352kd);
    }

    @Override // X.C3T4
    public final Object LJIILLIIL(E e) {
        return this.LJLJI.LJIILLIIL(e);
    }

    @Override // X.XKM
    public final C3CD<C79973Bx<E>> LJIIZILJ() {
        return this.LJLJI.LJIIZILJ();
    }

    @Override // X.XKM
    public final Object LJIJJLI() {
        return this.LJLJI.LJIJJLI();
    }

    @Override // X.C3T4
    public final void LJIL(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        this.LJLJI.LJIL(interfaceC88472Yns);
    }

    @Override // X.C3T4
    public final boolean LJJIFFI(Throwable th) {
        return this.LJLJI.LJJIFFI(th);
    }

    @Override // X.XKM
    public final InterfaceC169716lL<E> iterator() {
        return this.LJLJI.iterator();
    }

    @Override // kotlinx.coroutines.JobSupport, X.InterfaceC79150V4o
    public final void LIZIZ(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C37308Eka(LJJJ(), null, this);
        }
        LJJIJL(cancellationException);
    }

    @Override // X.XKM
    public final Object LJIILJJIL(InterfaceC67352kd<? super C79973Bx<? extends E>> interfaceC67352kd) {
        return this.LJLJI.LJIILJJIL(interfaceC67352kd);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void LJJIJL(Throwable th) {
        CancellationException cancellationException = (CancellationException) th;
        this.LJLJI.LIZIZ(cancellationException);
        LJJIJIIJI(cancellationException);
    }

    public XKN(MBA mba, XK4 xk4) {
        super(mba, true);
        this.LJLJI = xk4;
    }
}
