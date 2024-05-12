package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Raf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69817Raf extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        Integer num;
        C69638RUs LJJIJLIJ;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
        if (productPackStruct != null && (LJJIJLIJ = C1A7.LJJIJLIJ(productPackStruct, null, null, null, 15)) != null) {
            LJ.add(C69717RXt.LIZ);
            LJ.add(LJJIJLIJ);
        }
        PromotionEntrance promotionEntrance = ry7.LIZ.promotionEntrance;
        if (promotionEntrance != null && (num = promotionEntrance.entranceStyle) != null) {
            if (num.intValue() == 4 || num.intValue() == 5) {
                LJ.add(new C27515Ar1(promotionEntrance, true));
            } else if (num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3) {
                LJ.add(C62819Ol5.LJJIJ(promotionEntrance, true));
            } else if (num.intValue() == 6) {
                LJ.add(C62814Ol0.LJJIJIL(promotionEntrance, true));
            }
        }
        return LJ;
    }
}
