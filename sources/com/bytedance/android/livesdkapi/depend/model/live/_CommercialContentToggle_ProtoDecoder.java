package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CommercialContentToggle_ProtoDecoder implements InterfaceC31105CIr<CommercialContentToggle> {
    public static CommercialContentToggle LIZIZ(Q9H q9h) {
        CommercialContentToggle commercialContentToggle = new CommercialContentToggle();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            commercialContentToggle.promoteThirdParty = Q9J.LIZ(q9h);
                        }
                    } else {
                        commercialContentToggle.promoteMyself = Q9J.LIZ(q9h);
                    }
                } else {
                    commercialContentToggle.openCommercialContentToggle = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return commercialContentToggle;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CommercialContentToggle LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
