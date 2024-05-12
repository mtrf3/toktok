package X;

/* renamed from: X.Y0g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86682Y0g implements Y1J {
    public final /* synthetic */ Y00 LIZ;
    public final /* synthetic */ Y0S LIZIZ;

    @Override // X.Y1J
    public final boolean LIZ() {
        return this.LIZIZ.LIZ.LIZ();
    }

    @Override // X.Y1J
    public final int LIZIZ() {
        return this.LIZIZ.LIZ.LIZIZ();
    }

    @Override // X.Y1J
    public final void LIZJ() {
        this.LIZIZ.LIZ.LIZJ();
    }

    @Override // X.Y1J
    public final void LIZLLL() {
        EnumC86689Y0n state = this.LIZ.getState();
        if (state == null) {
            return;
        }
        int i = Y14.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZIZ.LIZ.LIZLLL(true);
            this.LIZ.setState(EnumC86689Y0n.EXPANDED);
            return;
        }
        this.LIZIZ.LIZ.LIZLLL(false);
        this.LIZ.setState(EnumC86689Y0n.COLLAPSED);
    }

    @Override // X.Y1J
    public final boolean LJ() {
        return this.LIZIZ.LIZ.LJ();
    }

    @Override // X.Y1J
    public final void LJFF() {
        this.LIZIZ.LIZ.LJFF();
    }

    public C86682Y0g(Y00 y00, Y0S y0s) {
        this.LIZ = y00;
        this.LIZIZ = y0s;
    }

    @Override // X.Y1J
    public final void LJI(float f, int i) {
        Y0S y0s = this.LIZIZ;
        if (y0s.LIZLLL) {
            y0s.LIZLLL = false;
            y0s.LIZ.LJI(f, i);
        }
    }
}
