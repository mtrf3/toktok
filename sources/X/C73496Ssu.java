package X;

/* renamed from: X.Ssu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73496Ssu<T> implements InterfaceC73463SsN<T>, InterfaceC92693kP {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public InterfaceC92693kP LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    public C73496Ssu(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLIL = interfaceC73463SsN;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
            this.LJLILLLLZI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
    }
}
