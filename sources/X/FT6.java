package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FT6 {
    public final String LIZ;
    public final int LIZIZ;
    public String LIZJ = "";
    public FT6 LIZLLL = null;
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public long LJIIL = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FT6)) {
            return false;
        }
        FT6 ft6 = (FT6) obj;
        return o.LJ(this.LIZ, ft6.LIZ) && this.LIZIZ == ft6.LIZIZ && o.LJ(this.LIZJ, ft6.LIZJ) && o.LJ(this.LIZLLL, ft6.LIZLLL) && o.LJ(this.LJ, ft6.LJ) && o.LJ(this.LJFF, ft6.LJFF) && o.LJ(this.LJI, ft6.LJI) && this.LJII == ft6.LJII && this.LJIIIIZZ == ft6.LJIIIIZZ && this.LJIIIZ == ft6.LJIIIZ && this.LJIIJ == ft6.LJIIJ && this.LJIIJJI == ft6.LJIIJJI && this.LJIIL == ft6.LJIIL;
    }

    public final String toString() {
        return "KinshipRunnable(blood=" + this.LIZ + ", hashcode=" + this.LIZIZ + ", fatherThreadName=" + this.LIZJ + ", fatherRunnable=" + this.LIZLLL + ", threadName=" + this.LJ + ", runnableName=" + this.LJFF + ", stackTrace=" + this.LJI + ", startWallTime=" + this.LJII + ", endWallTime=" + this.LJIIIIZZ + ", startCpuTime=" + this.LJIIIZ + ", endCpuTime=" + this.LJIIJ + ", costWallTime=" + this.LJIIJJI + ", costCpuTime=" + this.LJIIL + ')';
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31, 31);
        FT6 ft6 = this.LIZLLL;
        if (ft6 == null) {
            hashCode = 0;
        } else {
            hashCode = ft6.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJIIL) + JBR.LIZJ(this.LJIIJJI, JBR.LIZJ(this.LJIIJ, JBR.LIZJ(this.LJIIIZ, JBR.LIZJ(this.LJIIIIZZ, JBR.LIZJ(this.LJII, C79062V1e.LJ(this.LJI, C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, (LJ + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public FT6(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
