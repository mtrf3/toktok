package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pxf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66147Pxf {
    public final String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public long LJFF;
    public long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66147Pxf)) {
            return false;
        }
        C66147Pxf c66147Pxf = (C66147Pxf) obj;
        return o.LJ(this.LIZ, c66147Pxf.LIZ) && o.LJ(this.LIZIZ, c66147Pxf.LIZIZ) && o.LJ(this.LIZJ, c66147Pxf.LIZJ) && o.LJ(this.LIZLLL, c66147Pxf.LIZLLL) && o.LJ(this.LJ, c66147Pxf.LJ) && this.LJFF == c66147Pxf.LJFF && this.LJI == c66147Pxf.LJI;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.LJ;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        long j = this.LJFF;
        int i = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.LJI;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomAnchorCase(caseId=");
        LIZ.append(this.LIZ);
        LIZ.append(", startTopPage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startDescription=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", stopDescription=");
        LIZ.append(this.LJ);
        LIZ.append(", startTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", stopTopPage=");
        LIZ.append(this.LIZJ);
        LIZ.append(",, stopTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C66147Pxf(String caseId) {
        o.LJIIIZ(caseId, "caseId");
        this.LIZ = caseId;
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = -1L;
        this.LJI = -1L;
    }
}
