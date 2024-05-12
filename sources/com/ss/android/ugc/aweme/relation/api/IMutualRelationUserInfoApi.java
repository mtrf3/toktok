package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC73638SvC;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;

/* loaded from: classes2.dex */
public interface IMutualRelationUserInfoApi {
    @E4Q("/tiktok/user/relation/user/info/v1")
    AbstractC73638SvC<MutualRelationListResponse> getUsersInfo(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("to_user_ids") String str, @InterfaceC64989Pez("to_sec_user_ids") String str2);
}
