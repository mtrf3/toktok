package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizJoinDirectParams_ProtoDecoder implements InterfaceC31105CIr<BizJoinDirectParams> {
    @Override // X.InterfaceC31105CIr
    public final BizJoinDirectParams LIZ(Q9H q9h) {
        BizJoinDirectParams bizJoinDirectParams = new BizJoinDirectParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            bizJoinDirectParams.userReturnType = q9h.LJIIJ();
                        }
                    } else {
                        bizJoinDirectParams.replyType = q9h.LJIIJ();
                    }
                } else {
                    bizJoinDirectParams.linkType = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizJoinDirectParams;
            }
        }
    }
}
