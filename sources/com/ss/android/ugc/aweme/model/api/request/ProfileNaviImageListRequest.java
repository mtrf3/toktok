package com.ss.android.ugc.aweme.model.api.request;

import X.AbstractC73638SvC;
import X.E8L;
import X.InterfaceC64986Pew;
import X.X1D;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviImageListResponse;

/* loaded from: classes7.dex */
public final class ProfileNaviImageListRequest {
    public static final Api LIZ;

    /* loaded from: classes7.dex */
    public interface Api {
        @E8L("/tiktok/v1/navi/images/")
        AbstractC73638SvC<ProfileNaviImageListResponse> getNaviImageList(@InterfaceC64986Pew("offset") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("panel") String str);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        LIZ = (Api) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().createRetrofit(X1D.LIZIZ(LIZ2), true, Api.class);
    }
}
