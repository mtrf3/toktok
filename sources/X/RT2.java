package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes13.dex */
public final class RT2 {
    public static String LIZ(PurchaseLimit purchaseLimit, String str) {
        String str2;
        if (purchaseLimit != null) {
            str2 = purchaseLimit.LIZ(str);
        } else {
            str2 = null;
        }
        if (C78685UuP.LJJJZ(str2)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
