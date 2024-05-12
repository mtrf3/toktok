package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PartnershipGameEvent_ProtoDecoder implements InterfaceC31105CIr<PartnershipGameEvent> {
    public static PartnershipGameEvent LIZIZ(Q9H q9h) {
        PartnershipGameEvent partnershipGameEvent = new PartnershipGameEvent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipGameEvent.gameTagId = q9h.LJIIJJI();
                        break;
                    case 2:
                        partnershipGameEvent.anchorHasJoined = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        partnershipGameEvent.eventDetailUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        partnershipGameEvent.gameName = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        partnershipGameEvent.gameIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        partnershipGameEvent.taskIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        partnershipGameEvent.eventIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        partnershipGameEvent.eventType = q9h.LJIIJ();
                        break;
                    case 9:
                        partnershipGameEvent.incentivetype = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipGameEvent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipGameEvent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
