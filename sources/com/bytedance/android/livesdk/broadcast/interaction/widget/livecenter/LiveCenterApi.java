package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import tikcast.api.anchor_data.GetRealtimeLiveCenterOverviewContainer;

/* loaded from: classes6.dex */
public interface LiveCenterApi {
    @E8L("/webcast/live_center/realtime/overview/")
    AbstractC73672Svk<C28467BFf<GetRealtimeLiveCenterOverviewContainer>> getOverview(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("need_detail") int i, @InterfaceC64986Pew("need_layout") int i2);

    @E8M("/webcast/live_center/realtime/operate/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> switchImMessage(@InterfaceC64985Pev("action") int i, @InterfaceC64985Pev("push_interval") int i2, @InterfaceC64985Pev("room_id") String str);
}
