package com.ss.android.ugc.aweme.relation;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.Friend;
import java.util.List;

/* loaded from: classes2.dex */
public final class ContactResponse extends BaseResponse {

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("registered_user")
    public final List<Friend> users;
}
