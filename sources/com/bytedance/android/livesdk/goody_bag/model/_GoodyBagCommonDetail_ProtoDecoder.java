package com.bytedance.android.livesdk.goody_bag.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GoodyBagCommonDetail_ProtoDecoder implements InterfaceC31105CIr<GoodyBagCommonDetail> {
    public static GoodyBagCommonDetail LIZIZ(Q9H q9h) {
        GoodyBagCommonDetail goodyBagCommonDetail = new GoodyBagCommonDetail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        goodyBagCommonDetail.winnerHeadcount = q9h.LJIIJ();
                        break;
                    case 2:
                        goodyBagCommonDetail.joinedHeadcount = q9h.LJIIJ();
                        break;
                    case 3:
                        goodyBagCommonDetail.participateMethod = q9h.LJIIJ();
                        break;
                    case 4:
                        goodyBagCommonDetail.participateMethodContent = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        goodyBagCommonDetail.openAt = q9h.LJIIJ();
                        break;
                    case 6:
                        goodyBagCommonDetail.countDownMinutes = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return goodyBagCommonDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GoodyBagCommonDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
