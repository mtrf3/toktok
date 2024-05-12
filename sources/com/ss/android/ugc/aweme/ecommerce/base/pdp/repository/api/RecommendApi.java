package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api;

import X.C36043ECp;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendFeedRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendFeedResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WriteImpressionResponse;

/* loaded from: classes7.dex */
public interface RecommendApi {
    public static final C36043ECp LIZ = C36043ECp.LIZ;

    @E4T("/api/v1/shop/recommend/feed/pdp_page_recommend_get")
    Object getRecommend(@InterfaceC27211Am7 RecommendFeedRequest recommendFeedRequest, InterfaceC67352kd<? super RecommendFeedResponse> interfaceC67352kd);

    @E4T("/api/v1/shop/recommend/impression/write")
    Object writeImpression(@InterfaceC27211Am7 WriteImpressionRequest writeImpressionRequest, InterfaceC67352kd<? super WriteImpressionResponse> interfaceC67352kd);
}
