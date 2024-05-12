package com.ss.android.ugc.aweme.commercialize.advideo;

import X.AbstractC73672Svk;
import X.C42949GtN;
import X.E4Q;
import X.E4T;
import X.InterfaceC64989Pez;

/* loaded from: classes8.dex */
public interface VideoAuthorizationApi {
    public static final C42949GtN LIZ = C42949GtN.LIZ;

    @E4Q("/tiktok/v1/ad/tagging/invitation/get/")
    AbstractC73672Svk<VideoAuthorizationResponse> getVideoInvitationInfo(@InterfaceC64989Pez("ba_uid") String str, @InterfaceC64989Pez("item_id") String str2, @InterfaceC64989Pez("apply_type") int i, @InterfaceC64989Pez("send_notice_time") long j);

    @E4T("/tiktok/v1/ad/tagging/invitation/update/")
    AbstractC73672Svk<VideoAuthorizationResponse> updateInvitation(@InterfaceC64989Pez("ba_uid") String str, @InterfaceC64989Pez("item_id") String str2, @InterfaceC64989Pez("apply_type") int i, @InterfaceC64989Pez("action") int i2, @InterfaceC64989Pez("send_notice_time") long j);
}
