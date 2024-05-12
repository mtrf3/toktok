package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ReplyReserveParams_ProtoDecoder implements InterfaceC31105CIr<ReplyReserveParams> {
    @Override // X.InterfaceC31105CIr
    public final ReplyReserveParams LIZ(Q9H q9h) {
        ReplyReserveParams replyReserveParams = new ReplyReserveParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                replyReserveParams.replyStatus = q9h.LJIIJ();
                            }
                        } else {
                            replyReserveParams.reserverUserId = q9h.LJIIJJI();
                        }
                    } else {
                        replyReserveParams.reserverRoomId = q9h.LJIIJJI();
                    }
                } else {
                    replyReserveParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return replyReserveParams;
            }
        }
    }
}
