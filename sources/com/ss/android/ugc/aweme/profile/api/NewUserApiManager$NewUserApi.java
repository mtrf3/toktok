package com.ss.android.ugc.aweme.profile.api;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.ss.android.ugc.aweme.profile.model.NewUserCount;

/* loaded from: classes2.dex */
public interface NewUserApiManager$NewUserApi {
    @E4Q("/aweme/v2/new/recommend/user/count/")
    C10K<NewUserCount> getNewUserCount();

    @E4Q("/tiktok/v1/ffp/user/recommendations/")
    C10K<NewRecommendList> recommendList4NewFindFriends(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("cursor") Integer num2, @InterfaceC64989Pez("rec_impr_users") String str);
}
