package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi;

/* loaded from: classes7.dex */
public final class E7R {
    public static final /* synthetic */ E7R LIZ = new E7R();
    public static final PolicyNoticeApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (PolicyNoticeApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(PolicyNoticeApi.class);
    }
}
