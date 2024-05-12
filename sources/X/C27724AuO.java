package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.HighLightPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionDiscountBrief;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionTagStyle;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AuO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27724AuO {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final List<C69645RUz> LJ;
    public final String LJFF;
    public final String LJI;
    public final Integer LJII;
    public final String LJIIIIZZ;
    public final PromotionTagStyle LJIIIZ;
    public final HighLightPromotionInfo LJIIJ;
    public final List<PromotionDiscountBrief> LJIIJJI;
    public final BonusInfo LJIIL;
    public final String LJIILIIL;
    public final PromotionBanner LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27724AuO)) {
            return false;
        }
        C27724AuO c27724AuO = (C27724AuO) obj;
        return o.LJ(this.LIZ, c27724AuO.LIZ) && o.LJ(this.LIZIZ, c27724AuO.LIZIZ) && this.LIZJ == c27724AuO.LIZJ && o.LJ(this.LIZLLL, c27724AuO.LIZLLL) && o.LJ(this.LJ, c27724AuO.LJ) && o.LJ(this.LJFF, c27724AuO.LJFF) && o.LJ(this.LJI, c27724AuO.LJI) && o.LJ(this.LJII, c27724AuO.LJII) && o.LJ(this.LJIIIIZZ, c27724AuO.LJIIIIZZ) && this.LJIIIZ == c27724AuO.LJIIIZ && o.LJ(this.LJIIJ, c27724AuO.LJIIJ) && o.LJ(this.LJIIJJI, c27724AuO.LJIIJJI) && o.LJ(this.LJIIL, c27724AuO.LJIIL) && o.LJ(this.LJIILIIL, c27724AuO.LJIILIIL) && o.LJ(this.LJIILJJIL, c27724AuO.LJIILJJIL);
    }

    public final String toString() {
        return "PlatformDiscountsVO(totalDiscounts=" + this.LIZ + ", platformCouponCacheKey=" + this.LIZIZ + ", selectShippingVoucher=" + this.LIZJ + ", couponSchema=" + this.LIZLLL + ", voucherList=" + this.LJ + ", couponStatus=" + this.LJFF + ", title=" + this.LJI + ", unusedCouponCount=" + this.LJII + ", promotionTagText=" + this.LJIIIIZZ + ", promotionTagStyle=" + this.LJIIIZ + ", highLightInfo=" + this.LJIIJ + ", discountList=" + this.LJIIJJI + ", bonusInfo=" + this.LJIIL + ", daInfo=" + this.LJIILIIL + ", promotionBanner=" + this.LJIILJJIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        boolean z = this.LIZJ;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        String str3 = this.LIZLLL;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJ, (i5 + hashCode3) * 31, 31);
        String str4 = this.LJFF;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i6 = (LIZIZ + hashCode4) * 31;
        String str5 = this.LJI;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        Integer num = this.LJII;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        String str6 = this.LJIIIIZZ;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        PromotionTagStyle promotionTagStyle = this.LJIIIZ;
        if (promotionTagStyle == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = promotionTagStyle.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        HighLightPromotionInfo highLightPromotionInfo = this.LJIIJ;
        if (highLightPromotionInfo == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = highLightPromotionInfo.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        List<PromotionDiscountBrief> list = this.LJIIJJI;
        if (list == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list.hashCode();
        }
        int i12 = (i11 + hashCode10) * 31;
        BonusInfo bonusInfo = this.LJIIL;
        if (bonusInfo == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bonusInfo.hashCode();
        }
        int i13 = (i12 + hashCode11) * 31;
        String str7 = this.LJIILIIL;
        if (str7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str7.hashCode();
        }
        int i14 = (i13 + hashCode12) * 31;
        PromotionBanner promotionBanner = this.LJIILJJIL;
        if (promotionBanner != null) {
            i = promotionBanner.hashCode();
        }
        return i14 + i;
    }

    public C27724AuO(String str, String str2, boolean z, String str3, List<C69645RUz> voucherList, String str4, String str5, Integer num, String str6, PromotionTagStyle promotionTagStyle, HighLightPromotionInfo highLightPromotionInfo, List<PromotionDiscountBrief> list, BonusInfo bonusInfo, String str7, PromotionBanner promotionBanner) {
        o.LJIIIZ(voucherList, "voucherList");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = str3;
        this.LJ = voucherList;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = num;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = promotionTagStyle;
        this.LJIIJ = highLightPromotionInfo;
        this.LJIIJJI = list;
        this.LJIIL = bonusInfo;
        this.LJIILIIL = str7;
        this.LJIILJJIL = promotionBanner;
    }
}
