package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C07670Rv;
import X.C78983UzD;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PackedSku {

    @InterfaceC65349Pkn("activity_info")
    public final PickTag activityInfo;

    @InterfaceC65349Pkn("aggregation_count")
    public final Integer aggregationCount;

    @InterfaceC65349Pkn("aggregation_key")
    public final String aggregationKey;

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("bundle_id")
    public final String bundleId;

    @InterfaceC65349Pkn("button")
    public final List<Button> button;

    @InterfaceC65349Pkn("cart_item_id")
    public final String cartItemId;

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("entrance_info")
    public final String entranceInfo;

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("low_stock_warning")
    public final String lowStockWarning;

    @InterfaceC65349Pkn("minimum_buy_quantity")
    public final Integer minBuyQuantity;

    @InterfaceC65349Pkn("packed_sku_sale_props")
    public final List<PackedSKUSaleProp> packedSKUSaleProps;

    @InterfaceC65349Pkn("price")
    public final SkuPrice price;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("product_name")
    public final String productName;

    @InterfaceC65349Pkn("product_platform_level1")
    public final Integer productPlatformLevel1;

    @InterfaceC65349Pkn("promotion_limit_quantity")
    public final Integer promotionLimitQuantity;

    @InterfaceC65349Pkn("promotion_logos")
    public final List<PromotionLogo> promotionLogos;

    @InterfaceC65349Pkn("promotion_view")
    public final PromotionView promotionView;

    @InterfaceC65349Pkn("purchase_limit")
    public final Integer purchaseLimit;

    @InterfaceC65349Pkn("purchase_notice")
    public final PurchaseNotice purchaseNotice;

    @InterfaceC65349Pkn("quantity_property")
    public final SkuQuantityProperty quantityProperty;

    @InterfaceC65349Pkn("sale_props_str")
    public final String salePropsStr;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("sku_amount")
    public final Integer skuAmount;

    @InterfaceC65349Pkn("sku_card_style")
    public final SkuCardStyleInfo skuCardStyleInfo;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("source_info")
    public final String sourceInfo;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("stock")
    public final Integer stock;

    @InterfaceC65349Pkn("unavailable_text")
    public final String unavailableText;

    @InterfaceC65349Pkn("user_right")
    public final UserRight userRight;

    public static /* synthetic */ PackedSku copy$default(PackedSku packedSku, String str, String str2, Integer num, String str3, Integer num2, String str4, List list, String str5, Integer num3, String str6, Integer num4, SkuPrice skuPrice, Image image, Integer num5, List list2, String str7, PickTag pickTag, List list3, String str8, String str9, String str10, PromotionView promotionView, Map map, PurchaseNotice purchaseNotice, SkuQuantityProperty skuQuantityProperty, UserRight userRight, Integer num6, Integer num7, String str11, String str12, String str13, Integer num8, Integer num9, SkuCardStyleInfo skuCardStyleInfo, String str14, int i, int i2, Object obj) {
        Integer num10 = num5;
        Image image2 = image;
        SkuPrice skuPrice2 = skuPrice;
        Integer num11 = num4;
        String str15 = str6;
        Integer num12 = num3;
        String str16 = str5;
        List list4 = list;
        String str17 = str2;
        String str18 = str;
        Integer num13 = num;
        String str19 = str3;
        Integer num14 = num2;
        String str20 = str4;
        Integer num15 = num9;
        Integer num16 = num8;
        String str21 = str9;
        String str22 = str8;
        List list5 = list3;
        PickTag pickTag2 = pickTag;
        List list6 = list2;
        String str23 = str7;
        String str24 = str10;
        PromotionView promotionView2 = promotionView;
        Map map2 = map;
        SkuCardStyleInfo skuCardStyleInfo2 = skuCardStyleInfo;
        String str25 = str13;
        PurchaseNotice purchaseNotice2 = purchaseNotice;
        String str26 = str14;
        SkuQuantityProperty skuQuantityProperty2 = skuQuantityProperty;
        UserRight userRight2 = userRight;
        Integer num17 = num6;
        Integer num18 = num7;
        String str27 = str11;
        String str28 = str12;
        if ((i & 1) != 0) {
            str18 = packedSku.productId;
        }
        if ((i & 2) != 0) {
            str17 = packedSku.skuId;
        }
        if ((i & 4) != 0) {
            num13 = packedSku.bizType;
        }
        if ((i & 8) != 0) {
            str19 = packedSku.cartItemId;
        }
        if ((i & 16) != 0) {
            num14 = packedSku.status;
        }
        if ((i & 32) != 0) {
            str20 = packedSku.productName;
        }
        if ((i & 64) != 0) {
            list4 = packedSku.packedSKUSaleProps;
        }
        if ((i & 128) != 0) {
            str16 = packedSku.salePropsStr;
        }
        if ((i & 256) != 0) {
            num12 = packedSku.stock;
        }
        if ((i & 512) != 0) {
            str15 = packedSku.lowStockWarning;
        }
        if ((i & 1024) != 0) {
            num11 = packedSku.purchaseLimit;
        }
        if ((i & 2048) != 0) {
            skuPrice2 = packedSku.price;
        }
        if ((i & 4096) != 0) {
            image2 = packedSku.image;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            num10 = packedSku.skuAmount;
        }
        if ((i & 16384) != 0) {
            list6 = packedSku.button;
        }
        if ((32768 & i) != 0) {
            str23 = packedSku.link;
        }
        if ((65536 & i) != 0) {
            pickTag2 = packedSku.activityInfo;
        }
        if ((131072 & i) != 0) {
            list5 = packedSku.promotionLogos;
        }
        if ((262144 & i) != 0) {
            str22 = packedSku.sourceInfo;
        }
        if ((524288 & i) != 0) {
            str21 = packedSku.entranceInfo;
        }
        if ((1048576 & i) != 0) {
            str24 = packedSku.chainKey;
        }
        if ((2097152 & i) != 0) {
            promotionView2 = packedSku.promotionView;
        }
        if ((4194304 & i) != 0) {
            map2 = packedSku.extra;
        }
        if ((8388608 & i) != 0) {
            purchaseNotice2 = packedSku.purchaseNotice;
        }
        if ((16777216 & i) != 0) {
            skuQuantityProperty2 = packedSku.quantityProperty;
        }
        if ((33554432 & i) != 0) {
            userRight2 = packedSku.userRight;
        }
        if ((67108864 & i) != 0) {
            num17 = packedSku.minBuyQuantity;
        }
        if ((134217728 & i) != 0) {
            num18 = packedSku.promotionLimitQuantity;
        }
        if ((268435456 & i) != 0) {
            str27 = packedSku.sellerId;
        }
        if ((536870912 & i) != 0) {
            str28 = packedSku.bundleId;
        }
        if ((1073741824 & i) != 0) {
            str25 = packedSku.aggregationKey;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            num16 = packedSku.aggregationCount;
        }
        if ((i2 & 1) != 0) {
            num15 = packedSku.productPlatformLevel1;
        }
        if ((i2 & 2) != 0) {
            skuCardStyleInfo2 = packedSku.skuCardStyleInfo;
        }
        if ((i2 & 4) != 0) {
            str26 = packedSku.unavailableText;
        }
        return packedSku.copy(str18, str17, num13, str19, num14, str20, list4, str16, num12, str15, num11, skuPrice2, image2, num10, list6, str23, pickTag2, list5, str22, str21, str24, promotionView2, map2, purchaseNotice2, skuQuantityProperty2, userRight2, num17, num18, str27, str28, str25, num16, num15, skuCardStyleInfo2, str26);
    }

    public final PackedSku copy(String str, String str2, Integer num, String str3, Integer num2, String str4, List<PackedSKUSaleProp> list, String str5, Integer num3, String str6, Integer num4, SkuPrice skuPrice, Image image, Integer num5, List<Button> list2, String str7, PickTag pickTag, List<PromotionLogo> list3, String str8, String str9, String str10, PromotionView promotionView, Map<String, String> map, PurchaseNotice purchaseNotice, SkuQuantityProperty skuQuantityProperty, UserRight userRight, Integer num6, Integer num7, String str11, String str12, String str13, Integer num8, Integer num9, SkuCardStyleInfo skuCardStyleInfo, String str14) {
        return new PackedSku(str, str2, num, str3, num2, str4, list, str5, num3, str6, num4, skuPrice, image, num5, list2, str7, pickTag, list3, str8, str9, str10, promotionView, map, purchaseNotice, skuQuantityProperty, userRight, num6, num7, str11, str12, str13, num8, num9, skuCardStyleInfo, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackedSku)) {
            return false;
        }
        PackedSku packedSku = (PackedSku) obj;
        return o.LJ(this.productId, packedSku.productId) && o.LJ(this.skuId, packedSku.skuId) && o.LJ(this.bizType, packedSku.bizType) && o.LJ(this.cartItemId, packedSku.cartItemId) && o.LJ(this.status, packedSku.status) && o.LJ(this.productName, packedSku.productName) && o.LJ(this.packedSKUSaleProps, packedSku.packedSKUSaleProps) && o.LJ(this.salePropsStr, packedSku.salePropsStr) && o.LJ(this.stock, packedSku.stock) && o.LJ(this.lowStockWarning, packedSku.lowStockWarning) && o.LJ(this.purchaseLimit, packedSku.purchaseLimit) && o.LJ(this.price, packedSku.price) && o.LJ(this.image, packedSku.image) && o.LJ(this.skuAmount, packedSku.skuAmount) && o.LJ(this.button, packedSku.button) && o.LJ(this.link, packedSku.link) && o.LJ(this.activityInfo, packedSku.activityInfo) && o.LJ(this.promotionLogos, packedSku.promotionLogos) && o.LJ(this.sourceInfo, packedSku.sourceInfo) && o.LJ(this.entranceInfo, packedSku.entranceInfo) && o.LJ(this.chainKey, packedSku.chainKey) && o.LJ(this.promotionView, packedSku.promotionView) && o.LJ(this.extra, packedSku.extra) && o.LJ(this.purchaseNotice, packedSku.purchaseNotice) && o.LJ(this.quantityProperty, packedSku.quantityProperty) && o.LJ(this.userRight, packedSku.userRight) && o.LJ(this.minBuyQuantity, packedSku.minBuyQuantity) && o.LJ(this.promotionLimitQuantity, packedSku.promotionLimitQuantity) && o.LJ(this.sellerId, packedSku.sellerId) && o.LJ(this.bundleId, packedSku.bundleId) && o.LJ(this.aggregationKey, packedSku.aggregationKey) && o.LJ(this.aggregationCount, packedSku.aggregationCount) && o.LJ(this.productPlatformLevel1, packedSku.productPlatformLevel1) && o.LJ(this.skuCardStyleInfo, packedSku.skuCardStyleInfo) && o.LJ(this.unavailableText, packedSku.unavailableText);
    }

    public int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.bizType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.cartItemId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.status;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.productName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<PackedSKUSaleProp> list = this.packedSKUSaleProps;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.salePropsStr;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.stock;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.lowStockWarning;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.purchaseLimit;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        SkuPrice skuPrice = this.price;
        int hashCode12 = (hashCode11 + (skuPrice == null ? 0 : skuPrice.hashCode())) * 31;
        Image image = this.image;
        int hashCode13 = (hashCode12 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num5 = this.skuAmount;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<Button> list2 = this.button;
        int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.link;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PickTag pickTag = this.activityInfo;
        int hashCode17 = (hashCode16 + (pickTag == null ? 0 : pickTag.hashCode())) * 31;
        List<PromotionLogo> list3 = this.promotionLogos;
        int hashCode18 = (hashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str8 = this.sourceInfo;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.entranceInfo;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.chainKey;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int hashCode22 = (hashCode21 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        Map<String, String> map = this.extra;
        int hashCode23 = (hashCode22 + (map == null ? 0 : map.hashCode())) * 31;
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        int hashCode24 = (hashCode23 + (purchaseNotice == null ? 0 : purchaseNotice.hashCode())) * 31;
        SkuQuantityProperty skuQuantityProperty = this.quantityProperty;
        int hashCode25 = (hashCode24 + (skuQuantityProperty == null ? 0 : skuQuantityProperty.hashCode())) * 31;
        UserRight userRight = this.userRight;
        int hashCode26 = (hashCode25 + (userRight == null ? 0 : userRight.hashCode())) * 31;
        Integer num6 = this.minBuyQuantity;
        int hashCode27 = (hashCode26 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.promotionLimitQuantity;
        int hashCode28 = (hashCode27 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str11 = this.sellerId;
        int hashCode29 = (hashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bundleId;
        int hashCode30 = (hashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.aggregationKey;
        int hashCode31 = (hashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num8 = this.aggregationCount;
        int hashCode32 = (hashCode31 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.productPlatformLevel1;
        int hashCode33 = (hashCode32 + (num9 == null ? 0 : num9.hashCode())) * 31;
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        int hashCode34 = (hashCode33 + (skuCardStyleInfo == null ? 0 : skuCardStyleInfo.hashCode())) * 31;
        String str14 = this.unavailableText;
        return hashCode34 + (str14 != null ? str14.hashCode() : 0);
    }

    public final boolean isGiftSku() {
        Integer num;
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        if (skuCardStyleInfo == null || (num = skuCardStyleInfo.skuCardStyleType) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PackedSku(productId=");
        sb.append(this.productId);
        sb.append(", skuId=");
        sb.append(this.skuId);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", cartItemId=");
        sb.append(this.cartItemId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", productName=");
        sb.append(this.productName);
        sb.append(", packedSKUSaleProps=");
        sb.append(this.packedSKUSaleProps);
        sb.append(", salePropsStr=");
        sb.append(this.salePropsStr);
        sb.append(", stock=");
        sb.append(this.stock);
        sb.append(", lowStockWarning=");
        sb.append(this.lowStockWarning);
        sb.append(", purchaseLimit=");
        sb.append(this.purchaseLimit);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", skuAmount=");
        sb.append(this.skuAmount);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", activityInfo=");
        sb.append(this.activityInfo);
        sb.append(", promotionLogos=");
        sb.append(this.promotionLogos);
        sb.append(", sourceInfo=");
        sb.append(this.sourceInfo);
        sb.append(", entranceInfo=");
        sb.append(this.entranceInfo);
        sb.append(", chainKey=");
        sb.append(this.chainKey);
        sb.append(", promotionView=");
        sb.append(this.promotionView);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", purchaseNotice=");
        sb.append(this.purchaseNotice);
        sb.append(", quantityProperty=");
        sb.append(this.quantityProperty);
        sb.append(", userRight=");
        sb.append(this.userRight);
        sb.append(", minBuyQuantity=");
        sb.append(this.minBuyQuantity);
        sb.append(", promotionLimitQuantity=");
        sb.append(this.promotionLimitQuantity);
        sb.append(", sellerId=");
        sb.append(this.sellerId);
        sb.append(", bundleId=");
        sb.append(this.bundleId);
        sb.append(", aggregationKey=");
        sb.append(this.aggregationKey);
        sb.append(", aggregationCount=");
        sb.append(this.aggregationCount);
        sb.append(", productPlatformLevel1=");
        sb.append(this.productPlatformLevel1);
        sb.append(", skuCardStyleInfo=");
        sb.append(this.skuCardStyleInfo);
        sb.append(", unavailableText=");
        return C07670Rv.LIZIZ(sb, this.unavailableText, ')');
    }

    public final PickTag getActivityInfo() {
        return this.activityInfo;
    }

    public final Integer getAggregationCount() {
        return this.aggregationCount;
    }

    public final String getAggregationKey() {
        return this.aggregationKey;
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final List<Button> getButton() {
        return this.button;
    }

    public final String getCartItemId() {
        return this.cartItemId;
    }

    public final String getChainKey() {
        return this.chainKey;
    }

    public final String getEntranceInfo() {
        return this.entranceInfo;
    }

    public final Map<String, String> getExtra() {
        return this.extra;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLowStockWarning() {
        return this.lowStockWarning;
    }

    public final Integer getMinBuyQuantity() {
        return this.minBuyQuantity;
    }

    public final List<PackedSKUSaleProp> getPackedSKUSaleProps() {
        return this.packedSKUSaleProps;
    }

    public final SkuPrice getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final Integer getProductPlatformLevel1() {
        return this.productPlatformLevel1;
    }

    public final Integer getPromotionLimitQuantity() {
        return this.promotionLimitQuantity;
    }

    public final List<PromotionLogo> getPromotionLogos() {
        return this.promotionLogos;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final Integer getPurchaseLimit() {
        return this.purchaseLimit;
    }

    public final PurchaseNotice getPurchaseNotice() {
        return this.purchaseNotice;
    }

    public final SkuQuantityProperty getQuantityProperty() {
        return this.quantityProperty;
    }

    public final String getSalePropsStr() {
        return this.salePropsStr;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final Integer getSkuAmount() {
        return this.skuAmount;
    }

    public final SkuCardStyleInfo getSkuCardStyleInfo() {
        return this.skuCardStyleInfo;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final String getSourceInfo() {
        return this.sourceInfo;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Integer getStock() {
        return this.stock;
    }

    public final String getUnavailableText() {
        return this.unavailableText;
    }

    public final UserRight getUserRight() {
        return this.userRight;
    }

    public final PackedSku merge(PackedSku packedSku) {
        if (packedSku == null) {
            return this;
        }
        String str = packedSku.productId;
        if (str == null) {
            str = this.productId;
        }
        String str2 = packedSku.skuId;
        if (str2 == null) {
            str2 = this.skuId;
        }
        Integer num = packedSku.bizType;
        if (num == null) {
            num = this.bizType;
        }
        Integer num2 = packedSku.status;
        if (num2 == null) {
            num2 = this.status;
        }
        String str3 = packedSku.productName;
        if (str3 == null) {
            str3 = this.productName;
        }
        List<PackedSKUSaleProp> list = packedSku.packedSKUSaleProps;
        if (list == null) {
            list = this.packedSKUSaleProps;
        }
        String str4 = packedSku.salePropsStr;
        if (str4 == null) {
            str4 = this.salePropsStr;
        }
        Integer num3 = packedSku.stock;
        if (num3 == null) {
            num3 = this.stock;
        }
        String str5 = packedSku.lowStockWarning;
        if (str5 == null) {
            str5 = this.lowStockWarning;
        }
        Integer num4 = packedSku.purchaseLimit;
        if (num4 == null) {
            num4 = this.purchaseLimit;
        }
        SkuPrice skuPrice = this.price;
        if (skuPrice != null) {
            SkuPrice skuPrice2 = packedSku.price;
            if (skuPrice2 != null) {
                String str6 = skuPrice2.originalPrice;
                if (str6 == null) {
                    str6 = skuPrice.originalPrice;
                }
                Price price = skuPrice2.realPrice;
                if (price == null) {
                    price = skuPrice.realPrice;
                }
                String str7 = skuPrice2.discount;
                if (str7 == null) {
                    str7 = skuPrice.discount;
                }
                String str8 = skuPrice2.originalPriceVal;
                if (str8 == null) {
                    str8 = skuPrice.originalPriceVal;
                }
                skuPrice = new SkuPrice(price, str6, str7, str8);
            }
        } else {
            skuPrice = packedSku.price;
        }
        Image image = packedSku.image;
        if (image == null) {
            image = this.image;
        }
        Integer num5 = packedSku.skuAmount;
        if (num5 == null) {
            num5 = this.skuAmount;
        }
        List<Button> list2 = packedSku.button;
        if (list2 == null) {
            list2 = this.button;
        }
        String str9 = packedSku.link;
        if (str9 == null) {
            str9 = this.link;
        }
        String str10 = packedSku.cartItemId;
        if (str10 == null) {
            str10 = this.cartItemId;
        }
        PickTag pickTag = packedSku.activityInfo;
        if (pickTag == null) {
            pickTag = this.activityInfo;
        }
        List<PromotionLogo> list3 = packedSku.promotionLogos;
        if (list3 == null) {
            list3 = this.promotionLogos;
        }
        String str11 = packedSku.chainKey;
        if (str11 == null) {
            str11 = this.chainKey;
        }
        String str12 = packedSku.sourceInfo;
        if (str12 == null) {
            str12 = this.sourceInfo;
        }
        String str13 = packedSku.entranceInfo;
        if (str13 == null) {
            str13 = this.entranceInfo;
        }
        PromotionView promotionView = packedSku.promotionView;
        if (promotionView == null) {
            promotionView = this.promotionView;
        }
        Map<String, String> map = packedSku.extra;
        if (map == null) {
            map = this.extra;
        }
        PurchaseNotice purchaseNotice = packedSku.purchaseNotice;
        if (purchaseNotice == null) {
            purchaseNotice = this.purchaseNotice;
        }
        SkuQuantityProperty skuQuantityProperty = packedSku.quantityProperty;
        if (skuQuantityProperty == null) {
            skuQuantityProperty = this.quantityProperty;
        }
        UserRight userRight = packedSku.userRight;
        if (userRight == null) {
            userRight = this.userRight;
        }
        Integer num6 = packedSku.minBuyQuantity;
        if (num6 == null) {
            num6 = this.minBuyQuantity;
        }
        Integer num7 = packedSku.promotionLimitQuantity;
        if (num7 == null) {
            num7 = this.promotionLimitQuantity;
        }
        String str14 = packedSku.sellerId;
        if (str14 == null) {
            str14 = this.sellerId;
        }
        String str15 = packedSku.bundleId;
        if (str15 == null) {
            str15 = this.bundleId;
        }
        String str16 = packedSku.aggregationKey;
        if (str16 == null) {
            str16 = this.aggregationKey;
        }
        Integer num8 = packedSku.aggregationCount;
        if (num8 == null) {
            num8 = this.aggregationCount;
        }
        Integer num9 = packedSku.productPlatformLevel1;
        if (num9 == null) {
            num9 = this.productPlatformLevel1;
        }
        SkuCardStyleInfo skuCardStyleInfo = packedSku.skuCardStyleInfo;
        if (skuCardStyleInfo == null) {
            skuCardStyleInfo = this.skuCardStyleInfo;
        }
        String str17 = packedSku.unavailableText;
        if (str17 == null) {
            str17 = this.unavailableText;
        }
        return new PackedSku(str, str2, num, str10, num2, str3, list, str4, num3, str5, num4, skuPrice, image, num5, list2, str9, pickTag, list3, str12, str13, str11, promotionView, map, purchaseNotice, skuQuantityProperty, userRight, num6, num7, str14, str15, str16, num8, num9, skuCardStyleInfo, str17);
    }

    public PackedSku(String str, String str2, Integer num, String str3, Integer num2, String str4, List<PackedSKUSaleProp> list, String str5, Integer num3, String str6, Integer num4, SkuPrice skuPrice, Image image, Integer num5, List<Button> list2, String str7, PickTag pickTag, List<PromotionLogo> list3, String str8, String str9, String str10, PromotionView promotionView, Map<String, String> map, PurchaseNotice purchaseNotice, SkuQuantityProperty skuQuantityProperty, UserRight userRight, Integer num6, Integer num7, String str11, String str12, String str13, Integer num8, Integer num9, SkuCardStyleInfo skuCardStyleInfo, String str14) {
        this.productId = str;
        this.skuId = str2;
        this.bizType = num;
        this.cartItemId = str3;
        this.status = num2;
        this.productName = str4;
        this.packedSKUSaleProps = list;
        this.salePropsStr = str5;
        this.stock = num3;
        this.lowStockWarning = str6;
        this.purchaseLimit = num4;
        this.price = skuPrice;
        this.image = image;
        this.skuAmount = num5;
        this.button = list2;
        this.link = str7;
        this.activityInfo = pickTag;
        this.promotionLogos = list3;
        this.sourceInfo = str8;
        this.entranceInfo = str9;
        this.chainKey = str10;
        this.promotionView = promotionView;
        this.extra = map;
        this.purchaseNotice = purchaseNotice;
        this.quantityProperty = skuQuantityProperty;
        this.userRight = userRight;
        this.minBuyQuantity = num6;
        this.promotionLimitQuantity = num7;
        this.sellerId = str11;
        this.bundleId = str12;
        this.aggregationKey = str13;
        this.aggregationCount = num8;
        this.productPlatformLevel1 = num9;
        this.skuCardStyleInfo = skuCardStyleInfo;
        this.unavailableText = str14;
        if (str8 == null || str8.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sourceInfo get null init, PackedSku: ");
            LIZ.append(this);
            C78983UzD.LJIIZILJ(new RuntimeException(X1D.LIZIZ(LIZ)));
        }
        if (str10 == null || str10.length() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("chainKey get null init, PackedSku: ");
            LIZ2.append(this);
            C78983UzD.LJIIZILJ(new RuntimeException(X1D.LIZIZ(LIZ2)));
        }
    }

    public /* synthetic */ PackedSku(String str, String str2, Integer num, String str3, Integer num2, String str4, List list, String str5, Integer num3, String str6, Integer num4, SkuPrice skuPrice, Image image, Integer num5, List list2, String str7, PickTag pickTag, List list3, String str8, String str9, String str10, PromotionView promotionView, Map map, PurchaseNotice purchaseNotice, SkuQuantityProperty skuQuantityProperty, UserRight userRight, Integer num6, Integer num7, String str11, String str12, String str13, Integer num8, Integer num9, SkuCardStyleInfo skuCardStyleInfo, String str14, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, num2, str4, list, str5, num3, str6, num4, skuPrice, image, num5, list2, str7, pickTag, list3, str8, str9, str10, promotionView, map, purchaseNotice, skuQuantityProperty, userRight, num6, num7, str11, (i & 536870912) != 0 ? null : str12, (i & 1073741824) != 0 ? null : str13, (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : num8, num9, (i2 & 2) == 0 ? skuCardStyleInfo : null, str14);
    }
}
