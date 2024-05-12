package com.ss.android.ugc.aweme.following.repository;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.TCL;
import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.following.model.FollowingItemList;

/* loaded from: classes13.dex */
public interface FollowRelationApi {
    public static final TCL LIZ = TCL.LIZ;

    @E4Q("aweme/v1/connected/relation/list")
    AbstractC73672Svk<Object> queryConnectedList(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("cursor") Integer num, @InterfaceC64989Pez("count") Integer num2);

    @E4Q("/aweme/v1/user/follower/list/")
    AbstractC73672Svk<FollowerItemList> queryFollowerList(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("max_time") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("offset") int i2, @InterfaceC64989Pez("source_type") int i3, @InterfaceC64989Pez("address_book_access") int i4, @InterfaceC64989Pez("page_token") String str3, @InterfaceC64989Pez("target_user_ids") String str4);

    @E4Q("/aweme/v1/user/following/list/")
    AbstractC73672Svk<FollowingItemList> queryFollowingList(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("max_time") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("offset") int i2, @InterfaceC64989Pez("source_type") int i3, @InterfaceC64989Pez("address_book_access") int i4, @InterfaceC64989Pez("page_token") String str3, @InterfaceC64989Pez("live_sort_by") int i5);
}
