package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillInfo extends F9E {

    @InterfaceC65349Pkn("bill_amount")
    public final Amount billAmount;

    @InterfaceC65349Pkn("bill_id")
    public final String billId;

    @InterfaceC65349Pkn("bill_month_time")
    public final long billMonthTime;

    @InterfaceC65349Pkn("due_date")
    public final long dueDate;

    @InterfaceC65349Pkn("overdue")
    public final boolean overdue;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.billId, Long.valueOf(this.billMonthTime), Boolean.valueOf(this.overdue), Long.valueOf(this.dueDate), this.billAmount};
    }

    public BillInfo(String billId, long j, boolean z, long j2, Amount billAmount) {
        o.LJIIIZ(billId, "billId");
        o.LJIIIZ(billAmount, "billAmount");
        this.billId = billId;
        this.billMonthTime = j;
        this.overdue = z;
        this.dueDate = j2;
        this.billAmount = billAmount;
    }
}
