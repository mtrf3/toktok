package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ReserveResponse_ProtoDecoder implements InterfaceC31105CIr<ReserveResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReserveResponse LIZ(Q9H q9h) {
        ReserveResponse reserveResponse = new ReserveResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        reserveResponse.extra = _ReserveResponse_ReserveExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    reserveResponse.data = _ReserveResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reserveResponse;
            }
        }
    }
}
