package com.ss.android.ugc.aweme.ecommercelive.common.framework.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderSKUDTO {

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("entrance_info")
    public final String entranceInfo;

    @InterfaceC65349Pkn("kol_id")
    public final String kolId;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("quantity")
    public final Integer quantity;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("source")
    public final Integer source;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSKUDTO)) {
            return false;
        }
        OrderSKUDTO orderSKUDTO = (OrderSKUDTO) obj;
        return o.LJ(this.productId, orderSKUDTO.productId) && o.LJ(this.skuId, orderSKUDTO.skuId) && o.LJ(this.quantity, orderSKUDTO.quantity) && o.LJ(this.source, orderSKUDTO.source) && o.LJ(this.entranceInfo, orderSKUDTO.entranceInfo) && o.LJ(this.chainKey, orderSKUDTO.chainKey) && o.LJ(this.kolId, orderSKUDTO.kolId);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.source;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.entranceInfo;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.chainKey;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.kolId;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrderSKUDTO(productId=");
        LIZ.append(this.productId);
        LIZ.append(", skuId=");
        LIZ.append(this.skuId);
        LIZ.append(", quantity=");
        LIZ.append(this.quantity);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", entranceInfo=");
        LIZ.append(this.entranceInfo);
        LIZ.append(", chainKey=");
        LIZ.append(this.chainKey);
        LIZ.append(", kolId=");
        return q.LIZIZ(LIZ, this.kolId, ')', LIZ);
    }

    public OrderSKUDTO(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5) {
        this.productId = str;
        this.skuId = str2;
        this.quantity = num;
        this.source = num2;
        this.entranceInfo = str3;
        this.chainKey = str4;
        this.kolId = str5;
    }

    public /* synthetic */ OrderSKUDTO(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, num2, (i & 16) != 0 ? null : str3, str4, (i & 64) == 0 ? str5 : null);
    }
}
