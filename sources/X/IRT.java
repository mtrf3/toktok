package X;

/* loaded from: classes9.dex */
public final class IRT {
    public long LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public String LJFF;
    public final long LJI;
    public final String LJII;
    public long LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BatteryLogEntity{id=");
        LIZ.append(this.LIZ);
        LIZ.append(", front=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", time=");
        LIZ.append(this.LIZJ);
        LIZ.append(", type='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", status=");
        LIZ.append(this.LJ);
        LIZ.append(", scene='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", accumulation=");
        LIZ.append(this.LJI);
        LIZ.append(", source='");
        Q89.LIZIZ(LIZ, this.LJII, '\'', ", versionId=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", processName='");
        Q89.LIZIZ(LIZ, this.LJIIIZ, '\'', ", mainProcess=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", startUuid='");
        LIZ.append(this.LJIIJJI);
        LIZ.append('\'');
        LIZ.append(", deleteFlag=");
        LIZ.append(false);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public IRT() {
    }

    public IRT(long j, long j2, String str, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJI = j2;
    }

    public IRT(long j, long j2, String str, String str2, String str3, boolean z, boolean z2) {
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = z2;
        this.LJFF = str2;
        this.LJI = j2;
        this.LJII = str3;
    }
}
