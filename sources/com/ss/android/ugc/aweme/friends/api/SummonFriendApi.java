package com.ss.android.ugc.aweme.friends.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.EFJ;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;

/* loaded from: classes2.dex */
public final class SummonFriendApi {
    public static final SummonFriendService LIZ = (SummonFriendService) RetrofitFactory.LIZLLL().create(EFJ.LIZJ).create(SummonFriendService.class);

    /* loaded from: classes2.dex */
    public interface SummonFriendService {
        @E8L("/tiktok/interaction/mention/general/check/v1")
        InterfaceC37276Ek4<MentionGeneralCheckResponse> batchCheckMentionPrivacy(@InterfaceC64986Pew("uids") String str, @InterfaceC64986Pew("mention_type") String str2, @InterfaceC64986Pew("is_check_aweme") boolean z, @InterfaceC64986Pew("aweme_id") long j);

        @E8L("/aweme/v1/user/following/list/")
        InterfaceC37276Ek4<FollowUserListModel> queryFollowFriends(@InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("user_id") String str, @InterfaceC64986Pew("sec_user_id") String str2, @InterfaceC64986Pew("max_time") long j, @InterfaceC64986Pew("min_time") long j2, @InterfaceC64986Pew("address_book_access") int i2);

        @E8L("/aweme/v1/user/recent/contact/")
        InterfaceC37276Ek4<RecentFriendModel> queryRecentFriends();

        @E8L("/aweme/v1/user/recent/contact/")
        AbstractC73672Svk<RecentFriendModel> queryRecentFriends4At();

        @E8L("/tiktok/interaction/mention/recent/contact/query/v1")
        InterfaceC37276Ek4<Object> queryRecentFriendsV2(@InterfaceC64986Pew("mention_type") long j);

        @E8L("/aweme/v1/discover/search/")
        InterfaceC37276Ek4<SummonFriendList> searchFriends(@InterfaceC64986Pew("keyword") String str, @InterfaceC64986Pew("count") long j, @InterfaceC64986Pew("cursor") long j2, @InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("search_source") String str2, @InterfaceC64986Pew("filter_block") int i2);
    }
}
