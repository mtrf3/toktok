package com.ss.android.ugc.aweme.rss.api;

import X.C69915RcF;
import X.E4Q;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC64996Pf6;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.rss.api.models.GetRssFeedResponse;
import com.ss.android.ugc.aweme.rss.api.models.GetRssUserResponse;
import com.ss.android.ugc.aweme.rss.api.models.UpdateRssResponse;

/* loaded from: classes13.dex */
public interface RssApi {
    public static final C69915RcF LIZ = C69915RcF.LIZ;

    @E4Q("/tiktok/v1/rss/feed")
    Object getRssFeed(@InterfaceC64989Pez("rss_feed_url") String str, @InterfaceC64989Pez("page_size") Integer num, @InterfaceC64989Pez("page_token") String str2, InterfaceC67352kd<? super GetRssFeedResponse> interfaceC67352kd);

    @E4Q("/tiktok/v1/rss/user")
    Object getRssUser(InterfaceC67352kd<? super GetRssUserResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @InterfaceC64996Pf6("/tiktok/v1/rss")
    Object updateRss(@InterfaceC64987Pex("url") String str, InterfaceC67352kd<? super UpdateRssResponse> interfaceC67352kd);
}
