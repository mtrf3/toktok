package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.UC7;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreateOrderSku {

    @InterfaceC65349Pkn("aggregation_count")
    public final Integer aggregationCount;

    @InterfaceC65349Pkn("aggregation_key")
    public final String aggregationKey;

    @InterfaceC65349Pkn("bundle_id")
    public final String bundleId;

    @InterfaceC65349Pkn("cart_item_id")
    public final String cartItemId;

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("entrance_info")
    public final String entranceInfo;

    @InterfaceC65349Pkn("kol_id")
    public String kolId;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("product_platform_level1")
    public final Integer productPlatformLevel1;

    @InterfaceC65349Pkn("quantity")
    public final int quantity;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("sku_price")
    public final SkuPrice skuPrice;

    @InterfaceC65349Pkn("source")
    public final Integer source;

    @InterfaceC65349Pkn("source_info")
    public final String sourceInfo;

    @InterfaceC65349Pkn("user_right")
    public final UserRight userRight;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderSku)) {
            return false;
        }
        CreateOrderSku createOrderSku = (CreateOrderSku) obj;
        return o.LJ(this.productId, createOrderSku.productId) && o.LJ(this.skuId, createOrderSku.skuId) && this.quantity == createOrderSku.quantity && o.LJ(this.skuPrice, createOrderSku.skuPrice) && o.LJ(this.chainKey, createOrderSku.chainKey) && o.LJ(this.entranceInfo, createOrderSku.entranceInfo) && o.LJ(this.cartItemId, createOrderSku.cartItemId) && o.LJ(this.source, createOrderSku.source) && o.LJ(this.userRight, createOrderSku.userRight) && o.LJ(this.sourceInfo, createOrderSku.sourceInfo) && o.LJ(this.kolId, createOrderSku.kolId) && o.LJ(this.bundleId, createOrderSku.bundleId) && o.LJ(this.aggregationKey, createOrderSku.aggregationKey) && o.LJ(this.aggregationCount, createOrderSku.aggregationCount) && o.LJ(this.productPlatformLevel1, createOrderSku.productPlatformLevel1);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11 = (this.skuPrice.hashCode() + ((C79062V1e.LJ(this.skuId, this.productId.hashCode() * 31, 31) + this.quantity) * 31)) * 31;
        String str = this.chainKey;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode11 + hashCode) * 31;
        String str2 = this.entranceInfo;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.cartItemId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num = this.source;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        UserRight userRight = this.userRight;
        if (userRight == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = userRight.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str4 = this.sourceInfo;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str5 = this.kolId;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str6 = this.bundleId;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str7 = this.aggregationKey;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Integer num2 = this.aggregationCount;
        if (num2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num2.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Integer num3 = this.productPlatformLevel1;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateOrderSku(productId=");
        sb.append(this.productId);
        sb.append(", skuId=");
        sb.append(this.skuId);
        sb.append(", quantity=");
        sb.append(this.quantity);
        sb.append(", skuPrice=");
        sb.append(this.skuPrice);
        sb.append(", chainKey=");
        sb.append(this.chainKey);
        sb.append(", entranceInfo=");
        sb.append(this.entranceInfo);
        sb.append(", cartItemId=");
        sb.append(this.cartItemId);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", userRight=");
        sb.append(this.userRight);
        sb.append(", sourceInfo=");
        sb.append(this.sourceInfo);
        sb.append(", kolId=");
        sb.append(this.kolId);
        sb.append(", bundleId=");
        sb.append(this.bundleId);
        sb.append(", aggregationKey=");
        sb.append(this.aggregationKey);
        sb.append(", aggregationCount=");
        sb.append(this.aggregationCount);
        sb.append(", productPlatformLevel1=");
        return UC7.LIZ(sb, this.productPlatformLevel1, ')');
    }

    public static CreateOrderSku LIZ(CreateOrderSku createOrderSku, String str) {
        String productId = createOrderSku.productId;
        String skuId = createOrderSku.skuId;
        int i = createOrderSku.quantity;
        SkuPrice skuPrice = createOrderSku.skuPrice;
        String str2 = createOrderSku.chainKey;
        String str3 = createOrderSku.cartItemId;
        Integer num = createOrderSku.source;
        UserRight userRight = createOrderSku.userRight;
        String str4 = createOrderSku.sourceInfo;
        String str5 = createOrderSku.kolId;
        String str6 = createOrderSku.bundleId;
        String str7 = createOrderSku.aggregationKey;
        Integer num2 = createOrderSku.aggregationCount;
        Integer num3 = createOrderSku.productPlatformLevel1;
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(skuId, "skuId");
        o.LJIIIZ(skuPrice, "skuPrice");
        return new CreateOrderSku(productId, skuId, i, skuPrice, str2, str, str3, num, userRight, str4, str5, str6, str7, num2, num3);
    }

    public CreateOrderSku(String productId, String skuId, int i, SkuPrice skuPrice, String str, String str2, String str3, Integer num, UserRight userRight, String str4, String str5, String str6, String str7, Integer num2, Integer num3) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(skuId, "skuId");
        o.LJIIIZ(skuPrice, "skuPrice");
        this.productId = productId;
        this.skuId = skuId;
        this.quantity = i;
        this.skuPrice = skuPrice;
        this.chainKey = str;
        this.entranceInfo = str2;
        this.cartItemId = str3;
        this.source = num;
        this.userRight = userRight;
        this.sourceInfo = str4;
        this.kolId = str5;
        this.bundleId = str6;
        this.aggregationKey = str7;
        this.aggregationCount = num2;
        this.productPlatformLevel1 = num3;
    }

    public /* synthetic */ CreateOrderSku(String str, String str2, int i, SkuPrice skuPrice, String str3, String str4, String str5, Integer num, UserRight userRight, String str6, String str7, String str8, String str9, Integer num2, Integer num3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, skuPrice, str3, str4, str5, num, (i2 & 256) != 0 ? null : userRight, str6, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : str8, (i2 & 4096) != 0 ? null : str9, (i2 & FileUtils.BUFFER_SIZE) == 0 ? num2 : null, num3);
    }
}
