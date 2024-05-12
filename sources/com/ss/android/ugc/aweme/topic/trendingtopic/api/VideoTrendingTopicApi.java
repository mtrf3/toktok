package com.ss.android.ugc.aweme.topic.trendingtopic.api;

import X.AbstractC73672Svk;
import X.C237299Sz;
import X.E4Q;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.topic.trendingtopic.TrendingTopicSettingResponse;

/* loaded from: classes5.dex */
public interface VideoTrendingTopicApi {
    public static final C237299Sz LIZ = C237299Sz.LIZ;

    @E4Q("/tiktok/trends/billboard/topics/v1/")
    AbstractC73672Svk<TrendingTopicListResponse> getTrendingTopicList(@InterfaceC64986Pew("billboard_type") String str);

    @E4Q("/tiktok/trends/settings/v1/")
    AbstractC73672Svk<TrendingTopicSettingResponse> getTrendingTopicSetting();

    @E4Q("/tiktok/trends/search/topic/v1/")
    AbstractC73672Svk<TrendingTopicSearchResponse> searchTrendingTopicList(@InterfaceC64986Pew("keyword") String str);
}
