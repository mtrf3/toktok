package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerReserveNoticeResponse;

/* loaded from: classes14.dex */
public final class _TriggerReserveNoticeResponse_ProtoDecoder implements InterfaceC31105CIr<TriggerReserveNoticeResponse> {
    @Override // X.InterfaceC31105CIr
    public final TriggerReserveNoticeResponse LIZ(Q9H q9h) {
        TriggerReserveNoticeResponse triggerReserveNoticeResponse = new TriggerReserveNoticeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    TriggerReserveNoticeResponse.ResponseData responseData = new TriggerReserveNoticeResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    triggerReserveNoticeResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return triggerReserveNoticeResponse;
            }
        }
    }
}
