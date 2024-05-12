package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyTogether;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LazyLoadInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class RYB extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        ProductPackStruct productPackStruct;
        LazyLoadInfo lazyLoadInfo;
        BuyTogether buyTogether;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        if (!ry7.LIZLLL && pdpViewModel.pw0() && (productPackStruct = pdpViewModel.LJLJLLL) != null && (lazyLoadInfo = productPackStruct.lazyLoadInfo) != null && (buyTogether = lazyLoadInfo.buyTogether) != null) {
            Integer num = buyTogether.position;
            int value = EnumC246659m9.UNDER_REVIEW.getValue();
            if (num != null && num.intValue() == value) {
                LJ.addAll(C69818Rag.LJFF(pdpViewModel, C69717RXt.LIZ, pdpViewModel.LLILZLL));
            }
        }
        return LJ;
    }
}
