package com.ss.android.ugc.aweme.compliance.protection.familypairing.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes7.dex */
public final class FamilyPairingApi {
    public static final API LIZ = (API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(API.class);

    /* loaded from: classes7.dex */
    public interface API {
        @InterfaceC195787mI
        @E4T("/aweme/v2/guardian/platform/verify/password/")
        AbstractC73672Svk<BaseResponse> verifyPassword(@InterfaceC64987Pex("pass_code") String str);
    }

    public static AbstractC73672Svk<BaseResponse> LIZ(String str) {
        return LIZ.verifyPassword(str);
    }
}
