package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact.ReplyResponse;

/* loaded from: classes14.dex */
public final class _ReplyResponse_ReplyExtra_LogPb_ProtoDecoder implements InterfaceC31105CIr<ReplyResponse.ReplyExtra.LogPb> {
    public static ReplyResponse.ReplyExtra.LogPb LIZIZ(Q9H q9h) {
        ReplyResponse.ReplyExtra.LogPb logPb = new ReplyResponse.ReplyExtra.LogPb();
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
    public final ReplyResponse.ReplyExtra.LogPb LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
