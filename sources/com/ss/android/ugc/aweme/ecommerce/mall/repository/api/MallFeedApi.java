package com.ss.android.ugc.aweme.ecommerce.mall.repository.api;

import X.C55675Lt9;
import X.C64797Pbt;
import X.E4T;
import X.InterfaceC195727mC;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallFeedImpressionSaveRequest;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallFeedRequest;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallFeedResponse;

/* loaded from: classes10.dex */
public interface MallFeedApi {
    public static final C55675Lt9 LIZ = C55675Lt9.LIZ;

    @E4T("/api/v1/shop/recommend/feed/get")
    Object getMallRecommendFeed(@InterfaceC195727mC MallFeedRequest mallFeedRequest, InterfaceC67352kd<? super C64797Pbt<MallFeedResponse>> interfaceC67352kd);

    @E4T("/api/v1/shop/recommend/impression/save")
    Object saveMallRecommendImpression(@InterfaceC195727mC MallFeedImpressionSaveRequest mallFeedImpressionSaveRequest, InterfaceC67352kd<? super Response<Object>> interfaceC67352kd);
}
