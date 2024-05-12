package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderShopRequestParam {

    @InterfaceC65349Pkn("order_sku")
    public final List<CreateOrderSku> createOrderSku;

    @InterfaceC65349Pkn("delivery_option")
    public final int deliveryOption;

    @InterfaceC65349Pkn("logistics_service_id")
    public final String logisticsServiceId;

    @InterfaceC65349Pkn("phone_credit")
    public final PhoneCredit phoneCredit;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("user_note")
    public final String userNote;

    @InterfaceC65349Pkn("warehouse_id")
    public final String warehouseId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderShopRequestParam)) {
            return false;
        }
        OrderShopRequestParam orderShopRequestParam = (OrderShopRequestParam) obj;
        return o.LJ(this.createOrderSku, orderShopRequestParam.createOrderSku) && o.LJ(this.sellerId, orderShopRequestParam.sellerId) && o.LJ(this.warehouseId, orderShopRequestParam.warehouseId) && this.deliveryOption == orderShopRequestParam.deliveryOption && o.LJ(this.logisticsServiceId, orderShopRequestParam.logisticsServiceId) && o.LJ(this.userNote, orderShopRequestParam.userNote) && o.LJ(this.phoneCredit, orderShopRequestParam.phoneCredit);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrderShopRequestParam(createOrderSku=");
        LIZ.append(this.createOrderSku);
        LIZ.append(", sellerId=");
        LIZ.append(this.sellerId);
        LIZ.append(", warehouseId=");
        LIZ.append(this.warehouseId);
        LIZ.append(", deliveryOption=");
        LIZ.append(this.deliveryOption);
        LIZ.append(", logisticsServiceId=");
        LIZ.append(this.logisticsServiceId);
        LIZ.append(", userNote=");
        LIZ.append(this.userNote);
        LIZ.append(", phoneCredit=");
        LIZ.append(this.phoneCredit);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        List<CreateOrderSku> list = this.createOrderSku;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int LJ = C79062V1e.LJ(this.logisticsServiceId, (C79062V1e.LJ(this.warehouseId, C79062V1e.LJ(this.sellerId, hashCode * 31, 31), 31) + this.deliveryOption) * 31, 31);
        String str = this.userNote;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        PhoneCredit phoneCredit = this.phoneCredit;
        if (phoneCredit != null) {
            i = phoneCredit.hashCode();
        }
        return i2 + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r7.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OrderShopRequestParam(java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku> r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, java.lang.String r12, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit r13) {
        /*
            r6 = this;
            java.lang.String r1 = "sellerId"
            java.lang.String r3 = "warehouseId"
            java.lang.String r5 = "logisticsServiceId"
            r2 = r9
            r4 = r11
            r0 = r8
            X.HH1.LIZ(r0, r1, r2, r3, r4, r5)
            r6.<init>()
            r6.createOrderSku = r7
            r6.sellerId = r0
            r6.warehouseId = r2
            r6.deliveryOption = r10
            r6.logisticsServiceId = r4
            r6.userNote = r12
            r6.phoneCredit = r13
            if (r7 == 0) goto L25
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L2f
        L25:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "orderSKUs is empty"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L35
            X.C78983UzD.LJIIZILJ(r1)     // Catch: java.lang.Throwable -> L35
        L2f:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L35
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L35
            goto L3d
        L35:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopRequestParam.<init>(java.util.List, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit):void");
    }
}
