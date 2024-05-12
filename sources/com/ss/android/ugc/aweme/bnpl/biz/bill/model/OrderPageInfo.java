package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class OrderPageInfo {

    @InterfaceC65349Pkn("order_details_page_info")
    public final OrderDetailsPageInfo orderDetailsPageInfo;

    @InterfaceC65349Pkn("order_installment_details_page_info")
    public final OrderInstallmentDetailsPageInfo orderInstallmentDetailsPageInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderPageInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPageInfo)) {
            return false;
        }
        OrderPageInfo orderPageInfo = (OrderPageInfo) obj;
        return o.LJ(this.orderDetailsPageInfo, orderPageInfo.orderDetailsPageInfo) && o.LJ(this.orderInstallmentDetailsPageInfo, orderPageInfo.orderInstallmentDetailsPageInfo);
    }

    public final int hashCode() {
        OrderDetailsPageInfo orderDetailsPageInfo = this.orderDetailsPageInfo;
        int hashCode = (orderDetailsPageInfo == null ? 0 : orderDetailsPageInfo.hashCode()) * 31;
        OrderInstallmentDetailsPageInfo orderInstallmentDetailsPageInfo = this.orderInstallmentDetailsPageInfo;
        return hashCode + (orderInstallmentDetailsPageInfo != null ? orderInstallmentDetailsPageInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrderPageInfo(orderDetailsPageInfo=");
        LIZ.append(this.orderDetailsPageInfo);
        LIZ.append(", orderInstallmentDetailsPageInfo=");
        LIZ.append(this.orderInstallmentDetailsPageInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public OrderPageInfo(OrderDetailsPageInfo orderDetailsPageInfo, OrderInstallmentDetailsPageInfo orderInstallmentDetailsPageInfo) {
        this.orderDetailsPageInfo = orderDetailsPageInfo;
        this.orderInstallmentDetailsPageInfo = orderInstallmentDetailsPageInfo;
    }

    public /* synthetic */ OrderPageInfo(OrderDetailsPageInfo orderDetailsPageInfo, OrderInstallmentDetailsPageInfo orderInstallmentDetailsPageInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderDetailsPageInfo, (i & 2) != 0 ? null : orderInstallmentDetailsPageInfo);
    }
}
