package com.ss.android.ugc.aweme.stemfeed.repo;

import X.C76L;
import X.C77800Ug8;
import X.E6L;
import X.E8L;
import X.EFJ;
import X.InterfaceC64986Pew;
import X.RPI;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StemFeedApi implements IStemFeedApi {
    public static final StemFeedApi LIZIZ = new StemFeedApi();
    public final /* synthetic */ IStemFeedApi LIZ;

    @Override // com.ss.android.ugc.aweme.stemfeed.repo.IStemFeedApi
    @E6L(2)
    @E8L("tiktok/feed/stem/v2")
    public C76L<ComposePbAndJson<RPI, FeedItemList>> fetchStemFeedList(@InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("is_mock_provider") int i2, @InterfaceC64986Pew("mock_info") String mockInfo) {
        o.LJIIIZ(mockInfo, "mockInfo");
        return this.LIZ.fetchStemFeedList(i, i2, mockInfo);
    }

    public StemFeedApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IStemFeedApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IStemFeedApi.class);
    }
}
