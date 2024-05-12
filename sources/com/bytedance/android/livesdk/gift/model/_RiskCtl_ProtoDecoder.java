package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RiskCtl_ProtoDecoder implements InterfaceC31105CIr<RiskCtl> {
    public static RiskCtl LIZIZ(Q9H q9h) {
        RiskCtl riskCtl = new RiskCtl();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            riskCtl.toastReason = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        riskCtl.errorMsg = Q9J.LIZIZ(q9h);
                    }
                } else {
                    riskCtl.disableSendGift = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return riskCtl;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RiskCtl LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
