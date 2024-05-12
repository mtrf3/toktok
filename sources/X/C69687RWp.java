package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RWp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69687RWp {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final CombinedSalesVolume LJFF;
    public final String LJI;
    public final boolean LJII;
    public final AbstractC70489RlV LJIIIIZZ;
    public final ProductDetailReview LJIIIZ;
    public final boolean LJIIJ;
    public final FlashSale LJIIJJI;
    public final PickTag LJIIL;
    public final boolean LJIILIIL;
    public final List<PromotionLogo> LJIILJJIL;
    public final List<ProductLogo> LJIILL;
    public final PromotionView LJIILLIIL;
    public final PurchaseNotice LJIIZILJ;
    public final Boolean LJIJ;
    public final int LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;
    public final EnumC70499Rlf LJJI;
    public final DeductibleVoucherReminder LJJIFFI;
    public final Boolean LJJII;
    public final boolean LJJIII;
    public final String LJJIIJ;
    public final boolean LJJIIJZLJL;
    public final UserRightTag LJJIIZ;
    public final boolean LJJIIZI;
    public final SkuItem LJJIJ;
    public final LinkRichText LJJIJIIJI;
    public final String LJJIJIIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69687RWp)) {
            return false;
        }
        C69687RWp c69687RWp = (C69687RWp) obj;
        return o.LJ(this.LIZ, c69687RWp.LIZ) && o.LJ(this.LIZIZ, c69687RWp.LIZIZ) && o.LJ(this.LIZJ, c69687RWp.LIZJ) && o.LJ(this.LIZLLL, c69687RWp.LIZLLL) && o.LJ(this.LJ, c69687RWp.LJ) && o.LJ(this.LJFF, c69687RWp.LJFF) && o.LJ(this.LJI, c69687RWp.LJI) && this.LJII == c69687RWp.LJII && o.LJ(this.LJIIIIZZ, c69687RWp.LJIIIIZZ) && o.LJ(this.LJIIIZ, c69687RWp.LJIIIZ) && this.LJIIJ == c69687RWp.LJIIJ && o.LJ(this.LJIIJJI, c69687RWp.LJIIJJI) && o.LJ(this.LJIIL, c69687RWp.LJIIL) && this.LJIILIIL == c69687RWp.LJIILIIL && o.LJ(this.LJIILJJIL, c69687RWp.LJIILJJIL) && o.LJ(this.LJIILL, c69687RWp.LJIILL) && o.LJ(this.LJIILLIIL, c69687RWp.LJIILLIIL) && o.LJ(this.LJIIZILJ, c69687RWp.LJIIZILJ) && o.LJ(this.LJIJ, c69687RWp.LJIJ) && this.LJIJI == c69687RWp.LJIJI && this.LJIJJ == c69687RWp.LJIJJ && this.LJIJJLI == c69687RWp.LJIJJLI && this.LJIL == c69687RWp.LJIL && this.LJJ == c69687RWp.LJJ && this.LJJI == c69687RWp.LJJI && o.LJ(this.LJJIFFI, c69687RWp.LJJIFFI) && o.LJ(this.LJJII, c69687RWp.LJJII) && this.LJJIII == c69687RWp.LJJIII && o.LJ(this.LJJIIJ, c69687RWp.LJJIIJ) && this.LJJIIJZLJL == c69687RWp.LJJIIJZLJL && o.LJ(this.LJJIIZ, c69687RWp.LJJIIZ) && this.LJJIIZI == c69687RWp.LJJIIZI && o.LJ(this.LJJIJ, c69687RWp.LJJIJ) && o.LJ(this.LJJIJIIJI, c69687RWp.LJJIJIIJI) && o.LJ(this.LJJIJIIJIL, c69687RWp.LJJIJIIJIL);
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
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        String str = this.LIZLLL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        CombinedSalesVolume combinedSalesVolume = this.LJFF;
        if (combinedSalesVolume == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = combinedSalesVolume.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJI, (i3 + hashCode3) * 31, 31);
        boolean z = this.LJII;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int hashCode18 = (this.LJIIIIZZ.hashCode() + ((LJ2 + i5) * 31)) * 31;
        ProductDetailReview productDetailReview = this.LJIIIZ;
        if (productDetailReview == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = productDetailReview.hashCode();
        }
        int i6 = (hashCode18 + hashCode4) * 31;
        boolean z2 = this.LJIIJ;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        FlashSale flashSale = this.LJIIJJI;
        if (flashSale == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = flashSale.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        PickTag pickTag = this.LJIIL;
        if (pickTag == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = pickTag.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        boolean z3 = this.LJIILIIL;
        int i11 = z3;
        if (z3 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        List<PromotionLogo> list = this.LJIILJJIL;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i13 = (i12 + hashCode7) * 31;
        List<ProductLogo> list2 = this.LJIILL;
        if (list2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list2.hashCode();
        }
        int i14 = (i13 + hashCode8) * 31;
        PromotionView promotionView = this.LJIILLIIL;
        if (promotionView == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = promotionView.hashCode();
        }
        int i15 = (i14 + hashCode9) * 31;
        PurchaseNotice purchaseNotice = this.LJIIZILJ;
        if (purchaseNotice == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = purchaseNotice.hashCode();
        }
        int i16 = (i15 + hashCode10) * 31;
        Boolean bool = this.LJIJ;
        if (bool == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool.hashCode();
        }
        int i17 = (((i16 + hashCode11) * 31) + this.LJIJI) * 31;
        boolean z4 = this.LJIJJ;
        int i18 = z4;
        if (z4 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z5 = this.LJIJJLI;
        int i20 = z5;
        if (z5 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z6 = this.LJIL;
        int i22 = z6;
        if (z6 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        boolean z7 = this.LJJ;
        int i24 = z7;
        if (z7 != 0) {
            i24 = 1;
        }
        int hashCode19 = (this.LJJI.hashCode() + ((i23 + i24) * 31)) * 31;
        DeductibleVoucherReminder deductibleVoucherReminder = this.LJJIFFI;
        if (deductibleVoucherReminder == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = deductibleVoucherReminder.hashCode();
        }
        int i25 = (hashCode19 + hashCode12) * 31;
        Boolean bool2 = this.LJJII;
        if (bool2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool2.hashCode();
        }
        int i26 = (i25 + hashCode13) * 31;
        boolean z8 = this.LJJIII;
        int i27 = z8;
        if (z8 != 0) {
            i27 = 1;
        }
        int i28 = (i26 + i27) * 31;
        String str3 = this.LJJIIJ;
        if (str3 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str3.hashCode();
        }
        int i29 = (i28 + hashCode14) * 31;
        boolean z9 = this.LJJIIJZLJL;
        int i30 = z9;
        if (z9 != 0) {
            i30 = 1;
        }
        int i31 = (i29 + i30) * 31;
        UserRightTag userRightTag = this.LJJIIZ;
        if (userRightTag == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = userRightTag.hashCode();
        }
        int i32 = (i31 + hashCode15) * 31;
        if (!this.LJJIIZI) {
            i4 = 0;
        }
        int i33 = (i32 + i4) * 31;
        SkuItem skuItem = this.LJJIJ;
        if (skuItem == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = skuItem.hashCode();
        }
        int i34 = (i33 + hashCode16) * 31;
        LinkRichText linkRichText = this.LJJIJIIJI;
        if (linkRichText == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = linkRichText.hashCode();
        }
        int i35 = (i34 + hashCode17) * 31;
        String str4 = this.LJJIJIIJIL;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i35 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductInfoVO(title=");
        sb.append(this.LIZ);
        sb.append(", realPrice=");
        sb.append(this.LIZIZ);
        sb.append(", originPrice=");
        sb.append(this.LIZJ);
        sb.append(", sales=");
        sb.append(this.LIZLLL);
        sb.append(", purchaseLimit=");
        sb.append(this.LJ);
        sb.append(", combinedSalesVolume=");
        sb.append(this.LJFF);
        sb.append(", discount=");
        sb.append(this.LJI);
        sb.append(", needIcon=");
        sb.append(this.LJII);
        sb.append(", waistStyle=");
        sb.append(this.LJIIIIZZ);
        sb.append(", review=");
        sb.append(this.LJIIIZ);
        sb.append(", freeShipping=");
        sb.append(this.LJIIJ);
        sb.append(", flashSale=");
        sb.append(this.LJIIJJI);
        sb.append(", activityInfo=");
        sb.append(this.LJIIL);
        sb.append(", isIntervalPrice=");
        sb.append(this.LJIILIIL);
        sb.append(", promotionLogos=");
        sb.append(this.LJIILJJIL);
        sb.append(", productLogos=");
        sb.append(this.LJIILL);
        sb.append(", promotionView=");
        sb.append(this.LJIILLIIL);
        sb.append(", purchaseNotice=");
        sb.append(this.LJIIZILJ);
        sb.append(", isLoading=");
        sb.append(this.LJIJ);
        sb.append(", template=");
        sb.append(this.LJIJI);
        sb.append(", showPrice=");
        sb.append(this.LJIJJ);
        sb.append(", isUS=");
        sb.append(this.LJIJJLI);
        sb.append(", hideNewCouponsArea=");
        sb.append(this.LJIL);
        sb.append(", showHotZone=");
        sb.append(this.LJJ);
        sb.append(", deductionTextShowType=");
        sb.append(this.LJJI);
        sb.append(", voucherReminder=");
        sb.append(this.LJJIFFI);
        sb.append(", isFavorite=");
        sb.append(this.LJJII);
        sb.append(", fromFull=");
        sb.append(this.LJJIII);
        sb.append(", couponSchema=");
        sb.append(this.LJJIIJ);
        sb.append(", needDivider=");
        sb.append(this.LJJIIJZLJL);
        sb.append(", freeReturn=");
        sb.append(this.LJJIIZ);
        sb.append(", removePrice=");
        sb.append(this.LJJIIZI);
        sb.append(", skuItem=");
        sb.append(this.LJJIJ);
        sb.append(", globalShippingTag=");
        sb.append(this.LJJIJIIJI);
        sb.append(", pricePanelSchema=");
        return C07670Rv.LIZIZ(sb, this.LJJIJIIJIL, ')');
    }

    public static C69687RWp LIZ(C69687RWp c69687RWp, String str, String str2, String str3, boolean z, int i) {
        String title;
        String str4;
        String str5;
        CombinedSalesVolume combinedSalesVolume;
        AbstractC70489RlV waistStyle;
        ProductDetailReview productDetailReview;
        boolean z2;
        FlashSale flashSale;
        PickTag pickTag;
        boolean z3;
        List<PromotionLogo> list;
        List<ProductLogo> list2;
        PromotionView promotionView;
        PurchaseNotice purchaseNotice;
        Boolean bool;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        EnumC70499Rlf deductionTextShowType;
        DeductibleVoucherReminder deductibleVoucherReminder;
        Boolean bool2;
        boolean z8;
        String str6;
        boolean z9;
        UserRightTag userRightTag;
        boolean z10;
        boolean z11 = z;
        String str7 = str3;
        String str8 = str;
        String str9 = str2;
        if ((i & 1) != 0) {
            title = c69687RWp.LIZ;
        } else {
            title = null;
        }
        if ((i & 2) != 0) {
            str8 = c69687RWp.LIZIZ;
        }
        if ((i & 4) != 0) {
            str9 = c69687RWp.LIZJ;
        }
        if ((i & 8) != 0) {
            str4 = c69687RWp.LIZLLL;
        } else {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = c69687RWp.LJ;
        } else {
            str5 = null;
        }
        if ((i & 32) != 0) {
            combinedSalesVolume = c69687RWp.LJFF;
        } else {
            combinedSalesVolume = null;
        }
        if ((i & 64) != 0) {
            str7 = c69687RWp.LJI;
        }
        if ((i & 128) != 0) {
            z11 = c69687RWp.LJII;
        }
        if ((i & 256) != 0) {
            waistStyle = c69687RWp.LJIIIIZZ;
        } else {
            waistStyle = null;
        }
        if ((i & 512) != 0) {
            productDetailReview = c69687RWp.LJIIIZ;
        } else {
            productDetailReview = null;
        }
        if ((i & 1024) != 0) {
            z2 = c69687RWp.LJIIJ;
        } else {
            z2 = false;
        }
        if ((i & 2048) != 0) {
            flashSale = c69687RWp.LJIIJJI;
        } else {
            flashSale = null;
        }
        if ((i & 4096) != 0) {
            pickTag = c69687RWp.LJIIL;
        } else {
            pickTag = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z3 = c69687RWp.LJIILIIL;
        } else {
            z3 = false;
        }
        if ((i & 16384) != 0) {
            list = c69687RWp.LJIILJJIL;
        } else {
            list = null;
        }
        if ((32768 & i) != 0) {
            list2 = c69687RWp.LJIILL;
        } else {
            list2 = null;
        }
        if ((65536 & i) != 0) {
            promotionView = c69687RWp.LJIILLIIL;
        } else {
            promotionView = null;
        }
        if ((131072 & i) != 0) {
            purchaseNotice = c69687RWp.LJIIZILJ;
        } else {
            purchaseNotice = null;
        }
        if ((262144 & i) != 0) {
            bool = c69687RWp.LJIJ;
        } else {
            bool = null;
        }
        if ((524288 & i) != 0) {
            i2 = c69687RWp.LJIJI;
        } else {
            i2 = 0;
        }
        if ((1048576 & i) != 0) {
            z4 = c69687RWp.LJIJJ;
        } else {
            z4 = false;
        }
        if ((2097152 & i) != 0) {
            z5 = c69687RWp.LJIJJLI;
        } else {
            z5 = false;
        }
        if ((4194304 & i) != 0) {
            z6 = c69687RWp.LJIL;
        } else {
            z6 = false;
        }
        if ((8388608 & i) != 0) {
            z7 = c69687RWp.LJJ;
        } else {
            z7 = false;
        }
        if ((16777216 & i) != 0) {
            deductionTextShowType = c69687RWp.LJJI;
        } else {
            deductionTextShowType = null;
        }
        if ((33554432 & i) != 0) {
            deductibleVoucherReminder = c69687RWp.LJJIFFI;
        } else {
            deductibleVoucherReminder = null;
        }
        if ((67108864 & i) != 0) {
            bool2 = c69687RWp.LJJII;
        } else {
            bool2 = null;
        }
        if ((134217728 & i) != 0) {
            z8 = c69687RWp.LJJIII;
        } else {
            z8 = false;
        }
        if ((268435456 & i) != 0) {
            str6 = c69687RWp.LJJIIJ;
        } else {
            str6 = null;
        }
        if ((536870912 & i) != 0) {
            z9 = c69687RWp.LJJIIJZLJL;
        } else {
            z9 = false;
        }
        if ((1073741824 & i) != 0) {
            userRightTag = c69687RWp.LJJIIZ;
        } else {
            userRightTag = null;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            z10 = c69687RWp.LJJIIZI;
        } else {
            z10 = false;
        }
        SkuItem skuItem = c69687RWp.LJJIJ;
        LinkRichText linkRichText = c69687RWp.LJJIJIIJI;
        String str10 = c69687RWp.LJJIJIIJIL;
        o.LJIIIZ(title, "title");
        String realPrice = str8;
        o.LJIIIZ(realPrice, "realPrice");
        String originPrice = str9;
        o.LJIIIZ(originPrice, "originPrice");
        String discount = str7;
        o.LJIIIZ(discount, "discount");
        o.LJIIIZ(waistStyle, "waistStyle");
        o.LJIIIZ(deductionTextShowType, "deductionTextShowType");
        return new C69687RWp(title, str8, str9, str4, str5, combinedSalesVolume, str7, z11, waistStyle, productDetailReview, z2, flashSale, pickTag, z3, list, list2, promotionView, purchaseNotice, bool, i2, z4, z5, z6, z7, deductionTextShowType, deductibleVoucherReminder, bool2, z8, str6, z9, userRightTag, z10, skuItem, linkRichText, str10);
    }

    public C69687RWp(String str, String str2, String str3, String str4, String str5, CombinedSalesVolume combinedSalesVolume, String str6, boolean z, AbstractC70489RlV abstractC70489RlV, ProductDetailReview productDetailReview, boolean z2, FlashSale flashSale, PickTag pickTag, boolean z3, List<PromotionLogo> list, List<ProductLogo> list2, PromotionView promotionView, PurchaseNotice purchaseNotice, Boolean bool, int i, boolean z4, boolean z5, boolean z6, boolean z7, EnumC70499Rlf deductionTextShowType, DeductibleVoucherReminder deductibleVoucherReminder, Boolean bool2, boolean z8, String str7, boolean z9, UserRightTag userRightTag, boolean z10, SkuItem skuItem, LinkRichText linkRichText, String str8) {
        o.LJIIIZ(deductionTextShowType, "deductionTextShowType");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = combinedSalesVolume;
        this.LJI = str6;
        this.LJII = z;
        this.LJIIIIZZ = abstractC70489RlV;
        this.LJIIIZ = productDetailReview;
        this.LJIIJ = z2;
        this.LJIIJJI = flashSale;
        this.LJIIL = pickTag;
        this.LJIILIIL = z3;
        this.LJIILJJIL = list;
        this.LJIILL = list2;
        this.LJIILLIIL = promotionView;
        this.LJIIZILJ = purchaseNotice;
        this.LJIJ = bool;
        this.LJIJI = i;
        this.LJIJJ = z4;
        this.LJIJJLI = z5;
        this.LJIL = z6;
        this.LJJ = z7;
        this.LJJI = deductionTextShowType;
        this.LJJIFFI = deductibleVoucherReminder;
        this.LJJII = bool2;
        this.LJJIII = z8;
        this.LJJIIJ = str7;
        this.LJJIIJZLJL = z9;
        this.LJJIIZ = userRightTag;
        this.LJJIIZI = z10;
        this.LJJIJ = skuItem;
        this.LJJIJIIJI = linkRichText;
        this.LJJIJIIJIL = str8;
    }
}
