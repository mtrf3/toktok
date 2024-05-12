package com.ss.android.ugc.aweme.account.api;

import X.C10K;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC65002PfC;
import X.XJ5;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;

/* loaded from: classes16.dex */
public interface IChangeUnlinkAccountBindingsApi {
    public static final XJ5 LIZ = XJ5.LIZ;

    @InterfaceC195787mI
    @E4T("/passport/shark/safe_verify/v2/")
    C10K<SafeEnvV2Response> checkSafeEnvV2(@InterfaceC64987Pex("product_scene") String str, @InterfaceC64987Pex("mix_mode") Integer num, @InterfaceC65002PfC("x-tt-passport-csrf-token") String str2);
}
