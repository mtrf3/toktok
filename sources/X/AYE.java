package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.setting.api.AuthListApi;

/* loaded from: classes5.dex */
public final class AYE {
    public static final /* synthetic */ AYE LIZ = new AYE();

    public static AuthListApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return (AuthListApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(AuthListApi.class);
    }
}
