package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.unbind.IUnbindApi;

/* loaded from: classes16.dex */
public final class XJ4 {
    public static final /* synthetic */ XJ4 LIZ = new XJ4();
    public static final IUnbindApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (IUnbindApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IUnbindApi.class);
    }
}
