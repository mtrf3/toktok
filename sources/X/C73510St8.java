package X;

/* renamed from: X.St8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73510St8<T> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public final InterfaceC73509St7<? super T> LJLIL;
    public final InterfaceC48038ItG<? super Throwable, ? extends T> LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
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
        try {
            T apply = this.LJLILLLLZI.apply(th);
            C73320Sq4.LIZ(apply, "The valueSupplier returned a null value");
            this.LJLIL.onSuccess(apply);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLIL.onError(new C63756P0m(th, th2));
        }
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
        this.LJLIL.onSuccess(t);
    }

    public C73510St8(InterfaceC73509St7<? super T> interfaceC73509St7, InterfaceC48038ItG<? super Throwable, ? extends T> interfaceC48038ItG) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
