package X;

/* renamed from: X.Sv2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73628Sv2<T, R> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public final InterfaceC73509St7<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends R> LJLILLLLZI;
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
            R apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The mapper returned a null item");
            this.LJLIL.onSuccess(apply);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLIL.onError(th);
        }
    }

    public C73628Sv2(InterfaceC73509St7<? super R> interfaceC73509St7, InterfaceC48038ItG<? super T, ? extends R> interfaceC48038ItG) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
