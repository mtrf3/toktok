package X;

/* loaded from: classes12.dex */
public final class PIE {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final PIL LIZLLL;
    public PIB LJ;
    public final boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    public final synchronized PID LIZ() {
        if (this.LJII || !this.LJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("test");
            LIZ.append(" is start after Trace finish or before Trace begin, it will be ignore!!!!");
            X1D.LIZIZ(LIZ);
            return null;
        }
        PIB pib = this.LJ;
        pib.getClass();
        return new PID("test", "tracer_span", pib);
    }

    public final synchronized void LIZIZ(long j) {
        PIB pib;
        if (this.LJI) {
            return;
        }
        if (this.LJ == null) {
            if (PIK.LIZ[this.LIZLLL.ordinal()] != 1) {
                pib = null;
            } else {
                pib = new PIB(this);
            }
            this.LJ = pib;
        }
        PIB pib2 = this.LJ;
        if (pib2 != null) {
            pib2.LIZ = j;
            this.LJI = true;
        }
    }

    public PIE(String str, PIL pil, boolean z, PIS pis, String str2) {
        this.LIZ = str;
        this.LIZJ = pis.generate();
        this.LIZLLL = pil;
        this.LJFF = z;
        this.LIZIZ = str2;
    }
}
