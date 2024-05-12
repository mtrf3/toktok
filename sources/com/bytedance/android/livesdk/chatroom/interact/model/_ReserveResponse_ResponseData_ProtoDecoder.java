package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;

/* loaded from: classes14.dex */
public final class _ReserveResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ReserveResponse.ResponseData> {
    public static ReserveResponse.ResponseData LIZIZ(Q9H q9h) {
        ReserveResponse.ResponseData responseData = new ReserveResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.reservationId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReserveResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
