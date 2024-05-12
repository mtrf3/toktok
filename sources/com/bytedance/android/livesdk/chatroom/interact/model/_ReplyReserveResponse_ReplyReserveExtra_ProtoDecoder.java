package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyReserveResponse;

/* loaded from: classes14.dex */
public final class _ReplyReserveResponse_ReplyReserveExtra_ProtoDecoder implements InterfaceC31105CIr<ReplyReserveResponse.ReplyReserveExtra> {
    public static ReplyReserveResponse.ReplyReserveExtra LIZIZ(Q9H q9h) {
        ReplyReserveResponse.ReplyReserveExtra replyReserveExtra = new ReplyReserveResponse.ReplyReserveExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    replyReserveExtra.logPb = _ReplyReserveResponse_ReplyReserveExtra_LogPb_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return replyReserveExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReplyReserveResponse.ReplyReserveExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
