package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PermitParams_ProtoDecoder implements InterfaceC31105CIr<PermitParams> {
    @Override // X.InterfaceC31105CIr
    public final PermitParams LIZ(Q9H q9h) {
        PermitParams permitParams = new PermitParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        permitParams.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        permitParams.toUserId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        permitParams.secToUserId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        permitParams.fromUserRole = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        permitParams.effectiveSeconds = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        permitParams.transparentExtra = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        permitParams.permitStatus = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return permitParams;
            }
        }
    }
}
