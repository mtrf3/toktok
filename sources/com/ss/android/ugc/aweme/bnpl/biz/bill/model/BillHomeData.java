package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillHomeData {

    @InterfaceC65349Pkn("available_amount")
    public final Amount availableAmount;

    @InterfaceC65349Pkn("bill_id")
    public final String billId;

    @InterfaceC65349Pkn("customer_service_url")
    public final String customerServiceUrl;

    @InterfaceC65349Pkn("due_amount")
    public final Amount dueAmount;

    @InterfaceC65349Pkn("due_date")
    public final Long dueDate;

    @InterfaceC65349Pkn("limit_amount")
    public final Amount limitAmount;

    @InterfaceC65349Pkn("notice")
    public final Notice notice;

    @InterfaceC65349Pkn("overdue_days")
    public final Integer overdueDays;

    @InterfaceC65349Pkn("refund_record_url")
    public final String refundRecordUrl;

    @InterfaceC65349Pkn("repayment_point")
    public final RepaymentPoint repaymentPoint;

    @InterfaceC65349Pkn("repayment_record_url")
    public final String repaymentRecordUrl;

    @InterfaceC65349Pkn("setting_page_url")
    public final String settingPageUrl;

    @InterfaceC65349Pkn("user_bill_status")
    public final String userBillStatus;

    @InterfaceC65349Pkn("user_status")
    public final String userStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillHomeData)) {
            return false;
        }
        BillHomeData billHomeData = (BillHomeData) obj;
        return o.LJ(this.userStatus, billHomeData.userStatus) && o.LJ(this.userBillStatus, billHomeData.userBillStatus) && o.LJ(this.billId, billHomeData.billId) && o.LJ(this.dueDate, billHomeData.dueDate) && o.LJ(this.overdueDays, billHomeData.overdueDays) && o.LJ(this.dueAmount, billHomeData.dueAmount) && o.LJ(this.availableAmount, billHomeData.availableAmount) && o.LJ(this.limitAmount, billHomeData.limitAmount) && o.LJ(this.notice, billHomeData.notice) && o.LJ(this.settingPageUrl, billHomeData.settingPageUrl) && o.LJ(this.customerServiceUrl, billHomeData.customerServiceUrl) && o.LJ(this.repaymentRecordUrl, billHomeData.repaymentRecordUrl) && o.LJ(this.refundRecordUrl, billHomeData.refundRecordUrl) && o.LJ(this.repaymentPoint, billHomeData.repaymentPoint);
    }

    public final int hashCode() {
        int hashCode = ((this.userStatus.hashCode() * 31) + this.userBillStatus.hashCode()) * 31;
        String str = this.billId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.dueDate;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.overdueDays;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.dueAmount.hashCode()) * 31) + this.availableAmount.hashCode()) * 31) + this.limitAmount.hashCode()) * 31;
        Notice notice = this.notice;
        int hashCode5 = (((((((((hashCode4 + (notice == null ? 0 : notice.hashCode())) * 31) + this.settingPageUrl.hashCode()) * 31) + this.customerServiceUrl.hashCode()) * 31) + this.repaymentRecordUrl.hashCode()) * 31) + this.refundRecordUrl.hashCode()) * 31;
        RepaymentPoint repaymentPoint = this.repaymentPoint;
        return hashCode5 + (repaymentPoint != null ? repaymentPoint.hashCode() : 0);
    }

    public final String toString() {
        return "BillHomeData(userStatus=" + this.userStatus + ", userBillStatus=" + this.userBillStatus + ", billId=" + this.billId + ", dueDate=" + this.dueDate + ", overdueDays=" + this.overdueDays + ", dueAmount=" + this.dueAmount + ", availableAmount=" + this.availableAmount + ", limitAmount=" + this.limitAmount + ", notice=" + this.notice + ", settingPageUrl=" + this.settingPageUrl + ", customerServiceUrl=" + this.customerServiceUrl + ", repaymentRecordUrl=" + this.repaymentRecordUrl + ", refundRecordUrl=" + this.refundRecordUrl + ", repaymentPoint=" + this.repaymentPoint + ')';
    }

    public BillHomeData(String userStatus, String userBillStatus, String str, Long l, Integer num, Amount dueAmount, Amount availableAmount, Amount limitAmount, Notice notice, String settingPageUrl, String customerServiceUrl, String repaymentRecordUrl, String refundRecordUrl, RepaymentPoint repaymentPoint) {
        o.LJIIIZ(userStatus, "userStatus");
        o.LJIIIZ(userBillStatus, "userBillStatus");
        o.LJIIIZ(dueAmount, "dueAmount");
        o.LJIIIZ(availableAmount, "availableAmount");
        o.LJIIIZ(limitAmount, "limitAmount");
        o.LJIIIZ(settingPageUrl, "settingPageUrl");
        o.LJIIIZ(customerServiceUrl, "customerServiceUrl");
        o.LJIIIZ(repaymentRecordUrl, "repaymentRecordUrl");
        o.LJIIIZ(refundRecordUrl, "refundRecordUrl");
        this.userStatus = userStatus;
        this.userBillStatus = userBillStatus;
        this.billId = str;
        this.dueDate = l;
        this.overdueDays = num;
        this.dueAmount = dueAmount;
        this.availableAmount = availableAmount;
        this.limitAmount = limitAmount;
        this.notice = notice;
        this.settingPageUrl = settingPageUrl;
        this.customerServiceUrl = customerServiceUrl;
        this.repaymentRecordUrl = repaymentRecordUrl;
        this.refundRecordUrl = refundRecordUrl;
        this.repaymentPoint = repaymentPoint;
    }

    public /* synthetic */ BillHomeData(String str, String str2, String str3, Long l, Integer num, Amount amount, Amount amount2, Amount amount3, Notice notice, String str4, String str5, String str6, String str7, RepaymentPoint repaymentPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, l, num, amount, amount2, amount3, notice, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? "" : str6, (i & 4096) == 0 ? str7 : "", (i & FileUtils.BUFFER_SIZE) != 0 ? null : repaymentPoint);
    }
}
