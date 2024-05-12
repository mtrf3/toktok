package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import X.C74992wx;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* loaded from: classes2.dex */
public interface EcMessageApi {
    public static final C74992wx LIZ = C74992wx.LIZ;

    @E8M("/aweme/v1/oec/live/short_touch/refresh")
    Object refreshShortTouch(@InterfaceC195727mC RefreshShortTouchRequestBody refreshShortTouchRequestBody, InterfaceC67352kd<? super BaseResponse<RefreshShortTouchResponse>> interfaceC67352kd);

    @E8M("/api/v1/shop/marketing_interactive/task/register")
    Object registerTask(@InterfaceC195727mC RegisterTaskRequestBody registerTaskRequestBody, InterfaceC67352kd<? super BaseResponse<Object>> interfaceC67352kd);
}
