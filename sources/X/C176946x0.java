package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6x0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176946x0 {
    public final Boolean LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public boolean LJI;
    public long LJII;
    public long LJIIIIZZ;
    public final boolean LJIIIZ;

    public C176946x0() {
        this(0L, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C176946x0)) {
            return false;
        }
        C176946x0 c176946x0 = (C176946x0) obj;
        return o.LJ(this.LIZ, c176946x0.LIZ) && this.LIZIZ == c176946x0.LIZIZ && this.LIZJ == c176946x0.LIZJ && this.LIZLLL == c176946x0.LIZLLL && this.LJ == c176946x0.LJ && this.LJFF == c176946x0.LJFF && this.LJI == c176946x0.LJI && this.LJII == c176946x0.LJII && this.LJIIIIZZ == c176946x0.LJIIIIZZ && this.LJIIIZ == c176946x0.LJIIIZ;
    }

    public final long LIZ() {
        long j;
        long j2 = this.LIZJ;
        if (1 <= j2) {
            if (j2 < this.LJFF) {
                j = this.LJFF;
            } else if (j2 < this.LJ) {
                j = this.LJ;
            }
            return j - j2;
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        Boolean bool = this.LIZ;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, ((hashCode * 31) + this.LIZIZ) * 31, 31), 31), 31), 31);
        boolean z = this.LJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZJ2 = JBR.LIZJ(this.LJIIIIZZ, JBR.LIZJ(this.LJII, (LIZJ + i2) * 31, 31), 31);
        if (!this.LJIIIZ) {
            i = 0;
        }
        return LIZJ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TimeRecorder(isLoadSuccess=");
        LIZ.append(this.LIZ);
        LIZ.append(", loadDataCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showFragmentStartAt=");
        LIZ.append(this.LIZJ);
        LIZ.append(", networkStartAt=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", networkFinishedAt=");
        LIZ.append(this.LJ);
        LIZ.append(", assemStateUpdateFinishedAt=");
        LIZ.append(this.LJFF);
        LIZ.append(", isFirstLoad=");
        LIZ.append(this.LJI);
        LIZ.append(", cacheStartTime=");
        LIZ.append(this.LJII);
        LIZ.append(", viewDrawFinishTime=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", isCreateView=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C176946x0(long j, boolean z, boolean z2, int i) {
        j = (i & 4) != 0 ? 0L : j;
        z = (i & 64) != 0 ? false : z;
        z2 = (i & 512) != 0 ? false : z2;
        this.LIZ = null;
        this.LIZIZ = 0;
        this.LIZJ = j;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LJI = z;
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = z2;
    }
}
