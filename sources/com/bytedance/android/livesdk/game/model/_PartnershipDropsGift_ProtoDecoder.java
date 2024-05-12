package com.bytedance.android.livesdk.game.model;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PartnershipDropsGift_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsGift> {
    public static PartnershipDropsGift LIZIZ(Q9H q9h) {
        PartnershipDropsGift partnershipDropsGift = new PartnershipDropsGift();
        partnershipDropsGift.taskConfig = new ArrayList();
        partnershipDropsGift.totalNumConfig = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipDropsGift.gift = _PartnershipGiftInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipDropsGift.totalNum = q9h.LJIIJJI();
                        break;
                    case 3:
                        partnershipDropsGift.taskConfig.add(_PartnershipDropsTaskConfig_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        C29991Fr.LIZ(q9h, partnershipDropsGift.totalNumConfig);
                        break;
                    case 5:
                        partnershipDropsGift.unique = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        partnershipDropsGift.totalAvailableNum = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsGift;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsGift LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
