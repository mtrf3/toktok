package com.ss.android.ugc.aweme.topicfeed.repo;

import X.C76L;
import X.E6L;
import X.E8L;
import X.InterfaceC64986Pew;
import X.RPO;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* loaded from: classes10.dex */
public interface ITopicFeedApi {
    @E6L(2)
    @E8L("tiktok/feed/topic/v2")
    C76L<ComposePbAndJson<RPO, FeedItemList>> fetchTopicFeedList(@InterfaceC64986Pew("topic_type") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("is_mock_provider") int i3, @InterfaceC64986Pew("mock_info") String str);
}
