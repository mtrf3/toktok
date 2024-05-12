package X;

/* loaded from: classes9.dex */
public final class IOD {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IOD) && this.LIZ == ((IOD) obj).LIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeaveRankTotalPointItem(totalScore=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public IOD(long j) {
        this.LIZ = j;
    }
}
