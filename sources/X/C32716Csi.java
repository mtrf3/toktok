package X;

/* renamed from: X.Csi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32716Csi extends V1B {
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ AbstractC32678Cs6 LJLJJLL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        C32781Ctl.LIZ.LIZ(0, this.LJLJJL);
    }

    public C32716Csi(long j, AbstractC32678Cs6 abstractC32678Cs6) {
        this.LJLJJL = j;
        this.LJLJJLL = abstractC32678Cs6;
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        String str2;
        InterfaceC32725Csr interfaceC32725Csr;
        if (exc == null || (str2 = exc.getMessage()) == null) {
            str2 = "Download Error";
        }
        C32700CsS c32700CsS = C32781Ctl.LIZ;
        long j = this.LJLJJL;
        c32700CsS.getClass();
        C32700CsS.LIZIZ(j, str2);
        AbstractC32678Cs6 abstractC32678Cs6 = this.LJLJJLL;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = abstractC32678Cs6.LJZ;
        if (abstractC32698CsQ != null && (interfaceC32725Csr = abstractC32678Cs6.LJZI) != null) {
            interfaceC32725Csr.LIZIZ(abstractC32698CsQ);
        }
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        InterfaceC32725Csr interfaceC32725Csr;
        C47061t0 c47061t0;
        AbstractC32678Cs6 abstractC32678Cs6 = this.LJLJJLL;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = abstractC32678Cs6.LJZ;
        if (abstractC32698CsQ != null && abstractC32698CsQ.LIZJ && (c47061t0 = abstractC32678Cs6.LJLJJLL) != null) {
            c47061t0.setVisibility(8);
        }
        C32781Ctl.LIZ.LIZJ(this.LJLJJL);
        AbstractC32678Cs6 abstractC32678Cs62 = this.LJLJJLL;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = abstractC32678Cs62.LJZ;
        if (abstractC32698CsQ2 != null && (interfaceC32725Csr = abstractC32678Cs62.LJZI) != null) {
            interfaceC32725Csr.LJIILLIIL(abstractC32698CsQ2);
        }
    }
}
