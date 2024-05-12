package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PartnershipDropsRewardV1_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsRewardV1> {
    public static PartnershipDropsRewardV1 LIZIZ(Q9H q9h) {
        PartnershipDropsRewardV1 partnershipDropsRewardV1 = new PartnershipDropsRewardV1();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                partnershipDropsRewardV1.activityId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            partnershipDropsRewardV1.type = q9h.LJIIJ();
                        }
                    } else {
                        partnershipDropsRewardV1.gift = _PartnershipGiftInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    partnershipDropsRewardV1.game = _BriefGame_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsRewardV1;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsRewardV1 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
