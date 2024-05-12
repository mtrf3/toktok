package X;

/* renamed from: X.Sty, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73562Sty<T> extends C73560Stw<T> implements InterfaceC73463SsN<T> {
    public static final long serialVersionUID = 3786543492451018833L;
    public InterfaceC92693kP LJLJI;

    @Override // X.C73560Stw, X.AbstractC73555Str, X.InterfaceC92693kP
    public final void dispose() {
        super.dispose();
        this.LJLJI.dispose();
    }

    public C73562Sty(InterfaceC116954iR<? super T> interfaceC116954iR) {
        super(interfaceC116954iR);
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        error(th);
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
        complete(t);
    }
}
