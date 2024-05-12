package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.setting.api.IUnbindValidateApi;

/* loaded from: classes7.dex */
public final class E7X {
    public static final /* synthetic */ E7X LIZ = new E7X();
    public static final IUnbindValidateApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (IUnbindValidateApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IUnbindValidateApi.class);
    }
}
