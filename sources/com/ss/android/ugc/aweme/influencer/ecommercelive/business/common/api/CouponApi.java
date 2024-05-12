package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.E8M;
import X.EK4;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;

/* loaded from: classes7.dex */
public interface CouponApi {
    public static final EK4 LIZ = EK4.LIZ;

    @E8M("/api/v1/shop/marketing_interactive/task/stop_pre")
    Object stopPreTask(InterfaceC67352kd<? super BaseResponse<String>> interfaceC67352kd);
}
