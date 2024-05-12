package X;

/* renamed from: X.Srd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73417Srd<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public long LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        long j = this.LJLILLLLZI;
        if (j != 0) {
            this.LJLILLLLZI = j - 1;
        } else {
            this.LJLIL.onNext(t);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73417Srd(InterfaceC116954iR<? super T> interfaceC116954iR, long j) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = j;
    }
}
