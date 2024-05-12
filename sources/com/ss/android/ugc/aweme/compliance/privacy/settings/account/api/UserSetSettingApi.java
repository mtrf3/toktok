package com.ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64986Pew;
import X.SL9;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes13.dex */
public interface UserSetSettingApi {
    public static final SL9 LIZ = SL9.LIZ;

    @E4Q("/aweme/v1/user/set/settings/")
    AbstractC73672Svk<BaseResponse> setUserSetting(@InterfaceC64986Pew("field") String str, @InterfaceC64986Pew("value") int i);
}
