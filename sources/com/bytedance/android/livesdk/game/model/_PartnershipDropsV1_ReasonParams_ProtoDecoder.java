package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;

/* loaded from: classes17.dex */
public final class _PartnershipDropsV1_ReasonParams_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsV1.ReasonParams> {
    public static PartnershipDropsV1.ReasonParams LIZIZ(Q9H q9h) {
        PartnershipDropsV1.ReasonParams reasonParams = new PartnershipDropsV1.ReasonParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        reasonParams.topRewardParams = _PartnershipDropsV1_ReasonParams_TopRewardsParams_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    reasonParams.excellentCreatorParams = _PartnershipDropsV1_ReasonParams_ExcellentCreatorParams_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reasonParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsV1.ReasonParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
