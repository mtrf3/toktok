package X;

/* renamed from: X.Ssf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73481Ssf<T> implements InterfaceC73463SsN<T>, InterfaceC92693kP {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final InterfaceC64592gB<? super T> LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
        try {
            this.LJLILLLLZI.accept(t);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
        }
    }

    public C73481Ssf(InterfaceC73463SsN<? super T> interfaceC73463SsN, InterfaceC64592gB<? super T> interfaceC64592gB) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = interfaceC64592gB;
    }
}
