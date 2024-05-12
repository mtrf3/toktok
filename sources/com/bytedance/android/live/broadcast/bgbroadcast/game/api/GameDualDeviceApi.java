package com.bytedance.android.live.broadcast.bgbroadcast.game.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes.dex */
public interface GameDualDeviceApi {
    @E8M("/webcast/game/basic/dual_device_update/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> dualDeviceUpdate(@InterfaceC64985Pev("status") int i, @InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("update_reason") String str);
}
