package X;

/* renamed from: X.Ifz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47215Ifz extends AbstractC47210Ifu {
    public C47222Ig6 LJ;
    public C47216Ig0 LJFF;
    public C46539IOh LJI;

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void resume() {
        InterfaceC47219Ig3 interfaceC47219Ig3;
        C47222Ig6 c47222Ig6 = this.LJ;
        if (c47222Ig6 != null && (interfaceC47219Ig3 = c47222Ig6.LIZIZ) != null) {
            interfaceC47219Ig3.resume();
        }
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void release() {
        super.release();
        C46539IOh c46539IOh = this.LJI;
        if (c46539IOh != null) {
            c46539IOh.LIZJ(this.LJFF);
        }
        C47222Ig6 c47222Ig6 = this.LJ;
        if (c47222Ig6 != null) {
            C47250IgY c47250IgY = c47222Ig6.LIZLLL;
            c47250IgY.LIZIZ.LJFF();
            c47250IgY.LIZ = null;
            c47250IgY.LIZJ = null;
            c47250IgY.LJ = null;
            c47250IgY.LJFF = null;
            c47250IgY.LIZIZ = null;
            C47155If1 c47155If1 = c47222Ig6.LIZJ;
            c47155If1.LIZ = null;
            c47155If1.LIZIZ = null;
            c47222Ig6.LIZIZ = null;
            c47222Ig6.LIZJ = null;
            c47222Ig6.LIZLLL = null;
        }
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        InterfaceC47219Ig3 interfaceC47219Ig3;
        C47222Ig6 c47222Ig6 = this.LJ;
        if (c47222Ig6 != null && (interfaceC47219Ig3 = c47222Ig6.LIZIZ) != null) {
            interfaceC47219Ig3.LIZ(interfaceC46811IYt);
        }
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZIZ(IZ2 iz2) {
        C47222Ig6 c47222Ig6 = this.LJ;
        if (c47222Ig6 == null) {
            return;
        }
        if (iz2.LJJLIIIJLJLI() != null) {
            c47222Ig6.LIZIZ = c47222Ig6.LIZLLL;
        } else {
            c47222Ig6.LIZIZ = c47222Ig6.LIZJ;
        }
        c47222Ig6.LIZIZ.LIZIZ(iz2);
    }

    @Override // X.AbstractC47210Ifu, X.InterfaceC47232IgG
    public final void LIZJ(IU3 iu3) {
        C47222Ig6 c47222Ig6 = this.LJ;
        if (c47222Ig6 != null && (iu3 instanceof C47228IgC)) {
            C47249IgX c47249IgX = ((C47228IgC) iu3).LIZ;
            InterfaceC47219Ig3 interfaceC47219Ig3 = c47222Ig6.LIZIZ;
            if (interfaceC47219Ig3 != null) {
                interfaceC47219Ig3.LIZJ(c47249IgX);
            }
        }
    }

    @Override // X.AbstractC47210Ifu
    public final void LIZLLL(C46539IOh c46539IOh) {
        InterfaceC47219Ig3 interfaceC47219Ig3;
        this.LJI = c46539IOh;
        C47216Ig0 c47216Ig0 = new C47216Ig0(this.LIZJ, this.LJ);
        this.LJFF = c47216Ig0;
        c46539IOh.LIZ(c47216Ig0);
        C47222Ig6 c47222Ig6 = this.LJ;
        if (c47222Ig6 != null && (interfaceC47219Ig3 = c47222Ig6.LIZIZ) != null) {
            interfaceC47219Ig3.LJ(c46539IOh);
        }
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJ(InterfaceC197787pW interfaceC197787pW) {
        InterfaceC47219Ig3 interfaceC47219Ig3;
        C47222Ig6 c47222Ig6 = this.LJ;
        if (c47222Ig6 != null && (interfaceC47219Ig3 = c47222Ig6.LIZIZ) != null) {
            interfaceC47219Ig3.LJJIIJZLJL();
        }
    }

    @Override // X.AbstractC47210Ifu
    public final void LJIIIIZZ(IWH iwh) {
        this.LIZJ = iwh;
        this.LJ = new C47222Ig6(iwh);
    }
}
