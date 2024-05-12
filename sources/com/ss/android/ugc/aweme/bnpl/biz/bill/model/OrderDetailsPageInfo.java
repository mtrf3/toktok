package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class OrderDetailsPageInfo extends F9E {

    @InterfaceC65349Pkn("installment_tenor")
    public final int installmentTenor;

    @InterfaceC65349Pkn("loan_agreement")
    public final String loanAgreement;

    @InterfaceC65349Pkn("loan_sub_order_id")
    public final String loanSubOrderId;

    @InterfaceC65349Pkn("order_no")
    public final String orderNo;

    @InterfaceC65349Pkn("order_status")
    public final String orderStatus;

    @InterfaceC65349Pkn("order_type")
    public final String orderType;

    @InterfaceC65349Pkn("product_amount")
    public final Amount productAmount;

    @InterfaceC65349Pkn("sku_name")
    public final String skuName;

    @InterfaceC65349Pkn("transaction_time")
    public final long transactionTime;

    @InterfaceC65349Pkn("shop_name")
    public final String userStatus;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.userStatus, this.skuName, this.productAmount, Integer.valueOf(this.installmentTenor), this.loanSubOrderId, this.orderStatus, this.orderType, Long.valueOf(this.transactionTime), this.orderNo, this.loanAgreement};
    }

    public OrderDetailsPageInfo(String userStatus, String skuName, Amount productAmount, int i, String loanSubOrderId, String orderStatus, String orderType, long j, String orderNo, String loanAgreement) {
        o.LJIIIZ(userStatus, "userStatus");
        o.LJIIIZ(skuName, "skuName");
        o.LJIIIZ(productAmount, "productAmount");
        o.LJIIIZ(loanSubOrderId, "loanSubOrderId");
        o.LJIIIZ(orderStatus, "orderStatus");
        o.LJIIIZ(orderType, "orderType");
        o.LJIIIZ(orderNo, "orderNo");
        o.LJIIIZ(loanAgreement, "loanAgreement");
        this.userStatus = userStatus;
        this.skuName = skuName;
        this.productAmount = productAmount;
        this.installmentTenor = i;
        this.loanSubOrderId = loanSubOrderId;
        this.orderStatus = orderStatus;
        this.orderType = orderType;
        this.transactionTime = j;
        this.orderNo = orderNo;
        this.loanAgreement = loanAgreement;
    }
}
