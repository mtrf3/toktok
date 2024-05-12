package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class OrderInstallmentDetailsPageInfo extends F9E {

    @InterfaceC65349Pkn("loan_sub_order_id")
    public final String loanOrderId;

    @InterfaceC65349Pkn("sku_name")
    public final String resultStatus;

    @InterfaceC65349Pkn("statement_info_list")
    public final List<Object> statementInfoList;

    @InterfaceC65349Pkn("total_installment_amount")
    public final Amount totalInstallmentAmount;

    @InterfaceC65349Pkn("transaction_time")
    public final long transactionTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.loanOrderId, this.totalInstallmentAmount, Long.valueOf(this.transactionTime), this.resultStatus, this.statementInfoList};
    }

    public OrderInstallmentDetailsPageInfo(String loanOrderId, Amount totalInstallmentAmount, long j, String resultStatus, List<Object> statementInfoList) {
        o.LJIIIZ(loanOrderId, "loanOrderId");
        o.LJIIIZ(totalInstallmentAmount, "totalInstallmentAmount");
        o.LJIIIZ(resultStatus, "resultStatus");
        o.LJIIIZ(statementInfoList, "statementInfoList");
        this.loanOrderId = loanOrderId;
        this.totalInstallmentAmount = totalInstallmentAmount;
        this.transactionTime = j;
        this.resultStatus = resultStatus;
        this.statementInfoList = statementInfoList;
    }
}
