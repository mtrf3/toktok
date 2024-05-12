package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderSubmitRequestParam {

    @InterfaceC65349Pkn("one_step_order_type")
    public final Integer oneStepOrderType;

    @InterfaceC65349Pkn("order_shop")
    public final List<OrderShopDigest> orderShopDigest;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitRequestParam)) {
            return false;
        }
        OrderSubmitRequestParam orderSubmitRequestParam = (OrderSubmitRequestParam) obj;
        return o.LJ(this.orderShopDigest, orderSubmitRequestParam.orderShopDigest) && o.LJ(this.oneStepOrderType, orderSubmitRequestParam.oneStepOrderType);
    }

    public final int hashCode() {
        List<OrderShopDigest> list = this.orderShopDigest;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.oneStepOrderType;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrderSubmitRequestParam(orderShopDigest=");
        LIZ.append(this.orderShopDigest);
        LIZ.append(", oneStepOrderType=");
        return s0.LIZJ(LIZ, this.oneStepOrderType, ')', LIZ);
    }

    public OrderSubmitRequestParam(List<OrderShopDigest> list, Integer num) {
        this.orderShopDigest = list;
        this.oneStepOrderType = num;
    }

    public /* synthetic */ OrderSubmitRequestParam(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, num);
    }
}
