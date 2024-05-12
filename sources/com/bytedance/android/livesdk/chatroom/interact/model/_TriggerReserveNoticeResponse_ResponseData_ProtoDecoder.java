package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerReserveNoticeResponse;

/* loaded from: classes14.dex */
public final class _TriggerReserveNoticeResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<TriggerReserveNoticeResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final TriggerReserveNoticeResponse.ResponseData LIZ(Q9H q9h) {
        TriggerReserveNoticeResponse.ResponseData responseData = new TriggerReserveNoticeResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
