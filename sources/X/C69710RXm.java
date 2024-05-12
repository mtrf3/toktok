package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RXm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69710RXm extends AbstractC69707RXj {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<Object> LIZIZ(PdpViewModel vm, RY7 ry7) {
        int i;
        Object obj;
        String[] checkedSkuIds;
        o.LJIIIZ(vm, "vm");
        ProductPackStruct productPackStruct = ry7.LIZ;
        ArrayList arrayList = new ArrayList();
        if (!vm.Zv0() || C1GE.LJIILIIL(productPackStruct.saleProps)) {
            List<SaleProp> list = productPackStruct.saleProps;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                strArr[i2] = "";
            }
            for (int i3 = 0; i3 < i; i3++) {
                SkuPanelState skuPanelState = vm.LJLL;
                if (skuPanelState == null || (checkedSkuIds = skuPanelState.getCheckedSkuIds()) == null || (obj = ORY.LJJJJI(i3, checkedSkuIds)) == null) {
                    obj = "";
                }
                strArr[i3] = obj;
            }
            SizeGuide sizeGuide = null;
            if (C52310Kfy.LIZ()) {
                List<SaleProp> list2 = productPackStruct.saleProps;
                SkcInfo skcInfo = productPackStruct.skcInfo;
                List<SkuItem> list3 = productPackStruct.skus;
                SkuCommonConfig skuCommonConfig = productPackStruct.skuCommonConfig;
                ProductBase productBase = productPackStruct.baseInfo;
                if (productBase != null) {
                    sizeGuide = productBase.sizeGuide;
                }
                arrayList.add(new RWJ(list2, skcInfo, list3, skuCommonConfig, sizeGuide, ORY.LJJZZIII(strArr)));
            } else if (productPackStruct.LIZLLL()) {
                arrayList.add(new RXV(productPackStruct.saleProps, productPackStruct.skus, productPackStruct.skcInfo, ORY.LJJZZIII(strArr)));
            } else {
                List<SaleProp> list4 = productPackStruct.saleProps;
                List<SkuItem> list5 = productPackStruct.skus;
                SkuCommonConfig skuCommonConfig2 = productPackStruct.skuCommonConfig;
                ProductBase productBase2 = productPackStruct.baseInfo;
                if (productBase2 != null) {
                    sizeGuide = productBase2.sizeGuide;
                }
                arrayList.add(new RWH(list4, list5, skuCommonConfig2, sizeGuide, ORY.LJJZZIII(strArr)));
            }
        }
        C26840Ag8 c26840Ag8 = new C26840Ag8(0.0f, false, 0, 12);
        SelfOperatedPolicy selfOperatedPolicy = productPackStruct.selfOperatedPolicy;
        if (selfOperatedPolicy != null) {
            arrayList.add(new C27079Ajz(selfOperatedPolicy));
            arrayList.add(new C26840Ag8(c26840Ag8.LJLILLLLZI, c26840Ag8.LJLJI, 24.0f, c26840Ag8.LJLJJI));
        }
        if (!ry7.LIZLLL) {
            RankInfo rankInfo = productPackStruct.rankInfo;
            if (rankInfo != null) {
                arrayList.add(rankInfo);
            }
            List<ShopPolicy> list6 = productPackStruct.shopPolicies;
            if (list6 != null && !list6.isEmpty()) {
                arrayList.add(new C26792AfM(list6));
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC69707RXj
    public final /* bridge */ /* synthetic */ List LIZ(Object obj, RY7 ry7) {
        return LIZIZ((PdpViewModel) obj, ry7);
    }
}
