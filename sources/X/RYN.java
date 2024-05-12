package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.HashMap;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYN {
    public static final void LIZJ(PdpViewModel pdpViewModel, ProductPackStruct productPackStruct) {
        Long l;
        o.LJIIIZ(pdpViewModel, "<this>");
        GlobalWaistBanner globalWaistBanner = productPackStruct.globalWaistBanner;
        if (globalWaistBanner != null && productPackStruct.productId != null && (l = globalWaistBanner.countDown) != null && l.longValue() > 0) {
            pdpViewModel.kx0(productPackStruct.productId, C32151Nz.LJJIZ(productPackStruct.globalWaistBanner));
        }
    }

    public static final void LIZ(PdpViewModel pdpViewModel, SkuPanelState skuPanelState, SkuPanelState skuPanelState2) {
        Integer num;
        o.LJIIIZ(pdpViewModel, "<this>");
        C52922Kpq c52922Kpq = C52922Kpq.LIZ;
        Integer Wv0 = pdpViewModel.Wv0();
        c52922Kpq.getClass();
        if (C52922Kpq.LIZ(Wv0) || skuPanelState == null) {
            return;
        }
        if (skuPanelState2 != null) {
            num = skuPanelState2.getProductQuantity();
        } else {
            num = null;
        }
        skuPanelState.setProductQuantity(num);
    }

    public static final void LIZIZ(PdpViewModel pdpViewModel, String eventName, String str) {
        ProductPackStruct productPackStruct;
        SellerInfo sellerInfo;
        String str2;
        Object obj;
        String str3;
        o.LJIIIZ(pdpViewModel, "<this>");
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_clear_unread_msg") && (productPackStruct = pdpViewModel.LJLJLLL) != null && (sellerInfo = productPackStruct.sellerInfo) != null && (str2 = sellerInfo.sellerId) != null) {
            HashMap<String, Object> LJII = C27739Aud.LJII(str);
            if (LJII != null) {
                obj = LJII.get("seller_id");
            } else {
                obj = null;
            }
            if (o.LJ(obj, str2)) {
                pdpViewModel.hx0();
                pdpViewModel.setState(new AqS178S0100000_12(pdpViewModel, 354));
                ProductPackStruct productPackStruct2 = pdpViewModel.LJLJLLL;
                if (productPackStruct2 != null && (str3 = productPackStruct2.productId) != null) {
                    C78565UsT.LJJIJ(pdpViewModel, C78613UtF.LIZJ, new C27558Ari(str3, null));
                }
            }
        }
    }
}
