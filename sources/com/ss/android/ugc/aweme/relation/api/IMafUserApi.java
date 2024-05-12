package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC73638SvC;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse;

/* loaded from: classes10.dex */
public interface IMafUserApi {
    @E4Q("/aweme/v1/recommend/user/dislike/")
    Object dislikeUser(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("scene") Integer num, @InterfaceC64989Pez("action_type") Integer num2, @InterfaceC64989Pez("maf_scene") Integer num3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E4Q("/tiktok/user/relation/maf/list/v1")
    AbstractC73638SvC<MaFListResponse> getMaFUserList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("page_token") String str, @InterfaceC64989Pez("rec_impr_users") String str2, @InterfaceC64989Pez("platforms") String str3, @InterfaceC64989Pez("sec_target_user_id") String str4, @InterfaceC64989Pez("maf_type") Integer num, @InterfaceC64989Pez("sec_target_user_ids") String str5, @InterfaceC64989Pez("new_maf_count") int i3, @InterfaceC64989Pez("is_non_personalized") boolean z);

    @E4Q("tiktok/user/relation/maf/items/v1")
    AbstractC73638SvC<MaFUserVideoListResponse> getMaFVideoList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("sec_target_user_id") String str, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("page_token") String str2);

    @E4Q("/tiktok/user/relation/maf/list/v1")
    Object getRelatedUserList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("maf_type") Integer num, @InterfaceC64989Pez("target_user_ids") String str, InterfaceC67352kd<? super MaFListResponse> interfaceC67352kd);
}
