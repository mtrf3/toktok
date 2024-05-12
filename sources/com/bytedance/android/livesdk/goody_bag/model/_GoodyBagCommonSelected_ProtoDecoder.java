package com.bytedance.android.livesdk.goody_bag.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GoodyBagCommonSelected_ProtoDecoder implements InterfaceC31105CIr<GoodyBagCommonSelected> {
    public static GoodyBagCommonSelected LIZIZ(Q9H q9h) {
        GoodyBagCommonSelected goodyBagCommonSelected = new GoodyBagCommonSelected();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                goodyBagCommonSelected.countdownMinute = q9h.LJIIJ();
                            }
                        } else {
                            goodyBagCommonSelected.participateMethodContent = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        goodyBagCommonSelected.participateMethod = q9h.LJIIJ();
                    }
                } else {
                    goodyBagCommonSelected.winnerHeadcount = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return goodyBagCommonSelected;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GoodyBagCommonSelected LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
