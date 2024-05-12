package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyReserveResponse;

/* loaded from: classes14.dex */
public final class _ReplyReserveResponse_ReplyReserveExtra_LogPb_ProtoDecoder implements InterfaceC31105CIr<ReplyReserveResponse.ReplyReserveExtra.LogPb> {
    public static ReplyReserveResponse.ReplyReserveExtra.LogPb LIZIZ(Q9H q9h) {
        ReplyReserveResponse.ReplyReserveExtra.LogPb logPb = new ReplyReserveResponse.ReplyReserveExtra.LogPb();
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
    public final ReplyReserveResponse.ReplyReserveExtra.LogPb LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
