package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import java.util.List;

/* loaded from: classes13.dex */
public final class RYH extends Response<ProductInfoPackData> {
    public static final int LJLILLLLZI = C2VO.LIZ().cacheTimeout * 1000;
    public long LJLIL;

    public RYH() {
        this(-1, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isValid() {
        ProductInfoPackData productInfoPackData;
        List<ProductPackStruct> list;
        ProductInfoPackData productInfoPackData2;
        List<ProductPackStruct> list2;
        ProductPackStruct productPackStruct;
        Integer num;
        if (!isCodeOK() || (productInfoPackData = (ProductInfoPackData) this.data) == null || (list = productInfoPackData.productionInfoPack) == null || list.isEmpty()) {
            return false;
        }
        T t = this.data;
        if (!(t instanceof ProductInfoPackData) || (productInfoPackData2 = (ProductInfoPackData) t) == null || (list2 = productInfoPackData2.productionInfoPack) == null || (productPackStruct = (ProductPackStruct) ORZ.LJLLLL(list2)) == null || (num = productPackStruct.status) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public RYH(int i, String str, ProductInfoPackData productInfoPackData) {
        super(i, str, productInfoPackData, null, 8, null);
        this.LJLIL = SystemClock.elapsedRealtime();
    }
}
