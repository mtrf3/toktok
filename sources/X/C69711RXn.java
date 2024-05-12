package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
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

/* renamed from: X.RXn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69711RXn extends AbstractC69707RXj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.RWJ] */
    public static final List<Object> LIZIZ(PdpViewModel pdpViewModel, RY7 ry7) {
        int i;
        RWH rwh;
        SizeGuide sizeGuide;
        SkuPanelState skuPanelState;
        Object obj;
        String[] checkedSkuIds;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        ProductPackStruct productPackStruct = ry7.LIZ;
        if (!pdpViewModel.Zv0() || C1GE.LJIILIIL(productPackStruct.saleProps)) {
            SkuCommonConfig skuCommonConfig = productPackStruct.skuCommonConfig;
            if (skuCommonConfig == null || !o.LJ(skuCommonConfig.isWithDefaultSku, Boolean.TRUE)) {
                List<SaleProp> list = productPackStruct.saleProps;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                ?? r2 = new String[i];
                for (int i2 = 0; i2 < i; i2++) {
                    r2[i2] = "";
                }
                for (int i3 = 0; i3 < i; i3++) {
                    SkuPanelState skuPanelState2 = pdpViewModel.LJLL;
                    if (skuPanelState2 == null || (checkedSkuIds = skuPanelState2.getCheckedSkuIds()) == null || (obj = ORY.LJJJJI(i3, checkedSkuIds)) == null) {
                        obj = "";
                    }
                    r2[i3] = obj;
                }
                C52922Kpq c52922Kpq = C52922Kpq.LIZ;
                Integer Wv0 = pdpViewModel.Wv0();
                c52922Kpq.getClass();
                SizeGuide sizeGuide2 = null;
                r9 = null;
                Integer num = null;
                SizeGuide sizeGuide3 = null;
                if (C52922Kpq.LIZ(Wv0)) {
                    List<SaleProp> list2 = productPackStruct.saleProps;
                    List<SkuItem> list3 = productPackStruct.skus;
                    SkuCommonConfig skuCommonConfig2 = productPackStruct.skuCommonConfig;
                    ProductBase productBase = productPackStruct.baseInfo;
                    if (productBase != null) {
                        sizeGuide = productBase.sizeGuide;
                    } else {
                        sizeGuide = null;
                    }
                    List LJJZZIII = ORY.LJJZZIII(r2);
                    if (pdpViewModel.LLJZ && (skuPanelState = pdpViewModel.LJLL) != null) {
                        num = skuPanelState.getProductQuantity();
                    }
                    LJ.add(new RWI(list2, list3, skuCommonConfig2, sizeGuide, LJJZZIII, num));
                } else {
                    if (C52310Kfy.LIZ()) {
                        List<SaleProp> list4 = productPackStruct.saleProps;
                        SkcInfo skcInfo = productPackStruct.skcInfo;
                        List<SkuItem> list5 = productPackStruct.skus;
                        SkuCommonConfig skuCommonConfig3 = productPackStruct.skuCommonConfig;
                        ProductBase productBase2 = productPackStruct.baseInfo;
                        if (productBase2 != null) {
                            sizeGuide3 = productBase2.sizeGuide;
                        }
                        rwh = new RWJ(list4, skcInfo, list5, skuCommonConfig3, sizeGuide3, ORY.LJJZZIII(r2));
                    } else {
                        List<SaleProp> list6 = productPackStruct.saleProps;
                        List<SkuItem> list7 = productPackStruct.skus;
                        SkuCommonConfig skuCommonConfig4 = productPackStruct.skuCommonConfig;
                        ProductBase productBase3 = productPackStruct.baseInfo;
                        if (productBase3 != null) {
                            sizeGuide2 = productBase3.sizeGuide;
                        }
                        rwh = new RWH(list6, list7, skuCommonConfig4, sizeGuide2, ORY.LJJZZIII(r2));
                    }
                    LJ.add(rwh);
                }
            }
        }
        return LJ;
    }

    @Override // X.AbstractC69707RXj
    public final /* bridge */ /* synthetic */ List LIZ(Object obj, RY7 ry7) {
        return LIZIZ((PdpViewModel) obj, ry7);
    }
}
