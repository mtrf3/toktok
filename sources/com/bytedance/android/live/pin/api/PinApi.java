package com.bytedance.android.live.pin.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import webcast.api.interaction.PinResponse;

/* loaded from: classes6.dex */
public interface PinApi {
    @E8M("/webcast/room/pin/")
    @InterfaceC195757mF
    AbstractC73672Svk<PinResponse> pin(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("method") String str, @InterfaceC64985Pev("payload") String str2);

    @E8M("/webcast/room/pin_cancel/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> unpin(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("content_msg_id") long j2, @InterfaceC64985Pev("pin_msg_id") long j3, @InterfaceC64985Pev("method") String str);
}
