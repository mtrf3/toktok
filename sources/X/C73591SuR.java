package X;

/* renamed from: X.SuR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73591SuR<T> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public final InterfaceC73509St7<? super T> LJLIL;
    public final InterfaceC73592SuS<? super T> LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJI;
        this.LJLJI = EnumC73418Sre.DISPOSED;
        interfaceC92693kP.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        try {
            if (this.LJLILLLLZI.test(t)) {
                this.LJLIL.onSuccess(t);
            } else {
                this.LJLIL.onComplete();
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLIL.onError(th);
        }
    }

    public C73591SuR(InterfaceC73509St7<? super T> interfaceC73509St7, InterfaceC73592SuS<? super T> interfaceC73592SuS) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = interfaceC73592SuS;
    }
}
