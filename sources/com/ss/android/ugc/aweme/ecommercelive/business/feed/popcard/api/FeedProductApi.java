package com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.api;

import X.C71475S3j;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* loaded from: classes13.dex */
public interface FeedProductApi {
    public static final C71475S3j LIZ = C71475S3j.LIZ;

    @E8L("/aweme/v1/oec/live/product/preview")
    Object getProduct(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("traffic_source_list") String str2, @InterfaceC64986Pew("recommend_info") String str3, InterfaceC67352kd<? super BaseResponse<FeedProductResp>> interfaceC67352kd);
}
