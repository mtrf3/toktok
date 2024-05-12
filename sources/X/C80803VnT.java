package X;

/* renamed from: X.VnT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80803VnT implements InterfaceC116954iR<Long> {
    public InterfaceC92693kP LJLIL;
    public int LJLILLLLZI = 2;
    public final /* synthetic */ C80797VnN LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
    }

    public C80803VnT(C80797VnN c80797VnN) {
        this.LJLJI = c80797VnN;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Long l) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scroll ");
        LIZ.append(this.LJLJI.LJLLI.getCurrY() - this.LJLJI.getScrollY());
        C0NB.LJ("slide_log", X1D.LIZIZ(LIZ));
        if (this.LJLJI.LJLLI.getCurrY() == this.LJLJI.getScrollY()) {
            this.LJLILLLLZI--;
            InterfaceC92693kP interfaceC92693kP = this.LJLIL;
            if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed() && this.LJLILLLLZI <= 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("dispose ");
                LIZ2.append(this.LJLJI.LJLLI.getCurrY());
                C0NB.LJ("slide_log", X1D.LIZIZ(LIZ2));
                this.LJLIL.dispose();
                return;
            }
            return;
        }
        C80797VnN c80797VnN = this.LJLJI;
        c80797VnN.scrollTo(c80797VnN.LJLLI.getCurrX(), this.LJLJI.LJLLI.getCurrY());
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL = interfaceC92693kP;
    }
}
