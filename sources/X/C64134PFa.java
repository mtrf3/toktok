package X;

/* renamed from: X.PFa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64134PFa {
    public final long LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FdConfig{fdCountThreshold=");
        LIZ.append(this.LIZ);
        LIZ.append(", collectIntervalMs=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isSampled=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, '}', LIZ);
    }

    public C64134PFa(long j, long j2, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = z;
    }
}
