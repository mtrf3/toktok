package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.E8L;
import X.InterfaceC37276Ek4;
import com.google.gson.m;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;

/* loaded from: classes2.dex */
public interface RouteStatusApi {
    @E8L("/api/v1/affiliate/account/route_status")
    InterfaceC37276Ek4<BaseResponse<m>> getStatus();
}
