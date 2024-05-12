package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes20.dex */
public final class PeriodTimeInfo extends F9E {

    @InterfaceC65349Pkn("period_end_time")
    public final long periodEndTime;

    @InterfaceC65349Pkn("period_start_time")
    public final long periodStartTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.periodStartTime), Long.valueOf(this.periodEndTime)};
    }

    public PeriodTimeInfo(long j, long j2) {
        this.periodStartTime = j;
        this.periodEndTime = j2;
    }
}
