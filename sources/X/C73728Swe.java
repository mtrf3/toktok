package X;

/* renamed from: X.Swe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73728Swe<T> implements InterfaceC116954iR<T>, InterfaceC73651SvP {
    public final InterfaceC73740Swq<? super T> LJLIL;
    public InterfaceC92693kP LJLILLLLZI;

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
    }

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    public C73728Swe(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLILLLLZI = interfaceC92693kP;
        this.LJLIL.onSubscribe(this);
    }
}
