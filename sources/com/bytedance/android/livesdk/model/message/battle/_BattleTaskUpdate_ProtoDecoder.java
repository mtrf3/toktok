package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleTaskUpdate_ProtoDecoder implements InterfaceC31105CIr<BattleTaskUpdate> {
    public static BattleTaskUpdate LIZIZ(Q9H q9h) {
        BattleTaskUpdate battleTaskUpdate = new BattleTaskUpdate();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 21) {
                                Q9J.LIZJ(q9h);
                            } else {
                                battleTaskUpdate.logId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            battleTaskUpdate.promptKey = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        battleTaskUpdate.fromUserUid = q9h.LJIIJJI();
                    }
                } else {
                    battleTaskUpdate.taskProgress = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTaskUpdate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTaskUpdate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
