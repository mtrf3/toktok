package X;

/* loaded from: classes12.dex */
public final class PGE {
    public static final PGE LJ = new PGE();
    public PGG LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public C64161PGb LIZLLL;

    public final synchronized void LIZ() {
        if (this.LIZJ) {
            return;
        }
        PGG pgg = this.LIZ;
        if (pgg != null && pgg.LIZ && pgg.LJIIL) {
            if (!PC5.LJJIIZ()) {
                return;
            }
            this.LIZJ = true;
            this.LIZLLL = new C64161PGb(this);
            C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZJ(this.LIZLLL);
        }
    }

    public final synchronized void LIZIZ(PGG pgg) {
        if (pgg == null) {
            return;
        }
        this.LIZ = pgg;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateConfig:");
            LIZ.append(pgg);
            C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ));
        }
        if (!this.LIZIZ) {
            return;
        }
        PG9 pg9 = (PG9) PGH.LIZ(PG9.class);
        if (pg9 != null && !pg9.isForeground()) {
            LIZ();
        }
    }
}
