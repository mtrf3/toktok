package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.C74952wt;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.google.gson.m;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.data.QuickProductCheck;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;

/* loaded from: classes2.dex */
public interface EcAnchorApi {
    public static final C74952wt LIZ = C74952wt.LIZ;

    @E8L("/aweme/v1/oec/live/quick_product/check")
    Object checkQuickProductAvailable(@InterfaceC64986Pew("room_id") String str, InterfaceC67352kd<? super BaseResponse<QuickProductCheck>> interfaceC67352kd);

    @E8L("/instant/api/v1/product/product_creation/preload")
    Object preloadCreation(InterfaceC67352kd<? super BaseResponse<m>> interfaceC67352kd);

    @E8M("/aweme/v1/oec/live/short_touch/refresh")
    Object refreshShortTouch(@InterfaceC195727mC RefreshShortTouchRequestBody refreshShortTouchRequestBody, InterfaceC67352kd<? super BaseResponse<RefreshShortTouchResponse>> interfaceC67352kd);
}
