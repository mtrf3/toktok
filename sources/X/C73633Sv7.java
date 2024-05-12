package X;

/* renamed from: X.Sv7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73633Sv7<T, R> implements InterfaceC73463SsN<T> {
    public final InterfaceC73463SsN<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends R> LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.onSubscribe(interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        try {
            R apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The mapper function returned a null value.");
            this.LJLIL.onSuccess(apply);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            onError(th);
        }
    }

    public C73633Sv7(InterfaceC73463SsN<? super R> interfaceC73463SsN, InterfaceC48038ItG<? super T, ? extends R> interfaceC48038ItG) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
