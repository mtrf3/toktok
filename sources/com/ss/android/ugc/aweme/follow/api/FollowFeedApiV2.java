package com.ss.android.ugc.aweme.follow.api;

import X.C76L;
import X.E4Q;
import X.InterfaceC195737mD;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;

/* loaded from: classes10.dex */
public interface FollowFeedApiV2 {
    @E4Q("/aweme/v2/follow/feed/")
    C76L<FollowFeedList> getFollowFeedListNew(@InterfaceC64989Pez("follow_req_index") int i, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("level") int i2, @InterfaceC64989Pez("count") int i3, @InterfaceC64989Pez("pull_type") int i4, @InterfaceC64989Pez("feed_style") int i5, @InterfaceC64989Pez("enter_time") long j2, @InterfaceC64989Pez("rec_impr_users") String str, @InterfaceC64989Pez("aweme_id") String str2, @InterfaceC64989Pez("aweme_ids") String str3, @InterfaceC64989Pez("push_params") String str4, @InterfaceC64989Pez("last_follow_uid") String str5, @InterfaceC64989Pez("address_book_access") int i6, @InterfaceC64989Pez("filter_strategy") int i7, @InterfaceC64989Pez("notice_count_log_id") String str6, @InterfaceC64989Pez("notice_item_count") Integer num, @InterfaceC64989Pez("notice_live_count") Integer num2, @InterfaceC64989Pez("notice_count_type") Integer num3, @InterfaceC64989Pez("notice_link_author_id") Long l, @InterfaceC64989Pez("notice_link_item_id") Long l2, @InterfaceC64989Pez("notice_is_display_live") Integer num4, @InterfaceC64989Pez("user_avatar_shrink") String str7, @InterfaceC64989Pez("ad_user_agent") String str8, @InterfaceC64989Pez("ad_personality_mode") Integer num5, @InterfaceC64989Pez("cmpl_enc") String str9, @InterfaceC64989Pez("gaid") String str10, @InterfaceC64989Pez("last_show_lives") String str11, @InterfaceC64989Pez("last_play_lives") String str12, @InterfaceC64989Pez("session_info") String str13, @InterfaceC64989Pez("is_non_personalized") int i8, @InterfaceC64989Pez("preload") Integer num6, @InterfaceC195737mD Object obj);
}
