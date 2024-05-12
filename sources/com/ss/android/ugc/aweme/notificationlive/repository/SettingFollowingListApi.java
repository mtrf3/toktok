package com.ss.android.ugc.aweme.notificationlive.repository;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.TCH;
import com.ss.android.ugc.aweme.following.model.FollowingItemList;

/* loaded from: classes13.dex */
public interface SettingFollowingListApi {
    public static final TCH LIZ = TCH.LIZ;

    @E4Q("/aweme/v1/user/following/list/")
    AbstractC73672Svk<FollowingItemList> queryFollowingList(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("offset") int i2, @InterfaceC64989Pez("source_type") int i3);
}
