package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class LoanOrderInfo {

    @InterfaceC65349Pkn("current_tenor")
    public final Integer currentTenor;

    @InterfaceC65349Pkn("loan_order_id")
    public final String loanOrderId;

    @InterfaceC65349Pkn("loan_sub_order_id")
    public final String loanSubOrderId;

    @InterfaceC65349Pkn("order_page_info")
    public final OrderPageInfo orderPageInfo;

    @InterfaceC65349Pkn("order_status")
    public final String orderStatus;

    @InterfaceC65349Pkn("order_type")
    public final String orderType;

    @InterfaceC65349Pkn("purchase_date")
    public final long purchaseDate;

    @InterfaceC65349Pkn("quote_amount")
    public final Amount quoteAmount;

    @InterfaceC65349Pkn("sku_name")
    public final String skuName;

    @InterfaceC65349Pkn("total_tenor")
    public final Integer totalTenor;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanOrderInfo)) {
            return false;
        }
        LoanOrderInfo loanOrderInfo = (LoanOrderInfo) obj;
        return o.LJ(this.loanOrderId, loanOrderInfo.loanOrderId) && o.LJ(this.loanSubOrderId, loanOrderInfo.loanSubOrderId) && o.LJ(this.skuName, loanOrderInfo.skuName) && o.LJ(this.orderStatus, loanOrderInfo.orderStatus) && o.LJ(this.orderType, loanOrderInfo.orderType) && o.LJ(this.totalTenor, loanOrderInfo.totalTenor) && o.LJ(this.currentTenor, loanOrderInfo.currentTenor) && o.LJ(this.quoteAmount, loanOrderInfo.quoteAmount) && this.purchaseDate == loanOrderInfo.purchaseDate && o.LJ(this.orderPageInfo, loanOrderInfo.orderPageInfo);
    }

    public final int hashCode() {
        String str = this.loanOrderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loanSubOrderId;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.skuName.hashCode()) * 31;
        String str3 = this.orderStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.totalTenor;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currentTenor;
        int hashCode6 = (((((hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.quoteAmount.hashCode()) * 31) + C16880lQ.LLJIJIL(this.purchaseDate)) * 31;
        OrderPageInfo orderPageInfo = this.orderPageInfo;
        return hashCode6 + (orderPageInfo != null ? orderPageInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoanOrderInfo(loanOrderId=");
        LIZ.append(this.loanOrderId);
        LIZ.append(", loanSubOrderId=");
        LIZ.append(this.loanSubOrderId);
        LIZ.append(", skuName=");
        LIZ.append(this.skuName);
        LIZ.append(", orderStatus=");
        LIZ.append(this.orderStatus);
        LIZ.append(", orderType=");
        LIZ.append(this.orderType);
        LIZ.append(", totalTenor=");
        LIZ.append(this.totalTenor);
        LIZ.append(", currentTenor=");
        LIZ.append(this.currentTenor);
        LIZ.append(", quoteAmount=");
        LIZ.append(this.quoteAmount);
        LIZ.append(", purchaseDate=");
        LIZ.append(this.purchaseDate);
        LIZ.append(", orderPageInfo=");
        LIZ.append(this.orderPageInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public LoanOrderInfo(String str, String str2, String skuName, String str3, String str4, Integer num, Integer num2, Amount quoteAmount, long j, OrderPageInfo orderPageInfo) {
        o.LJIIIZ(skuName, "skuName");
        o.LJIIIZ(quoteAmount, "quoteAmount");
        this.loanOrderId = str;
        this.loanSubOrderId = str2;
        this.skuName = skuName;
        this.orderStatus = str3;
        this.orderType = str4;
        this.totalTenor = num;
        this.currentTenor = num2;
        this.quoteAmount = quoteAmount;
        this.purchaseDate = j;
        this.orderPageInfo = orderPageInfo;
    }

    public /* synthetic */ LoanOrderInfo(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Amount amount, long j, OrderPageInfo orderPageInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) == 0 ? num2 : null, amount, j, orderPageInfo);
    }
}
