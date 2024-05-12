package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubSwitcher_ProtoDecoder implements InterfaceC31105CIr<SubSwitcher> {
    public static SubSwitcher LIZIZ(Q9H q9h) {
        SubSwitcher subSwitcher = new SubSwitcher();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subSwitcher.isClose = Q9J.LIZ(q9h);
                    }
                } else {
                    subSwitcher.subFunctionEnum = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subSwitcher;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubSwitcher LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
