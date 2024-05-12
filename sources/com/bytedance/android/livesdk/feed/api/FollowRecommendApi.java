package com.bytedance.android.livesdk.feed.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import webcast.api.feed.FollowRecommendListResponse;

/* loaded from: classes6.dex */
public interface FollowRecommendApi {
    @E8L("/webcast/feed/follow_recommend_list/")
    AbstractC73672Svk<FollowRecommendListResponse> getRecommendList(@InterfaceC64986Pew("req_from") String str);

    @E8L("/webcast/feed/follow_recommend_user_block/")
    AbstractC73672Svk<Object> removeRecommendUser(@InterfaceC64986Pew("blocked_user_id") String str);
}
