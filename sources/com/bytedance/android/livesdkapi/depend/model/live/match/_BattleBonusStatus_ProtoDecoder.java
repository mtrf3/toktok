package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _BattleBonusStatus_ProtoDecoder implements InterfaceC31105CIr<BattleBonusStatus> {
    public static BattleBonusStatus LIZIZ(Q9H q9h) {
        BattleBonusStatus battleBonusStatus = new BattleBonusStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        switch (LJI) {
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                battleBonusStatus.taskProgress = q9h.LJIIJJI();
                                break;
                            case 12:
                                battleBonusStatus.userAssisted = Q9J.LIZ(q9h);
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                battleBonusStatus.rewardSettlePrompt = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 14:
                                battleBonusStatus.rewardSettleDuration = q9h.LJIIJJI();
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                    } else {
                        battleBonusStatus.enterRoomPrompt = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    battleBonusStatus.bonusPeriod = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleBonusStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleBonusStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
