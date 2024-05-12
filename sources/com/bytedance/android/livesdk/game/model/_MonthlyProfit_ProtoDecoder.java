package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _MonthlyProfit_ProtoDecoder implements InterfaceC31105CIr<MonthlyProfit> {
    @Override // X.InterfaceC31105CIr
    public final MonthlyProfit LIZ(Q9H q9h) {
        MonthlyProfit monthlyProfit = new MonthlyProfit();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        monthlyProfit.year = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 2:
                        monthlyProfit.month = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 3:
                        monthlyProfit.earnings = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        monthlyProfit.totalRevenue = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        monthlyProfit.refunds = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        monthlyProfit.earningsUsd = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        monthlyProfit.totalRevenueUsd = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        monthlyProfit.refundsUsd = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return monthlyProfit;
            }
        }
    }
}
