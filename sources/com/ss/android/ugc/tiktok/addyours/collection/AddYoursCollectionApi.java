package com.ss.android.ugc.tiktok.addyours.collection;

import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursCollectionTopicsResp;

/* loaded from: classes4.dex */
public interface AddYoursCollectionApi {
    @E8M("/tiktok/v1/addyours/topic/collect")
    @InterfaceC195757mF
    Object collectAddYoursTopic(@InterfaceC64985Pev("topic_id") long j, @InterfaceC64985Pev("action") int i, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/v1/addyours/collection/topics")
    Object getAddYoursCollectionList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, InterfaceC67352kd<? super AddYoursCollectionTopicsResp> interfaceC67352kd);
}
