package X;

/* loaded from: classes12.dex */
public abstract class PI2 extends PMI {
    public C64198PHm LIZIZ;
    public final C64211PHz LIZJ;
    public boolean LIZLLL;

    public abstract long LJIILL();

    public abstract boolean LJIILLIIL(boolean z);

    public abstract boolean LJIIZILJ();

    @Override // X.PMI
    public final void LJII() {
        super.LJII();
        C64071PCp.LIZ(PD6.CPU).LIZIZ(this.LIZJ);
    }

    public PI2(PI1 pi1) {
        super(pi1);
        this.LIZJ = new C64211PHz(this, LJIILL(), LJIILL());
    }

    @Override // X.PMI
    public void LJI(boolean z) {
        super.LJI(z);
        C64071PCp.LIZ(PD6.CPU).LIZIZ(this.LIZJ);
        PI1 pi1 = (PI1) this.LIZ;
        synchronized (pi1) {
            pi1.LIZ(pi1.LJIIJJI);
        }
    }

    @Override // X.PMI
    public final void LJFF(C64198PHm c64198PHm, boolean z) {
        super.LJFF(c64198PHm, z);
        this.LIZIZ = c64198PHm;
        this.LIZLLL = z;
        C64071PCp.LIZ(PD6.CPU).LIZJ(this.LIZJ);
    }
}
