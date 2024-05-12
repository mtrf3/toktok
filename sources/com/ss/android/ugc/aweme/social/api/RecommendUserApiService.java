package com.ss.android.ugc.aweme.social.api;

import X.AbstractC73672Svk;
import X.C10K;
import X.C76800UCe;
import X.C791238q;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecommendUserApiService implements IRecommendUserApi {
    public static final RecommendUserApiService LIZIZ = new RecommendUserApiService();
    public final /* synthetic */ IRecommendUserApi LIZ = (IRecommendUserApi) C791238q.LIZIZ.create(IRecommendUserApi.class);

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @E4Q("/aweme/v1/recommend/user/dislike/")
    public AbstractC73672Svk<C76800UCe> dislikeRecommend(@InterfaceC64989Pez("user_id") String userId, @InterfaceC64989Pez("sec_user_id") String str, @InterfaceC64989Pez("scene") Integer num) {
        o.LJIIIZ(userId, "userId");
        return this.LIZ.dislikeRecommend(userId, str, num);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @E4Q("/tiktok/user/relation/maf/list/v1")
    public AbstractC73672Svk<MaFListResponse> getMAFList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2) {
        return this.LIZ.getMAFList(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @E4Q("/tiktok/user/relation/maf/list/v1")
    public AbstractC73672Svk<MaFListResponse> getMAFList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("page_token") String pageToken) {
        o.LJIIIZ(pageToken, "pageToken");
        return this.LIZ.getMAFList(i, i2, pageToken);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @E4Q("/aweme/v2/user/recommend/")
    public C10K<RecommendList> recommendList(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("cursor") Integer num2, @InterfaceC64989Pez("target_user_id") String str, @InterfaceC64989Pez("recommend_type") Integer num3, @InterfaceC64989Pez("yellow_point_count") Integer num4, @InterfaceC64989Pez("address_book_access") Integer num5, @InterfaceC64989Pez("rec_impr_users") String str2, @InterfaceC64989Pez("sec_target_user_id") String str3, @InterfaceC64989Pez("show_super_account_when_follow_empty") int i) {
        return this.LIZ.recommendList(num, num2, str, num3, num4, num5, str2, str3, i);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @E4Q("/aweme/v2/user/recommend/")
    public C10K<RecommendList> recommendList(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("cursor") Integer num2, @InterfaceC64989Pez("target_user_id") String str, @InterfaceC64989Pez("recommend_type") Integer num3, @InterfaceC64989Pez("yellow_point_count") Integer num4, @InterfaceC64989Pez("address_book_access") Integer num5, @InterfaceC64989Pez("rec_impr_users") String str2, @InterfaceC64989Pez("push_user_id") String str3, @InterfaceC64989Pez("sec_target_user_id") String str4, @InterfaceC64989Pez("sec_push_user_id") String str5) {
        return this.LIZ.recommendList(num, num2, str, num3, num4, num5, str2, str3, str4, str5);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @E4Q("/aweme/v2/user/recommend/")
    public AbstractC73672Svk<RecommendList> recommendList(@InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("cursor") Integer num2, @InterfaceC64989Pez("target_user_id") String str, @InterfaceC64989Pez("recommend_type") int i, @InterfaceC64989Pez("yellow_point_count") Integer num3, @InterfaceC64989Pez("address_book_access") Integer num4, @InterfaceC64989Pez("rec_impr_users") String str2, @InterfaceC64989Pez("push_user_id") String str3, @InterfaceC64989Pez("sec_target_user_id") String str4) {
        return this.LIZ.recommendList(num, num2, str, i, num3, num4, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @E4Q("/aweme/v1/following/page/user/recommend/")
    public C10K<SuperAccountList> recommendSuperAccount() {
        return this.LIZ.recommendSuperAccount();
    }
}
