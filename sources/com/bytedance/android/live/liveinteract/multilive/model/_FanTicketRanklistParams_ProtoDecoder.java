package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FanTicketRanklistParams_ProtoDecoder implements InterfaceC31105CIr<FanTicketRanklistParams> {
    @Override // X.InterfaceC31105CIr
    public final FanTicketRanklistParams LIZ(Q9H q9h) {
        FanTicketRanklistParams fanTicketRanklistParams = new FanTicketRanklistParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        fanTicketRanklistParams.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        fanTicketRanklistParams.guestUserId = q9h.LJIIJJI();
                        break;
                    case 3:
                        fanTicketRanklistParams.anchorId = q9h.LJIIJJI();
                        break;
                    case 4:
                        fanTicketRanklistParams.channelId = q9h.LJIIJJI();
                        break;
                    case 5:
                        fanTicketRanklistParams.linkmicId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        fanTicketRanklistParams.showId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return fanTicketRanklistParams;
            }
        }
    }
}
