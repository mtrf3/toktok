package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizReplyParams_ProtoDecoder implements InterfaceC31105CIr<BizReplyParams> {
    @Override // X.InterfaceC31105CIr
    public final BizReplyParams LIZ(Q9H q9h) {
        BizReplyParams bizReplyParams = new BizReplyParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bizReplyParams.isTurnOffInvitation = q9h.LJIIJ();
                    }
                } else {
                    bizReplyParams.linkType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizReplyParams;
            }
        }
    }
}
