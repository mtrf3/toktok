package X;

/* renamed from: X.JUt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49255JUt {
    public final long LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49255JUt)) {
            return false;
        }
        C49255JUt c49255JUt = (C49255JUt) obj;
        return this.LIZ == c49255JUt.LIZ && this.LIZIZ == c49255JUt.LIZIZ && this.LIZJ == c49255JUt.LIZJ && this.LIZLLL == c49255JUt.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return C16880lQ.LLJIJIL(this.LIZLLL) + JBR.LIZJ(this.LIZJ, (LLJIJIL + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Metrics(likeCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", isLike=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", commentCount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", shareCount=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public static C49255JUt LIZ(C49255JUt c49255JUt, long j) {
        long j2 = c49255JUt.LIZ;
        boolean z = c49255JUt.LIZIZ;
        long j3 = c49255JUt.LIZLLL;
        c49255JUt.getClass();
        return new C49255JUt(j2, j, j3, z);
    }

    public C49255JUt(long j, long j2, long j3, boolean z) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }
}
