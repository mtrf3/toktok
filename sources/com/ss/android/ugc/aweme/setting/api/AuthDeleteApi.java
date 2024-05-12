package com.ss.android.ugc.aweme.setting.api;

import X.AYI;
import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64992Pf2;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public interface AuthDeleteApi {
    public static final AYI LIZ = AYI.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/openapi/authorized/app/remove/")
    AbstractC73672Svk<BaseResponse> deleteAuthInfoApp(@InterfaceC64992Pf2 LinkedHashMap<String, String> linkedHashMap);
}
