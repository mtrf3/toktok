package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RXh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69705RXh extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        Object obj2;
        List list;
        boolean z;
        String[] strArr;
        SkuItem skuItem;
        ProductPrice productPrice;
        String str;
        ProductPrice productPrice2;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        Integer num;
        String str7;
        CombinedSalesVolume combinedSalesVolume;
        String str8;
        Integer num2;
        String str9;
        Price price;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        ArrayList arrayList = new ArrayList();
        java.util.Map<String, ? extends Object> map = this.LIZ;
        if (map != null) {
            obj2 = map.get("product_info_sort");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof List) {
            list = (List) obj2;
        } else {
            list = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        ProductPackStruct productPackStruct = ry7.LIZ;
        Boolean bool = pdpViewModel.LLIIZ;
        SkuCommonConfig skuCommonConfig = productPackStruct.skuCommonConfig;
        if (skuCommonConfig != null) {
            z = o.LJ(skuCommonConfig.isWithDefaultSku, Boolean.TRUE);
        } else {
            z = false;
        }
        boolean z2 = true;
        boolean z3 = !z;
        SkuPanelState skuPanelState = pdpViewModel.LJLL;
        if (skuPanelState != null) {
            strArr = skuPanelState.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        if (strArr == null || productPackStruct.skus == null) {
            skuItem = null;
        } else {
            skuItem = RXW.LIZJ(C63122Opy.LIZ(strArr), productPackStruct.skus);
        }
        if (skuItem != null) {
            SkuPrice skuPrice = skuItem.price;
            if (skuPrice != null && (price = skuPrice.realPrice) != null) {
                str = price.getPriceStr();
            }
            str = null;
        } else {
            ProductBase productBase = productPackStruct.baseInfo;
            if (productBase != null && (productPrice = productBase.priceInfo) != null) {
                str = productPrice.realPrice;
            }
            str = null;
        }
        if (skuItem != null) {
            SkuPrice skuPrice2 = skuItem.price;
            if (skuPrice2 != null) {
                str2 = skuPrice2.originalPrice;
            }
            str2 = null;
        } else {
            ProductBase productBase2 = productPackStruct.baseInfo;
            if (productBase2 != null && (productPrice2 = productBase2.priceInfo) != null) {
                str2 = productPrice2.originPrice;
            }
            str2 = null;
        }
        PurchaseLimit purchaseLimit = productPackStruct.purchaseLimit;
        if (purchaseLimit != null) {
            if (skuItem != null) {
                str9 = skuItem.skuId;
            } else {
                str9 = null;
            }
            str3 = purchaseLimit.LIZ(str9);
        } else {
            str3 = null;
        }
        GlobalWaistBanner globalWaistBanner = productPackStruct.globalWaistBanner;
        if (globalWaistBanner != null) {
            str4 = globalWaistBanner.title;
        } else {
            str4 = null;
        }
        if (globalWaistBanner != null) {
            str5 = globalWaistBanner.desc_text;
        } else {
            str5 = null;
        }
        if (globalWaistBanner != null && (num2 = globalWaistBanner.promotion_type) != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        RVG rvg = new RVG(Integer.valueOf(i), str4, str5, 82);
        try {
            ProductBase productBase3 = productPackStruct.baseInfo;
            if (productBase3 != null && (str8 = productBase3.sales) != null) {
                num = Integer.valueOf(CastIntegerProtector.parseInt(str8));
            } else {
                num = null;
            }
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("the sale is not number: ");
            ProductBase productBase4 = productPackStruct.baseInfo;
            if (productBase4 != null) {
                str6 = productBase4.sales;
            } else {
                str6 = null;
            }
            LIZ.append(str6);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
            num = 0;
        }
        if (str != null && !ujb.o.LJJJJJL(str)) {
            z2 = false;
        }
        if (z2) {
            str = "--";
        }
        ProductBase productBase5 = productPackStruct.baseInfo;
        if (productBase5 == null || (str7 = productBase5.title) == null) {
            str7 = "";
        }
        List<ProductLogo> list2 = productPackStruct.productLogos;
        ProductDetailReview productDetailReview = productPackStruct.review;
        if (productBase5 != null) {
            combinedSalesVolume = productBase5.combinedSalesVolume;
        } else {
            combinedSalesVolume = null;
        }
        LJ.add(new C69688RWq(str7, str, str2, str3, list2, productDetailReview, combinedSalesVolume, rvg, bool, num, z3, arrayList));
        List<StaticSellingPoint> list3 = ry7.LIZ.staticSellingPoints;
        if (list3 != null) {
            LJ.add(new C27341AoD(list3, false));
        }
        return LJ;
    }
}
