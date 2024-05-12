package X;

/* loaded from: classes12.dex */
public final class PG6 {
    public final long LIZ;
    public final double LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MemoryConfig{memoryCollectionInterval=");
        LIZ.append(this.LIZ);
        LIZ.append(", memoryTopCheckThreshold=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isStopWhenBackground=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isRealTimeMemEnable=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isUploadEnable=");
        LIZ.append(this.LJ);
        LIZ.append(", isApm6SampleEnable=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, '}', LIZ);
    }

    public PG6(long j, double d, boolean z, boolean z2) {
        if (j <= 0) {
            this.LIZ = 120L;
        } else {
            this.LIZ = j;
        }
        this.LIZIZ = d;
        this.LJFF = z2;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = z;
    }
}
