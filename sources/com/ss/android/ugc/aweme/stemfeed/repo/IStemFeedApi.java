package com.ss.android.ugc.aweme.stemfeed.repo;

import X.C76L;
import X.E6L;
import X.E8L;
import X.InterfaceC64986Pew;
import X.RPI;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* loaded from: classes10.dex */
public interface IStemFeedApi {
    @E6L(2)
    @E8L("tiktok/feed/stem/v2")
    C76L<ComposePbAndJson<RPI, FeedItemList>> fetchStemFeedList(@InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("is_mock_provider") int i2, @InterfaceC64986Pew("mock_info") String str);
}
