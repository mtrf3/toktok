package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ay0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27948Ay0 {
    public static final C27959AyB LIZ(PackedSku packedSku, List<C27967AyJ> list) {
        String str;
        Price price;
        o.LJIIIZ(packedSku, "packedSku");
        String skuId = packedSku.getSkuId();
        Image image = packedSku.getImage();
        String productName = packedSku.getProductName();
        String salePropsStr = packedSku.getSalePropsStr();
        SkuPrice price2 = packedSku.getPrice();
        String str2 = null;
        if (price2 != null && (price = price2.realPrice) != null) {
            str = price.getPriceStr();
        } else {
            str = null;
        }
        C27959AyB c27959AyB = new C27959AyB(skuId, g0.LJJIII(packedSku), image, productName, salePropsStr, str, g0.LJJI(packedSku), packedSku.getLowStockWarning(), packedSku.getActivityInfo(), packedSku.getPromotionLogos(), packedSku.getPurchaseNotice(), packedSku.getUserRight(), packedSku.getMinBuyQuantity(), packedSku.getPromotionLimitQuantity(), packedSku.getSellerId(), packedSku.getPromotionView(), packedSku.getSkuCardStyleInfo(), list);
        SkuPrice price3 = packedSku.getPrice();
        if (price3 != null) {
            str2 = price3.originalPrice;
        }
        c27959AyB.LJIJ = str2;
        c27959AyB.LJIL = packedSku.getProductId();
        return c27959AyB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f6, code lost:
    
        if (r1 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0090, code lost:
    
        if (r6 == null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ed A[LOOP:5: B:103:0x01e7->B:105:0x01ed, LOOP_END] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.ORR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C26804AfY LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew r34, boolean r35, java.lang.Boolean r36, X.EnumC28022AzC r37) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27948Ay0.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew, boolean, java.lang.Boolean, X.AzC):X.AfY");
    }
}
