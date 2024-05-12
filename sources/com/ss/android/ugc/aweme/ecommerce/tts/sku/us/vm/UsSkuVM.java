package com.ss.android.ugc.aweme.ecommerce.tts.sku.us.vm;

import X.C52310Kfy;
import X.C52922Kpq;
import X.C70223RhD;
import X.C70233RhN;
import X.InterfaceC70386Rjq;
import X.ORZ;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.global.sku.vm.GlobalSkuVm;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsSkuVM extends GlobalSkuVm {
    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.vm.GlobalSkuVm, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel
    public final InterfaceC70386Rjq Tv0() {
        Integer num;
        C52922Kpq c52922Kpq = C52922Kpq.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
        if (skuEnterParams != null) {
            num = skuEnterParams.getBizType();
        } else {
            num = null;
        }
        c52922Kpq.getClass();
        if (C52922Kpq.LIZ(num)) {
            return new C70223RhD();
        }
        return new C70233RhN();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel
    public final String[] Vv0() {
        Integer num;
        String[] strArr;
        List<SaleProp> list;
        int size;
        SaleProp saleProp;
        List<SalePropValue> list2;
        String str;
        ArrayList<Integer> clickSpecGroupIds;
        List<SaleProp> list3;
        List<SaleProp> list4;
        SaleProp saleProp2;
        List<SalePropValue> list5;
        C52922Kpq c52922Kpq = C52922Kpq.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
        if (skuEnterParams != null) {
            num = skuEnterParams.getBizType();
        } else {
            num = null;
        }
        c52922Kpq.getClass();
        if (C52922Kpq.LIZ(num)) {
            SkuPanelState skuPanelState = this.LJLLI;
            if (skuPanelState != null) {
                strArr = skuPanelState.getCheckedSkuIds();
            } else {
                strArr = null;
            }
            ProductPackStruct productPackStruct = this.LJLLL;
            if (productPackStruct == null || (list = productPackStruct.saleProps) == null || (size = list.size()) == 0) {
                return strArr;
            }
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                strArr2[i] = "";
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (strArr != null) {
                    for (String str2 : strArr) {
                        ProductPackStruct productPackStruct2 = this.LJLLL;
                        if (productPackStruct2 != null && (list4 = productPackStruct2.saleProps) != null && (saleProp2 = (SaleProp) ORZ.LJLLLLLL(i2, list4)) != null && (list5 = saleProp2.salePropValueList) != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<SalePropValue> it = list5.iterator();
                            while (it.hasNext()) {
                                String str3 = it.next().propValueId;
                                if (str3 != null) {
                                    arrayList.add(str3);
                                }
                            }
                            if (arrayList.contains(str2)) {
                                strArr2[i2] = str2;
                            }
                        }
                    }
                }
                ProductPackStruct productPackStruct3 = this.LJLLL;
                if (productPackStruct3 != null && (list3 = productPackStruct3.saleProps) != null) {
                    saleProp = (SaleProp) ORZ.LJLLLLLL(i2, list3);
                } else {
                    saleProp = null;
                }
                SkuPanelState skuPanelState2 = this.LJLLI;
                if ((skuPanelState2 == null || (clickSpecGroupIds = skuPanelState2.getClickSpecGroupIds()) == null || !clickSpecGroupIds.contains(Integer.valueOf(i2))) && saleProp != null && (list2 = saleProp.salePropValueList) != null && list2.size() == 1) {
                    SalePropValue salePropValue = (SalePropValue) ORZ.LJLLLLLL(0, saleProp.salePropValueList);
                    if (salePropValue == null || (str = salePropValue.propValueId) == null) {
                        str = "";
                    }
                    strArr2[i2] = str;
                }
            }
            return strArr2;
        }
        return super.Vv0();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.vm.GlobalSkuVm, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel
    public final boolean Zv0() {
        Integer num;
        C52922Kpq c52922Kpq = C52922Kpq.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
        if (skuEnterParams != null) {
            num = skuEnterParams.getBizType();
        } else {
            num = null;
        }
        c52922Kpq.getClass();
        return !C52922Kpq.LIZ(num);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel
    public final int Qv0() {
        return super.Qv0();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel
    public final SkuPanelBaseWidget Pv0(SkuPanelFragment fragment) {
        Integer num;
        int i;
        o.LJIIIZ(fragment, "fragment");
        C52922Kpq c52922Kpq = C52922Kpq.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
        if (skuEnterParams != null) {
            num = skuEnterParams.getBizType();
        } else {
            num = null;
        }
        c52922Kpq.getClass();
        if (C52922Kpq.LIZ(num)) {
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LJLLJ;
            if (skuEnterParams2 != null) {
                i = skuEnterParams2.getClickFrom();
            } else {
                i = 0;
            }
            return new UsSkuBottomWidget(i, fragment);
        }
        return super.Pv0(fragment);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel
    public final SkuPanelBaseWidget Rv0(SkuPanelFragment fragment) {
        Integer num;
        o.LJIIIZ(fragment, "fragment");
        C52922Kpq c52922Kpq = C52922Kpq.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
        if (skuEnterParams != null) {
            num = skuEnterParams.getBizType();
        } else {
            num = null;
        }
        c52922Kpq.getClass();
        if (C52922Kpq.LIZ(num)) {
            return new UsSkuHeaderWidget(fragment);
        }
        return super.Rv0(fragment);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel
    public final SkuPanelBaseWidget Sv0(SkuPanelFragment fragment) {
        Integer num;
        o.LJIIIZ(fragment, "fragment");
        C52922Kpq c52922Kpq = C52922Kpq.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
        if (skuEnterParams != null) {
            num = skuEnterParams.getBizType();
        } else {
            num = null;
        }
        c52922Kpq.getClass();
        if (C52922Kpq.LIZ(num) && !C52310Kfy.LIZ()) {
            return new UsSkuWidget(fragment);
        }
        return super.Sv0(fragment);
    }
}
