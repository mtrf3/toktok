package com.ss.android.ugc.aweme.model.api.request;

import X.AbstractC73638SvC;
import X.C47261Igj;
import X.E8L;
import X.InterfaceC64986Pew;
import X.X1D;
import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviStarterAvatarListResponse;

/* loaded from: classes7.dex */
public final class ProfileNaviStarterAvatarListRequest {
    public static final Api LIZ;

    /* loaded from: classes7.dex */
    public interface Api {
        @E8L("tiktok/v1/navi/candidates/")
        AbstractC73638SvC<ProfileNaviStarterAvatarListResponse> getStarterAvatar(@InterfaceC64986Pew("transparent_candidates_required") String str, @InterfaceC64986Pew("scenario") int i, @InterfaceC64986Pew("panel") String str2);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        LIZ = (Api) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().createRetrofitWithInterceptors(X1D.LIZIZ(LIZ2), true, Api.class, C47261Igj.LJJIJ(new EPRequestInterceptor()));
    }
}
