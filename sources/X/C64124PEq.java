package X;

/* renamed from: X.PEq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64124PEq {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final long LJFF;
    public final int LJI;
    public final int LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MonitorConfig{enableAtrace=");
        LIZ.append(this.LIZ);
        LIZ.append(", enableBinder=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enableLock=");
        C76965UIn.LIZJ(LIZ, this.LIZJ, ", enableIO=", false, ", enableLooperMonitor=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enableStackSampling=");
        LIZ.append(this.LJ);
        LIZ.append(", atraceTag=");
        LIZ.append(this.LJFF);
        LIZ.append(", runMode=");
        V10.LJFF(LIZ, this.LJI, ", alogRef=", 0L);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C64124PEq(C64127PEt c64127PEt) {
        this.LIZ = c64127PEt.LIZ;
        this.LIZIZ = c64127PEt.LIZIZ;
        this.LIZLLL = c64127PEt.LIZLLL;
        this.LIZJ = c64127PEt.LIZJ;
        this.LJFF = c64127PEt.LJFF;
        this.LJI = c64127PEt.LJI;
        this.LJ = c64127PEt.LJ;
        this.LJII = c64127PEt.LJII;
    }
}
