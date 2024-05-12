package com.bytedance.android.live.adminsetting;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes.dex */
public interface ChatApproveApi {
    @E8M("/webcast/room/chat/approve")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> chatApprove(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("msg_id") long j2);
}
