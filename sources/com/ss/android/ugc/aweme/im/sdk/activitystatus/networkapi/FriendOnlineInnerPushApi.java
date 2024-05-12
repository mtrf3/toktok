package com.ss.android.ugc.aweme.im.sdk.activitystatus.networkapi;

import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes2.dex */
public interface FriendOnlineInnerPushApi {
    @InterfaceC195757mF
    @E4T("/tiktok/v1/im_rank_feedback/report")
    Object reportFriendOnlinePushFeedback(@InterfaceC64987Pex("sender_uid") long j, @InterfaceC64987Pex("action_mode") int i, @InterfaceC64987Pex("scene") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
