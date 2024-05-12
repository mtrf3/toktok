package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.repository;

import X.C64797Pbt;
import X.C76800UCe;
import X.E4T;
import X.ECF;
import X.InterfaceC27211Am7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachUpdateParams;

/* loaded from: classes7.dex */
public interface FeedReachApi {
    public static final ECF LIZ = ECF.LIZ;

    @E4T("api/v1/mall/feed/reach/get")
    Object feedReachGet(@InterfaceC27211Am7 FeedReachGetParams feedReachGetParams, InterfaceC67352kd<? super C64797Pbt<Response<FeedReachResponse>>> interfaceC67352kd);

    @E4T("api/v1/mall/feed/reach/update")
    Object feedReachUpdate(@InterfaceC27211Am7 FeedReachUpdateParams feedReachUpdateParams, InterfaceC67352kd<? super C64797Pbt<Response<C76800UCe>>> interfaceC67352kd);
}
