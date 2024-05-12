package com.ss.android.ugc.aweme.mention.api;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.EFJ;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.mention.models.FollowFriendResponse;
import com.ss.android.ugc.aweme.mention.models.MentionRecentContactResponse;

/* loaded from: classes4.dex */
public final class MentionNetworkApi implements IMentionNetworkApi {
    public static final MentionNetworkApi LIZIZ = new MentionNetworkApi();
    public final /* synthetic */ IMentionNetworkApi LIZ;

    @Override // com.ss.android.ugc.aweme.mention.api.IMentionNetworkApi
    @E8L("/aweme/v1/at/default/list/")
    public AbstractC73672Svk<FollowFriendResponse> queryFollowFriends(@InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("cursor") int i2, @InterfaceC64986Pew("scenario") Integer num) {
        return this.LIZ.queryFollowFriends(i, i2, num);
    }

    @Override // com.ss.android.ugc.aweme.mention.api.IMentionNetworkApi
    @E8L("/tiktok/interaction/mention/recent/contact/query/v1")
    public AbstractC73672Svk<MentionRecentContactResponse> queryRecentFriends(@InterfaceC64986Pew("mention_type") long j) {
        return this.LIZ.queryRecentFriends(j);
    }

    @Override // com.ss.android.ugc.aweme.mention.api.IMentionNetworkApi
    @E8L("/tiktok/interaction/mention/recent/contact/query/v1")
    public InterfaceC37276Ek4<MentionRecentContactResponse> queryRecentFriendsCall(@InterfaceC64986Pew("mention_type") long j) {
        return this.LIZ.queryRecentFriendsCall(j);
    }

    public MentionNetworkApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IMentionNetworkApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IMentionNetworkApi.class);
    }
}
