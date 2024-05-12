package X;

/* renamed from: X.Csq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32724Csq extends V1B {
    public final /* synthetic */ C73893SzJ<C76800UCe> LJLJJL;
    public final /* synthetic */ C32597Cqn LJLJJLL;
    public final /* synthetic */ AbstractC32698CsQ<? extends C30896CAq> LJLJL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        C0NB.LIZ("onLoadStarted");
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        C0NB.LIZ("onLoadFailed");
        InterfaceC32725Csr interfaceC32725Csr = this.LJLJJLL.LJZI;
        if (interfaceC32725Csr != null) {
            interfaceC32725Csr.LIZLLL(this.LJLJL);
        }
    }

    public C32724Csq(C73893SzJ<C76800UCe> c73893SzJ, C32597Cqn c32597Cqn, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        this.LJLJJL = c73893SzJ;
        this.LJLJJLL = c32597Cqn;
        this.LJLJL = abstractC32698CsQ;
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        C0NB.LIZ("onLoadSuccess");
        this.LJLJJL.onNext(C76800UCe.LIZ);
        InterfaceC32725Csr interfaceC32725Csr = this.LJLJJLL.LJZI;
        if (interfaceC32725Csr != null) {
            interfaceC32725Csr.LJII(this.LJLJL);
        }
    }
}
