package com.ss.android.ugc.aweme.popularfeed.repo;

import X.C69515RPz;
import X.C76L;
import X.C77800Ug8;
import X.E6L;
import X.E8L;
import X.EFJ;
import X.InterfaceC195737mD;
import X.InterfaceC64986Pew;
import X.InterfaceC65002PfC;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopularFeedApi implements IPopularFeedApi {
    public static final PopularFeedApi LIZIZ = new PopularFeedApi();
    public final /* synthetic */ IPopularFeedApi LIZ;

    @Override // com.ss.android.ugc.aweme.popularfeed.repo.IPopularFeedApi
    @E6L(2)
    @E8L("tiktok/feed/popular/v2")
    public C76L<ComposePbAndJson<C69515RPz, FeedItemList>> fetchPopularFeedList(@InterfaceC64986Pew("sp") Integer num, @InterfaceC64986Pew("count") Integer num2, @InterfaceC64986Pew("pull_type") Integer num3, @InterfaceC64986Pew("filter_warn") Integer num4, @InterfaceC64986Pew("is_audio_mode") String str, @InterfaceC64986Pew("bot_mocked_gids") String str2, @InterfaceC195737mD Object obj, @InterfaceC195737mD Object obj2, @InterfaceC65002PfC("Cookie") String str3, @InterfaceC64986Pew("ad_user_agent") String str4, @InterfaceC64986Pew("ad_personality_mode") Integer num5, @InterfaceC64986Pew("gaid") String str5, @InterfaceC64986Pew("cmpl_enc") String str6, @InterfaceC64986Pew("mock_info") String mockInfo) {
        o.LJIIIZ(mockInfo, "mockInfo");
        return this.LIZ.fetchPopularFeedList(num, num2, num3, num4, str, str2, obj, obj2, str3, str4, num5, str5, str6, mockInfo);
    }

    public PopularFeedApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IPopularFeedApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IPopularFeedApi.class);
    }
}
