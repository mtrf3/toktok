package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _ProfitInfo_ProtoDecoder implements InterfaceC31105CIr<ProfitInfo> {
    public static ProfitInfo LIZIZ(Q9H q9h) {
        ProfitInfo profitInfo = new ProfitInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        profitInfo.startTs = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        profitInfo.endTs = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        profitInfo.totalRevenue = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        profitInfo.dailyRevenue = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 6:
                        profitInfo.dailyNewPlayers = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        profitInfo.dailyNewInstalls = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        profitInfo.totalEarnings = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        profitInfo.totalRevenueUsd = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        profitInfo.dailyRevenueUsd = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        profitInfo.refundsUsd = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        profitInfo.totalEarningsUsd = Q9J.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return profitInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ProfitInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
