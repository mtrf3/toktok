package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyReserveResponse;

/* loaded from: classes14.dex */
public final class _ReplyReserveResponse_ProtoDecoder implements InterfaceC31105CIr<ReplyReserveResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReplyReserveResponse LIZ(Q9H q9h) {
        ReplyReserveResponse replyReserveResponse = new ReplyReserveResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        replyReserveResponse.extra = _ReplyReserveResponse_ReplyReserveExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    ReplyReserveResponse.ResponseData responseData = new ReplyReserveResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    replyReserveResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return replyReserveResponse;
            }
        }
    }
}
