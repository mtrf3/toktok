package com.ss.android.ugc.aweme.api;

import X.C69494RPe;
import X.C76L;
import X.C77800Ug8;
import X.E4Q;
import X.E6L;
import X.EFJ;
import X.InterfaceC195797mJ;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyFeedApi implements INearbyFeedApi {
    public static final NearbyFeedApi LIZIZ = new NearbyFeedApi();
    public final /* synthetic */ INearbyFeedApi LIZ;

    @Override // com.ss.android.ugc.aweme.api.INearbyFeedApi
    @E6L(2)
    @E4Q("/tiktok/feed/nearby/v2")
    public C76L<ComposePbAndJson<C69494RPe, FeedItemList>> fetchNearbyFeedList(@InterfaceC64989Pez("sp") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("aweme_ids") String str, @InterfaceC64989Pez("pull_type") int i3, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("manual_city_code") String str2, @InterfaceC64989Pez("cmpl_enc") String str3, @InterfaceC64989Pez("mock_info") String mockInfo, @InterfaceC64989Pez("card_insert") String str4, @InterfaceC64989Pez("page_num") int i4, @InterfaceC64989Pez("landing_aweme_ids") String str5, @InterfaceC64989Pez("landing_aweme_position") Integer num) {
        o.LJIIIZ(mockInfo, "mockInfo");
        return this.LIZ.fetchNearbyFeedList(i, i2, str, i3, d, str2, str3, mockInfo, str4, i4, str5, num);
    }

    @Override // com.ss.android.ugc.aweme.api.INearbyFeedApi
    @E6L(2)
    @E4Q
    public C76L<ComposePbAndJson<C69494RPe, FeedItemList>> preloadNearbyFeedList(@InterfaceC195797mJ String url, @InterfaceC64989Pez("sp") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("aweme_ids") String str, @InterfaceC64989Pez("pull_type") int i3, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("manual_city_code") String str2, @InterfaceC64989Pez("cmpl_enc") String str3, @InterfaceC64989Pez("mock_info") String mockInfo) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(mockInfo, "mockInfo");
        return this.LIZ.preloadNearbyFeedList(url, i, i2, str, i3, d, str2, str3, mockInfo);
    }

    public NearbyFeedApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (INearbyFeedApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, INearbyFeedApi.class);
    }
}
