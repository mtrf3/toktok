package com.ss.android.ugc.aweme.setting.api;

import X.AYE;
import X.AbstractC73672Svk;
import X.C76L;
import X.E4Q;
import com.ss.android.ugc.aweme.setting.model.AuthAppCountResponse;
import com.ss.android.ugc.aweme.setting.model.AuthAppInfoListResponse;

/* loaded from: classes5.dex */
public interface AuthListApi {
    public static final AYE LIZ = AYE.LIZ;

    @E4Q("/aweme/v1/openapi/authorized/app/count/")
    C76L<AuthAppCountResponse> getAuthAppCount();

    @E4Q("/aweme/v1/openapi/authorized/app/list/")
    AbstractC73672Svk<AuthAppInfoListResponse> getAuthInfoList();
}
