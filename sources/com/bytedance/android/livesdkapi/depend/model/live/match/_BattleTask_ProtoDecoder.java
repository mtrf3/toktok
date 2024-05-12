package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleTask_ProtoDecoder implements InterfaceC31105CIr<BattleTask> {
    public static BattleTask LIZIZ(Q9H q9h) {
        BattleTask battleTask = new BattleTask();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleTask.battleBonusStatus = _BattleBonusStatus_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    battleTask.battleBonusConfig = _BattleBonusConfig_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTask;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTask LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
