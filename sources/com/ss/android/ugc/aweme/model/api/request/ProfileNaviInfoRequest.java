package com.ss.android.ugc.aweme.model.api.request;

import X.AbstractC73638SvC;
import X.C47261Igj;
import X.E8L;
import X.InterfaceC64986Pew;
import X.X1D;
import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviInfoResponse;

/* loaded from: classes7.dex */
public final class ProfileNaviInfoRequest {
    public static final Api LIZ;

    /* loaded from: classes7.dex */
    public interface Api {
        @E8L("tiktok/v1/navi/info/")
        AbstractC73638SvC<ProfileNaviInfoResponse> getNaviInfo(@InterfaceC64986Pew("navi_id") String str, @InterfaceC64986Pew("panel") String str2);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        LIZ = (Api) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().createRetrofitWithInterceptors(X1D.LIZIZ(LIZ2), true, Api.class, C47261Igj.LJJIJ(new EPRequestInterceptor()));
    }
}
