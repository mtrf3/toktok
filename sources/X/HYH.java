package X;

/* loaded from: classes8.dex */
public final class HYH extends HYI {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HYH) && this.LIZ == ((HYH) obj).LIZ;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.LIZ;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StopRecordReturnNegative(ret=");
        return C0H1.LIZJ(LIZ, this.LIZ, ")", LIZ);
    }

    public HYH(long j) {
        this.LIZ = j;
    }
}
