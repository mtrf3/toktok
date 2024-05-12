package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;

/* loaded from: classes17.dex */
public final class _PartnershipDropsV1_ReasonParams_ExcellentCreatorParams_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsV1.ReasonParams.ExcellentCreatorParams> {
    public static PartnershipDropsV1.ReasonParams.ExcellentCreatorParams LIZIZ(Q9H q9h) {
        PartnershipDropsV1.ReasonParams.ExcellentCreatorParams excellentCreatorParams = new PartnershipDropsV1.ReasonParams.ExcellentCreatorParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    excellentCreatorParams.gameName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return excellentCreatorParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsV1.ReasonParams.ExcellentCreatorParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
