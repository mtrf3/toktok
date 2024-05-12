package com.ss.android.ugc.trill.setting;

import X.AB3;
import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface TranslationLanguageApi {
    public static final AB3 LIZ = AB3.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/user/set/settings/")
    AbstractC73672Svk<BaseResponse> setTranslationLanguage(@InterfaceC64987Pex("field") String str, @InterfaceC64987Pex("value") String str2);
}
