package X;

/* renamed from: X.Sy2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73814Sy2<T> implements InterfaceC73812Sy0<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public InterfaceC73651SvP LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.cancel();
        this.LJLILLLLZI = EnumC73755Sx5.CANCELLED;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLILLLLZI == EnumC73755Sx5.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    public C73814Sy2(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLILLLLZI, interfaceC73651SvP)) {
            this.LJLILLLLZI = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }
}
