package com.ss.android.ugc.aweme.popularfeed.repo;

import X.C69515RPz;
import X.C76L;
import X.E6L;
import X.E8L;
import X.InterfaceC195737mD;
import X.InterfaceC64986Pew;
import X.InterfaceC65002PfC;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* loaded from: classes10.dex */
public interface IPopularFeedApi {
    @E6L(2)
    @E8L("tiktok/feed/popular/v2")
    C76L<ComposePbAndJson<C69515RPz, FeedItemList>> fetchPopularFeedList(@InterfaceC64986Pew("sp") Integer num, @InterfaceC64986Pew("count") Integer num2, @InterfaceC64986Pew("pull_type") Integer num3, @InterfaceC64986Pew("filter_warn") Integer num4, @InterfaceC64986Pew("is_audio_mode") String str, @InterfaceC64986Pew("bot_mocked_gids") String str2, @InterfaceC195737mD Object obj, @InterfaceC195737mD Object obj2, @InterfaceC65002PfC("Cookie") String str3, @InterfaceC64986Pew("ad_user_agent") String str4, @InterfaceC64986Pew("ad_personality_mode") Integer num5, @InterfaceC64986Pew("gaid") String str5, @InterfaceC64986Pew("cmpl_enc") String str6, @InterfaceC64986Pew("mock_info") String str7);
}
