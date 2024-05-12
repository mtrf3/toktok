package com.ss.android.ugc.aweme.notification.followrequest.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes10.dex */
public class FollowRequestResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("max_time")
    public long maxTime;

    @InterfaceC65349Pkn("min_time")
    public long minTime;

    @InterfaceC65349Pkn("total")
    public int total;

    @InterfaceC65349Pkn("request_users")
    public List<User> userRequestList;
}
