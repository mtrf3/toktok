package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.search.PnSSearchHistoryApi;

/* loaded from: classes7.dex */
public final class E7T {
    public static final /* synthetic */ E7T LIZ = new E7T();
    public static final PnSSearchHistoryApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (PnSSearchHistoryApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(PnSSearchHistoryApi.class);
    }
}
