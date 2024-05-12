package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9E {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final C51244K9g LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final C50948Jz6 LJIILIIL;
    public final Integer LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final C208398Fv LJIIZILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K9E)) {
            return false;
        }
        K9E k9e = (K9E) obj;
        return o.LJ(this.LIZ, k9e.LIZ) && o.LJ(this.LIZIZ, k9e.LIZIZ) && o.LJ(this.LIZJ, k9e.LIZJ) && o.LJ(this.LIZLLL, k9e.LIZLLL) && o.LJ(this.LJ, k9e.LJ) && o.LJ(this.LJFF, k9e.LJFF) && o.LJ(this.LJI, k9e.LJI) && o.LJ(this.LJII, k9e.LJII) && this.LJIIIIZZ == k9e.LJIIIIZZ && o.LJ(this.LJIIIZ, k9e.LJIIIZ) && o.LJ(this.LJIIJ, k9e.LJIIJ) && o.LJ(this.LJIIJJI, k9e.LJIIJJI) && o.LJ(this.LJIIL, k9e.LJIIL) && o.LJ(this.LJIILIIL, k9e.LJIILIIL) && o.LJ(this.LJIILJJIL, k9e.LJIILJJIL) && o.LJ(this.LJIILL, k9e.LJIILL) && o.LJ(this.LJIILLIIL, k9e.LJIILLIIL) && o.LJ(this.LJIIZILJ, k9e.LJIIZILJ);
    }

    public final String toString() {
        return "ECSearchBarImmutableData(enterFrom=" + this.LIZ + ", defaultKeyword=" + this.LIZIZ + ", defaultHint=" + this.LIZJ + ", activityHashCode=" + this.LIZLLL + ", counponInfo=" + this.LJ + ", promotionInfo=" + this.LJFF + ", resultAttachCard=" + this.LJI + ", trafficSourceList=" + this.LJII + ", isFromVideo=" + this.LJIIIIZZ + ", isFromComment=" + this.LJIIIZ + ", lastFromGroupId=" + this.LJIIJ + ", attachProducts=" + this.LJIIJJI + ", personalContextInfo=" + this.LJIIL + ", enterParam=" + this.LJIILIIL + ", feedSearchBarFlag=" + this.LJIILJJIL + ", mobProductPanelType=" + this.LJIILL + ", mobEnterGroupId=" + this.LJIILLIIL + ", capsuleWords=" + this.LJIIZILJ + ')';
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
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14 = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode14 + hashCode) * 31;
        String str2 = this.LIZJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZLLL, (i2 + hashCode2) * 31, 31);
        String str3 = this.LJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (LJ + hashCode3) * 31;
        String str4 = this.LJFF;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        C51244K9g c51244K9g = this.LJI;
        if (c51244K9g == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c51244K9g.hashCode();
        }
        int LJ2 = (C79062V1e.LJ(this.LJII, (i4 + hashCode5) * 31, 31) + this.LJIIIIZZ) * 31;
        String str5 = this.LJIIIZ;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i5 = (LJ2 + hashCode6) * 31;
        String str6 = this.LJIIJ;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i6 = (i5 + hashCode7) * 31;
        String str7 = this.LJIIJJI;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i7 = (i6 + hashCode8) * 31;
        String str8 = this.LJIIL;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i8 = (i7 + hashCode9) * 31;
        C50948Jz6 c50948Jz6 = this.LJIILIIL;
        if (c50948Jz6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c50948Jz6.hashCode();
        }
        int i9 = (i8 + hashCode10) * 31;
        Integer num = this.LJIILJJIL;
        if (num == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num.hashCode();
        }
        int i10 = (i9 + hashCode11) * 31;
        String str9 = this.LJIILL;
        if (str9 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str9.hashCode();
        }
        int i11 = (i10 + hashCode12) * 31;
        String str10 = this.LJIILLIIL;
        if (str10 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str10.hashCode();
        }
        int i12 = (i11 + hashCode13) * 31;
        C208398Fv c208398Fv = this.LJIIZILJ;
        if (c208398Fv != null) {
            i = c208398Fv.hashCode();
        }
        return i12 + i;
    }

    public K9E(String str, String str2, String str3, String str4, String str5, String str6, C51244K9g c51244K9g, String str7, int i, String str8, String str9, String str10, String str11, C50948Jz6 c50948Jz6, Integer num, String str12, String str13, C208398Fv c208398Fv) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = c51244K9g;
        this.LJII = str7;
        this.LJIIIIZZ = i;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
        this.LJIIL = str11;
        this.LJIILIIL = c50948Jz6;
        this.LJIILJJIL = num;
        this.LJIILL = str12;
        this.LJIILLIIL = str13;
        this.LJIIZILJ = c208398Fv;
    }
}
