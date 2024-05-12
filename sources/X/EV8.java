package X;

/* loaded from: classes7.dex */
public class EV8 {
    public final long LIZ;
    public final long LIZIZ;
    public final double LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DataStat{availFreeSpace=");
        LIZ.append(this.LIZ);
        LIZ.append(", totalSpace=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", availPercent=");
        return C07670Rv.LIZ(LIZ, this.LIZJ, '}', LIZ);
    }

    public EV8(double d, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = d;
    }
}
