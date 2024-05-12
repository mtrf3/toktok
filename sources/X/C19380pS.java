package X;

/* renamed from: X.0pS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19380pS {
    public String LIZ;
    public EnumC08510Vb LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public C0CY LJ;
    public C0CY LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public C0VP LJIIIZ;
    public int LJIIJ;
    public C0VM LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public boolean LJIILLIIL;
    public EnumC08500Va LJIIZILJ;

    static {
        C0VW.LIZIZ("WorkSpec");
    }

    public final long LIZ() {
        long j;
        long j2;
        long scalb;
        if (this.LIZIZ == EnumC08510Vb.ENQUEUED && this.LJIIJ > 0) {
            if (this.LJIIJJI == C0VM.LINEAR) {
                scalb = this.LJIIL * this.LJIIJ;
            } else {
                scalb = Math.scalb((float) this.LJIIL, this.LJIIJ - 1);
            }
            j2 = this.LJIILIIL;
            j = Math.min(18000000L, scalb);
        } else {
            long j3 = 0;
            if (LIZJ()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = this.LJIILIIL;
                if (j4 == 0) {
                    j4 = this.LJI + currentTimeMillis;
                }
                long j5 = this.LJIIIIZZ;
                long j6 = this.LJII;
                if (j5 != j6) {
                    if (j4 == 0) {
                        j3 = j5 * (-1);
                    }
                    return j4 + j6 + j3;
                }
                if (j4 != 0) {
                    j3 = j6;
                }
                return j4 + j3;
            }
            j = this.LJIILIIL;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            j2 = this.LJI;
        }
        return j + j2;
    }

    public final boolean LIZIZ() {
        return !C0VP.LJIIIIZZ.equals(this.LJIIIZ);
    }

    public final boolean LIZJ() {
        if (this.LJII != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int LJ = C79062V1e.LJ(this.LIZJ, (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31, 31);
        String str = this.LIZLLL;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.LJFF.hashCode() + ((this.LJ.hashCode() + ((LJ + i) * 31)) * 31)) * 31;
        long j = this.LJI;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.LJII;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.LJIIIIZZ;
        int hashCode2 = (this.LJIIJJI.hashCode() + ((((this.LJIIIZ.hashCode() + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.LJIIJ) * 31)) * 31;
        long j4 = this.LJIIL;
        int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.LJIILIIL;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.LJIILJJIL;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.LJIILL;
        return this.LJIIZILJ.hashCode() + ((((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.LJIILLIIL ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{WorkSpec: ");
        return JBR.LJFF(LIZ, this.LIZ, "}", LIZ);
    }

    public C19380pS(C19380pS c19380pS) {
        this.LIZIZ = EnumC08510Vb.ENQUEUED;
        C0CY c0cy = C0CY.LIZIZ;
        this.LJ = c0cy;
        this.LJFF = c0cy;
        this.LJIIIZ = C0VP.LJIIIIZZ;
        this.LJIIJJI = C0VM.EXPONENTIAL;
        this.LJIIL = 30000L;
        this.LJIILL = -1L;
        this.LJIIZILJ = EnumC08500Va.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.LIZ = c19380pS.LIZ;
        this.LIZJ = c19380pS.LIZJ;
        this.LIZIZ = c19380pS.LIZIZ;
        this.LIZLLL = c19380pS.LIZLLL;
        this.LJ = new C0CY(c19380pS.LJ);
        this.LJFF = new C0CY(c19380pS.LJFF);
        this.LJI = c19380pS.LJI;
        this.LJII = c19380pS.LJII;
        this.LJIIIIZZ = c19380pS.LJIIIIZZ;
        this.LJIIIZ = new C0VP(c19380pS.LJIIIZ);
        this.LJIIJ = c19380pS.LJIIJ;
        this.LJIIJJI = c19380pS.LJIIJJI;
        this.LJIIL = c19380pS.LJIIL;
        this.LJIILIIL = c19380pS.LJIILIIL;
        this.LJIILJJIL = c19380pS.LJIILJJIL;
        this.LJIILL = c19380pS.LJIILL;
        this.LJIILLIIL = c19380pS.LJIILLIIL;
        this.LJIIZILJ = c19380pS.LJIIZILJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19380pS.class != obj.getClass()) {
            return false;
        }
        C19380pS c19380pS = (C19380pS) obj;
        if (this.LJI != c19380pS.LJI || this.LJII != c19380pS.LJII || this.LJIIIIZZ != c19380pS.LJIIIIZZ || this.LJIIJ != c19380pS.LJIIJ || this.LJIIL != c19380pS.LJIIL || this.LJIILIIL != c19380pS.LJIILIIL || this.LJIILJJIL != c19380pS.LJIILJJIL || this.LJIILL != c19380pS.LJIILL || this.LJIILLIIL != c19380pS.LJIILLIIL || !this.LIZ.equals(c19380pS.LIZ) || this.LIZIZ != c19380pS.LIZIZ || !this.LIZJ.equals(c19380pS.LIZJ)) {
            return false;
        }
        String str = this.LIZLLL;
        if (str == null ? c19380pS.LIZLLL != null : !str.equals(c19380pS.LIZLLL)) {
            return false;
        }
        if (this.LJ.equals(c19380pS.LJ) && this.LJFF.equals(c19380pS.LJFF) && this.LJIIIZ.equals(c19380pS.LJIIIZ) && this.LJIIJJI == c19380pS.LJIIJJI && this.LJIIZILJ == c19380pS.LJIIZILJ) {
            return true;
        }
        return false;
    }

    public C19380pS(String str, String str2) {
        this.LIZIZ = EnumC08510Vb.ENQUEUED;
        C0CY c0cy = C0CY.LIZIZ;
        this.LJ = c0cy;
        this.LJFF = c0cy;
        this.LJIIIZ = C0VP.LJIIIIZZ;
        this.LJIIJJI = C0VM.EXPONENTIAL;
        this.LJIIL = 30000L;
        this.LJIILL = -1L;
        this.LJIIZILJ = EnumC08500Va.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.LIZ = str;
        this.LIZJ = str2;
    }
}
