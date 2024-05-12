package com.ss.android.ugc.aweme.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public interface ISocial2TabVisitApi {
    @E8M("/tiktok/v1/friend/visit")
    AbstractC73672Svk<BaseResponse> visitFriendsFeedV1();

    @E8M("/tiktok/v1/friends/tab/visit")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> visitSocial2Tab(@InterfaceC64985Pev("landing_feed_type") Integer num, @InterfaceC64985Pev("feeds_to_clear_red_point") String str);
}
