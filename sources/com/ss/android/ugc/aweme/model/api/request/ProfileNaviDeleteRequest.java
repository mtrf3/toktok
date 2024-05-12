package com.ss.android.ugc.aweme.model.api.request;

import X.AbstractC73638SvC;
import X.E8M;
import X.InterfaceC64986Pew;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;

/* loaded from: classes7.dex */
public final class ProfileNaviDeleteRequest {
    public static final Api LIZ;

    /* loaded from: classes7.dex */
    public interface Api {
        @E8M("tiktok/v1/navi/delete/")
        AbstractC73638SvC<BaseResponse> deleteNavi(@InterfaceC64986Pew("navi_id") String str);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        LIZ = (Api) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().createRetrofit(X1D.LIZIZ(LIZ2), true, Api.class);
    }
}
