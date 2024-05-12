package X;

/* renamed from: X.Csg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32714Csg extends V1B {
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ C32686CsE LJLJJLL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        C32781Ctl.LIZ.LIZ(this.LJLJJLL.LJLLLL, this.LJLJJL);
    }

    public C32714Csg(long j, C32686CsE c32686CsE) {
        this.LJLJJL = j;
        this.LJLJJLL = c32686CsE;
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
        AbstractC32698CsQ<?> abstractC32698CsQ;
        C47061t0 c47061t0;
        C32686CsE c32686CsE = this.LJLJJLL;
        c32686CsE.LLF = false;
        InterfaceC32671Crz interfaceC32671Crz = c32686CsE.LJLJLLL;
        if (interfaceC32671Crz != null) {
            abstractC32698CsQ = ((AbstractC32682CsA) interfaceC32671Crz).LJLIL;
        } else {
            abstractC32698CsQ = null;
        }
        if (abstractC32698CsQ == c32686CsE.LJLJLJ && (c47061t0 = c32686CsE.LJLJJL) != null) {
            c47061t0.setVisibility(8);
        }
        C32781Ctl.LIZ.LIZJ(this.LJLJJL);
    }
}
