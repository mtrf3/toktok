package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleMode;

/* loaded from: classes17.dex */
public final class _BattleMode_StealTowerData_ProtoDecoder implements InterfaceC31105CIr<BattleMode.StealTowerData> {
    public static BattleMode.StealTowerData LIZIZ(Q9H q9h) {
        BattleMode.StealTowerData stealTowerData = new BattleMode.StealTowerData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        stealTowerData.triggerTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        stealTowerData.duration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        stealTowerData.targetScore = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        stealTowerData.startTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        stealTowerData.attackerId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        stealTowerData.finishTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        stealTowerData.win = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        stealTowerData.count = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        stealTowerData.openScore = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        stealTowerData.finish = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return stealTowerData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleMode.StealTowerData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
