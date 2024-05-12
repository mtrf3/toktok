package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.NOa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59272NOa {
    public final Long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final int LJII;

    public C59272NOa() {
        this(null, null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59272NOa)) {
            return false;
        }
        C59272NOa c59272NOa = (C59272NOa) obj;
        return o.LJ(this.LIZ, c59272NOa.LIZ) && o.LJ(this.LIZIZ, c59272NOa.LIZIZ) && o.LJ(this.LIZJ, c59272NOa.LIZJ) && o.LJ(this.LIZLLL, c59272NOa.LIZLLL) && o.LJ(this.LJ, c59272NOa.LJ) && o.LJ(this.LJFF, c59272NOa.LJFF) && this.LJI == c59272NOa.LJI && this.LJII == c59272NOa.LJII;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        return ((((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.LJI) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdWebUrlData(creativeId=");
        LIZ.append(this.LIZ);
        LIZ.append(", logExtra=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", downloadUrl=");
        LIZ.append(this.LIZJ);
        LIZ.append(", packageName=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", appName=");
        LIZ.append(this.LJ);
        LIZ.append(", adType=");
        LIZ.append(this.LJFF);
        LIZ.append(", adSystemOrigin=");
        LIZ.append(this.LJI);
        LIZ.append(", appAdFrom=");
        return b0.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C59272NOa(Long l, String str, String str2, String str3, String str4, String str5, int i) {
        l = (i & 1) != 0 ? 0L : l;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = 0;
        this.LJII = 0;
    }
}
