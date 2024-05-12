package com.ss.android.ugc.trill.setting;

import X.AbstractC73672Svk;
import X.C25808AAy;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface DoNotTranslateSettingApi {
    public static final C25808AAy LIZ = C25808AAy.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/user/set/settings/")
    AbstractC73672Svk<BaseResponse> setDoNotTranslateSetting(@InterfaceC64987Pex("field") String str, @InterfaceC64987Pex("do_not_translate") String str2, @InterfaceC64987Pex("action_type") int i);
}
