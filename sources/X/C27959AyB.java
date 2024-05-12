package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AyB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27959AyB {
    public final String LIZ;
    public final int LIZIZ;
    public final Image LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final C70109RfN LJI;
    public final String LJII;
    public final PickTag LJIIIIZZ;
    public final List<PromotionLogo> LJIIIZ;
    public final PurchaseNotice LJIIJ;
    public final UserRight LJIIJJI;
    public final Integer LJIIL;
    public final Integer LJIILIIL;
    public final String LJIILJJIL;
    public final PromotionView LJIILL;
    public final SkuCardStyleInfo LJIILLIIL;
    public final List<C27967AyJ> LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public OrderShopDigest LJIJJ;
    public CreateOrderSku LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27959AyB)) {
            return false;
        }
        C27959AyB c27959AyB = (C27959AyB) obj;
        return o.LJ(this.LIZ, c27959AyB.LIZ) && this.LIZIZ == c27959AyB.LIZIZ && o.LJ(this.LIZJ, c27959AyB.LIZJ) && o.LJ(this.LIZLLL, c27959AyB.LIZLLL) && o.LJ(this.LJ, c27959AyB.LJ) && o.LJ(this.LJFF, c27959AyB.LJFF) && o.LJ(this.LJI, c27959AyB.LJI) && o.LJ(this.LJII, c27959AyB.LJII) && o.LJ(this.LJIIIIZZ, c27959AyB.LJIIIIZZ) && o.LJ(this.LJIIIZ, c27959AyB.LJIIIZ) && o.LJ(this.LJIIJ, c27959AyB.LJIIJ) && o.LJ(this.LJIIJJI, c27959AyB.LJIIJJI) && o.LJ(this.LJIIL, c27959AyB.LJIIL) && o.LJ(this.LJIILIIL, c27959AyB.LJIILIIL) && o.LJ(this.LJIILJJIL, c27959AyB.LJIILJJIL) && o.LJ(this.LJIILL, c27959AyB.LJIILL) && o.LJ(this.LJIILLIIL, c27959AyB.LJIILLIIL) && o.LJ(this.LJIIZILJ, c27959AyB.LJIIZILJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        Image image = this.LIZJ;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int hashCode5 = (this.LJI.hashCode() + ((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.LJII;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PickTag pickTag = this.LJIIIIZZ;
        int hashCode7 = (hashCode6 + (pickTag == null ? 0 : pickTag.hashCode())) * 31;
        List<PromotionLogo> list = this.LJIIIZ;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        PurchaseNotice purchaseNotice = this.LJIIJ;
        int hashCode9 = (hashCode8 + (purchaseNotice == null ? 0 : purchaseNotice.hashCode())) * 31;
        UserRight userRight = this.LJIIJJI;
        int hashCode10 = (hashCode9 + (userRight == null ? 0 : userRight.hashCode())) * 31;
        Integer num = this.LJIIL;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIILIIL;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.LJIILJJIL;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PromotionView promotionView = this.LJIILL;
        int hashCode14 = (hashCode13 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        SkuCardStyleInfo skuCardStyleInfo = this.LJIILLIIL;
        int hashCode15 = (hashCode14 + (skuCardStyleInfo == null ? 0 : skuCardStyleInfo.hashCode())) * 31;
        List<C27967AyJ> list2 = this.LJIIZILJ;
        return hashCode15 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "SkuInfoVO(skuId=" + this.LIZ + ", quantity=" + this.LIZIZ + ", productImg=" + this.LIZJ + ", productTitle=" + this.LIZLLL + ", productSpec=" + this.LJ + ", price=" + this.LJFF + ", quantityLimit=" + this.LJI + ", lowStockWarning=" + this.LJII + ", activityInfo=" + this.LJIIIIZZ + ", promotionLogos=" + this.LJIIIZ + ", purchaseNotice=" + this.LJIIJ + ", userRight=" + this.LJIIJJI + ", minBuyQuantity=" + this.LJIIL + ", promotionLimitQuantity=" + this.LJIILIIL + ", sellerId=" + this.LJIILJJIL + ", promotionView=" + this.LJIILL + ", skuCardStyleInfo=" + this.LJIILLIIL + ", giftSkuList=" + this.LJIIZILJ + ')';
    }

    public /* synthetic */ C27959AyB(String str, int i, Image image, String str2, String str3, String str4, C70109RfN c70109RfN, String str5, PickTag pickTag, List list, PurchaseNotice purchaseNotice, UserRight userRight, Integer num, Integer num2, String str6, PromotionView promotionView) {
        this(str, i, image, str2, str3, str4, c70109RfN, str5, pickTag, list, purchaseNotice, userRight, num, num2, str6, promotionView, null, null);
    }

    public C27959AyB(String str, int i, Image image, String str2, String str3, String str4, C70109RfN c70109RfN, String str5, PickTag pickTag, List<PromotionLogo> list, PurchaseNotice purchaseNotice, UserRight userRight, Integer num, Integer num2, String str6, PromotionView promotionView, SkuCardStyleInfo skuCardStyleInfo, List<C27967AyJ> list2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = image;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = c70109RfN;
        this.LJII = str5;
        this.LJIIIIZZ = pickTag;
        this.LJIIIZ = list;
        this.LJIIJ = purchaseNotice;
        this.LJIIJJI = userRight;
        this.LJIIL = num;
        this.LJIILIIL = num2;
        this.LJIILJJIL = str6;
        this.LJIILL = promotionView;
        this.LJIILLIIL = skuCardStyleInfo;
        this.LJIIZILJ = list2;
    }
}
