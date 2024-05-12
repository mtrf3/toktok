package com.ss.android.ugc.aweme.friends.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes2.dex */
public class FollowUserListModel extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("min_time")
    public long maxTime;

    @InterfaceC65349Pkn("max_time")
    public long minTime;

    @InterfaceC65349Pkn("followings")
    public List<User> users;
}
