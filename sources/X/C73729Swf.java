package X;

/* renamed from: X.Swf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73729Swf<T> extends C73733Swj<T> implements InterfaceC73509St7<T> {
    public static final long serialVersionUID = 7603343402964826922L;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.C73733Swj, X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void cancel() {
        super.cancel();
        this.LJLJI.dispose();
    }

    public C73729Swf(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        super(interfaceC73740Swq);
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
        complete(t);
    }
}
