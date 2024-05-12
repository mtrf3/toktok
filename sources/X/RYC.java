package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYC<T, R> implements InterfaceC48038ItG {
    public static final RYC<T, R> LJLIL = new RYC<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        List<ProductPackStruct> list;
        RYH resp = (RYH) obj;
        o.LJIIIZ(resp, "resp");
        ProductInfoPackData productInfoPackData = (ProductInfoPackData) resp.data;
        if (productInfoPackData != null) {
            list = productInfoPackData.productionInfoPack;
        } else {
            list = null;
        }
        C69995RdX.LJLILLLLZI.getClass();
        C69995RdX.LLLZL(productInfoPackData);
        if (!resp.isCodeOK() || list == null || list.isEmpty()) {
            throw new C69888Rbo(resp.code, resp.message, resp);
        }
        return resp;
    }
}
