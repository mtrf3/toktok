package X;

/* renamed from: X.Syz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73873Syz<T, U> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC73463SsN<? super U> LJLIL;
    public final InterfaceC73459SsJ<? super U, ? super T> LJLILLLLZI;
    public final U LJLJI;
    public InterfaceC92693kP LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        this.LJLIL.onSuccess(this.LJLJI);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJL) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJJL = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJL) {
            return;
        }
        try {
            this.LJLILLLLZI.accept(this.LJLJI, t);
        } catch (Throwable th) {
            this.LJLJJI.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJI, interfaceC92693kP)) {
            this.LJLJJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73873Syz(InterfaceC73463SsN<? super U> interfaceC73463SsN, U u, InterfaceC73459SsJ<? super U, ? super T> interfaceC73459SsJ) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = interfaceC73459SsJ;
        this.LJLJI = u;
    }
}
