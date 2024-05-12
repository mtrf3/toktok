package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidgetV2;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rg4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70152Rg4 extends AbstractC65781Prl implements InterfaceC88475Ynv<AML, EnumC70239RhT, Object, SkuInfo, List<? extends String>, C76800UCe> {
    public final /* synthetic */ SkuWidgetV2 LJLIL;
    public final /* synthetic */ C70055ReV LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70152Rg4(SkuWidgetV2 skuWidgetV2, C70055ReV c70055ReV) {
        super(5);
        this.LJLIL = skuWidgetV2;
        this.LJLILLLLZI = c70055ReV;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(AML selectSubscribe, EnumC70239RhT state, Object forceRefresh, SkuInfo skuInfo, List<? extends String> list) {
        List list2;
        List<SkuItem> list3;
        SkuCommonConfig skuCommonConfig;
        SizeGuide sizeGuide;
        ProductBase productBase;
        List<SaleProp> list4;
        SkuInfo skuInfo2 = skuInfo;
        List<? extends String> list5 = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(forceRefresh, "forceRefresh");
        if (state == EnumC70239RhT.SUCCESS) {
            SkuInfo skuInfo3 = this.LJLIL.getMViewModel().LJLLILLLL;
            if (skuInfo3 != null && (list4 = skuInfo3.salePropList) != null) {
                C70053ReT.LIZIZ(list4);
            }
            SkuWidgetV2 skuWidgetV2 = this.LJLIL;
            SpecListLayoutV2 specListLayoutV2 = skuWidgetV2.LJLJJI;
            List list6 = null;
            if (specListLayoutV2 != null) {
                if (skuInfo2 == null || (list2 = skuInfo2.salePropList) == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                if (skuInfo2 != null) {
                    list3 = skuInfo2.skuList;
                    skuCommonConfig = skuInfo2.skuCommonConfig;
                } else {
                    list3 = null;
                    skuCommonConfig = null;
                }
                ProductPackStruct productPackStruct = skuWidgetV2.getMViewModel().LJLLL;
                if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
                    sizeGuide = productBase.sizeGuide;
                } else {
                    sizeGuide = null;
                }
                if (list5 != null) {
                    list6 = ORZ.LLJI(list5);
                }
                specListLayoutV2.bindData(new RWJ(list2, null, list3, skuCommonConfig, sizeGuide, list6), new C70243RhX(this.LJLIL.getMViewModel().Tv0().LIZJ(), "sku", this.LJLIL.LJLIL), this.LJLILLLLZI);
            } else {
                o.LJIJI("specListLayoutV2");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
