package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface PrivateAccountUserSettingsApi {
    @InterfaceC195787mI
    @E4T("aweme/v1/user/set/settings/")
    AbstractC73672Svk<BaseResponse> setPrivatePolicyShow(@InterfaceC64987Pex("field") String str, @InterfaceC64987Pex("value") String str2);
}
