package com.ss.android.ugc.aweme.social.api;

import X.AbstractC73672Svk;
import X.C10K;
import X.C76800UCe;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;

/* loaded from: classes10.dex */
public interface IRecommendUserApi {
    @E4Q("/aweme/v1/recommend/user/dislike/")
    AbstractC73672Svk<C76800UCe> dislikeRecommend(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("scene") Integer num);

    @E4Q("/tiktok/user/relation/maf/list/v1")
    AbstractC73672Svk<MaFListResponse> getMAFList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2);

    @E4Q("/tiktok/user/relation/maf/list/v1")
    AbstractC73672Svk<MaFListResponse> getMAFList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("page_token") String str);

    @E4Q("/aweme/v2/user/recommend/")
    C10K<RecommendList> recommendList(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("cursor") Integer num2, @InterfaceC64989Pez("target_user_id") String str, @InterfaceC64989Pez("recommend_type") Integer num3, @InterfaceC64989Pez("yellow_point_count") Integer num4, @InterfaceC64989Pez("address_book_access") Integer num5, @InterfaceC64989Pez("rec_impr_users") String str2, @InterfaceC64989Pez("sec_target_user_id") String str3, @InterfaceC64989Pez("show_super_account_when_follow_empty") int i);

    @E4Q("/aweme/v2/user/recommend/")
    C10K<RecommendList> recommendList(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("cursor") Integer num2, @InterfaceC64989Pez("target_user_id") String str, @InterfaceC64989Pez("recommend_type") Integer num3, @InterfaceC64989Pez("yellow_point_count") Integer num4, @InterfaceC64989Pez("address_book_access") Integer num5, @InterfaceC64989Pez("rec_impr_users") String str2, @InterfaceC64989Pez("push_user_id") String str3, @InterfaceC64989Pez("sec_target_user_id") String str4, @InterfaceC64989Pez("sec_push_user_id") String str5);

    @E4Q("/aweme/v2/user/recommend/")
    AbstractC73672Svk<RecommendList> recommendList(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("cursor") Integer num2, @InterfaceC64989Pez("target_user_id") String str, @InterfaceC64989Pez("recommend_type") int i, @InterfaceC64989Pez("yellow_point_count") Integer num3, @InterfaceC64989Pez("address_book_access") Integer num4, @InterfaceC64989Pez("rec_impr_users") String str2, @InterfaceC64989Pez("push_user_id") String str3, @InterfaceC64989Pez("sec_target_user_id") String str4);

    @E4Q("/aweme/v1/following/page/user/recommend/")
    C10K<SuperAccountList> recommendSuperAccount();
}
