package com.ss.android.ugc.aweme.setting.api;

import X.C10K;
import X.E4T;
import X.E7X;
import X.InterfaceC65002PfC;

/* loaded from: classes16.dex */
public interface IUnbindValidateApi {
    public static final E7X LIZ = E7X.LIZ;

    @E4T("/passport/email/unbind_validate/")
    C10K<UnbindValidateResponse> unbindEmailValidate(@InterfaceC65002PfC("x-tt-passport-csrf-token") String str);

    @E4T("/passport/mobile/unbind_validate/")
    C10K<UnbindValidateResponse> unbindMobileValidate(@InterfaceC65002PfC("x-tt-passport-csrf-token") String str);
}
