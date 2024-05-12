package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXT<T> implements InterfaceC64592gB {
    public static final RXT<T> LJLIL = new RXT<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        List<ProductPackStruct> list;
        Response response = (Response) obj;
        o.LJIIIIZZ(response, "response");
        ProductInfoPackData productInfoPackData = (ProductInfoPackData) response.data;
        if (productInfoPackData != null && (list = productInfoPackData.productionInfoPack) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (ProductPackStruct productPackStruct : list) {
                String str = productPackStruct.productId;
                if (str != null) {
                    C70031Re7.LIZIZ(productPackStruct, str);
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
        }
    }
}
