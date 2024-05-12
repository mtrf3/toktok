package X;

/* renamed from: X.SrO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73402SrO<T> implements InterfaceC92693kP, InterfaceC36621EYv<T> {
    public final InterfaceC37276Ek4<?> LJLIL;
    public final InterfaceC116954iR<? super C64797Pbt<T>> LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLIL.cancel();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLIL.isCanceled();
    }

    public C73402SrO(InterfaceC37276Ek4<?> interfaceC37276Ek4, InterfaceC116954iR<? super C64797Pbt<T>> interfaceC116954iR) {
        this.LJLIL = interfaceC37276Ek4;
        this.LJLILLLLZI = interfaceC116954iR;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<T> interfaceC37276Ek4, Throwable th) {
        if (interfaceC37276Ek4.isCanceled()) {
            return;
        }
        try {
            this.LJLILLLLZI.onError(th);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            C73548Stk.LIZIZ(new C63756P0m(th, th2));
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<T> interfaceC37276Ek4, C64797Pbt<T> c64797Pbt) {
        if (interfaceC37276Ek4.isCanceled()) {
            return;
        }
        try {
            this.LJLILLLLZI.onNext(c64797Pbt);
            if (!interfaceC37276Ek4.isCanceled()) {
                this.LJLJI = true;
                this.LJLILLLLZI.onComplete();
            }
        } catch (Throwable th) {
            if (this.LJLJI) {
                C73548Stk.LIZIZ(th);
                return;
            }
            if (interfaceC37276Ek4.isCanceled()) {
                return;
            }
            try {
                this.LJLILLLLZI.onError(th);
            } catch (Throwable th2) {
                V0N.LJJIL(th2);
                C73548Stk.LIZIZ(new C63756P0m(th, th2));
            }
        }
    }
}
