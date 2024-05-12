package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleTaskSettle_ProtoDecoder implements InterfaceC31105CIr<BattleTaskSettle> {
    public static BattleTaskSettle LIZIZ(Q9H q9h) {
        BattleTaskSettle battleTaskSettle = new BattleTaskSettle();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleTaskSettle.rewardStartTime = q9h.LJIIJJI();
                    }
                } else {
                    battleTaskSettle.taskResult = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTaskSettle;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTaskSettle LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
