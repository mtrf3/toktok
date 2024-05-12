package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillDetailData {

    @InterfaceC65349Pkn("amount_due")
    public final Amount amountDue;

    @InterfaceC65349Pkn("amount_repayment")
    public final Amount amountRepayment;

    @InterfaceC65349Pkn("bill_month_time")
    public final long billMonthTime;

    @InterfaceC65349Pkn("bill_period")
    public final PeriodTimeInfo billPeriod;

    @InterfaceC65349Pkn("bill_repayment_status")
    public final String billRepaymentStatus;

    @InterfaceC65349Pkn("bill_status")
    public final String billStatus;

    @InterfaceC65349Pkn("due_date")
    public final Long dueDate;

    @InterfaceC65349Pkn("installment_details_url")
    public final String installmentDetailsUrl;

    @InterfaceC65349Pkn("later_amount")
    public final Amount laterAmount;

    @InterfaceC65349Pkn("loan_order_info_list")
    public final List<LoanOrderInfo> loanOrderInfoList;

    @InterfaceC65349Pkn("next_cursor")
    public final String nextCursor;

    @InterfaceC65349Pkn("order_details_url")
    public final String orderDetailUrl;

    @InterfaceC65349Pkn("overdue_days")
    public final Integer overdueDays;

    @InterfaceC65349Pkn("repayment_button_show")
    public final boolean repaymentButtonShow;

    @InterfaceC65349Pkn("total_statement")
    public final Amount totalStatement;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillDetailData)) {
            return false;
        }
        BillDetailData billDetailData = (BillDetailData) obj;
        return o.LJ(this.amountDue, billDetailData.amountDue) && o.LJ(this.dueDate, billDetailData.dueDate) && o.LJ(this.totalStatement, billDetailData.totalStatement) && o.LJ(this.amountRepayment, billDetailData.amountRepayment) && o.LJ(this.billPeriod, billDetailData.billPeriod) && o.LJ(this.billStatus, billDetailData.billStatus) && o.LJ(this.billRepaymentStatus, billDetailData.billRepaymentStatus) && o.LJ(this.overdueDays, billDetailData.overdueDays) && o.LJ(this.laterAmount, billDetailData.laterAmount) && o.LJ(this.loanOrderInfoList, billDetailData.loanOrderInfoList) && this.repaymentButtonShow == billDetailData.repaymentButtonShow && o.LJ(this.orderDetailUrl, billDetailData.orderDetailUrl) && o.LJ(this.installmentDetailsUrl, billDetailData.installmentDetailsUrl) && o.LJ(this.nextCursor, billDetailData.nextCursor) && this.billMonthTime == billDetailData.billMonthTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.amountDue.hashCode() * 31;
        Long l = this.dueDate;
        int hashCode2 = (((((((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.totalStatement.hashCode()) * 31) + this.amountRepayment.hashCode()) * 31) + this.billPeriod.hashCode()) * 31) + this.billStatus.hashCode()) * 31) + this.billRepaymentStatus.hashCode()) * 31;
        Integer num = this.overdueDays;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.laterAmount.hashCode()) * 31;
        List<LoanOrderInfo> list = this.loanOrderInfoList;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.repaymentButtonShow;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode4 + i) * 31) + this.orderDetailUrl.hashCode()) * 31) + this.installmentDetailsUrl.hashCode()) * 31) + this.nextCursor.hashCode()) * 31) + C16880lQ.LLJIJIL(this.billMonthTime);
    }

    public final String toString() {
        return "BillDetailData(amountDue=" + this.amountDue + ", dueDate=" + this.dueDate + ", totalStatement=" + this.totalStatement + ", amountRepayment=" + this.amountRepayment + ", billPeriod=" + this.billPeriod + ", billStatus=" + this.billStatus + ", billRepaymentStatus=" + this.billRepaymentStatus + ", overdueDays=" + this.overdueDays + ", laterAmount=" + this.laterAmount + ", loanOrderInfoList=" + this.loanOrderInfoList + ", repaymentButtonShow=" + this.repaymentButtonShow + ", orderDetailUrl=" + this.orderDetailUrl + ", installmentDetailsUrl=" + this.installmentDetailsUrl + ", nextCursor=" + this.nextCursor + ", billMonthTime=" + this.billMonthTime + ')';
    }

    public BillDetailData(Amount amountDue, Long l, Amount totalStatement, Amount amountRepayment, PeriodTimeInfo billPeriod, String billStatus, String billRepaymentStatus, Integer num, Amount laterAmount, List<LoanOrderInfo> list, boolean z, String orderDetailUrl, String installmentDetailsUrl, String nextCursor, long j) {
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalStatement, "totalStatement");
        o.LJIIIZ(amountRepayment, "amountRepayment");
        o.LJIIIZ(billPeriod, "billPeriod");
        o.LJIIIZ(billStatus, "billStatus");
        o.LJIIIZ(billRepaymentStatus, "billRepaymentStatus");
        o.LJIIIZ(laterAmount, "laterAmount");
        o.LJIIIZ(orderDetailUrl, "orderDetailUrl");
        o.LJIIIZ(installmentDetailsUrl, "installmentDetailsUrl");
        o.LJIIIZ(nextCursor, "nextCursor");
        this.amountDue = amountDue;
        this.dueDate = l;
        this.totalStatement = totalStatement;
        this.amountRepayment = amountRepayment;
        this.billPeriod = billPeriod;
        this.billStatus = billStatus;
        this.billRepaymentStatus = billRepaymentStatus;
        this.overdueDays = num;
        this.laterAmount = laterAmount;
        this.loanOrderInfoList = list;
        this.repaymentButtonShow = z;
        this.orderDetailUrl = orderDetailUrl;
        this.installmentDetailsUrl = installmentDetailsUrl;
        this.nextCursor = nextCursor;
        this.billMonthTime = j;
    }

    public /* synthetic */ BillDetailData(Amount amount, Long l, Amount amount2, Amount amount3, PeriodTimeInfo periodTimeInfo, String str, String str2, Integer num, Amount amount4, List list, boolean z, String str3, String str4, String str5, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(amount, (i & 2) != 0 ? null : l, amount2, amount3, periodTimeInfo, str, str2, (i & 128) == 0 ? num : null, amount4, list, z, str3, str4, str5, j);
    }
}
