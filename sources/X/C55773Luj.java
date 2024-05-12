package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Luj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55773Luj {
    public final EnumC57171McB LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final int LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55773Luj)) {
            return false;
        }
        C55773Luj c55773Luj = (C55773Luj) obj;
        return this.LIZ == c55773Luj.LIZ && o.LJ(this.LIZIZ, c55773Luj.LIZIZ) && o.LJ(this.LIZJ, c55773Luj.LIZJ) && o.LJ(this.LIZLLL, c55773Luj.LIZLLL) && o.LJ(this.LJ, c55773Luj.LJ) && o.LJ(this.LJFF, c55773Luj.LJFF) && this.LJI == c55773Luj.LJI && o.LJ(this.LJII, c55773Luj.LJII) && o.LJ(this.LJIIIIZZ, c55773Luj.LJIIIIZZ) && o.LJ(this.LJIIIZ, c55773Luj.LJIIIZ) && o.LJ(this.LJIIJ, c55773Luj.LJIIJ) && o.LJ(this.LJIIJJI, c55773Luj.LJIIJJI) && this.LJIIL == c55773Luj.LJIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        EnumC57171McB enumC57171McB = this.LIZ;
        int hashCode = (enumC57171McB == null ? 0 : enumC57171McB.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        String str6 = this.LJII;
        int hashCode7 = (i2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIIIZZ;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIZ;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIJ;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIIJJI;
        return ((hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.LJIIL;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialShareLinkParams(shareType=");
        sb.append(this.LIZ);
        sb.append(", aid=");
        sb.append(this.LIZIZ);
        sb.append(", shareUrlUtmSource=");
        sb.append(this.LIZJ);
        sb.append(", shareUrlLinkId=");
        sb.append(this.LIZLLL);
        sb.append(", shareUrlUserId=");
        sb.append(this.LJ);
        sb.append(", shareUrlSecUserId=");
        sb.append(this.LJFF);
        sb.append(", isExposeSharerMsg=");
        sb.append(this.LJI);
        sb.append(", checksum=");
        sb.append(this.LJII);
        sb.append(", timeStamp=");
        sb.append(this.LJIIIIZZ);
        sb.append(", invitationScene=");
        sb.append(this.LJIIIZ);
        sb.append(", label=");
        sb.append(this.LJIIJ);
        sb.append(", shareUrl=");
        sb.append(this.LJIIJJI);
        sb.append(", shareLinkMode=");
        return UPJ.LIZLLL(sb, this.LJIIL, ')');
    }

    public C55773Luj(EnumC57171McB enumC57171McB, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, int i) {
        this.LIZ = enumC57171McB;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
        this.LJIIL = i;
    }
}
