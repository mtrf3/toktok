package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RepaymentResultInfo {

    @InterfaceC65349Pkn("is_final_status")
    public final Boolean finalStatus;

    @InterfaceC65349Pkn("notice")
    public final Notice notice;

    @InterfaceC65349Pkn("result_message")
    public final String resultMessage;

    @InterfaceC65349Pkn("result_status")
    public final String resultStatus;

    @InterfaceC65349Pkn("result_title")
    public final String resultTitle;

    @InterfaceC65349Pkn("show_continue_repayment")
    public final boolean showContinueRepayment;

    @InterfaceC65349Pkn("show_customer_service")
    public final boolean showCustomerService;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepaymentResultInfo)) {
            return false;
        }
        RepaymentResultInfo repaymentResultInfo = (RepaymentResultInfo) obj;
        return o.LJ(this.resultStatus, repaymentResultInfo.resultStatus) && o.LJ(this.resultTitle, repaymentResultInfo.resultTitle) && o.LJ(this.resultMessage, repaymentResultInfo.resultMessage) && o.LJ(this.notice, repaymentResultInfo.notice) && o.LJ(this.finalStatus, repaymentResultInfo.finalStatus) && this.showContinueRepayment == repaymentResultInfo.showContinueRepayment && this.showCustomerService == repaymentResultInfo.showCustomerService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((((this.resultStatus.hashCode() * 31) + this.resultTitle.hashCode()) * 31) + this.resultMessage.hashCode()) * 31) + this.notice.hashCode()) * 31;
        Boolean bool = this.finalStatus;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.showContinueRepayment;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + (this.showCustomerService ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RepaymentResultInfo(resultStatus=");
        LIZ.append(this.resultStatus);
        LIZ.append(", resultTitle=");
        LIZ.append(this.resultTitle);
        LIZ.append(", resultMessage=");
        LIZ.append(this.resultMessage);
        LIZ.append(", notice=");
        LIZ.append(this.notice);
        LIZ.append(", finalStatus=");
        LIZ.append(this.finalStatus);
        LIZ.append(", showContinueRepayment=");
        LIZ.append(this.showContinueRepayment);
        LIZ.append(", showCustomerService=");
        LIZ.append(this.showCustomerService);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RepaymentResultInfo(String resultStatus, String resultTitle, String resultMessage, Notice notice, Boolean bool, boolean z, boolean z2) {
        o.LJIIIZ(resultStatus, "resultStatus");
        o.LJIIIZ(resultTitle, "resultTitle");
        o.LJIIIZ(resultMessage, "resultMessage");
        o.LJIIIZ(notice, "notice");
        this.resultStatus = resultStatus;
        this.resultTitle = resultTitle;
        this.resultMessage = resultMessage;
        this.notice = notice;
        this.finalStatus = bool;
        this.showContinueRepayment = z;
        this.showCustomerService = z2;
    }

    public /* synthetic */ RepaymentResultInfo(String str, String str2, String str3, Notice notice, Boolean bool, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, notice, (i & 16) != 0 ? null : bool, z, z2);
    }
}
