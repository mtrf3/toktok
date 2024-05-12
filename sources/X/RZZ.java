package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;

/* loaded from: classes13.dex */
public final class RZZ extends C70083Rex<PdpViewModel> implements InterfaceC69804RaS {
    @Override // X.InterfaceC69804RaS
    public final SkuPanelState Eg0(SkuPanelState skuPanelState, SkuPanelState skuPanelState2) {
        Integer num;
        if (skuPanelState != null) {
            if (skuPanelState2 != null) {
                num = skuPanelState2.getProductQuantity();
            } else {
                num = null;
            }
            skuPanelState.setProductQuantity(num);
        }
        return skuPanelState;
    }
}
