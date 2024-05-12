package X;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CTI {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public final JSONObject LJIIL;

    public CTI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTI)) {
            return false;
        }
        CTI cti = (CTI) obj;
        return this.LIZ == cti.LIZ && this.LIZIZ == cti.LIZIZ && this.LIZJ == cti.LIZJ && this.LIZLLL == cti.LIZLLL && this.LJ == cti.LJ && this.LJFF == cti.LJFF && this.LJI == cti.LJI && this.LJII == cti.LJII && this.LJIIIIZZ == cti.LJIIIIZZ && this.LJIIIZ == cti.LJIIIZ && this.LJIIJ == cti.LJIIJ && this.LJIIJJI == cti.LJIIJJI;
    }

    public final String toString() {
        return "ViewMetrics(createViewCount=" + this.LIZ + ", measureCount=" + this.LIZIZ + ", layoutCount=" + this.LIZJ + ", drawCount=" + this.LIZLLL + ", createViewStartAtMillis=" + this.LJ + ", createViewTotalDuration=" + this.LJFF + ", measureStartAtMillis=" + this.LJI + ", measureTotalDuration=" + this.LJII + ", layoutStartAtMillis=" + this.LJIIIIZZ + ", layoutTotalDuration=" + this.LJIIIZ + ", drawStartAtMillis=" + this.LJIIJ + ", drawTotalDuration=" + this.LJIIJJI + ')';
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJIIJJI) + JBR.LIZJ(this.LJIIJ, JBR.LIZJ(this.LJIIIZ, JBR.LIZJ(this.LJIIIIZZ, JBR.LIZJ(this.LJII, JBR.LIZJ(this.LJI, JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, ((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public CTI(int i) {
        this.LIZ = 0;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = new JSONObject();
    }
}
