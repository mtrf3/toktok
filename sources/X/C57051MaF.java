package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MaF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57051MaF {
    public String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public long LJFF;
    public long LJI;
    public int LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;

    public C57051MaF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57051MaF)) {
            return false;
        }
        C57051MaF c57051MaF = (C57051MaF) obj;
        return o.LJ(this.LIZ, c57051MaF.LIZ) && this.LIZIZ == c57051MaF.LIZIZ && this.LIZJ == c57051MaF.LIZJ && o.LJ(this.LIZLLL, c57051MaF.LIZLLL) && o.LJ(this.LJ, c57051MaF.LJ) && this.LJFF == c57051MaF.LJFF && this.LJI == c57051MaF.LJI && this.LJII == c57051MaF.LJII && this.LJIIIIZZ == c57051MaF.LJIIIIZZ && this.LJIIIZ == c57051MaF.LJIIIZ;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((((hashCode * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJIIIZ) + JBR.LIZJ(this.LJIIIIZZ, (JBR.LIZJ(this.LJI, JBR.LIZJ(this.LJFF, (i3 + i) * 31, 31), 31) + this.LJII) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MetaData(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", diggType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", groupType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nid=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", logId=");
        LIZ.append(this.LJ);
        LIZ.append(", clickTs=");
        LIZ.append(this.LJFF);
        LIZ.append(", requestTs=");
        LIZ.append(this.LJI);
        LIZ.append(", apiState=");
        LIZ.append(this.LJII);
        LIZ.append(", adapterSetDataTs=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", renderedTs=");
        return C47135Ieh.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C57051MaF(int i) {
        this.LIZ = "";
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
    }
}
