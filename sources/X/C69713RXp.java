package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductProperty;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.productprop.ProductPropVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RXp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69713RXp extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        PdpViewModel vm = (PdpViewModel) obj;
        o.LJIIIZ(vm, "vm");
        Integer Wv0 = vm.Wv0();
        if (Wv0 == null || Wv0.intValue() != 0) {
            ArrayList arrayList = new ArrayList();
            if (!vm.Zv0() || !ry7.LIZLLL) {
                ProductPackStruct productPackStruct = ry7.LIZ;
                o.LJIIIZ(productPackStruct, "<this>");
                ProductProperty productProperty = productPackStruct.productProps;
                if (productProperty != null) {
                    ProductPropVO productPropVO = new ProductPropVO(productProperty.title, productProperty.schema, productProperty.propItems);
                    arrayList.add(C69717RXt.LIZ);
                    arrayList.add(productPropVO);
                    return arrayList;
                }
                return arrayList;
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }
}
