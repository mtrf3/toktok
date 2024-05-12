package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AddItemToCartData {

    @InterfaceC65349Pkn("auto_claimed_vouchers")
    public final List<Voucher> autoVouchers;

    @InterfaceC65349Pkn("cart_entry")
    public final CartEntry cartEntry;

    @InterfaceC65349Pkn("cart_item_id")
    public final String cartItemId;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("post_sku_count")
    public final Integer postSkuCount;

    @InterfaceC65349Pkn("pre_sku_count")
    public final Integer preSkuCount;

    @InterfaceC65349Pkn("recommend_infos")
    public RecommendInfo recommendInfos;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddItemToCartData)) {
            return false;
        }
        AddItemToCartData addItemToCartData = (AddItemToCartData) obj;
        return o.LJ(this.cartItemId, addItemToCartData.cartItemId) && o.LJ(this.exceptionUX, addItemToCartData.exceptionUX) && o.LJ(this.cartEntry, addItemToCartData.cartEntry) && o.LJ(this.preSkuCount, addItemToCartData.preSkuCount) && o.LJ(this.postSkuCount, addItemToCartData.postSkuCount) && o.LJ(this.autoVouchers, addItemToCartData.autoVouchers) && o.LJ(this.recommendInfos, addItemToCartData.recommendInfos);
    }

    public final int hashCode() {
        String str = this.cartItemId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int hashCode2 = (hashCode + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        CartEntry cartEntry = this.cartEntry;
        int hashCode3 = (hashCode2 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        Integer num = this.preSkuCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.postSkuCount;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Voucher> list = this.autoVouchers;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        RecommendInfo recommendInfo = this.recommendInfos;
        return hashCode6 + (recommendInfo != null ? recommendInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddItemToCartData(cartItemId=");
        LIZ.append(this.cartItemId);
        LIZ.append(", exceptionUX=");
        LIZ.append(this.exceptionUX);
        LIZ.append(", cartEntry=");
        LIZ.append(this.cartEntry);
        LIZ.append(", preSkuCount=");
        LIZ.append(this.preSkuCount);
        LIZ.append(", postSkuCount=");
        LIZ.append(this.postSkuCount);
        LIZ.append(", autoVouchers=");
        LIZ.append(this.autoVouchers);
        LIZ.append(", recommendInfos=");
        LIZ.append(this.recommendInfos);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AddItemToCartData(String str, ExceptionUX exceptionUX, CartEntry cartEntry, Integer num, Integer num2, List<Voucher> list, RecommendInfo recommendInfo) {
        this.cartItemId = str;
        this.exceptionUX = exceptionUX;
        this.cartEntry = cartEntry;
        this.preSkuCount = num;
        this.postSkuCount = num2;
        this.autoVouchers = list;
        this.recommendInfos = recommendInfo;
    }
}
