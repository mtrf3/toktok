package X;

/* renamed from: X.Ss1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73441Ss1<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC73442Ss2 LJLIL;
    public InterfaceC92693kP LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
    }

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

    public C73441Ss1(InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLIL = interfaceC73442Ss2;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLILLLLZI = interfaceC92693kP;
        this.LJLIL.onSubscribe(this);
    }
}
