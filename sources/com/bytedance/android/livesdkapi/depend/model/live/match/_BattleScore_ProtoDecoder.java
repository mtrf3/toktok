package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _BattleScore_ProtoDecoder implements InterfaceC31105CIr<BattleScore> {
    public static BattleScore LIZIZ(Q9H q9h) {
        BattleScore battleScore = new BattleScore();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleScore.userId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    battleScore.score = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleScore;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleScore LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
