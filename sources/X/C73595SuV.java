package X;

/* renamed from: X.SuV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73595SuV<T> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public final InterfaceC73509St7<? super T> LJLIL;
    public final InterfaceC73592SuS<? super Throwable> LJLILLLLZI;
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
            if (this.LJLILLLLZI.test(th)) {
                this.LJLIL.onComplete();
            } else {
                this.LJLIL.onError(th);
            }
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

    public C73595SuV(InterfaceC73509St7<? super T> interfaceC73509St7, InterfaceC73592SuS<? super Throwable> interfaceC73592SuS) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = interfaceC73592SuS;
    }
}
