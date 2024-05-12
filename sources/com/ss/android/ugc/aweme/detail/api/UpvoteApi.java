package com.ss.android.ugc.aweme.detail.api;

import X.C76L;
import X.C77800Ug8;
import X.E4T;
import X.EFJ;
import X.HH1;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes2.dex */
public final class UpvoteApi implements IUpvoteApi {
    public static final UpvoteApi LIZIZ = new UpvoteApi();
    public final /* synthetic */ IUpvoteApi LIZ;

    public UpvoteApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (IUpvoteApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, IUpvoteApi.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.api.IUpvoteApi
    @E4T("tiktok/v1/upvote/feed")
    public C76L<UpvoteFeedListResponse> getUpvoteFeedList(@InterfaceC64986Pew("page_control") String str, @InterfaceC64986Pew("client_viewed_gids") String str2, @InterfaceC64986Pew("top_upvoter_uids") String str3) {
        HH1.LIZ(str, "pageControl", str2, "viewedAids", str3, "topUpvoters");
        return this.LIZ.getUpvoteFeedList(str, str2, str3);
    }
}
