package X;

import kotlin.jvm.internal.o;

/* renamed from: X.K9v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51259K9v {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final Integer LJI;
    public final Long LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51259K9v)) {
            return false;
        }
        C51259K9v c51259K9v = (C51259K9v) obj;
        return o.LJ(this.LIZ, c51259K9v.LIZ) && o.LJ(this.LIZIZ, c51259K9v.LIZIZ) && o.LJ(this.LIZJ, c51259K9v.LIZJ) && o.LJ(this.LIZLLL, c51259K9v.LIZLLL) && o.LJ(this.LJ, c51259K9v.LJ) && o.LJ(this.LJFF, c51259K9v.LJFF) && o.LJ(this.LJI, c51259K9v.LJI) && o.LJ(this.LJII, c51259K9v.LJII) && o.LJ(this.LJIIIIZZ, c51259K9v.LJIIIIZZ) && this.LJIIIZ == c51259K9v.LJIIIZ && o.LJ(this.LJIIJ, c51259K9v.LJIIJ) && o.LJ(this.LJIIJJI, c51259K9v.LJIIJJI) && o.LJ(this.LJIIL, c51259K9v.LJIIL) && o.LJ(this.LJIILIIL, c51259K9v.LJIILIIL) && o.LJ(this.LJIILJJIL, c51259K9v.LJIILJJIL);
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
        Integer num2 = this.LJI;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l = this.LJII;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.LJIIIIZZ;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (((i5 + hashCode5) * 31) + this.LJIIIZ) * 31;
        String str3 = this.LJIIJ;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
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
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i10 + i;
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
        sb.append(", signal=");
        sb.append(this.LJFF);
        sb.append(", richSugCount=");
        sb.append(this.LJI);
        sb.append(", requestOrder=");
        sb.append(this.LJII);
        sb.append(", enterFrom=");
        sb.append(this.LJIIIIZZ);
        sb.append(", sugCostDegradation=");
        sb.append(this.LJIIIZ);
        sb.append(", newSugSessionId=");
        sb.append(this.LJIIJ);
        sb.append(", srcMaterialId=");
        sb.append(this.LJIIJJI);
        sb.append(", srcAnchorProductId=");
        sb.append(this.LJIIL);
        sb.append(", searchPosition=");
        sb.append(this.LJIILIIL);
        sb.append(", singlePathUserActions=");
        return C07670Rv.LIZIZ(sb, this.LJIILJJIL, ')');
    }

    public /* synthetic */ C51259K9v(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, "", null, null, null, null, "", 0, "", str4, str5, str6, str7);
    }

    public C51259K9v(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Long l, String str6, int i, String str7, String str8, String str9, String str10, String str11) {
        HH1.LIZ(str2, "source", str3, "gid", str4, "historyJson");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = num;
        this.LJFF = str5;
        this.LJI = num2;
        this.LJII = l;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = i;
        this.LJIIJ = str7;
        this.LJIIJJI = str8;
        this.LJIIL = str9;
        this.LJIILIIL = str10;
        this.LJIILJJIL = str11;
    }
}
