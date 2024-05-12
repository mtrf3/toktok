package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PartnershipBriefDrops_ProtoDecoder implements InterfaceC31105CIr<PartnershipBriefDrops> {
    public static PartnershipBriefDrops LIZIZ(Q9H q9h) {
        PartnershipBriefDrops partnershipBriefDrops = new PartnershipBriefDrops();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipBriefDrops.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipBriefDrops.name = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipBriefDrops.icon = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        partnershipBriefDrops.gameName = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        partnershipBriefDrops.startTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        partnershipBriefDrops.endTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        partnershipBriefDrops.joined = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        partnershipBriefDrops.gameIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        partnershipBriefDrops.incentivetype = q9h.LJIIJ();
                        break;
                    case 10:
                        partnershipBriefDrops.gameTagId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipBriefDrops;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipBriefDrops LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
