package com.ss.android.ugc.aweme.detail.api;

import X.C76L;
import X.E4T;
import X.InterfaceC64986Pew;

/* loaded from: classes2.dex */
public interface IUpvoteApi {
    @E4T("tiktok/v1/upvote/feed")
    C76L<UpvoteFeedListResponse> getUpvoteFeedList(@InterfaceC64986Pew("page_control") String str, @InterfaceC64986Pew("client_viewed_gids") String str2, @InterfaceC64986Pew("top_upvoter_uids") String str3);
}
