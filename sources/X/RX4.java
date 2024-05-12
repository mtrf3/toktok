package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RX4 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(ProductPackStruct productPackStruct, String[] strArr) {
        List<SaleProp> list;
        SaleProp saleProp;
        List<SalePropValue> list2;
        List<Image> list3;
        int i = 0;
        if (strArr == null || strArr.length == 0 || (list = productPackStruct.saleProps) == null) {
            return 0;
        }
        Iterator<SaleProp> it = list.iterator();
        do {
            saleProp = null;
            if (!it.hasNext()) {
                break;
            }
            saleProp = it.next();
        } while (!o.LJ(saleProp.hasImage, Boolean.TRUE));
        SaleProp saleProp2 = saleProp;
        if (saleProp2 == null || (list2 = saleProp2.salePropValueList) == null || list2.size() <= 1) {
            return 0;
        }
        int i2 = 0;
        for (SalePropValue salePropValue : list2) {
            if (salePropValue.image != null) {
                i2++;
            }
            if (ORY.LJJIJIIJIL(salePropValue.propValueId, strArr)) {
                ProductBase productBase = productPackStruct.baseInfo;
                if (productBase != null && (list3 = productBase.images) != null) {
                    i = list3.size();
                }
                return (i + i2) - 1;
            }
        }
        return 0;
    }
}
