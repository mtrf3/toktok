package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _MultiGuestReserveReqParams_ProtoDecoder implements InterfaceC31105CIr<MultiGuestReserveReqParams> {
    @Override // X.InterfaceC31105CIr
    public final MultiGuestReserveReqParams LIZ(Q9H q9h) {
        MultiGuestReserveReqParams multiGuestReserveReqParams = new MultiGuestReserveReqParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        multiGuestReserveReqParams.scene = q9h.LJIIJ();
                        break;
                    case 2:
                        multiGuestReserveReqParams.appId = q9h.LJIIJJI();
                        break;
                    case 3:
                        multiGuestReserveReqParams.liveId = q9h.LJIIJJI();
                        break;
                    case 4:
                        multiGuestReserveReqParams.fromUserId = q9h.LJIIJJI();
                        break;
                    case 5:
                        multiGuestReserveReqParams.toUserId = q9h.LJIIJJI();
                        break;
                    case 6:
                        multiGuestReserveReqParams.roomId = q9h.LJIIJJI();
                        break;
                    case 7:
                        multiGuestReserveReqParams.type = q9h.LJIIJ();
                        break;
                    case 8:
                        multiGuestReserveReqParams.autoFollow = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return multiGuestReserveReqParams;
            }
        }
    }
}
