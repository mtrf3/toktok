package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AddItemResult {

    @InterfaceC65349Pkn("cart_item_id")
    public final String cartItemId;

    @InterfaceC65349Pkn("post_sku_count")
    public final Integer postSkuCount;

    @InterfaceC65349Pkn("pre_sku_count")
    public final Integer preSkuCount;

    @InterfaceC65349Pkn("add_result_status")
    public final Integer result;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddItemResult)) {
            return false;
        }
        AddItemResult addItemResult = (AddItemResult) obj;
        return o.LJ(this.cartItemId, addItemResult.cartItemId) && o.LJ(this.skuId, addItemResult.skuId) && o.LJ(this.preSkuCount, addItemResult.preSkuCount) && o.LJ(this.postSkuCount, addItemResult.postSkuCount) && o.LJ(this.result, addItemResult.result);
    }

    public final int hashCode() {
        String str = this.cartItemId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.preSkuCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.postSkuCount;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.result;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddItemResult(cartItemId=");
        LIZ.append(this.cartItemId);
        LIZ.append(", skuId=");
        LIZ.append(this.skuId);
        LIZ.append(", preSkuCount=");
        LIZ.append(this.preSkuCount);
        LIZ.append(", postSkuCount=");
        LIZ.append(this.postSkuCount);
        LIZ.append(", result=");
        return s0.LIZJ(LIZ, this.result, ')', LIZ);
    }

    public AddItemResult(String str, String str2, Integer num, Integer num2, Integer num3) {
        this.cartItemId = str;
        this.skuId = str2;
        this.preSkuCount = num;
        this.postSkuCount = num2;
        this.result = num3;
    }
}
