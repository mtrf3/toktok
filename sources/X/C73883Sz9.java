package X;

/* JADX INFO: Add missing generic type declarations: [U] */
/* renamed from: X.Sz9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73883Sz9<U> implements InterfaceC116954iR<U> {
    public final C73879Sz5<T, U, R> LJLIL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    public C73883Sz9(C73879Sz5 c73879Sz5) {
        this.LJLIL = c73879Sz5;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        C73879Sz5<T, U, R> c73879Sz5 = this.LJLIL;
        EnumC73418Sre.dispose(c73879Sz5.LJLJI);
        c73879Sz5.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(U u) {
        this.LJLIL.lazySet(u);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLIL.LJLJJI, interfaceC92693kP);
    }
}
