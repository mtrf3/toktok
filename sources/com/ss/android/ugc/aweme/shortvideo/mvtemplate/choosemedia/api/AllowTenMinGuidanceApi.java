package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.api;

import X.C60903NvH;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;

/* loaded from: classes2.dex */
public final class AllowTenMinGuidanceApi {
    public static final API LIZ = (API) C60903NvH.LJIIJJI().getNetworkService().createDefaultRetrofit(API.class);

    /* loaded from: classes2.dex */
    public interface API {
        @E8L("/tiktok/user/popup/v1")
        Object needShowAllowTenMinGuidance(@InterfaceC64986Pew("show_ten_min") boolean z, InterfaceC67352kd<? super ShowTenMinResponse> interfaceC67352kd);
    }
}
