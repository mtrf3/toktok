package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.RaW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69808RaW extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        String str;
        Integer productQuantity;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        ProductPackStruct productPackStruct = ry7.LIZ;
        if (!ry7.LIZLLL) {
            int i = 1;
            if (pdpViewModel.LJLLJ != null || productPackStruct.returnPolicy != null || productPackStruct.userRight != null) {
                LJ.add(C69717RXt.LIZ);
                PDPReturnPolicyModule pDPReturnPolicyModule = null;
                C27631Ast c27631Ast = new C27631Ast(null, Integer.valueOf(R.string.sm5), 1);
                float f = 16;
                c27631Ast.LJLJJI = new Padding(C45804HyK.LJJ(f), C45804HyK.LJJ(0), C45804HyK.LJJ(f), C45804HyK.LJJ(f));
                LJ.add(c27631Ast);
                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = pdpViewModel.LJLLJ;
                SkuPanelState skuPanelState = pdpViewModel.LJLL;
                if (skuPanelState != null) {
                    str = skuPanelState.getSkuId();
                } else {
                    str = null;
                }
                RX6 rx6 = pdpViewModel.LLIL;
                String str2 = productPackStruct.defaultAddressId;
                PreOrderInfo preOrderInfo = pdpViewModel.LLJJLIIIJLLLLLLLZ;
                PDPLogisticModule pDPLogisticModule = productPackStruct.pdpLogisticModule;
                SkuPanelState skuPanelState2 = pdpViewModel.LJLL;
                if (skuPanelState2 != null && (productQuantity = skuPanelState2.getProductQuantity()) != null) {
                    i = productQuantity.intValue();
                }
                LJ.add(C73994T2g.LJJIL(productPackStruct, packedDeliverySelectResult, str, rx6, str2, preOrderInfo, pDPLogisticModule, Integer.valueOf(i)));
                UserRight userRight = productPackStruct.returnPolicy;
                if (userRight != null) {
                    PDPLogisticModule pDPLogisticModule2 = productPackStruct.pdpLogisticModule;
                    if (pDPLogisticModule2 != null) {
                        pDPReturnPolicyModule = pDPLogisticModule2.pdpReturnPolicyModule;
                    }
                    LJ.add(new C26669AdN(userRight, pDPReturnPolicyModule, Boolean.FALSE));
                }
            }
        }
        return LJ;
    }
}
