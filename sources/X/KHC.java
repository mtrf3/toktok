package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KHC {
    public String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public Integer LIZLLL;
    public Integer LJ;
    public final String LJFF;
    public String LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public final String LJIILJJIL;
    public final KHH LJIILL;
    public final String LJIILLIIL;
    public Integer LJIIZILJ;
    public String LJIJ;
    public String LJIJI;

    public KHC() {
        this(null, null, null, 1048575);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KHC)) {
            return false;
        }
        KHC khc = (KHC) obj;
        return o.LJ(this.LIZ, khc.LIZ) && o.LJ(this.LIZIZ, khc.LIZIZ) && o.LJ(this.LIZJ, khc.LIZJ) && o.LJ(this.LIZLLL, khc.LIZLLL) && o.LJ(this.LJ, khc.LJ) && o.LJ(this.LJFF, khc.LJFF) && o.LJ(this.LJI, khc.LJI) && o.LJ(this.LJII, khc.LJII) && o.LJ(this.LJIIIIZZ, khc.LJIIIIZZ) && o.LJ(this.LJIIIZ, khc.LJIIIZ) && o.LJ(this.LJIIJ, khc.LJIIJ) && o.LJ(this.LJIIJJI, khc.LJIIJJI) && o.LJ(this.LJIIL, khc.LJIIL) && o.LJ(this.LJIILIIL, khc.LJIILIIL) && o.LJ(this.LJIILJJIL, khc.LJIILJJIL) && o.LJ(this.LJIILL, khc.LJIILL) && o.LJ(this.LJIILLIIL, khc.LJIILLIIL) && o.LJ(this.LJIIZILJ, khc.LJIIZILJ) && o.LJ(this.LJIJ, khc.LJIJ) && o.LJ(this.LJIJI, khc.LJIJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.LJFF;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.LJII;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.LJIIIZ;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIJ;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIJJI;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIL;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIILIIL;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LJIILJJIL;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        KHH khh = this.LJIILL;
        int hashCode16 = (hashCode15 + (khh == null ? 0 : khh.hashCode())) * 31;
        String str12 = this.LJIILLIIL;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.LJIIZILJ;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str13 = this.LJIJ;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LJIJI;
        return hashCode19 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoSearchRequest(keyword=");
        sb.append(this.LIZ);
        sb.append(", searchSource=");
        sb.append(this.LIZIZ);
        sb.append(", source=");
        sb.append(this.LIZJ);
        sb.append(", hotSearch=");
        sb.append(this.LIZLLL);
        sb.append(", correctType=");
        sb.append(this.LJ);
        sb.append(", searchId=");
        sb.append(this.LJFF);
        sb.append(", lastSearchId=");
        sb.append(this.LJI);
        sb.append(", cursor=");
        sb.append(this.LJII);
        sb.append(", count=");
        sb.append(this.LJIIIIZZ);
        sb.append(", enterFrom=");
        sb.append(this.LJIIIZ);
        sb.append(", searchContext=");
        sb.append(this.LJIIJ);
        sb.append(", searchChannel=");
        sb.append(this.LJIIJJI);
        sb.append(", attachProducts=");
        sb.append(this.LJIIL);
        sb.append(", trafficSourceList=");
        sb.append(this.LJIILIIL);
        sb.append(", personalContextInfo=");
        sb.append(this.LJIILJJIL);
        sb.append(", photoSearch=");
        sb.append(this.LJIILL);
        sb.append(", productDetailUri=");
        sb.append(this.LJIILLIIL);
        sb.append(", recallShield=");
        sb.append(this.LJIIZILJ);
        sb.append(", searchSessionId=");
        sb.append(this.LJIJ);
        sb.append(", ecSearchSessionId=");
        return C07670Rv.LIZIZ(sb, this.LJIJI, ')');
    }

    public KHC(String str, KHH khh, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        khh = (32768 & i) != 0 ? null : khh;
        str2 = (i & 65536) != 0 ? null : str2;
        this.LIZ = null;
        this.LIZIZ = str;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = khh;
        this.LJIILLIIL = str2;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = null;
    }
}
