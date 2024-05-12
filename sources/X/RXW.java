package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXW {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(List list, String[] skuIdArray) {
        int i;
        ArrayList arrayList;
        o.LJIIIZ(skuIdArray, "skuIdArray");
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int length = skuIdArray.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (!o.LJ(skuIdArray[i3], "")) {
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        SkuItem skuItem = (SkuItem) obj;
                        List<SkuSaleProp> list2 = skuItem.skuSalePropList;
                        if (list2 != null && !list2.isEmpty()) {
                            List<SkuSaleProp> skuSalePropList = skuItem.skuSalePropList;
                            String id = skuIdArray[i3];
                            o.LJIIIZ(skuSalePropList, "skuSalePropList");
                            o.LJIIIZ(id, "id");
                            Iterator<SkuSaleProp> it = skuSalePropList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (o.LJ(it.next().propValueId, id)) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                list = arrayList;
            }
        }
        if (list != null) {
            i2 = 0;
            for (SkuItem skuItem2 : list) {
                Integer num = skuItem2.minBuyQuantity;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                Integer num2 = skuItem2.stockNum;
                if (num2 != null && num2.intValue() >= i) {
                    i2 += skuItem2.stockNum.intValue();
                }
            }
        }
        return i2;
    }

    public static com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc LIZIZ(String str, SkcInfo skcInfo) {
        boolean z;
        List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> list;
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc skc = null;
        if (z || skcInfo == null || (list = skcInfo.skcList) == null) {
            return null;
        }
        Iterator<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc next = it.next();
            if (o.LJ(next.skcId, str)) {
                skc = next;
                break;
            }
        }
        return skc;
    }

    public static SkuItem LIZJ(String str, List skuList) {
        Object obj;
        o.LJIIIZ(skuList, "skuList");
        Iterator it = skuList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (ujb.o.LJJJJIZL(((SkuItem) obj).salePropValueIds, str, false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (SkuItem) obj;
    }
}
