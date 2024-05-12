package X;

import Y.ARunnableS10S0400000_6;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ProductListRequestBody;
import java.util.concurrent.CancellationException;

/* loaded from: classes7.dex */
public final class EZI {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(ProductListRequestBody productListRequestBody, Response response) {
        m mVar;
        if (response == null || (mVar = (m) response.data) == null) {
            return;
        }
        try {
            g LJJIJIIJI = mVar.LJJIJIIJI("product_list");
            if (LJJIJIIJI != null) {
                C1DH.LJJIJIIJI(new ARunnableS10S0400000_6(productListRequestBody, response, mVar, LJJIJIIJI, 9));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }
}
