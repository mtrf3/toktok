package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.IRuInstantLoginApi;

/* loaded from: classes16.dex */
public final class XJ3 {
    public static final /* synthetic */ XJ3 LIZ = new XJ3();
    public static final IRuInstantLoginApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (IRuInstantLoginApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IRuInstantLoginApi.class);
    }
}
