package com.ss.android.ugc.aweme.share.api;

import X.C45840Hyu;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.share.ClientScopeResponse;

/* loaded from: classes8.dex */
public interface CheckScopeApi {
    public static final C45840Hyu LIZ = C45840Hyu.LIZ;

    @InterfaceC195787mI
    @E4T("/oauth/get_client_scopes/")
    Object checkScopeExist(@InterfaceC64987Pex("client_key") String str, @InterfaceC64987Pex("app_identity") String str2, @InterfaceC64987Pex("certificate") String str3, @InterfaceC64987Pex("sdk_name") String str4, InterfaceC67352kd<? super ClientScopeResponse> interfaceC67352kd);
}
