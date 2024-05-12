package X;

/* renamed from: X.Swi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73732Swi<T> extends C73733Swj<T> implements InterfaceC73463SsN<T> {
    public static final long serialVersionUID = 187782011903685568L;
    public InterfaceC92693kP LJLJI;

    @Override // X.C73733Swj, X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void cancel() {
        super.cancel();
        this.LJLJI.dispose();
    }

    public C73732Swi(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        super(interfaceC73740Swq);
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
        complete(t);
    }
}
