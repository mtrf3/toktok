package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercelive.common.data.FlashSaleDTO;
import com.ss.android.ugc.aweme.ecommercelive.common.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Rwu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71196Rwu {
    public static PopupCardVO LIZ(Product product, long j, long j2, Boolean bool) {
        long j3;
        boolean z;
        C35579Dxn c35579Dxn;
        o.LJIIIZ(product, "product");
        try {
            j3 = CastLongProtector.parseLong(product.productId);
        } catch (Throwable unused) {
            j3 = 0;
        }
        String str = product.title;
        String str2 = product.formatPrice;
        String str3 = product.pricePrefix;
        String str4 = product.availablePriceIntegerNum;
        String str5 = product.availablePriceDecimalNum;
        String str6 = product.displayCurrency;
        String str7 = product.detailUrl;
        String str8 = product.source;
        int i = product.source_from;
        String str9 = product.schema;
        int i2 = product.platform;
        int i3 = product.productStatus;
        String LIZ = product.LIZ();
        String LIZIZ = product.LIZIZ();
        if (product.elasticImg != null && (!r0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        String str10 = product.formatOriginPrice;
        String str11 = product.formatAvailablePrice;
        FlashSaleDTO flashSaleDTO = product.flashSaleInfo;
        if (flashSaleDTO != null) {
            c35579Dxn = new C35579Dxn(flashSaleDTO.beginTime, flashSaleDTO.endTime);
        } else {
            c35579Dxn = null;
        }
        return new PopupCardVO(str, str2, str3, str4, str5, str6, str7, str8, i, str9, i2, i3, LIZ, LIZIZ, z, j3, str10, str11, c35579Dxn, product.promotionLogos, null, product.promotionView, 0, new ArrayList(), product.extra, product.soldCount, product.productRating, product.sellingView, product.skuIds, product.visitReportParams, product.chainKey, product.sellerId, bool, product.assistantModules, j, j2, product.bizType, product.skcInfo, product.discount, product.daInfo, 1);
    }
}
