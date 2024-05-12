package com.ss.android.ugc.aweme.feed.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.EventDetailData;

/* loaded from: classes2.dex */
public interface LiveEventActionApi$RealApi {
    @E4Q("/tiktok/event/get/v1")
    AbstractC73672Svk<EventDetailData> getEventDetail(@InterfaceC64989Pez("event_id") String str);

    @E4T("/tiktok/event/subscribe/v1")
    AbstractC73672Svk<BaseResponse> registerEvent(@InterfaceC64989Pez("event_id") String str);

    @E4T("/tiktok/event/unsubscribe/v1")
    AbstractC73672Svk<BaseResponse> unregisterEvent(@InterfaceC64989Pez("event_id") String str);
}
