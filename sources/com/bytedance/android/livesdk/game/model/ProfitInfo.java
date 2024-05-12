package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class ProfitInfo extends F9E {

    @InterfaceC65349Pkn("daily_new_installs")
    public Long dailyNewInstalls;

    @InterfaceC65349Pkn("daily_new_players")
    public Long dailyNewPlayers;

    @InterfaceC65349Pkn("daily_revenue")
    public String dailyRevenue;

    @InterfaceC65349Pkn("end_ts")
    public Long endTs;

    @InterfaceC65349Pkn("start_ts")
    public Long startTs;

    @InterfaceC65349Pkn("total_earnings")
    public String totalEarnings;

    @InterfaceC65349Pkn("total_revenue")
    public String totalRevenue;

    @InterfaceC65349Pkn("total_earnings_usd")
    public String totalEarningsUsd = "";

    @InterfaceC65349Pkn("refunds_usd")
    public String refundsUsd = "";

    @InterfaceC65349Pkn("daily_revenue_usd")
    public String dailyRevenueUsd = "";

    @InterfaceC65349Pkn("total_revenue_usd")
    public String totalRevenueUsd = "";

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.startTs;
        Long l2 = this.endTs;
        String str = this.totalRevenue;
        String str2 = this.dailyRevenue;
        Long l3 = this.dailyNewPlayers;
        Long l4 = this.dailyNewInstalls;
        return new Object[]{l, l, l2, l2, str, str, str2, str2, l3, l3, l4, l4};
    }
}
