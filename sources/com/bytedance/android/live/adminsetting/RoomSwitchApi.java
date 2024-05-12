package com.bytedance.android.live.adminsetting;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes.dex */
public interface RoomSwitchApi {
    @E8M("/webcast/room/switch/batch_update/")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<C28467BFf<Object>> batchUpdateSwitch(@InterfaceC195727mC SwitchBatchUpdateRequest switchBatchUpdateRequest);

    @E8M("/webcast/room/switch/update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> updateSwitch(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("switch_type") int i, @InterfaceC64985Pev("switch_value") boolean z);
}
