package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.RXa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69698RXa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public Integer LIZLLL;
    public Boolean LJ;
    public final ReviewItemStruct.User LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final Boolean LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final Integer LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69698RXa)) {
            return false;
        }
        C69698RXa c69698RXa = (C69698RXa) obj;
        return o.LJ(this.LIZ, c69698RXa.LIZ) && o.LJ(this.LIZIZ, c69698RXa.LIZIZ) && o.LJ(this.LIZJ, c69698RXa.LIZJ) && o.LJ(this.LIZLLL, c69698RXa.LIZLLL) && o.LJ(this.LJ, c69698RXa.LJ) && o.LJ(this.LJFF, c69698RXa.LJFF) && o.LJ(this.LJI, c69698RXa.LJI) && o.LJ(this.LJII, c69698RXa.LJII) && this.LJIIIIZZ == c69698RXa.LJIIIIZZ && o.LJ(this.LJIIIZ, c69698RXa.LJIIIZ) && this.LJIIJ == c69698RXa.LJIIJ && o.LJ(this.LJIIJJI, c69698RXa.LJIIJJI) && o.LJ(this.LJIIL, c69698RXa.LJIIL) && o.LJ(this.LJIILIIL, c69698RXa.LJIILIIL) && o.LJ(this.LJIILJJIL, c69698RXa.LJIILJJIL) && o.LJ(this.LJIILL, c69698RXa.LJIILL) && o.LJ(this.LJIILLIIL, c69698RXa.LJIILLIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJ;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        ReviewItemStruct.User user = this.LJFF;
        int hashCode6 = (hashCode5 + (user == null ? 0 : user.hashCode())) * 31;
        String str4 = this.LJI;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJII;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.LJIIIIZZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        String str6 = this.LJIIIZ;
        int hashCode9 = (((i2 + (str6 == null ? 0 : str6.hashCode())) * 31) + (this.LJIIJ ? 1 : 0)) * 31;
        Boolean bool2 = this.LJIIJJI;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.LJIIL;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIILIIL;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.LJIILJJIL;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.LJIILL;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIILLIIL;
        return hashCode14 + (str10 != null ? str10.hashCode() : 0);
    }

    public C69698RXa() {
        this("", CardStruct.IStatusCode.DEFAULT, null, null, null, null, null, null, false, CardStruct.IStatusCode.DEFAULT, false, Boolean.FALSE, null, null, null, null, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleReviewItem(reviewId=");
        sb.append(this.LIZ);
        sb.append(", rating=");
        sb.append(this.LIZIZ);
        sb.append(", specification=");
        sb.append(this.LIZJ);
        sb.append(", diggCount=");
        sb.append(this.LIZLLL);
        sb.append(", isDigged=");
        sb.append(this.LJ);
        sb.append(", user=");
        sb.append(this.LJFF);
        sb.append(", text=");
        sb.append(this.LJI);
        sb.append(", skuId=");
        sb.append(this.LJII);
        sb.append(", isOwner=");
        sb.append(this.LJIIIIZZ);
        sb.append(", reviewTimeStamp=");
        sb.append(this.LJIIIZ);
        sb.append(", isAnonymous=");
        sb.append(this.LJIIJ);
        sb.append(", hasOriginText=");
        sb.append(this.LJIIJJI);
        sb.append(", reviewTimestampFmt=");
        sb.append(this.LJIIL);
        sb.append(", reviewSourceName=");
        sb.append(this.LJIILIIL);
        sb.append(", reviewSourceType=");
        sb.append(this.LJIILJJIL);
        sb.append(", reviewLink=");
        sb.append(this.LJIILL);
        sb.append(", reviewLabelText=");
        return C07670Rv.LIZIZ(sb, this.LJIILLIIL, ')');
    }

    public static C69698RXa LIZ(C69698RXa c69698RXa, Integer num, Boolean bool) {
        String str = c69698RXa.LIZ;
        String str2 = c69698RXa.LIZIZ;
        String str3 = c69698RXa.LIZJ;
        ReviewItemStruct.User user = c69698RXa.LJFF;
        String str4 = c69698RXa.LJI;
        String str5 = c69698RXa.LJII;
        boolean z = c69698RXa.LJIIIIZZ;
        String str6 = c69698RXa.LJIIIZ;
        boolean z2 = c69698RXa.LJIIJ;
        Boolean bool2 = c69698RXa.LJIIJJI;
        String str7 = c69698RXa.LJIIL;
        String str8 = c69698RXa.LJIILIIL;
        Integer num2 = c69698RXa.LJIILJJIL;
        String str9 = c69698RXa.LJIILL;
        String str10 = c69698RXa.LJIILLIIL;
        c69698RXa.getClass();
        return new C69698RXa(str, str2, str3, num, bool, user, str4, str5, z, str6, z2, bool2, str7, str8, num2, str9, str10);
    }

    public C69698RXa(String str, String str2, String str3, Integer num, Boolean bool, ReviewItemStruct.User user, String str4, String str5, boolean z, String str6, boolean z2, Boolean bool2, String str7, String str8, Integer num2, String str9, String str10) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = num;
        this.LJ = bool;
        this.LJFF = user;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str6;
        this.LJIIJ = z2;
        this.LJIIJJI = bool2;
        this.LJIIL = str7;
        this.LJIILIIL = str8;
        this.LJIILJJIL = num2;
        this.LJIILL = str9;
        this.LJIILLIIL = str10;
    }
}
