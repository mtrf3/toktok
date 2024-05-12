package X;

/* renamed from: X.SuZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73599SuZ<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final InterfaceC73592SuS<? super T> LJLILLLLZI;
    public InterfaceC92693kP LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJI) {
            this.LJLIL.onNext(t);
            return;
        }
        try {
            if (this.LJLILLLLZI.test(t)) {
                return;
            }
            this.LJLJJI = true;
            this.LJLIL.onNext(t);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLJI.dispose();
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73599SuZ(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC73592SuS<? super T> interfaceC73592SuS) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC73592SuS;
    }
}
