package X;

/* loaded from: classes9.dex */
public final class IRU {
    public final int LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NumberAndTime(rawNumber=");
        LIZ.append(this.LIZ);
        LIZ.append(", time=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IRU) || this.LIZ != ((IRU) obj).LIZ) {
            return false;
        }
        return true;
    }

    public IRU(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
