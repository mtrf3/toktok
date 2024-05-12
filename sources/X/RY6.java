package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RY6 extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        AbstractC70489RlV abstractC70489RlV;
        C69638RUs c69638RUs;
        boolean z;
        ProductPackStruct productPackStruct;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        ProductPackStruct productPackStruct2 = pdpViewModel.LJLJLLL;
        String[] strArr = null;
        if (productPackStruct2 != null) {
            abstractC70489RlV = C70657RoD.LJIILJJIL(productPackStruct2, true);
        } else {
            abstractC70489RlV = null;
        }
        if (!(abstractC70489RlV instanceof C70498Rle) && (productPackStruct = pdpViewModel.LJLJLLL) != null) {
            LJ.add(C70657RoD.LJJIII(productPackStruct, true));
        }
        ProductPackStruct productPackStruct3 = pdpViewModel.LJLJLLL;
        if (productPackStruct3 != null) {
            c69638RUs = C1A7.LJJIJLIJ(productPackStruct3, Boolean.TRUE, Boolean.FALSE, null, 12);
        } else {
            c69638RUs = null;
        }
        ProductPackStruct productPackStruct4 = pdpViewModel.LJLJLLL;
        boolean z2 = false;
        if (productPackStruct4 != null) {
            boolean z3 = ry7.LIZIZ;
            boolean z4 = ry7.LIZJ;
            if (c69638RUs == null) {
                z = true;
            } else {
                z = false;
            }
            PreOrderInfo preOrderInfo = pdpViewModel.LLJJLIIIJLLLLLLLZ;
            Boolean bool = pdpViewModel.LLIIZ;
            boolean LJII = C69818Rag.LJII(pdpViewModel, ry7.LIZ);
            SkuPanelState skuPanelState = pdpViewModel.LJLL;
            if (skuPanelState != null) {
                strArr = skuPanelState.getCheckedSkuIds();
            }
            LJ.add(SFS.LJJJ(productPackStruct4, z3, z4, z, true, preOrderInfo, bool, LJII, true, strArr));
        }
        ProductPackStruct productPackStruct5 = ry7.LIZ;
        List<StaticSellingPoint> list = productPackStruct5.staticSellingPoints;
        if (list != null) {
            SkuCommonConfig skuCommonConfig = productPackStruct5.skuCommonConfig;
            if (skuCommonConfig != null) {
                z2 = o.LJ(skuCommonConfig.isWithDefaultSku, Boolean.TRUE);
            }
            o.LJIIIZ(ry7.LIZ, "<this>");
            LJ.add(new C27341AoD(list, !z2));
        }
        return LJ;
    }
}
