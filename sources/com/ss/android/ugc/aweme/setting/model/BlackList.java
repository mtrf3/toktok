package com.ss.android.ugc.aweme.setting.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes13.dex */
public class BlackList extends BaseResponse {

    @InterfaceC65349Pkn("block_list")
    public List<User> blockList;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("hotsoon_filtered_count")
    public int hotsoonFilteredCount;

    @InterfaceC65349Pkn("hotsoon_has_more")
    public int hotsoonHasMore;

    @InterfaceC65349Pkn("hotsoon_text")
    public String hotsoonText;

    @InterfaceC65349Pkn("index")
    public int index;

    @InterfaceC65349Pkn("total")
    public int total;
}
