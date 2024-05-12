package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpSlowFuncOpt;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYK<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public RYK(int i, IPdpStarter.PdpEnterParam pdpEnterParam) {
        this.LJLIL = pdpEnterParam;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        List<ProductPackStruct> list;
        ProductInfoPackData productInfoPackData;
        PopUp popUp;
        RYH resp = (RYH) obj;
        o.LJIIIZ(resp, "resp");
        ProductInfoPackData productInfoPackData2 = (ProductInfoPackData) resp.data;
        if (productInfoPackData2 != null) {
            list = productInfoPackData2.productionInfoPack;
        } else {
            list = null;
        }
        if (resp.isCodeOK() && list != null && !list.isEmpty()) {
            ProductPackStruct.Companion.getClass();
            if (ORY.LJJIJIIJIL(((ProductPackStruct) ORZ.LJLLJ(list)).status, ProductPackStruct.ALL_STATUS)) {
                ProductPackStruct productPackStruct = (ProductPackStruct) ORZ.LJLLJ(list);
                long currentTimeMillis = System.currentTimeMillis();
                if (EcPdpSlowFuncOpt.LIZIZ()) {
                    XKX.LIZLLL(C780334l.LJLIL, null, null, new C69919RcJ(this.LJLIL.clone(), productPackStruct, resp, this.LJLILLLLZI, currentTimeMillis, null), 3);
                } else {
                    C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
                    IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLIL;
                    int i = this.LJLILLLLZI;
                    c69995RdX.getClass();
                    C69995RdX.LLLZ(pdpEnterParam, productPackStruct, resp, i, currentTimeMillis);
                }
                T t = resp.data;
                if ((t instanceof ProductInfoPackData) && (productInfoPackData = (ProductInfoPackData) t) != null && (popUp = productInfoPackData.popUp) != null) {
                    productPackStruct.popUp = popUp;
                }
                return productPackStruct;
            }
        }
        throw new C69888Rbo(resp.code, resp.message, resp);
    }
}
