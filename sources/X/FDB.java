package X;

import com.ss.android.ugc.aweme.ecommerce.core.settings.EcomGeckoFrontUpdateModel;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class FDB {
    public static java.util.Map<String, EcomGeckoFrontUpdateModel> LIZ(FDH fdh) {
        if (fdh.config().length == 0) {
            return C113554cx.LJJJLIIL();
        }
        EcomGeckoFrontUpdateModel[] config = fdh.config();
        int LJJIIZ = C51029K0z.LJJIIZ(config.length);
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel : config) {
            linkedHashMap.put(ecomGeckoFrontUpdateModel.getScene(), ecomGeckoFrontUpdateModel);
        }
        return linkedHashMap;
    }
}
