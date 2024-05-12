package com.bytedance.android.livesdk.goody_bag.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GoodyBagWinnerInfo_ProtoDecoder implements InterfaceC31105CIr<GoodyBagWinnerInfo> {
    public static GoodyBagWinnerInfo LIZIZ(Q9H q9h) {
        GoodyBagWinnerInfo goodyBagWinnerInfo = new GoodyBagWinnerInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        goodyBagWinnerInfo.coins = q9h.LJIIJ();
                    }
                } else {
                    goodyBagWinnerInfo.userInfo = _GoodyBagUserInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return goodyBagWinnerInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GoodyBagWinnerInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
