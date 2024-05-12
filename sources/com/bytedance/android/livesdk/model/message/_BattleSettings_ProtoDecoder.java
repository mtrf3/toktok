package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _BattleSettings_ProtoDecoder implements InterfaceC31105CIr<BattleSettings> {
    @Override // X.InterfaceC31105CIr
    public final BattleSettings LIZ(Q9H q9h) {
        BattleSettings battleSettings = new BattleSettings();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 2:
                        battleSettings.battleId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        battleSettings.startTimeMs = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        battleSettings.duration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        battleSettings.theme = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        battleSettings.channelId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        battleSettings.matchType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        battleSettings.bannerUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        battleSettings.subType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        battleSettings.mode = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        battleSettings.config = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleSettings;
            }
        }
    }
}
