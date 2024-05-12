package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69643RUx {
    public static final /* synthetic */ int LJFF = 0;
    public final Image LIZ;
    public final PlatformPromotionItem LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Voucher LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69643RUx)) {
            return false;
        }
        C69643RUx c69643RUx = (C69643RUx) obj;
        return o.LJ(this.LIZ, c69643RUx.LIZ) && o.LJ(this.LIZIZ, c69643RUx.LIZIZ) && o.LJ(this.LIZJ, c69643RUx.LIZJ) && o.LJ(this.LIZLLL, c69643RUx.LIZLLL) && o.LJ(this.LJ, c69643RUx.LJ);
    }

    public final int hashCode() {
        Image image = this.LIZ;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        PlatformPromotionItem platformPromotionItem = this.LIZIZ;
        int hashCode2 = (hashCode + (platformPromotionItem == null ? 0 : platformPromotionItem.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Voucher voucher = this.LJ;
        return hashCode4 + (voucher != null ? voucher.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlatformPromotionBannerData(image=");
        LIZ.append(this.LIZ);
        LIZ.append(", item=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", schema=");
        LIZ.append(this.LIZJ);
        LIZ.append(", daInfo=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", voucher=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C69643RUx(Image image, PlatformPromotionItem platformPromotionItem, String str, String str2, Voucher voucher) {
        this.LIZ = image;
        this.LIZIZ = platformPromotionItem;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = voucher;
    }
}
