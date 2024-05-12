package X;

import defpackage.b0;
import java.util.Objects;

/* renamed from: X.PHf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64191PHf {
    public int LIZ;
    public String LIZIZ;
    public long LIZJ;
    public double LIZLLL;
    public double LJ;
    public String LJFF;
    public long LJI;
    public int LJII;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZ), this.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ThreadExceptionItem{threadId=");
        LIZ.append(this.LIZ);
        LIZ.append(", threadName='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", threadCpuTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", processCpuTime=");
        LIZ.append(this.LJI);
        LIZ.append(", cpuUsage=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", weight=");
        LIZ.append(this.LJ);
        LIZ.append(", nice=");
        return b0.LIZJ(LIZ, this.LJII, '}', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64191PHf)) {
            return false;
        }
        C64191PHf c64191PHf = (C64191PHf) obj;
        String str = this.LIZIZ;
        if (str != null && this.LIZ == c64191PHf.LIZ && str.equals(c64191PHf.LIZIZ)) {
            return true;
        }
        return false;
    }
}
