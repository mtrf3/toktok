package X;

/* loaded from: classes12.dex */
public final class PI1 {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final PG9 LIZLLL;
    public C46625IRp LJ;
    public PMI LJFF;
    public C64198PHm LJI;
    public PMI LJII;
    public PMI LJIIIIZZ;
    public PMI LJIIIZ;
    public PMI LJIIJ;
    public PMI LJIIJJI;

    public final synchronized void LIZJ() {
        LIZ(this.LJII);
    }

    public PI1(PG9 pg9) {
        this.LIZLLL = pg9;
    }

    public final void LIZ(PMI pmi) {
        boolean z;
        if (!this.LIZ || !this.LIZIZ) {
            return;
        }
        this.LJFF = pmi;
        C64198PHm c64198PHm = this.LJI;
        PG9 pg9 = this.LIZLLL;
        if (pg9 == null || !pg9.isForeground()) {
            z = true;
        } else {
            z = false;
        }
        pmi.LJFF(c64198PHm, z);
        if (!C78248UnM.LJIIJ()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("change cpu exception detect state: ");
        LIZ.append(this.LJFF);
        C64028PAy.LIZLLL("APM-CPU", X1D.LIZIZ(LIZ));
    }

    public final synchronized void LIZIZ(boolean z) {
        PMI pmi = this.LJFF;
        if (pmi != null && this.LIZ) {
            if (this.LIZJ == z) {
                return;
            }
            this.LIZJ = z;
            pmi.LJI(z);
        }
    }
}
