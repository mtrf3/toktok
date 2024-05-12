package X;

import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import java.util.List;

/* loaded from: classes11.dex */
public final class OL9 {
    public static int LIZ(VSAProductCardsResponse.ProductCard productCard) {
        List<VSAProductCardsResponse.ProductDetail> productDetailList;
        int size;
        int i;
        Integer maxShowNum;
        if (productCard == null || (productDetailList = productCard.getProductDetailList()) == null || (size = productDetailList.size()) <= 0) {
            return 0;
        }
        if (productCard != null && (maxShowNum = productCard.getMaxShowNum()) != null && maxShowNum.intValue() > 0 && maxShowNum != null) {
            i = maxShowNum.intValue();
        } else {
            i = 3;
        }
        if (i >= size) {
            return size;
        }
        return i;
    }
}
