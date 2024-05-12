package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;

/* loaded from: classes17.dex */
public final class _PartnershipDropsV1_ReasonParams_TopRewardsParams_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsV1.ReasonParams.TopRewardsParams> {
    public static PartnershipDropsV1.ReasonParams.TopRewardsParams LIZIZ(Q9H q9h) {
        PartnershipDropsV1.ReasonParams.TopRewardsParams topRewardsParams = new PartnershipDropsV1.ReasonParams.TopRewardsParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        topRewardsParams.rank = q9h.LJIIJ();
                    }
                } else {
                    topRewardsParams.eventName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return topRewardsParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsV1.ReasonParams.TopRewardsParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
