package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleResult_ProtoDecoder implements InterfaceC31105CIr<BattleResult> {
    public static BattleResult LIZIZ(Q9H q9h) {
        BattleResult battleResult = new BattleResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            battleResult.score = q9h.LJIIJJI();
                        }
                    } else {
                        battleResult.result = q9h.LJIIJ();
                    }
                } else {
                    battleResult.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
