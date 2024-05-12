package X;

/* renamed from: X.SvS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73654SvS<T> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public final InterfaceC73442Ss2 LJLIL;
    public InterfaceC92693kP LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.dispose();
        this.LJLILLLLZI = EnumC73418Sre.DISPOSED;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLILLLLZI = EnumC73418Sre.DISPOSED;
        this.LJLIL.onComplete();
    }

    public C73654SvS(InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLIL = interfaceC73442Ss2;
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLILLLLZI = EnumC73418Sre.DISPOSED;
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
            this.LJLILLLLZI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        this.LJLILLLLZI = EnumC73418Sre.DISPOSED;
        this.LJLIL.onComplete();
    }
}
