package com.ss.android.ugc.aweme.follow.api;

import X.C76L;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;

/* loaded from: classes10.dex */
public interface IFollowFeedApiV1 {
    @InterfaceC195787mI
    @E4T("/aweme/v1/friend/feed/")
    C76L<FollowFeedList> getFriendList(@InterfaceC64987Pex("max_cursor") long j, @InterfaceC64987Pex("min_cursor") long j2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("pull_type") int i2, @InterfaceC64987Pex("feed_style") int i3, @InterfaceC64987Pex("enter_time") long j3, @InterfaceC64987Pex("fetch_recommend") int i4, @InterfaceC64987Pex("impression_ids") String str, @InterfaceC64987Pex("is_up_phone") int i5, @InterfaceC64987Pex("is_recommend") int i6, @InterfaceC64987Pex("push_params") String str2, @InterfaceC64987Pex("address_book_access") int i7, @InterfaceC64987Pex("notice_count_log_id") String str3, @InterfaceC64987Pex("notice_item_count") Integer num, @InterfaceC64987Pex("notice_count_type") Integer num2, @InterfaceC64987Pex("notice_link_author_id") Long l, @InterfaceC64987Pex("notice_link_item_id") Long l2);

    @InterfaceC195787mI
    @E4T("/aweme/v1/follow/feed/recommend/")
    C76L<FollowFeedList> getRecommendList(@InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("pull_type") int i2, @InterfaceC64987Pex("feed_style") int i3, @InterfaceC64987Pex("enter_time") long j, @InterfaceC64987Pex("impression_ids") String str, @InterfaceC64987Pex("last_feed_ids") String str2);
}
