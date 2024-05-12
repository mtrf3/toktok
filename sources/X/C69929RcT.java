package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SkuBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SkuBrickVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel$setData$2", f = "PdpBodyViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.RcT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69929RcT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<AbstractC27664AtQ<?, ?>> LJLIL;
    public final /* synthetic */ PdpBodyViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C69929RcT(List<? extends AbstractC27664AtQ<?, ?>> list, PdpBodyViewModel pdpBodyViewModel, InterfaceC67352kd<? super C69929RcT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = pdpBodyViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69929RcT(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AbstractC27664AtQ<?, ?> abstractC27664AtQ;
        SkuBrickVO skuBrickVO;
        int i;
        SkuBizData LIZ;
        List<SkuItem> list;
        SkuItem skuItem;
        String[] strArr;
        String str;
        String str2;
        SkuQuantityProperty skuQuantityProperty;
        Integer num;
        List<SkuItem> list2;
        SkuItem skuItem2;
        List<SkuSaleProp> list3;
        List<SkuItem> list4;
        C141335gf.LIZJ(obj);
        SkuVoucher skuVoucher = null;
        try {
            Iterator<AbstractC27664AtQ<?, ?>> it = this.LJLIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    abstractC27664AtQ = it.next();
                    if (abstractC27664AtQ instanceof SkuBrickVO) {
                        break;
                    }
                } else {
                    abstractC27664AtQ = null;
                    break;
                }
            }
            skuBrickVO = (SkuBrickVO) abstractC27664AtQ;
            i = 1;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (skuBrickVO != null && (LIZ = skuBrickVO.LIZ()) != null && (list = LIZ.skuItems) != null && list.size() == 1) {
            SkuBizData LIZ2 = skuBrickVO.LIZ();
            if (LIZ2 != null && (list4 = LIZ2.skuItems) != null) {
                skuItem = (SkuItem) ORZ.LJLLLLLL(0, list4);
            } else {
                skuItem = null;
            }
            SkuBizData LIZ3 = skuBrickVO.LIZ();
            if (LIZ3 != null && (list2 = LIZ3.skuItems) != null && (skuItem2 = (SkuItem) ORZ.LJLLLLLL(0, list2)) != null && (list3 = skuItem2.skuSalePropList) != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list3, 10));
                Iterator<SkuSaleProp> it2 = list3.iterator();
                while (it2.hasNext()) {
                    String str3 = it2.next().propValueId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(str3);
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            } else {
                strArr = null;
            }
            C70300RiS gv0 = this.LJLILLLLZI.gv0();
            String LIZIZ = this.LJLILLLLZI.gv0().LIZIZ();
            if (skuItem != null) {
                str = skuItem.skuId;
                str2 = skuItem.warehouseId;
                skuVoucher = skuItem.voucherInfo;
            } else {
                str = null;
                str2 = null;
            }
            if (skuItem != null && (skuQuantityProperty = skuItem.skuQuantityProperty) != null && (num = skuQuantityProperty.defaultAddCartQuantity) != null) {
                i = num.intValue();
            }
            gv0.LJLLL = new SkuPanelState(LIZIZ, str, str2, skuVoucher, strArr, new Integer(i), false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 1048512, null);
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.gv0().LJLLL = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
