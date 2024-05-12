package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SkuReachable {

    @InterfaceC65349Pkn("order_sku")
    public final OrderSKUDTO orderSku;

    @InterfaceC65349Pkn("reachable")
    public final Boolean reachable;

    public static /* synthetic */ SkuReachable copy$default(SkuReachable skuReachable, OrderSKUDTO orderSKUDTO, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            orderSKUDTO = skuReachable.orderSku;
        }
        if ((i & 2) != 0) {
            bool = skuReachable.reachable;
        }
        return skuReachable.copy(orderSKUDTO, bool);
    }

    public final SkuReachable copy(OrderSKUDTO orderSKUDTO, Boolean bool) {
        return new SkuReachable(orderSKUDTO, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuReachable)) {
            return false;
        }
        SkuReachable skuReachable = (SkuReachable) obj;
        return o.LJ(this.orderSku, skuReachable.orderSku) && o.LJ(this.reachable, skuReachable.reachable);
    }

    public int hashCode() {
        OrderSKUDTO orderSKUDTO = this.orderSku;
        int hashCode = (orderSKUDTO == null ? 0 : orderSKUDTO.hashCode()) * 31;
        Boolean bool = this.reachable;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuReachable(orderSku=");
        LIZ.append(this.orderSku);
        LIZ.append(", reachable=");
        return C78920UyC.LIZIZ(LIZ, this.reachable, ')', LIZ);
    }

    public final OrderSKUDTO getOrderSku() {
        return this.orderSku;
    }

    public final Boolean getReachable() {
        return this.reachable;
    }

    public SkuReachable(OrderSKUDTO orderSKUDTO, Boolean bool) {
        this.orderSku = orderSKUDTO;
        this.reachable = bool;
    }
}
