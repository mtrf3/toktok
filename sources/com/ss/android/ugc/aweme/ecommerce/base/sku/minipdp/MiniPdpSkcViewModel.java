package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.C47261Igj;
import X.C61878OQg;
import X.InterfaceC61312at;
import X.InterfaceC69848RbA;
import X.ORY;
import X.ORZ;
import X.RWJ;
import X.X1D;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MiniPdpSkcViewModel extends JediViewModel<SkcState> {
    public ProductPackStruct LJLJJLL;
    public SkuPanelStarter.SkuEnterParams LJLJL;
    public InterfaceC69848RbA LJLJLJ;

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Hv0, reason: merged with bridge method [inline-methods] */
    public final SkcState kv0() {
        List list;
        List<String> list2;
        ProductPackStruct productPackStruct;
        List<SaleProp> list3;
        SaleProp saleProp;
        List<SalePropValue> list4;
        String str;
        String[] nR;
        List<SaleProp> list5;
        SkcInfo skcInfo;
        List<SkuItem> list6;
        SkuCommonConfig skuCommonConfig;
        List<String> list7;
        InterfaceC69848RbA interfaceC69848RbA;
        ProductPackStruct productPackStruct2;
        List<SaleProp> list8;
        SaleProp saleProp2;
        List<SalePropValue> list9;
        SkcInfo skcInfo2;
        List<Skc> list10;
        Skc skc;
        String str2;
        String[] checkedSkuIds;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLJL;
        if (skuEnterParams != null && (checkedSkuIds = skuEnterParams.getCheckedSkuIds()) != null) {
            list = ORY.LJLIIIL(checkedSkuIds);
        } else {
            list = C61878OQg.INSTANCE;
        }
        SizeGuide sizeGuide = null;
        if (list.isEmpty()) {
            list2 = C61878OQg.INSTANCE;
            ProductPackStruct productPackStruct3 = this.LJLJJLL;
            if (productPackStruct3 != null && (skcInfo2 = productPackStruct3.skcInfo) != null && (list10 = skcInfo2.skcList) != null && (skc = (Skc) ORZ.LJLLLL(list10)) != null && (str2 = skc.skcId) != null) {
                list7 = C47261Igj.LJJIJ(str2);
            } else {
                list7 = list2;
            }
            if (list7.size() == 1 && (productPackStruct2 = this.LJLJJLL) != null && (list8 = productPackStruct2.saleProps) != null && (saleProp2 = (SaleProp) ORZ.LJLLLLLL(1, list8)) != null && (list9 = saleProp2.salePropValueList) != null && list9.size() == 1) {
                String str3 = ((SalePropValue) ORZ.LJLLJ(list9)).propValueId;
                if (str3 == null) {
                    str3 = "";
                }
                list7 = ORZ.LLIIJI(str3, list7);
            }
            String[] strArr = (String[]) list7.toArray(new String[0]);
            if (strArr.length != 0) {
                list2 = ORY.LJJZZIII(strArr);
            }
            if ((!list2.isEmpty()) && (interfaceC69848RbA = this.LJLJLJ) != null) {
                interfaceC69848RbA.Jh(list2);
            }
        } else {
            InterfaceC69848RbA interfaceC69848RbA2 = this.LJLJLJ;
            if (interfaceC69848RbA2 == null || (nR = interfaceC69848RbA2.nR()) == null || (list2 = ORY.LJJZZIII(nR)) == null) {
                list2 = C61878OQg.INSTANCE;
            }
            if (list2.size() == 1 && (productPackStruct = this.LJLJJLL) != null && (list3 = productPackStruct.saleProps) != null && (saleProp = (SaleProp) ORZ.LJLLLLLL(1, list3)) != null && (list4 = saleProp.salePropValueList) != null && list4.size() == 1) {
                list2 = ORZ.LLJILJILJ(list2);
                SalePropValue salePropValue = (SalePropValue) ORZ.LJLLLL(list4);
                if (salePropValue != null && (str = salePropValue.propValueId) != null) {
                    ((ArrayList) list2).add(str);
                }
            }
        }
        ProductPackStruct productPackStruct4 = this.LJLJJLL;
        if (productPackStruct4 != null) {
            list5 = productPackStruct4.saleProps;
            skcInfo = productPackStruct4.skcInfo;
            list6 = productPackStruct4.skus;
            skuCommonConfig = productPackStruct4.skuCommonConfig;
            ProductBase productBase = productPackStruct4.baseInfo;
            if (productBase != null) {
                sizeGuide = productBase.sizeGuide;
            }
        } else {
            list5 = null;
            skcInfo = null;
            list6 = null;
            skuCommonConfig = null;
        }
        return new SkcState(new RWJ(list5, skcInfo, list6, skuCommonConfig, sizeGuide, list2));
    }

    /* loaded from: classes13.dex */
    public static final class SkcState implements InterfaceC61312at {
        public final RWJ vo;

        public static /* synthetic */ SkcState copy$default(SkcState skcState, RWJ rwj, int i, Object obj) {
            if ((i & 1) != 0) {
                rwj = skcState.vo;
            }
            return skcState.copy(rwj);
        }

        public final SkcState copy(RWJ vo) {
            o.LJIIIZ(vo, "vo");
            return new SkcState(vo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SkcState) && o.LJ(this.vo, ((SkcState) obj).vo);
        }

        public int hashCode() {
            return this.vo.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SkcState(vo=");
            LIZ.append(this.vo);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final RWJ getVo() {
            return this.vo;
        }

        public SkcState(RWJ vo) {
            o.LJIIIZ(vo, "vo");
            this.vo = vo;
        }
    }
}
