package X;

/* renamed from: X.Src, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73416Src<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final InterfaceC64592gB<? super InterfaceC92693kP> LJLILLLLZI;
    public final InterfaceC29937Boz LJLJI;
    public InterfaceC92693kP LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJJI;
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP != enumC73418Sre) {
            this.LJLJJI = enumC73418Sre;
            try {
                this.LJLJI.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJJI;
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP != enumC73418Sre) {
            this.LJLJJI = enumC73418Sre;
            this.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        InterfaceC92693kP interfaceC92693kP = this.LJLJJI;
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP != enumC73418Sre) {
            this.LJLJJI = enumC73418Sre;
            this.LJLIL.onError(th);
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        try {
            this.LJLILLLLZI.accept(interfaceC92693kP);
            if (EnumC73418Sre.validate(this.LJLJJI, interfaceC92693kP)) {
                this.LJLJJI = interfaceC92693kP;
                this.LJLIL.onSubscribe(this);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            interfaceC92693kP.dispose();
            this.LJLJJI = EnumC73418Sre.DISPOSED;
            EnumC73538Sta.error(th, this.LJLIL);
        }
    }

    public C73416Src(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC64592gB<? super InterfaceC92693kP> interfaceC64592gB, InterfaceC29937Boz interfaceC29937Boz) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC64592gB;
        this.LJLJI = interfaceC29937Boz;
    }
}
