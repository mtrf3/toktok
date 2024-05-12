package com.ss.android.ugc.aweme.friends.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.mention.model.MentionCheckResult;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class RecentFriendModel extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("user_list")
    public final List<User> users = new ArrayList();

    @InterfaceC65349Pkn("block_results")
    public final List<MentionCheckResult> blockResults = new ArrayList();
}
