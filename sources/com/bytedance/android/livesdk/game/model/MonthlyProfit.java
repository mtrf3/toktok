package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class MonthlyProfit extends F9E {

    @InterfaceC65349Pkn("earnings")
    public String earnings;

    @InterfaceC65349Pkn("month")
    public Integer month;

    @InterfaceC65349Pkn("refunds")
    public String refunds;

    @InterfaceC65349Pkn("total_revenue")
    public String totalRevenue;

    @InterfaceC65349Pkn("year")
    public Integer year;

    @InterfaceC65349Pkn("refunds_usd")
    public String refundsUsd = "";

    @InterfaceC65349Pkn("total_revenue_usd")
    public String totalRevenueUsd = "";

    @InterfaceC65349Pkn("earnings_usd")
    public String earningsUsd = "";

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.year;
        Integer num2 = this.month;
        String str = this.earnings;
        String str2 = this.totalRevenue;
        String str3 = this.refunds;
        return new Object[]{num, num, num2, num2, str, str, str2, str2, str3, str3};
    }
}
