package com.bytedance.android.livesdk.mvp;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.network.response.BaseResponse;

/* loaded from: classes6.dex */
public interface PaidRoomApi {
    @E8M("/webcast/room/gated/check_ticket/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<Void, CheckCodeExtra>> checkCode(@InterfaceC64985Pev("ticket_code") String str, @InterfaceC64985Pev("room_id") Long l);

    @E8L("/webcast/room/gated/event_info/")
    AbstractC73672Svk<C28467BFf<GatedRoomData>> queryRoomData(@InterfaceC64986Pew("room_id") Long l);
}
