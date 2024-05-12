package com.ss.android.ugc.aweme.feed.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.LY5;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestFeedResponse;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;

/* loaded from: classes10.dex */
public interface FollowFeedApi {
    public static final LY5 LIZ = LY5.LIZ;

    @E4Q("/aweme/v1/following/interest/feed/")
    AbstractC73672Svk<FollowingInterestFeedResponse> getFollowingInterestFeed(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("following_uid") String str, @InterfaceC64989Pez("refresh_type") int i3, @InterfaceC64989Pez("sky_light_type") int i4, @InterfaceC64989Pez("is_blue_user") boolean z);

    @E4Q("/aweme/v1/following/interest/users/")
    AbstractC73672Svk<FollowingInterestUsersResponse> getInterestUsers(@InterfaceC64989Pez("following_list_type") int i, @InterfaceC64989Pez("last_display_time") long j, @InterfaceC64989Pez("sky_light_type") int i2, @InterfaceC64989Pez("is_non_personalized") int i3);
}
