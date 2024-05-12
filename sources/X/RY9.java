package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CodPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RY9 extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        boolean z;
        boolean z2;
        UserRight userRight;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        ProductPackStruct productPackStruct = ry7.LIZ;
        LJ.addAll(C78983UzD.LJJLIIIJJI(productPackStruct, pdpViewModel.LJLLJ, pdpViewModel.LLJJLIIIJLLLLLLLZ, productPackStruct.pdpLogisticModule, Boolean.valueOf(PdpViewModel.Nv0(productPackStruct))));
        ProductPackStruct productPackStruct2 = ry7.LIZ;
        boolean z3 = true;
        if (productPackStruct2.codPolicy != null) {
            z = true;
        } else {
            z = false;
        }
        if (productPackStruct2.userRight != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        PDPReturnPolicyModule pDPReturnPolicyModule = null;
        if (productPackStruct2.returnPolicy != null) {
            if (!(ORZ.LLFII(LJ) instanceof C27127Akl)) {
                LJ.add(C69717RXt.LIZIZ);
            }
            ProductPackStruct productPackStruct3 = ry7.LIZ;
            UserRight userRight2 = productPackStruct3.returnPolicy;
            PDPLogisticModule pDPLogisticModule = productPackStruct3.pdpLogisticModule;
            if (pDPLogisticModule != null) {
                pDPReturnPolicyModule = pDPLogisticModule.pdpReturnPolicyModule;
            }
            if (!z && !z2) {
                z3 = false;
            }
            LJ.add(new C26670AdO(userRight2, pDPReturnPolicyModule, z3));
        }
        ProductPackStruct productPackStruct4 = ry7.LIZ;
        o.LJIIIZ(productPackStruct4, "<this>");
        CodPolicy codPolicy = productPackStruct4.codPolicy;
        if (codPolicy != null) {
            LJ.add(new C26630Ack(codPolicy.title, codPolicy.schema, codPolicy.icon, codPolicy.desc, z2));
        }
        ProductPackStruct productPackStruct5 = ry7.LIZ;
        if (productPackStruct5.returnPolicy != null && (userRight = productPackStruct5.userRight) != null) {
            LJ.add(new C26678AdW(userRight));
        }
        return LJ;
    }
}
