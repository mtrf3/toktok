package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JoD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50273JoD {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;
    public final Integer LJIILJJIL;
    public final String LJIILL = "inner_flow";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50273JoD)) {
            return false;
        }
        C50273JoD c50273JoD = (C50273JoD) obj;
        return o.LJ(this.LIZ, c50273JoD.LIZ) && o.LJ(this.LIZIZ, c50273JoD.LIZIZ) && o.LJ(this.LIZJ, c50273JoD.LIZJ) && this.LIZLLL == c50273JoD.LIZLLL && this.LJ == c50273JoD.LJ && o.LJ(this.LJFF, c50273JoD.LJFF) && o.LJ(this.LJI, c50273JoD.LJI) && o.LJ(this.LJII, c50273JoD.LJII) && o.LJ(this.LJIIIIZZ, c50273JoD.LJIIIIZZ) && o.LJ(this.LJIIIZ, c50273JoD.LJIIIZ) && o.LJ(this.LJIIJ, c50273JoD.LJIIJ) && o.LJ(this.LJIIJJI, c50273JoD.LJIIJJI) && this.LJIIL == c50273JoD.LJIIL && o.LJ(this.LJIILIIL, c50273JoD.LJIILIIL) && o.LJ(this.LJIILJJIL, c50273JoD.LJIILJJIL);
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
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LIZJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (((((i3 + hashCode3) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        String str4 = this.LJFF;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJI, (i4 + hashCode4) * 31, 31);
        String str5 = this.LJII;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (LJ + hashCode5) * 31;
        String str6 = this.LJIIIIZZ;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str7 = this.LJIIIZ;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str8 = this.LJIIJ;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str9 = this.LJIIJJI;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i9 = (((i8 + hashCode9) * 31) + this.LJIIL) * 31;
        String str10 = this.LJIILIIL;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        Integer num = this.LJIILJJIL;
        if (num != null) {
            i = num.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InnerFlowRequest(searchId=");
        sb.append(this.LIZ);
        sb.append(", sugGenerateType=");
        sb.append(this.LIZIZ);
        sb.append(", innerSearchId=");
        sb.append(this.LIZJ);
        sb.append(", offset=");
        sb.append(this.LIZLLL);
        sb.append(", preloadNum=");
        sb.append(this.LJ);
        sb.append(", keyword=");
        sb.append(this.LJFF);
        sb.append(", innerFlowContext=");
        sb.append(this.LJI);
        sb.append(", backtrace=");
        sb.append(this.LJII);
        sb.append(", consumeInfos=");
        sb.append(this.LJIIIIZZ);
        sb.append(", inflowAdInfo=");
        sb.append(this.LJIIIZ);
        sb.append(", adUserAgent=");
        sb.append(this.LJIIJ);
        sb.append(", gaid=");
        sb.append(this.LJIIJJI);
        sb.append(", personalityMode=");
        sb.append(this.LJIIL);
        sb.append(", cmplEnc=");
        sb.append(this.LJIILIIL);
        sb.append(", isNonPersonalizedSearch=");
        return UC7.LIZ(sb, this.LJIILJJIL, ')');
    }

    public C50273JoD(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, String str11, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
        this.LJIIL = i3;
        this.LJIILIIL = str11;
        this.LJIILJJIL = num;
    }
}
