package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopPromotionActivity;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AfY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26804AfY {
    public final String LIZ;
    public final Image LIZIZ;
    public final String LIZJ;
    public final List<C26965Ai9> LIZLLL;
    public final ShopBill LJ;
    public final String LJFF;
    public final ShopPromotionActivity LJI;
    public final String LJII;
    public final StoreOfficialLabel LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final ShopOrderStarling LJIILJJIL;
    public final Boolean LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26804AfY)) {
            return false;
        }
        C26804AfY c26804AfY = (C26804AfY) obj;
        return o.LJ(this.LIZ, c26804AfY.LIZ) && o.LJ(this.LIZIZ, c26804AfY.LIZIZ) && o.LJ(this.LIZJ, c26804AfY.LIZJ) && o.LJ(this.LIZLLL, c26804AfY.LIZLLL) && o.LJ(this.LJ, c26804AfY.LJ) && o.LJ(this.LJFF, c26804AfY.LJFF) && o.LJ(this.LJI, c26804AfY.LJI) && o.LJ(this.LJII, c26804AfY.LJII) && o.LJ(this.LJIIIIZZ, c26804AfY.LJIIIIZZ) && this.LJIIIZ == c26804AfY.LJIIIZ && o.LJ(this.LJIIJ, c26804AfY.LJIIJ) && o.LJ(this.LJIIJJI, c26804AfY.LJIIJJI) && o.LJ(this.LJIIL, c26804AfY.LJIIL) && o.LJ(this.LJIILIIL, c26804AfY.LJIILIIL) && o.LJ(this.LJIILJJIL, c26804AfY.LJIILJJIL) && o.LJ(this.LJIILL, c26804AfY.LJIILL);
    }

    public final String toString() {
        return "ShopInfoVO(sellerId=" + this.LIZ + ", shopAvatar=" + this.LIZIZ + ", shopName=" + this.LIZJ + ", mainOrders=" + this.LIZLLL + ", shopBill=" + this.LJ + ", sellerCouponCacheKey=" + this.LJFF + ", promotionActivity=" + this.LJI + ", couponSchema=" + this.LJII + ", officialLabel=" + this.LJIIIIZZ + ", isHideShop=" + this.LJIIIZ + ", title=" + this.LJIIJ + ", expandAllTitle=" + this.LJIIJJI + ", sellerText=" + this.LJIIL + ", itemText=" + this.LJIILIIL + ", starling=" + this.LJIILJJIL + ", isNotLastShop=" + this.LJIILL + ')';
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
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Image image = this.LIZIZ;
        if (image == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = image.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LIZJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZLLL, (i3 + hashCode3) * 31, 31);
        ShopBill shopBill = this.LJ;
        if (shopBill == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = shopBill.hashCode();
        }
        int i4 = (LIZIZ + hashCode4) * 31;
        String str3 = this.LJFF;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        ShopPromotionActivity shopPromotionActivity = this.LJI;
        if (shopPromotionActivity == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = shopPromotionActivity.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str4 = this.LJII;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        StoreOfficialLabel storeOfficialLabel = this.LJIIIIZZ;
        if (storeOfficialLabel == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = storeOfficialLabel.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        boolean z = this.LJIIIZ;
        int i9 = z;
        if (z != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        String str5 = this.LJIIJ;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        String str6 = this.LJIIJJI;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i12 = (i11 + hashCode10) * 31;
        String str7 = this.LJIIL;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i13 = (i12 + hashCode11) * 31;
        String str8 = this.LJIILIIL;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i14 = (i13 + hashCode12) * 31;
        ShopOrderStarling shopOrderStarling = this.LJIILJJIL;
        if (shopOrderStarling == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = shopOrderStarling.hashCode();
        }
        int i15 = (i14 + hashCode13) * 31;
        Boolean bool = this.LJIILL;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i15 + i;
    }

    public C26804AfY(String str, Image image, String str2, List<C26965Ai9> list, ShopBill shopBill, String str3, ShopPromotionActivity shopPromotionActivity, String str4, StoreOfficialLabel storeOfficialLabel, boolean z, String str5, String str6, String str7, String str8, ShopOrderStarling shopOrderStarling, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = image;
        this.LIZJ = str2;
        this.LIZLLL = list;
        this.LJ = shopBill;
        this.LJFF = str3;
        this.LJI = shopPromotionActivity;
        this.LJII = str4;
        this.LJIIIIZZ = storeOfficialLabel;
        this.LJIIIZ = z;
        this.LJIIJ = str5;
        this.LJIIJJI = str6;
        this.LJIIL = str7;
        this.LJIILIIL = str8;
        this.LJIILJJIL = shopOrderStarling;
        this.LJIILL = bool;
    }
}
