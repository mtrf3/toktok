package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _BattleTaskInfo_ProtoDecoder implements InterfaceC31105CIr<BattleTaskInfo> {
    @Override // X.InterfaceC31105CIr
    public final BattleTaskInfo LIZ(Q9H q9h) {
        BattleTaskInfo battleTaskInfo = new BattleTaskInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        battleTaskInfo.taskType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        battleTaskInfo.startTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        battleTaskInfo.duration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        battleTaskInfo.endTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        battleTaskInfo.taskRound = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        battleTaskInfo.collectedCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        battleTaskInfo.goalCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        battleTaskInfo.finished = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        battleTaskInfo.success = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        battleTaskInfo.bonusRatio = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        battleTaskInfo.hasNextTask = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTaskInfo;
            }
        }
    }
}
