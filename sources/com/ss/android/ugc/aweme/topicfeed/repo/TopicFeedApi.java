package com.ss.android.ugc.aweme.topicfeed.repo;

import X.C76L;
import X.C77800Ug8;
import X.E6L;
import X.E8L;
import X.EFJ;
import X.InterfaceC64986Pew;
import X.RPO;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedApi implements ITopicFeedApi {
    public static final TopicFeedApi LIZIZ = new TopicFeedApi();
    public final /* synthetic */ ITopicFeedApi LIZ;

    @Override // com.ss.android.ugc.aweme.topicfeed.repo.ITopicFeedApi
    @E6L(2)
    @E8L("tiktok/feed/topic/v2")
    public C76L<ComposePbAndJson<RPO, FeedItemList>> fetchTopicFeedList(@InterfaceC64986Pew("topic_type") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("is_mock_provider") int i3, @InterfaceC64986Pew("mock_info") String mockInfo) {
        o.LJIIIZ(mockInfo, "mockInfo");
        return this.LIZ.fetchTopicFeedList(i, i2, i3, mockInfo);
    }

    public TopicFeedApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (ITopicFeedApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, ITopicFeedApi.class);
    }
}
