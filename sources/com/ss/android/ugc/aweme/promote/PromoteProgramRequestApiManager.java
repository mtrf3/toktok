package com.ss.android.ugc.aweme.promote;

import X.C46104I7o;
import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes16.dex */
public final class PromoteProgramRequestApiManager {
    public static final PromoteProgramRequestApi LIZ = (PromoteProgramRequestApi) C46104I7o.LJIIZILJ(Api.LIZ, PromoteProgramRequestApi.class);

    /* loaded from: classes16.dex */
    public interface PromoteProgramRequestApi {
        @E4Q("/aweme/v1/creatorlicense/cancel/")
        C76L<BaseResponse> cancelPromoteProgram();

        @E4Q("/aweme/v1/creatorlicense/confirm/")
        C76L<PromoteProgramResponse> confirmPromoteProgram(@InterfaceC64989Pez("license_version") String str);
    }
}
