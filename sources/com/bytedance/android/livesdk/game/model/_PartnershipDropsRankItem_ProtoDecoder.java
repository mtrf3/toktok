package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PartnershipDropsRankItem_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsRankItem> {
    public static PartnershipDropsRankItem LIZIZ(Q9H q9h) {
        PartnershipDropsRankItem partnershipDropsRankItem = new PartnershipDropsRankItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipDropsRankItem.dropsIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipDropsRankItem.anchorIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipDropsRankItem.score = q9h.LJIIJ();
                        break;
                    case 4:
                        partnershipDropsRankItem.rank = q9h.LJIIJ();
                        break;
                    case 5:
                        partnershipDropsRankItem.name = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        partnershipDropsRankItem.headUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        partnershipDropsRankItem.followStatus = q9h.LJIIJ();
                        break;
                    case 8:
                        partnershipDropsRankItem.liveStatus = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsRankItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsRankItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
