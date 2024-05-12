package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYP extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        PdpViewModel vm = (PdpViewModel) obj;
        o.LJIIIZ(vm, "vm");
        ProductPackStruct productPackStruct = ry7.LIZ;
        ArrayList arrayList = new ArrayList();
        Integer num = productPackStruct.status;
        if (((num != null && num.intValue() == 1) || ry7.LJ) && ((((!vm.Zv0() || !ry7.LIZLLL) && PdpViewModel.Nv0(productPackStruct)) || ry7.LJ) && !ry7.LIZLLL)) {
            ((RYS) C73340SqO.LJIILJJIL(vm, RYS.class)).au(arrayList, C69717RXt.LIZ, productPackStruct.review, productPackStruct.shopReview);
        }
        return arrayList;
    }
}
