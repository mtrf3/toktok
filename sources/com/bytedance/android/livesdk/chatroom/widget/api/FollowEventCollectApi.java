package com.bytedance.android.livesdk.chatroom.widget.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes2.dex */
public interface FollowEventCollectApi {
    @E8M("/webcast/room/event_collect/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> collectEventForFollow(@InterfaceC64985Pev("event_type") int i, @InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("anchor_id") long j2);
}
