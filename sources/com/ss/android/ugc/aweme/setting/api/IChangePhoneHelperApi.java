package com.ss.android.ugc.aweme.setting.api;

import X.C10K;
import X.C35968E9s;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;

/* loaded from: classes7.dex */
public interface IChangePhoneHelperApi {
    public static final C35968E9s LIZ = C35968E9s.LIZ;

    @E4T("passport/auth/available_ways/")
    C10K<AvailableWaysResponse> availableVerifyWays();

    @E4T("passport/safe/two_step_verification/get_verification_list/")
    C10K<AddVerificationResponse> check2sv();

    @InterfaceC195787mI
    @E4T("/passport/shark/safe_verify/")
    C10K<SafeEnvResponse> safeEnv(@InterfaceC64987Pex("scene") String str, @InterfaceC64987Pex("target") String str2);
}
