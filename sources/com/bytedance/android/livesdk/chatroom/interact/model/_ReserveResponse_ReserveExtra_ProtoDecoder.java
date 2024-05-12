package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;

/* loaded from: classes14.dex */
public final class _ReserveResponse_ReserveExtra_ProtoDecoder implements InterfaceC31105CIr<ReserveResponse.ReserveExtra> {
    public static ReserveResponse.ReserveExtra LIZIZ(Q9H q9h) {
        ReserveResponse.ReserveExtra reserveExtra = new ReserveResponse.ReserveExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    reserveExtra.logPb = _ReserveResponse_ReserveExtra_LogPb_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reserveExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReserveResponse.ReserveExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
