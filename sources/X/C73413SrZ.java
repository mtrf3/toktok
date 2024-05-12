package X;

/* renamed from: X.SrZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73413SrZ<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public InterfaceC92693kP LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    public C73413SrZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
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
        if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
            this.LJLILLLLZI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }
}
