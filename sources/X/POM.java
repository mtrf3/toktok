package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class POM {
    public final POP LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final long LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POM)) {
            return false;
        }
        POM pom = (POM) obj;
        return this.LIZ == pom.LIZ && o.LJ(this.LIZIZ, pom.LIZIZ) && this.LIZJ == pom.LIZJ && this.LIZLLL == pom.LIZLLL && o.LJ(this.LJ, pom.LJ) && o.LJ(this.LJFF, pom.LJFF) && this.LJI == pom.LJI && this.LJII == pom.LJII && o.LJ(this.LJIIIIZZ, pom.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((LJ + i) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LJIIIIZZ.hashCode() + JBR.LIZJ(this.LJII, (C79062V1e.LJ(this.LJFF, (i2 + hashCode) * 31, 31) + this.LJI) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KeyLogModel(logType=");
        LIZ.append(this.LIZ);
        LIZ.append(", btm=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", btmPageOpen=");
        LIZ.append(this.LIZJ);
        LIZ.append(", btmPageCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", event=");
        LIZ.append(this.LJ);
        LIZ.append(", url=");
        LIZ.append(this.LJFF);
        LIZ.append(", statusCode=");
        LIZ.append(this.LJI);
        LIZ.append(", duration=");
        LIZ.append(this.LJII);
        LIZ.append(", logid=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public POM(POP logType, String btm, boolean z, int i, String str, String url, int i2, long j, String logid, int i3) {
        btm = (i3 & 2) != 0 ? "" : btm;
        z = (i3 & 4) != 0 ? false : z;
        i = (i3 & 8) != 0 ? 0 : i;
        str = (i3 & 16) != 0 ? null : str;
        url = (i3 & 32) != 0 ? "" : url;
        i2 = (i3 & 64) != 0 ? -1 : i2;
        j = (i3 & 128) != 0 ? -1L : j;
        logid = (i3 & 256) != 0 ? "" : logid;
        o.LJIIIZ(logType, "logType");
        o.LJIIIZ(btm, "btm");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(logid, "logid");
        this.LIZ = logType;
        this.LIZIZ = btm;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = url;
        this.LJI = i2;
        this.LJII = j;
        this.LJIIIIZZ = logid;
    }
}
