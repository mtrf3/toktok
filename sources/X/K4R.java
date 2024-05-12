package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K4R {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final String LJI;
    public final Integer LJII;
    public final Long LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final Integer LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K4R)) {
            return false;
        }
        K4R k4r = (K4R) obj;
        return o.LJ(this.LIZ, k4r.LIZ) && o.LJ(this.LIZIZ, k4r.LIZIZ) && o.LJ(this.LIZJ, k4r.LIZJ) && o.LJ(this.LIZLLL, k4r.LIZLLL) && o.LJ(this.LJ, k4r.LJ) && o.LJ(this.LJFF, k4r.LJFF) && o.LJ(this.LJI, k4r.LJI) && o.LJ(this.LJII, k4r.LJII) && o.LJ(this.LJIIIIZZ, k4r.LJIIIIZZ) && o.LJ(this.LJIIIZ, k4r.LJIIIZ) && this.LJIIJ == k4r.LJIIJ && o.LJ(this.LJIIJJI, k4r.LJIIJJI) && o.LJ(this.LJIIL, k4r.LJIIL) && o.LJ(this.LJIILIIL, k4r.LJIILIIL) && o.LJ(this.LJIILJJIL, k4r.LJIILJJIL) && o.LJ(this.LJIILL, k4r.LJIILL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
        Integer num = this.LJ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.LJFF;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.LJII;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l = this.LJIIIIZZ;
        if (l == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str3 = this.LJIIIZ;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i7 = (((i6 + hashCode6) * 31) + this.LJIIJ) * 31;
        String str4 = this.LJIIJJI;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str5 = this.LJIIL;
        if (str5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str5.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str6 = this.LJIILIIL;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str7 = this.LJIILJJIL;
        if (str7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str7.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Integer num3 = this.LJIILL;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Param(keywords=");
        sb.append(this.LIZ);
        sb.append(", source=");
        sb.append(this.LIZIZ);
        sb.append(", gid=");
        sb.append(this.LIZJ);
        sb.append(", historyJson=");
        sb.append(this.LIZLLL);
        sb.append(", totalCount=");
        sb.append(this.LJ);
        sb.append(", sessionParams=");
        sb.append(this.LJFF);
        sb.append(", requestParams=");
        sb.append(this.LJI);
        sb.append(", richSugCount=");
        sb.append(this.LJII);
        sb.append(", requestOrder=");
        sb.append(this.LJIIIIZZ);
        sb.append(", enterFrom=");
        sb.append(this.LJIIIZ);
        sb.append(", sugCostDegradation=");
        sb.append(this.LJIIJ);
        sb.append(", newSugSessionId=");
        sb.append(this.LJIIJJI);
        sb.append(", srcMaterialId=");
        sb.append(this.LJIIL);
        sb.append(", srcAnchorProductId=");
        sb.append(this.LJIILIIL);
        sb.append(", searchPosition=");
        sb.append(this.LJIILJJIL);
        sb.append(", isNonPersonalizedSearch=");
        return UC7.LIZ(sb, this.LJIILL, ')');
    }

    public K4R(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, Long l, String str7, int i, String str8, String str9, String str10, String str11, Integer num3) {
        HH1.LIZ(str2, "source", str3, "gid", str4, "historyJson");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = num;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = num2;
        this.LJIIIIZZ = l;
        this.LJIIIZ = str7;
        this.LJIIJ = i;
        this.LJIIJJI = str8;
        this.LJIIL = str9;
        this.LJIILIIL = str10;
        this.LJIILJJIL = str11;
        this.LJIILL = num3;
    }
}
