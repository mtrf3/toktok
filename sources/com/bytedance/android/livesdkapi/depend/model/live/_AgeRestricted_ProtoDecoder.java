package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _AgeRestricted_ProtoDecoder implements InterfaceC31105CIr<AgeRestricted> {
    public static AgeRestricted LIZIZ(Q9H q9h) {
        AgeRestricted ageRestricted = new AgeRestricted();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            ageRestricted.source = q9h.LJIIJ();
                        }
                    } else {
                        ageRestricted.ageInterval = q9h.LJIIJ();
                    }
                } else {
                    ageRestricted.restricted = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return ageRestricted;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AgeRestricted LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
