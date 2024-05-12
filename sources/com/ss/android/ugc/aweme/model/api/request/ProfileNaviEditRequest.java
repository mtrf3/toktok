package com.ss.android.ugc.aweme.model.api.request;

import X.AbstractC73638SvC;
import X.E8M;
import X.InterfaceC64986Pew;
import X.X1D;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviEditResponse;

/* loaded from: classes7.dex */
public final class ProfileNaviEditRequest {
    public static final Api LIZ;

    /* loaded from: classes7.dex */
    public interface Api {
        @E8M("tiktok/v1/navi/edit/")
        AbstractC73638SvC<ProfileNaviEditResponse> editNavi(@InterfaceC64986Pew("navi") String str);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        LIZ = (Api) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().createRetrofit(X1D.LIZIZ(LIZ2), true, Api.class);
    }
}
