package X;

import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes7.dex */
public final class EZL {
    public static final String LIZ;
    public static final CommonApi LIZIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        LIZ = JBR.LJFF(LIZ2, str, "/aweme/v1/check/in/", LIZ2);
        LIZIZ = (CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(CommonApi.class);
    }
}
