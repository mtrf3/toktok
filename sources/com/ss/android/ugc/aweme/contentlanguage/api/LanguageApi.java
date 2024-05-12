package com.ss.android.ugc.aweme.contentlanguage.api;

import X.AF3;
import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;

/* loaded from: classes5.dex */
public interface LanguageApi {
    public static final AF3 LIZ = AF3.LIZ;

    @E4Q("/aweme/v1/config/list/")
    AbstractC73672Svk<ConfigListResponse> getUnloginContentLanguage(@InterfaceC64989Pez("type") String str, @InterfaceC64989Pez("content_language") String str2);

    @E4Q("/aweme/v1/config/list/")
    AbstractC73672Svk<ConfigListResponse> getUserConfig(@InterfaceC64989Pez("type") String str);

    @InterfaceC195787mI
    @E4T("/aweme/v1/user/set/settings/")
    AbstractC73672Svk<BaseResponse> setContentLanguage(@InterfaceC64987Pex("field") String str, @InterfaceC64987Pex("content_language") String str2, @InterfaceC64987Pex("action_type") int i);

    @InterfaceC195787mI
    @E4T("/aweme/v1/user/set/settings/")
    AbstractC73672Svk<BaseResponse> setContentLanguageDialogShown(@InterfaceC64987Pex("field") String str);

    @InterfaceC195787mI
    @E4T("/aweme/v1/user/set/settings/")
    AbstractC73672Svk<BaseResponse> setUnloginContentPreference(@InterfaceC64987Pex("field") String str, @InterfaceC64987Pex("settings_not_login") String str2);
}
