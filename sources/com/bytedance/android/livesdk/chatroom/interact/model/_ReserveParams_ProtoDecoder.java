package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ReserveParams_ProtoDecoder implements InterfaceC31105CIr<ReserveParams> {
    @Override // X.InterfaceC31105CIr
    public final ReserveParams LIZ(Q9H q9h) {
        ReserveParams reserveParams = new ReserveParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            reserveParams.toUserId = q9h.LJIIJJI();
                        }
                    } else {
                        reserveParams.toRoomId = q9h.LJIIJJI();
                    }
                } else {
                    reserveParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return reserveParams;
            }
        }
    }
}
