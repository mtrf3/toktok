package X;

/* renamed from: X.SrY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73412SrY<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final InterfaceC64592gB<? super T> LJLILLLLZI;
    public final InterfaceC64592gB<? super Throwable> LJLJI;
    public final InterfaceC29937Boz LJLJJI;
    public final InterfaceC29937Boz LJLJJL;
    public InterfaceC92693kP LJLJJLL;
    public boolean LJLJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJLL.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJLL.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJL) {
            return;
        }
        try {
            this.LJLJJI.run();
            this.LJLJL = true;
            this.LJLIL.onComplete();
            try {
                this.LJLJJL.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            onError(th2);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJL) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJL = true;
        try {
            this.LJLJI.accept(th);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            th = new C63756P0m(th, th2);
        }
        this.LJLIL.onError(th);
        try {
            this.LJLJJL.run();
        } catch (Throwable th3) {
            V0N.LJJIL(th3);
            C73548Stk.LIZIZ(th3);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJL) {
            return;
        }
        try {
            this.LJLILLLLZI.accept(t);
            this.LJLIL.onNext(t);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLJJLL.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJLL, interfaceC92693kP)) {
            this.LJLJJLL = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73412SrY(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz, InterfaceC29937Boz interfaceC29937Boz2) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC64592gB;
        this.LJLJI = interfaceC64592gB2;
        this.LJLJJI = interfaceC29937Boz;
        this.LJLJJL = interfaceC29937Boz2;
    }
}
