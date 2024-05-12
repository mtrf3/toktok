package com.ss.android.ugc.aweme.profile;

import X.AbstractC73638SvC;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface PushSettingApi {
    @E4Q("/aweme/v1/user/set/settings/")
    AbstractC73638SvC<BaseResponse> setItem(@InterfaceC64989Pez("field") String str, @InterfaceC64989Pez("value") int i);
}
