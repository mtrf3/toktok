package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YAM {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public long LJ;
    public long LJFF;
    public String LJI;
    public int LJII;
    public String LJIIIIZZ;
    public long LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YAM)) {
            return false;
        }
        YAM yam = (YAM) obj;
        return o.LJ(this.LIZ, yam.LIZ) && this.LIZIZ == yam.LIZIZ && o.LJ(this.LIZJ, yam.LIZJ) && this.LIZLLL == yam.LIZLLL && this.LJ == yam.LJ && this.LJFF == yam.LJFF && o.LJ(this.LJI, yam.LJI) && this.LJII == yam.LJII && o.LJ(this.LJIIIIZZ, yam.LJIIIIZZ) && this.LJIIIZ == yam.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31, 31);
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LIZJ = JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, (LJ + i) * 31, 31), 31);
        String str = this.LJI;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (((LIZJ + hashCode) * 31) + this.LJII) * 31;
        String str2 = this.LJIIIIZZ;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJIIIZ) + ((i3 + i2) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MetaData(aid=");
        LIZ.append(this.LIZ);
        LIZ.append(", nType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nid=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isMetricDup=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", clickTs=");
        LIZ.append(this.LJ);
        LIZ.append(", awemeTs=");
        LIZ.append(this.LJFF);
        LIZ.append(", awemeLogId=");
        LIZ.append(this.LJI);
        LIZ.append(", awemeErrorCode=");
        LIZ.append(this.LJII);
        LIZ.append(", awemeErrorMsg=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", videoTs=");
        return C47135Ieh.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public YAM(String aid, int i, String str, boolean z, long j, long j2, String str2, int i2, String str3, long j3) {
        o.LJIIIZ(aid, "aid");
        this.LIZ = aid;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = str2;
        this.LJII = i2;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = j3;
    }
}
