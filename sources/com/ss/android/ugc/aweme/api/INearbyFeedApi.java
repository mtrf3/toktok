package com.ss.android.ugc.aweme.api;

import X.C69494RPe;
import X.C76L;
import X.E4Q;
import X.E6L;
import X.InterfaceC195797mJ;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* loaded from: classes10.dex */
public interface INearbyFeedApi {
    @E6L(2)
    @E4Q("/tiktok/feed/nearby/v2")
    C76L<ComposePbAndJson<C69494RPe, FeedItemList>> fetchNearbyFeedList(@InterfaceC64989Pez("sp") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("aweme_ids") String str, @InterfaceC64989Pez("pull_type") int i3, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("manual_city_code") String str2, @InterfaceC64989Pez("cmpl_enc") String str3, @InterfaceC64989Pez("mock_info") String str4, @InterfaceC64989Pez("card_insert") String str5, @InterfaceC64989Pez("page_num") int i4, @InterfaceC64989Pez("landing_aweme_ids") String str6, @InterfaceC64989Pez("landing_aweme_position") Integer num);

    @E6L(2)
    @E4Q
    C76L<ComposePbAndJson<C69494RPe, FeedItemList>> preloadNearbyFeedList(@InterfaceC195797mJ String str, @InterfaceC64989Pez("sp") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("aweme_ids") String str2, @InterfaceC64989Pez("pull_type") int i3, @InterfaceC64989Pez("volume") double d, @InterfaceC64989Pez("manual_city_code") String str3, @InterfaceC64989Pez("cmpl_enc") String str4, @InterfaceC64989Pez("mock_info") String str5);
}
