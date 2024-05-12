package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ExemptStrategy_ProtoDecoder implements InterfaceC31105CIr<ExemptStrategy> {
    public static ExemptStrategy LIZIZ(Q9H q9h) {
        ExemptStrategy exemptStrategy = new ExemptStrategy();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        exemptStrategy.exemptAudienceTop = q9h.LJIIJ();
                    }
                } else {
                    exemptStrategy.exemptBothHost = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return exemptStrategy;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ExemptStrategy LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
