package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.settings.DoBStatusApi;

/* loaded from: classes7.dex */
public final class E7U {
    public static final /* synthetic */ E7U LIZ = new E7U();
    public static final DoBStatusApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (DoBStatusApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(DoBStatusApi.class);
    }
}
