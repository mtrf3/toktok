package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.network.ConsentApi;

/* loaded from: classes7.dex */
public final class E7V {
    public static final /* synthetic */ E7V LIZ = new E7V();
    public static final ConsentApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (ConsentApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(ConsentApi.class);
    }
}
