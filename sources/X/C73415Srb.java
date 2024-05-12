package X;

/* renamed from: X.Srb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73415Srb<T, R> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends Iterable<? extends R>> LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
        this.LJLJI = EnumC73418Sre.DISPOSED;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJI;
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP == enumC73418Sre) {
            return;
        }
        this.LJLJI = enumC73418Sre;
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        InterfaceC92693kP interfaceC92693kP = this.LJLJI;
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP == enumC73418Sre) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJI = enumC73418Sre;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJI == EnumC73418Sre.DISPOSED) {
            return;
        }
        try {
            InterfaceC116954iR<? super R> interfaceC116954iR = this.LJLIL;
            for (R r : this.LJLILLLLZI.apply(t)) {
                try {
                    try {
                        C73320Sq4.LIZ(r, "The iterator returned a null value");
                        interfaceC116954iR.onNext(r);
                    } catch (Throwable th) {
                        V0N.LJJIL(th);
                        this.LJLJI.dispose();
                        onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    V0N.LJJIL(th2);
                    this.LJLJI.dispose();
                    onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            V0N.LJJIL(th3);
            this.LJLJI.dispose();
            onError(th3);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73415Srb(InterfaceC116954iR<? super R> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends Iterable<? extends R>> interfaceC48038ItG) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
