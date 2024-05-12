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
import kotlin.jvm.internal.o;

/* renamed from: X.RaX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69809RaX extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        String str;
        int i;
        UserRight userRight;
        Integer productQuantity;
        PdpViewModel vm = (PdpViewModel) obj;
        o.LJIIIZ(vm, "vm");
        ArrayList arrayList = new ArrayList();
        EF7.LIZIZ();
        ProductPackStruct productPackStruct = ry7.LIZ;
        if (!ry7.LIZLLL) {
            boolean z = false;
            if (vm.LJLLJ != null || productPackStruct.returnPolicy != null || productPackStruct.userRight != null) {
                arrayList.add(C69717RXt.LIZ);
                PDPReturnPolicyModule pDPReturnPolicyModule = null;
                C27631Ast c27631Ast = new C27631Ast(null, Integer.valueOf(R.string.sm5), 1);
                float f = 16;
                c27631Ast.LJLJJI = new Padding(C45804HyK.LJJ(24), C45804HyK.LJJ(0), C45804HyK.LJJ(f), C45804HyK.LJJ(f));
                arrayList.add(c27631Ast);
                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = vm.LJLLJ;
                SkuPanelState skuPanelState = vm.LJLL;
                if (skuPanelState != null) {
                    str = skuPanelState.getSkuId();
                } else {
                    str = null;
                }
                RX6 rx6 = vm.LLIL;
                String str2 = productPackStruct.defaultAddressId;
                PreOrderInfo preOrderInfo = vm.LLJJLIIIJLLLLLLLZ;
                PDPLogisticModule pDPLogisticModule = productPackStruct.pdpLogisticModule;
                SkuPanelState skuPanelState2 = vm.LJLL;
                if (skuPanelState2 != null && (productQuantity = skuPanelState2.getProductQuantity()) != null) {
                    i = productQuantity.intValue();
                } else {
                    i = 1;
                }
                arrayList.add(C73994T2g.LJJIL(productPackStruct, packedDeliverySelectResult, str, rx6, str2, preOrderInfo, pDPLogisticModule, Integer.valueOf(i)));
                if (productPackStruct.userRight != null) {
                    z = true;
                }
                UserRight userRight2 = productPackStruct.returnPolicy;
                if (userRight2 != null) {
                    PDPLogisticModule pDPLogisticModule2 = productPackStruct.pdpLogisticModule;
                    if (pDPLogisticModule2 != null) {
                        pDPReturnPolicyModule = pDPLogisticModule2.pdpReturnPolicyModule;
                    }
                    arrayList.add(new C26669AdN(userRight2, pDPReturnPolicyModule, Boolean.valueOf(z)));
                }
                if (productPackStruct.returnPolicy != null && (userRight = productPackStruct.userRight) != null) {
                    arrayList.add(new C26675AdT(userRight));
                }
            }
        }
        return arrayList;
    }
}
