package com.ss.android.ugc.aweme.following.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class FollowingItemList extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("hotsoon_has_more")
    public int hotSoonHasMore;

    @InterfaceC65349Pkn("hotsoon_text")
    public String hotSoonText;

    @InterfaceC65349Pkn("max_time")
    public long maxTime;

    @InterfaceC65349Pkn("min_time")
    public long minTime;

    @InterfaceC65349Pkn("offset")
    public int offset;

    @InterfaceC65349Pkn("total")
    public int total;

    @InterfaceC65349Pkn("vcd_count")
    public int vcdCount;

    @InterfaceC65349Pkn("followings")
    public List<User> items = new ArrayList();

    @InterfaceC65349Pkn("rec_has_more")
    public boolean recommendHasMore = true;

    @InterfaceC65349Pkn("next_page_token")
    public String nextPageToken = "";
}
