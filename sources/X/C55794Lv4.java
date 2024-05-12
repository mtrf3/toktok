package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lv4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55794Lv4 {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public Integer LJIILJJIL;
    public String LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55794Lv4)) {
            return false;
        }
        C55794Lv4 c55794Lv4 = (C55794Lv4) obj;
        return this.LIZ == c55794Lv4.LIZ && this.LIZIZ == c55794Lv4.LIZIZ && o.LJ(this.LIZJ, c55794Lv4.LIZJ) && o.LJ(this.LIZLLL, c55794Lv4.LIZLLL) && this.LJ == c55794Lv4.LJ && o.LJ(this.LJFF, c55794Lv4.LJFF) && o.LJ(this.LJI, c55794Lv4.LJI) && o.LJ(this.LJII, c55794Lv4.LJII) && o.LJ(this.LJIIIIZZ, c55794Lv4.LJIIIIZZ) && o.LJ(this.LJIIIZ, c55794Lv4.LJIIIZ) && o.LJ(this.LJIIJ, c55794Lv4.LJIIJ) && o.LJ(this.LJIIJJI, c55794Lv4.LJIIJJI) && o.LJ(this.LJIIL, c55794Lv4.LJIIL) && o.LJ(this.LJIILIIL, c55794Lv4.LJIILIIL);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJ) * 31;
        String str3 = this.LJFF;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJII;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIIIZZ;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIIZ;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIJ;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIJJI;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIIL;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LJIILIIL;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MallProductItemInfo(itemType=");
        sb.append(this.LIZ);
        sb.append(", tapType=");
        sb.append(this.LIZIZ);
        sb.append(", productId=");
        sb.append(this.LIZJ);
        sb.append(", authorId=");
        sb.append(this.LIZLLL);
        sb.append(", sourceType=");
        sb.append(this.LJ);
        sb.append(", roomId=");
        sb.append(this.LJFF);
        sb.append(", itemId=");
        sb.append(this.LJI);
        sb.append(", requestId=");
        sb.append(this.LJII);
        sb.append(", productImageUrl=");
        sb.append(this.LJIIIIZZ);
        sb.append(", productDescription=");
        sb.append(this.LJIIIZ);
        sb.append(", productPrice=");
        sb.append(this.LJIIJ);
        sb.append(", productSoldCountStr=");
        sb.append(this.LJIIJJI);
        sb.append(", productSchema=");
        sb.append(this.LJIIL);
        sb.append(", productSource=");
        return C07670Rv.LIZIZ(sb, this.LJIILIIL, ')');
    }

    public C55794Lv4(int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i3;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = str8;
        this.LJIIJJI = str9;
        this.LJIIL = str10;
        this.LJIILIIL = str11;
    }
}
