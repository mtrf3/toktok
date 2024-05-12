package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class RY1 extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        List list;
        String[] checkedSkuIds;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        ProductPackStruct productPackStruct = ry7.LIZ;
        Boolean bool = pdpViewModel.LLIIZ;
        SkuPanelState skuPanelState = pdpViewModel.LJLL;
        if (skuPanelState != null && (checkedSkuIds = skuPanelState.getCheckedSkuIds()) != null) {
            list = ORY.LJJZZIII(checkedSkuIds);
        } else {
            list = null;
        }
        LJ.add(C1A7.LJJIL(productPackStruct, bool, true, list));
        return LJ;
    }
}
