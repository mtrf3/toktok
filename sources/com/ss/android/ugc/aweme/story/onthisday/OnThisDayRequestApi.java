package com.ss.android.ugc.aweme.story.onthisday;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;

/* loaded from: classes2.dex */
public interface OnThisDayRequestApi {
    @E8L("/tiktok/v1/memorable/video/")
    AbstractC73672Svk<OnThisDayResponse> requestOnThisDayAweme();

    @E8M("/tiktok/v1/memorable/video/update/")
    Object sendViewedMemorableView(@InterfaceC64986Pew("past_memory_key") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
