package X;

/* renamed from: X.Suz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73625Suz<T> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public final InterfaceC73509St7<? super T> LJLIL;
    public final C73626Sv0<T> LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        try {
            this.LJLILLLLZI.LJLJL.run();
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
        }
        this.LJLJI.dispose();
        this.LJLJI = EnumC73418Sre.DISPOSED;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJI;
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP == enumC73418Sre) {
            return;
        }
        try {
            this.LJLILLLLZI.LJLJJL.run();
            this.LJLJI = enumC73418Sre;
            this.LJLIL.onComplete();
            try {
                this.LJLILLLLZI.LJLJJLL.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            LIZ(th2);
        }
    }

    public final void LIZ(Throwable th) {
        try {
            this.LJLILLLLZI.LJLJJI.accept(th);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            th = new C63756P0m(th, th2);
        }
        this.LJLJI = EnumC73418Sre.DISPOSED;
        this.LJLIL.onError(th);
        try {
            this.LJLILLLLZI.LJLJJLL.run();
        } catch (Throwable th3) {
            V0N.LJJIL(th3);
            C73548Stk.LIZIZ(th3);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        if (this.LJLJI == EnumC73418Sre.DISPOSED) {
            C73548Stk.LIZIZ(th);
        } else {
            LIZ(th);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            try {
                this.LJLILLLLZI.LJLILLLLZI.accept(interfaceC92693kP);
                this.LJLJI = interfaceC92693kP;
                this.LJLIL.onSubscribe(this);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                interfaceC92693kP.dispose();
                this.LJLJI = EnumC73418Sre.DISPOSED;
                EnumC73538Sta.error(th, this.LJLIL);
            }
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        InterfaceC92693kP interfaceC92693kP = this.LJLJI;
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP == enumC73418Sre) {
            return;
        }
        try {
            this.LJLILLLLZI.LJLJI.accept(t);
            this.LJLJI = enumC73418Sre;
            this.LJLIL.onSuccess(t);
            try {
                this.LJLILLLLZI.LJLJJLL.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            LIZ(th2);
        }
    }

    public C73625Suz(InterfaceC73509St7<? super T> interfaceC73509St7, C73626Sv0<T> c73626Sv0) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = c73626Sv0;
    }
}
