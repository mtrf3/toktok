package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PartnershipDropsTaskConfig_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsTaskConfig> {
    public static PartnershipDropsTaskConfig LIZIZ(Q9H q9h) {
        PartnershipDropsTaskConfig partnershipDropsTaskConfig = new PartnershipDropsTaskConfig();
        partnershipDropsTaskConfig.viewDurations = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            partnershipDropsTaskConfig.commentTimes = q9h.LJIIJ();
                        }
                    } else {
                        partnershipDropsTaskConfig.viewDurations.add(Integer.valueOf(q9h.LJIIJ()));
                    }
                } else {
                    partnershipDropsTaskConfig.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsTaskConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsTaskConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
