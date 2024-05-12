package com.ss.android.ugc.aweme.mention.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.mention.models.FollowFriendResponse;
import com.ss.android.ugc.aweme.mention.models.MentionRecentContactResponse;

/* loaded from: classes4.dex */
public interface IMentionNetworkApi {
    @E8L("/aweme/v1/at/default/list/")
    AbstractC73672Svk<FollowFriendResponse> queryFollowFriends(@InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("cursor") int i2, @InterfaceC64986Pew("scenario") Integer num);

    @E8L("/tiktok/interaction/mention/recent/contact/query/v1")
    AbstractC73672Svk<MentionRecentContactResponse> queryRecentFriends(@InterfaceC64986Pew("mention_type") long j);

    @E8L("/tiktok/interaction/mention/recent/contact/query/v1")
    InterfaceC37276Ek4<MentionRecentContactResponse> queryRecentFriendsCall(@InterfaceC64986Pew("mention_type") long j);
}
