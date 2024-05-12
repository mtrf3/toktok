package com.ss.android.ugc.aweme.follow.widget.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;

/* loaded from: classes10.dex */
public interface IFollowWidgetApi {
    @E4Q("/aweme/v1/following/interest/users/")
    AbstractC73672Svk<FollowingInterestUsersResponse> getInterestUsers(@InterfaceC64989Pez("following_list_type") int i, @InterfaceC64989Pez("last_display_time") long j, @InterfaceC64989Pez("sky_light_type") int i2, @InterfaceC64989Pez("is_non_personalized") int i3);
}
