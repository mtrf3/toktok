package X;

/* renamed from: X.E8w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35946E8w {
    public final double LIZ;
    public final double LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35946E8w)) {
            return false;
        }
        C35946E8w c35946E8w = (C35946E8w) obj;
        return Double.compare(this.LIZ, c35946E8w.LIZ) == 0 && Double.compare(this.LIZIZ, c35946E8w.LIZIZ) == 0 && this.LIZJ == c35946E8w.LIZJ && this.LIZLLL == c35946E8w.LIZLLL;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZLLL) + JBR.LIZJ(this.LIZJ, C1JX.LIZIZ(this.LIZIZ, C16880lQ.LLJI(this.LIZ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Record(renderFps=");
        LIZ.append(this.LIZ);
        LIZ.append(", pushFps=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fromTs=");
        LIZ.append(this.LIZJ);
        LIZ.append(", toTs=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C35946E8w(double d, double d2, long j, long j2) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
