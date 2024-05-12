package X;

/* loaded from: classes8.dex */
public final class HYG extends HYI {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HYG) && this.LIZ == ((HYG) obj).LIZ;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.LIZ;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StopRecordDurationNegative(duration=");
        return C0H1.LIZJ(LIZ, this.LIZ, ")", LIZ);
    }

    public HYG(long j) {
        this.LIZ = j;
    }
}
