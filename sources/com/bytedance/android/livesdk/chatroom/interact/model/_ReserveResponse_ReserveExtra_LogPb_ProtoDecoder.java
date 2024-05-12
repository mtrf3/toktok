package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;

/* loaded from: classes14.dex */
public final class _ReserveResponse_ReserveExtra_LogPb_ProtoDecoder implements InterfaceC31105CIr<ReserveResponse.ReserveExtra.LogPb> {
    public static ReserveResponse.ReserveExtra.LogPb LIZIZ(Q9H q9h) {
        ReserveResponse.ReserveExtra.LogPb logPb = new ReserveResponse.ReserveExtra.LogPb();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    logPb.imprId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return logPb;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReserveResponse.ReserveExtra.LogPb LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
