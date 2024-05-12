package com.ss.android.ugc.aweme.discover.api;

import X.AbstractC73638SvC;
import X.C37226EjG;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;

/* loaded from: classes7.dex */
public interface DiscoverApiNew {
    public static final C37226EjG LIZ = C37226EjG.LIZ;

    @E4Q("/aweme/v1/find/")
    AbstractC73638SvC<BannerList> getBannerList(@InterfaceC64989Pez("banner_tab_type") Integer num, @InterfaceC64989Pez("ad_personality_mode") Integer num2, @InterfaceC64989Pez("cmpl_enc") String str);

    @E4Q("/aweme/v1/category/list/")
    AbstractC73638SvC<TrendingTopicList> getTrendingTopics(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("ad_personality_mode") Integer num, @InterfaceC64989Pez("cmpl_enc") String str);

    @E4Q("/aweme/v2/category/list/")
    AbstractC73638SvC<TrendingTopicList> getTrendingTopicsV2(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("is_complete") Integer num, @InterfaceC64989Pez("ad_personality_mode") Integer num2, @InterfaceC64989Pez("cmpl_enc") String str);
}
