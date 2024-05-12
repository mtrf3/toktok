package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GameAttributionInfo_ProtoDecoder implements InterfaceC31105CIr<GameAttributionInfo> {
    public static GameAttributionInfo LIZIZ(Q9H q9h) {
        GameAttributionInfo gameAttributionInfo = new GameAttributionInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            gameAttributionInfo.viewThroughUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        gameAttributionInfo.viewReportScene = q9h.LJIIJ();
                    }
                } else {
                    gameAttributionInfo.cppUrl = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameAttributionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameAttributionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
