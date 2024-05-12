package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Price;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BundlePriceResponse {

    @InterfaceC65349Pkn("add_to_cart_button_text")
    public final String addToCartButtonText;

    @InterfaceC65349Pkn("bundle_price_text")
    public final String bundlePriceText;

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("module_da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("max_bundle_price")
    public final String maxBundlePrice;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("min_bundle_price")
    public final String minBundlePrice;

    @InterfaceC65349Pkn("product_price")
    public final Map<String, Price> productPrice;

    @InterfaceC65349Pkn("promotion_rich_text")
    public final LinkRichText promotion;

    /* JADX WARN: Multi-variable type inference failed */
    public BundlePriceResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundlePriceResponse)) {
            return false;
        }
        BundlePriceResponse bundlePriceResponse = (BundlePriceResponse) obj;
        return o.LJ(this.code, bundlePriceResponse.code) && o.LJ(this.message, bundlePriceResponse.message) && o.LJ(this.addToCartButtonText, bundlePriceResponse.addToCartButtonText) && o.LJ(this.promotion, bundlePriceResponse.promotion) && o.LJ(this.bundlePriceText, bundlePriceResponse.bundlePriceText) && o.LJ(this.productPrice, bundlePriceResponse.productPrice) && o.LJ(this.daInfo, bundlePriceResponse.daInfo) && o.LJ(this.minBundlePrice, bundlePriceResponse.minBundlePrice) && o.LJ(this.maxBundlePrice, bundlePriceResponse.maxBundlePrice);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addToCartButtonText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkRichText linkRichText = this.promotion;
        int hashCode4 = (hashCode3 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        String str3 = this.bundlePriceText;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, Price> map = this.productPrice;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.daInfo;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minBundlePrice;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maxBundlePrice;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundlePriceResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", addToCartButtonText=");
        LIZ.append(this.addToCartButtonText);
        LIZ.append(", promotion=");
        LIZ.append(this.promotion);
        LIZ.append(", bundlePriceText=");
        LIZ.append(this.bundlePriceText);
        LIZ.append(", productPrice=");
        LIZ.append(this.productPrice);
        LIZ.append(", daInfo=");
        LIZ.append(this.daInfo);
        LIZ.append(", minBundlePrice=");
        LIZ.append(this.minBundlePrice);
        LIZ.append(", maxBundlePrice=");
        return q.LIZIZ(LIZ, this.maxBundlePrice, ')', LIZ);
    }

    public BundlePriceResponse(Integer num, String str, String str2, LinkRichText linkRichText, String str3, Map<String, Price> map, String str4, String str5, String str6) {
        this.code = num;
        this.message = str;
        this.addToCartButtonText = str2;
        this.promotion = linkRichText;
        this.bundlePriceText = str3;
        this.productPrice = map;
        this.daInfo = str4;
        this.minBundlePrice = str5;
        this.maxBundlePrice = str6;
    }

    public /* synthetic */ BundlePriceResponse(Integer num, String str, String str2, LinkRichText linkRichText, String str3, Map map, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : linkRichText, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null);
    }
}
