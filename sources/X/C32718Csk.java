package X;

/* renamed from: X.Csk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32718Csk extends V1B {
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ C32690CsI LJLJJLL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        C32781Ctl.LIZ.LIZ(0, this.LJLJJL);
    }

    public C32718Csk(long j, C32690CsI c32690CsI) {
        this.LJLJJL = j;
        this.LJLJJLL = c32690CsI;
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        String str2;
        if (exc == null || (str2 = exc.getMessage()) == null) {
            str2 = "Download Error";
        }
        C32700CsS c32700CsS = C32781Ctl.LIZ;
        long j = this.LJLJJL;
        c32700CsS.getClass();
        C32700CsS.LIZIZ(j, str2);
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        C47061t0 c47061t0;
        C32690CsI c32690CsI = this.LJLJJLL;
        AbstractC32698CsQ<?> abstractC32698CsQ = c32690CsI.LJLJLJ;
        if (abstractC32698CsQ != null && abstractC32698CsQ.LIZJ && (c47061t0 = c32690CsI.LJLJJL) != null) {
            c47061t0.setVisibility(8);
        }
        C32781Ctl.LIZ.LIZJ(this.LJLJJL);
    }
}
