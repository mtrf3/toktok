package X;

/* renamed from: X.X9m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84374X9m {
    public int LIZLLL;
    public int LJ;
    public String LIZ = "unknown";
    public String LIZIZ = "unknown";
    public String LIZJ = "unknown";
    public final int LJFF = -1;
    public double LJI = -1.0d;
    public String LJII = "unknown";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GPUInfo{renderer='");
        C1DI.LIZIZ(LIZ, this.LIZ, "'", ", version='");
        C1DI.LIZIZ(LIZ, this.LIZIZ, "'", ", vendor='");
        C1DI.LIZIZ(LIZ, this.LIZJ, "'", ", maxFreq=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", minFreq=");
        LIZ.append(this.LJ);
        LIZ.append(", glVer=");
        LIZ.append(this.LJFF);
        LIZ.append(", alusOrThroughput=");
        LIZ.append(this.LJI);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }
}
