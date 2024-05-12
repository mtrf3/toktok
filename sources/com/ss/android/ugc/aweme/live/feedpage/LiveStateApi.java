package com.ss.android.ugc.aweme.live.feedpage;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;

/* loaded from: classes6.dex */
public interface LiveStateApi {
    @E8L("/webcast/room/collect_unread/")
    AbstractC73672Svk<C28467BFf<Object>> collectUnreadRequest(@InterfaceC64986Pew("unread_extra") String str, @InterfaceC64986Pew("room_ids") String str2);

    @E8M("/webcast/room/live_room_id/")
    @InterfaceC195757mF
    AbstractC73672Svk<LiveStateResponse> liveStates(@InterfaceC64985Pev("user_id") String str, @InterfaceC64985Pev("scene") String str2, @InterfaceC64986Pew("request_audience_api") int i);
}
