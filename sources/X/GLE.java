package X;

/* loaded from: classes8.dex */
public final class GLE implements InterfaceC47084Ids {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.InterfaceC47084Ids
    public final /* synthetic */ void LJIIJ(long j, long j2) {
    }

    @Override // X.InterfaceC47084Ids
    public final void LJIILJJIL(int i) {
        GMQ.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
    }

    @Override // X.InterfaceC47084Ids
    public final void LJIILIIL(boolean z, String str) {
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns;
        if (z) {
            if (!this.LJLIL.element && (interfaceC88472Yns = GMQ.LIZIZ) != null) {
                interfaceC88472Yns.invoke(Boolean.TRUE);
            }
            this.LJLIL.element = true;
            return;
        }
        GMQ.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
    }

    public GLE(C34K c34k, String str, String str2, String str3) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }
}
