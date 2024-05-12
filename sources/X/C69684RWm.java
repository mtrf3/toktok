package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import kotlin.jvm.internal.o;

/* renamed from: X.RWm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69684RWm {
    public final int LIZ;
    public final int LIZIZ;
    public final SellerInfo LIZJ;
    public final Boolean LIZLLL;
    public final BuyButton LJ;
    public final AddToCartButton LJFF;
    public final ProductUnavailableInfo LJI;
    public final Announcement LJII;
    public final Integer LJIIIIZZ;
    public final String LJIIIZ;
    public final Integer LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69684RWm)) {
            return false;
        }
        C69684RWm c69684RWm = (C69684RWm) obj;
        return this.LIZ == c69684RWm.LIZ && this.LIZIZ == c69684RWm.LIZIZ && o.LJ(this.LIZJ, c69684RWm.LIZJ) && o.LJ(this.LIZLLL, c69684RWm.LIZLLL) && o.LJ(this.LJ, c69684RWm.LJ) && o.LJ(this.LJFF, c69684RWm.LJFF) && o.LJ(this.LJI, c69684RWm.LJI) && o.LJ(this.LJII, c69684RWm.LJII) && o.LJ(this.LJIIIIZZ, c69684RWm.LJIIIIZZ) && o.LJ(this.LJIIIZ, c69684RWm.LJIIIZ) && o.LJ(this.LJIIJ, c69684RWm.LJIIJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        SellerInfo sellerInfo = this.LIZJ;
        int hashCode = (i + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BuyButton buyButton = this.LJ;
        int hashCode3 = (hashCode2 + (buyButton == null ? 0 : buyButton.hashCode())) * 31;
        AddToCartButton addToCartButton = this.LJFF;
        int hashCode4 = (hashCode3 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
        ProductUnavailableInfo productUnavailableInfo = this.LJI;
        int hashCode5 = (hashCode4 + (productUnavailableInfo == null ? 0 : productUnavailableInfo.hashCode())) * 31;
        Announcement announcement = this.LJII;
        int hashCode6 = (hashCode5 + (announcement == null ? 0 : announcement.hashCode())) * 31;
        Integer num = this.LJIIIIZZ;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJIIIZ;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LJIIJ;
        return hashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomBarVO(status=");
        sb.append(this.LIZ);
        sb.append(", bottomNavBarStyle=");
        sb.append(this.LIZIZ);
        sb.append(", sellerInfo=");
        sb.append(this.LIZJ);
        sb.append(", isCouponPriceShowed=");
        sb.append(this.LIZLLL);
        sb.append(", buyButton=");
        sb.append(this.LJ);
        sb.append(", cartButton=");
        sb.append(this.LJFF);
        sb.append(", unavailableInfo=");
        sb.append(this.LJI);
        sb.append(", announcement=");
        sb.append(this.LJII);
        sb.append(", skuStatus=");
        sb.append(this.LJIIIIZZ);
        sb.append(", noStockMsg=");
        sb.append(this.LJIIIZ);
        sb.append(", unreadMsgCount=");
        return UC7.LIZ(sb, this.LJIIJ, ')');
    }

    public C69684RWm(int i, int i2, SellerInfo sellerInfo, Boolean bool, BuyButton buyButton, AddToCartButton addToCartButton, ProductUnavailableInfo productUnavailableInfo, Announcement announcement, Integer num, String str, Integer num2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = sellerInfo;
        this.LIZLLL = bool;
        this.LJ = buyButton;
        this.LJFF = addToCartButton;
        this.LJI = productUnavailableInfo;
        this.LJII = announcement;
        this.LJIIIIZZ = num;
        this.LJIIIZ = str;
        this.LJIIJ = num2;
    }
}
