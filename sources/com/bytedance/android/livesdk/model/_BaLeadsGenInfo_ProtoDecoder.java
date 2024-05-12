package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BaLeadsGenInfo_ProtoDecoder implements InterfaceC31105CIr<BaLeadsGenInfo> {
    public static BaLeadsGenInfo LIZIZ(Q9H q9h) {
        BaLeadsGenInfo baLeadsGenInfo = new BaLeadsGenInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        baLeadsGenInfo.leadsGenModel = Q9J.LIZIZ(q9h);
                    }
                } else {
                    baLeadsGenInfo.leadsGenPermission = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return baLeadsGenInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BaLeadsGenInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
