package X;

/* loaded from: classes12.dex */
public final class PI6 extends PMI {
    public final PI5 LIZIZ;
    public volatile boolean LIZJ;

    @Override // X.PMI
    public final void LJII() {
        super.LJII();
        C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZIZ(this.LIZIZ);
    }

    @Override // X.PMI
    public final PI8 LJIIIIZZ() {
        return PI8.COOL_DOWN;
    }

    public PI6(PI1 pi1) {
        super(pi1);
        long j;
        if (this.LIZJ) {
            j = 1200000;
        } else {
            j = 120000;
        }
        this.LIZIZ = new PI5(this, j, pi1);
    }

    @Override // X.PMI
    public final void LJI(boolean z) {
        super.LJI(z);
        this.LIZJ = z;
    }

    @Override // X.PMI
    public final void LJFF(C64198PHm c64198PHm, boolean z) {
        super.LJFF(c64198PHm, z);
        C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZJ(this.LIZIZ);
    }
}
