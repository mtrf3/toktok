package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.region.api.RegionChangeUpdatedApi;

/* loaded from: classes7.dex */
public final class E7S {
    public static final /* synthetic */ E7S LIZ = new E7S();
    public static final RegionChangeUpdatedApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (RegionChangeUpdatedApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(RegionChangeUpdatedApi.class);
    }
}
