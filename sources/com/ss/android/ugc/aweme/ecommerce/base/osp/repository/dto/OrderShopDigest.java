package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderShopDigest implements Serializable {

    @InterfaceC65349Pkn("delivery_option")
    public final Integer deliveryOption;

    @InterfaceC65349Pkn("order_sku")
    public final List<OrderSKUDTO> orderSKUs;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderShopDigest copy$default(OrderShopDigest orderShopDigest, String str, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderShopDigest.sellerId;
        }
        if ((i & 2) != 0) {
            list = orderShopDigest.orderSKUs;
        }
        if ((i & 4) != 0) {
            num = orderShopDigest.deliveryOption;
        }
        return orderShopDigest.copy(str, list, num);
    }

    public final OrderShopDigest copy(String str, List<OrderSKUDTO> list, Integer num) {
        return new OrderShopDigest(str, list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderShopDigest)) {
            return false;
        }
        OrderShopDigest orderShopDigest = (OrderShopDigest) obj;
        return o.LJ(this.sellerId, orderShopDigest.sellerId) && o.LJ(this.orderSKUs, orderShopDigest.orderSKUs) && o.LJ(this.deliveryOption, orderShopDigest.deliveryOption);
    }

    public int hashCode() {
        String str = this.sellerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OrderSKUDTO> list = this.orderSKUs;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.deliveryOption;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrderShopDigest(sellerId=");
        LIZ.append(this.sellerId);
        LIZ.append(", orderSKUs=");
        LIZ.append(this.orderSKUs);
        LIZ.append(", deliveryOption=");
        return s0.LIZJ(LIZ, this.deliveryOption, ')', LIZ);
    }

    public final Integer getDeliveryOption() {
        return this.deliveryOption;
    }

    public final List<OrderSKUDTO> getOrderSKUs() {
        return this.orderSKUs;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final OrderShopDigest merge(OrderShopDigest orderShopDigest) {
        if (orderShopDigest == null) {
            return this;
        }
        String str = orderShopDigest.sellerId;
        if (str == null) {
            str = this.sellerId;
        }
        List<OrderSKUDTO> list = orderShopDigest.orderSKUs;
        if (list == null) {
            list = this.orderSKUs;
        }
        Integer num = orderShopDigest.deliveryOption;
        if (num == null) {
            num = this.deliveryOption;
        }
        return new OrderShopDigest(str, list, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x000f, code lost:
    
        if (r4.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OrderShopDigest(java.lang.String r3, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO> r4, java.lang.Integer r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.sellerId = r3
            r2.orderSKUs = r4
            r2.deliveryOption = r5
            if (r4 == 0) goto L11
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1b
        L11:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "orderSKUs is empty"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L21
            X.C78983UzD.LJIIZILJ(r1)     // Catch: java.lang.Throwable -> L21
        L1b:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L21
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L21
            goto L29
        L21:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest.<init>(java.lang.String, java.util.List, java.lang.Integer):void");
    }
}
