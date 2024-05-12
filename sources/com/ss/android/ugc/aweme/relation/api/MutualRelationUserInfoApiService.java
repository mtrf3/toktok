package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC73638SvC;
import X.C791038o;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MutualRelationUserInfoApiService implements IMutualRelationUserInfoApi {
    public static final MutualRelationUserInfoApiService LIZIZ = new MutualRelationUserInfoApiService();
    public final /* synthetic */ IMutualRelationUserInfoApi LIZ = (IMutualRelationUserInfoApi) C791038o.LIZIZ.create(IMutualRelationUserInfoApi.class);

    @Override // com.ss.android.ugc.aweme.relation.api.IMutualRelationUserInfoApi
    @E4Q("/tiktok/user/relation/user/info/v1")
    public AbstractC73638SvC<MutualRelationListResponse> getUsersInfo(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("to_user_ids") String toUids, @InterfaceC64989Pez("to_sec_user_ids") String toSecUids) {
        o.LJIIIZ(toUids, "toUids");
        o.LJIIIZ(toSecUids, "toSecUids");
        return this.LIZ.getUsersInfo(i, toUids, toSecUids);
    }
}
