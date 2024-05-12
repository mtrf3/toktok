package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _ChijiHistory_ProtoDecoder implements InterfaceC31105CIr<ChijiHistory> {
    @Override // X.InterfaceC31105CIr
    public final ChijiHistory LIZ(Q9H q9h) {
        ChijiHistory chijiHistory = new ChijiHistory();
        chijiHistory.resultList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        chijiHistory.userId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        chijiHistory.canParticipate = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 3:
                        chijiHistory.originalBonus = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        chijiHistory.totalParticipations = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        chijiHistory.participationsThisMonth = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        chijiHistory.maxWinningStreak = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        chijiHistory.maxBattleScore = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        chijiHistory.totalBonus = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        chijiHistory.bonusThisMonth = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        chijiHistory.maxBonus = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        chijiHistory.resultList.add(_ChijiResult_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return chijiHistory;
            }
        }
    }
}
