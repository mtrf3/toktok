package X;

/* renamed from: X.JjE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49964JjE {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49964JjE)) {
            return false;
        }
        C49964JjE c49964JjE = (C49964JjE) obj;
        return this.LIZ == c49964JjE.LIZ && this.LIZIZ == c49964JjE.LIZIZ && this.LIZJ == c49964JjE.LIZJ && this.LIZLLL == c49964JjE.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZJ = JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31);
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CostInfo(startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", resVersion=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isSSR=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C49964JjE(long j, long j2, long j3, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = z;
    }
}
