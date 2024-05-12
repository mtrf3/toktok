package com.bytedance.android.livesdk.business.detect;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import com.google.gson.m;
import java.util.Map;

/* loaded from: classes14.dex */
public interface MessageDetectApi {
    @E8M("/webcast/im/detect/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<m>> imDetect(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("anchor_device_id") long j2, @InterfaceC64985Pev("anchor_user_id") long j3, @InterfaceC64985Pev("client_start_ms") long j4, @InterfaceC64985Pev("msg_body") String str, @InterfaceC36229EJt Map<String, String> map);

    @E8M("/webcast/im/detect/report/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<m>> imDetectReport(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("msg_type") int i, @InterfaceC64985Pev("client_start_ms") long j2, @InterfaceC64985Pev("api_recv_time_ms") long j3, @InterfaceC64985Pev("api_send_to_goim_ms") long j4, @InterfaceC64985Pev("imsdk_recv_time_ms") long j5, @InterfaceC64985Pev("imsdk_deliver_time_ms") long j6);
}
