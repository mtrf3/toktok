package com.bytedance.android.live.liveevent;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes.dex */
public interface LiveEventApi {
    @E8M("/webcast/room/bind/event")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> bindLiveEvent(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("owner_user_id") long j2, @InterfaceC64985Pev("event_id") long j3);
}
