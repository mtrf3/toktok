package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class RYQ extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        ProductPackStruct productPackStruct = ry7.LIZ;
        if (!ry7.LIZLLL && (PdpViewModel.Nv0(productPackStruct) || ry7.LJ)) {
            ((RYS) C73340SqO.LJIILJJIL(pdpViewModel, RYS.class)).au(LJ, C69717RXt.LIZ, productPackStruct.review, productPackStruct.shopReview);
            ((RYR) C73340SqO.LJIILJJIL(pdpViewModel, RYR.class)).VS(LJ, productPackStruct.shopReview);
        }
        return LJ;
    }
}
