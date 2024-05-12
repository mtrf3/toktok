package com.ss.android.ugc.aweme.ecommercelive.common.framework.utils;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderShopDigest {

    @InterfaceC65349Pkn("order_sku")
    public final List<OrderSKUDTO> orderSKUs;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderShopDigest)) {
            return false;
        }
        OrderShopDigest orderShopDigest = (OrderShopDigest) obj;
        return o.LJ(this.sellerId, orderShopDigest.sellerId) && o.LJ(this.orderSKUs, orderShopDigest.orderSKUs);
    }

    public final int hashCode() {
        String str = this.sellerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OrderSKUDTO> list = this.orderSKUs;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrderShopDigest(sellerId=");
        LIZ.append(this.sellerId);
        LIZ.append(", orderSKUs=");
        return C1NE.LIZIZ(LIZ, this.orderSKUs, ')', LIZ);
    }

    public OrderShopDigest(String str, List<OrderSKUDTO> list) {
        this.sellerId = str;
        this.orderSKUs = list;
    }
}
