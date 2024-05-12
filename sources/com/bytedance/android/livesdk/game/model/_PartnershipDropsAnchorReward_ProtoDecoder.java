package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PartnershipDropsAnchorReward_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsAnchorReward> {
    public static PartnershipDropsAnchorReward LIZIZ(Q9H q9h) {
        PartnershipDropsAnchorReward partnershipDropsAnchorReward = new PartnershipDropsAnchorReward();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipDropsAnchorReward.dropsIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipDropsAnchorReward.name = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipDropsAnchorReward.icon = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        partnershipDropsAnchorReward.firstRank = q9h.LJIIJ();
                        break;
                    case 5:
                        partnershipDropsAnchorReward.lastRank = q9h.LJIIJ();
                        break;
                    case 6:
                        partnershipDropsAnchorReward.remainNum = q9h.LJIIJ();
                        break;
                    case 7:
                        partnershipDropsAnchorReward.startTime = q9h.LJIIJJI();
                        break;
                    case 8:
                        partnershipDropsAnchorReward.endTime = q9h.LJIIJJI();
                        break;
                    case 9:
                        partnershipDropsAnchorReward.platform = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsAnchorReward;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsAnchorReward LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
