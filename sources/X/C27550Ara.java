package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ara, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27550Ara {
    public final String LIZ;
    public final Image LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final StoreOfficialLabel LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27550Ara)) {
            return false;
        }
        C27550Ara c27550Ara = (C27550Ara) obj;
        return o.LJ(this.LIZ, c27550Ara.LIZ) && o.LJ(this.LIZIZ, c27550Ara.LIZIZ) && o.LJ(this.LIZJ, c27550Ara.LIZJ) && o.LJ(this.LIZLLL, c27550Ara.LIZLLL) && o.LJ(this.LJ, c27550Ara.LJ) && o.LJ(this.LJFF, c27550Ara.LJFF) && o.LJ(this.LJI, c27550Ara.LJI) && o.LJ(this.LJII, c27550Ara.LJII) && this.LJIIIIZZ == c27550Ara.LJIIIIZZ && this.LJIIIZ == c27550Ara.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.LIZIZ;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StoreOfficialLabel storeOfficialLabel = this.LJI;
        int hashCode7 = (hashCode6 + (storeOfficialLabel == null ? 0 : storeOfficialLabel.hashCode())) * 31;
        String str6 = this.LJII;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.LJIIIIZZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode8 + i) * 31) + (this.LJIIIZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UsShopProfileVO(sellerId=");
        LIZ.append(this.LIZ);
        LIZ.append(", avatar=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sellerName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", rating=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", link=");
        LIZ.append(this.LJ);
        LIZ.append(", shopLink=");
        LIZ.append(this.LJFF);
        LIZ.append(", officialLabel=");
        LIZ.append(this.LJI);
        LIZ.append(", shopInfoText=");
        LIZ.append(this.LJII);
        LIZ.append(", hasUnreadMsg=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", hasDivider=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C27550Ara(String str, Image image, String str2, String str3, String str4, String str5, StoreOfficialLabel storeOfficialLabel, String str6, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = image;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = storeOfficialLabel;
        this.LJII = str6;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
    }
}
