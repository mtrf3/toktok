package X;

/* renamed from: X.SsX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73473SsX<T> implements InterfaceC73463SsN<T> {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final InterfaceC64592gB<? super InterfaceC92693kP> LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        if (this.LJLJI) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        try {
            this.LJLILLLLZI.accept(interfaceC92693kP);
            this.LJLIL.onSubscribe(interfaceC92693kP);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLJI = true;
            interfaceC92693kP.dispose();
            EnumC73538Sta.error(th, this.LJLIL);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        if (this.LJLJI) {
            return;
        }
        this.LJLIL.onSuccess(t);
    }

    public C73473SsX(InterfaceC73463SsN<? super T> interfaceC73463SsN, InterfaceC64592gB<? super InterfaceC92693kP> interfaceC64592gB) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = interfaceC64592gB;
    }
}
