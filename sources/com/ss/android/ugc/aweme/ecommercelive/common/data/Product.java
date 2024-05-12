package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.C07670Rv;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Product {
    public final boolean LIZ;

    @InterfaceC65349Pkn("activity_info")
    public final Object activityInfo;

    @InterfaceC65349Pkn("add_to_cart_button")
    public final AddToCartButton addToCartButton;

    @InterfaceC65349Pkn("addition_id")
    public final String additionId;

    @InterfaceC65349Pkn("assistant_modules")
    public final List<Object> assistantModules;

    @InterfaceC65349Pkn("assistant_switch")
    public final Boolean assistantSwitch;

    @InterfaceC65349Pkn("available_price_decimal")
    public final String availablePriceDecimalNum;

    @InterfaceC65349Pkn("available_price_num")
    public final String availablePriceIntegerNum;

    @InterfaceC65349Pkn("bag_index")
    public final int bagIndex;

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("category")
    public final List<Object> category;

    @InterfaceC65349Pkn("celling_price")
    public final String cellingPrice;

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("cover")
    public final ECImage cover;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("detail_url")
    public final String detailUrl;

    @InterfaceC65349Pkn("discount")
    public final String discount;

    @InterfaceC65349Pkn("display_available_price")
    public final String displayAvailablePrice;

    @InterfaceC65349Pkn("display_currency")
    public final String displayCurrency;

    @InterfaceC65349Pkn("display_origin_price")
    public final String displayOriginPrice;

    @InterfaceC65349Pkn("elastic_img")
    public final List<ECImage> elasticImg;

    @InterfaceC65349Pkn("elastic_title")
    public final String elasticTitle;

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("flash_sale_info")
    public final FlashSaleDTO flashSaleInfo;

    @InterfaceC65349Pkn("floor_price")
    public final String floorPrice;

    @InterfaceC65349Pkn("format_available_price")
    public final String formatAvailablePrice;

    @InterfaceC65349Pkn("format_market_price")
    public final String formatMarketPrice;

    @InterfaceC65349Pkn("format_origin_price")
    public final String formatOriginPrice;

    @InterfaceC65349Pkn("format_price")
    public final String formatPrice;

    @InterfaceC65349Pkn("img")
    public final List<ECImage> img;

    @InterfaceC65349Pkn("market_price")
    public final Long marketPrice;

    @InterfaceC65349Pkn("order_request_params")
    public final String orderRequestParams;

    @InterfaceC65349Pkn("platform")
    public final int platform;

    @InterfaceC65349Pkn("price")
    public final Long price;

    @InterfaceC65349Pkn("price_prefix")
    public final String pricePrefix;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("product_rating")
    public final String productRating;

    @InterfaceC65349Pkn("product_status")
    public final int productStatus;

    @InterfaceC65349Pkn("product_unavailable_text")
    public final String productUnavailableText;

    @InterfaceC65349Pkn("prom_logos_index")
    public final List<Integer> promLogosIndex;

    @InterfaceC65349Pkn("promotion_logos")
    public final List<PromotionLogo> promotionLogos;

    @InterfaceC65349Pkn("promotion_view")
    public final PromotionView promotionView;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("selling_view")
    public final SellingView sellingView;

    @InterfaceC65349Pkn("shipping_from")
    public final Integer shippingFrom;

    @InterfaceC65349Pkn("skc_info")
    public final List<Object> skcInfo;

    @InterfaceC65349Pkn("sku_ids")
    public final List<String> skuIds;

    @InterfaceC65349Pkn("sold_count")
    public final String soldCount;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("source_from")
    public final int source_from;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("visit_report_params")
    public final String visitReportParams;

    @InterfaceC65349Pkn("voucher_list")
    public final List<Object> voucherList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return o.LJ(this.productId, product.productId) && o.LJ(this.title, product.title) && o.LJ(this.cover, product.cover) && o.LJ(this.img, product.img) && o.LJ(this.price, product.price) && o.LJ(this.marketPrice, product.marketPrice) && o.LJ(this.currency, product.currency) && o.LJ(this.pricePrefix, product.pricePrefix) && o.LJ(this.detailUrl, product.detailUrl) && this.productStatus == product.productStatus && o.LJ(this.additionId, product.additionId) && o.LJ(this.elasticTitle, product.elasticTitle) && o.LJ(this.elasticImg, product.elasticImg) && this.platform == product.platform && o.LJ(this.formatPrice, product.formatPrice) && o.LJ(this.formatMarketPrice, product.formatMarketPrice) && o.LJ(this.source, product.source) && o.LJ(this.schema, product.schema) && o.LJ(this.cellingPrice, product.cellingPrice) && o.LJ(this.floorPrice, product.floorPrice) && this.source_from == product.source_from && o.LJ(this.formatOriginPrice, product.formatOriginPrice) && o.LJ(this.formatAvailablePrice, product.formatAvailablePrice) && o.LJ(this.availablePriceIntegerNum, product.availablePriceIntegerNum) && o.LJ(this.availablePriceDecimalNum, product.availablePriceDecimalNum) && this.LIZ == product.LIZ && o.LJ(this.flashSaleInfo, product.flashSaleInfo) && o.LJ(this.promotionLogos, product.promotionLogos) && o.LJ(this.promotionView, product.promotionView) && o.LJ(this.extra, product.extra) && o.LJ(this.soldCount, product.soldCount) && o.LJ(this.productRating, product.productRating) && o.LJ(this.sellingView, product.sellingView) && o.LJ(this.skuIds, product.skuIds) && o.LJ(this.visitReportParams, product.visitReportParams) && o.LJ(this.chainKey, product.chainKey) && o.LJ(this.sellerId, product.sellerId) && o.LJ(this.assistantSwitch, product.assistantSwitch) && o.LJ(this.assistantModules, product.assistantModules) && this.bagIndex == product.bagIndex && o.LJ(this.addToCartButton, product.addToCartButton) && o.LJ(this.activityInfo, product.activityInfo) && o.LJ(this.voucherList, product.voucherList) && o.LJ(this.orderRequestParams, product.orderRequestParams) && o.LJ(this.shippingFrom, product.shippingFrom) && o.LJ(this.category, product.category) && o.LJ(this.productUnavailableText, product.productUnavailableText) && o.LJ(this.promLogosIndex, product.promLogosIndex) && o.LJ(this.displayOriginPrice, product.displayOriginPrice) && o.LJ(this.displayAvailablePrice, product.displayAvailablePrice) && o.LJ(this.displayCurrency, product.displayCurrency) && o.LJ(this.bizType, product.bizType) && o.LJ(this.skcInfo, product.skcInfo) && o.LJ(this.daInfo, product.daInfo) && o.LJ(this.discount, product.discount);
    }

    public final String LIZ() {
        String str;
        if (this.elasticImg != null && (!r0.isEmpty())) {
            return ((ECImage) ListProtector.get(this.elasticImg, 0)).url;
        }
        ECImage eCImage = this.cover;
        if (eCImage != null && (str = eCImage.url) != null) {
            return str;
        }
        return "";
    }

    public final String LIZIZ() {
        String str;
        if (this.elasticImg != null && (!r0.isEmpty())) {
            str = ((ECImage) ListProtector.get(this.elasticImg, 0)).urlKey;
            if (str == null) {
                return "";
            }
        } else {
            ECImage eCImage = this.cover;
            if (eCImage == null || (str = eCImage.urlKey) == null) {
                return "";
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int LJ = C79062V1e.LJ(this.title, this.productId.hashCode() * 31, 31);
        ECImage eCImage = this.cover;
        int i = 0;
        if (eCImage == null) {
            hashCode = 0;
        } else {
            hashCode = eCImage.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        List<ECImage> list = this.img;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l = this.price;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l2 = this.marketPrice;
        if (l2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l2.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.elasticTitle, C79062V1e.LJ(this.additionId, (C79062V1e.LJ(this.detailUrl, C79062V1e.LJ(this.pricePrefix, C79062V1e.LJ(this.currency, (i4 + hashCode4) * 31, 31), 31), 31) + this.productStatus) * 31, 31), 31);
        List<ECImage> list2 = this.elasticImg;
        if (list2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list2.hashCode();
        }
        int LJ3 = C79062V1e.LJ(this.schema, C79062V1e.LJ(this.source, C79062V1e.LJ(this.formatMarketPrice, C79062V1e.LJ(this.formatPrice, (((LJ2 + hashCode5) * 31) + this.platform) * 31, 31), 31), 31), 31);
        String str = this.cellingPrice;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i5 = (LJ3 + hashCode6) * 31;
        String str2 = this.floorPrice;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int LJ4 = C79062V1e.LJ(this.formatAvailablePrice, C79062V1e.LJ(this.formatOriginPrice, (((i5 + hashCode7) * 31) + this.source_from) * 31, 31), 31);
        String str3 = this.availablePriceIntegerNum;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int i6 = (LJ4 + hashCode8) * 31;
        String str4 = this.availablePriceDecimalNum;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i7 = (i6 + hashCode9) * 31;
        boolean z = this.LIZ;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        FlashSaleDTO flashSaleDTO = this.flashSaleInfo;
        if (flashSaleDTO == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = flashSaleDTO.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        List<PromotionLogo> list3 = this.promotionLogos;
        if (list3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list3.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        PromotionView promotionView = this.promotionView;
        if (promotionView == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = promotionView.hashCode();
        }
        int i12 = (i11 + hashCode12) * 31;
        Map<String, String> map = this.extra;
        if (map == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = map.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        String str5 = this.soldCount;
        if (str5 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str5.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        String str6 = this.productRating;
        if (str6 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str6.hashCode();
        }
        int i15 = (i14 + hashCode15) * 31;
        SellingView sellingView = this.sellingView;
        if (sellingView == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = sellingView.hashCode();
        }
        int i16 = (i15 + hashCode16) * 31;
        List<String> list4 = this.skuIds;
        if (list4 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = list4.hashCode();
        }
        int i17 = (i16 + hashCode17) * 31;
        String str7 = this.visitReportParams;
        if (str7 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str7.hashCode();
        }
        int i18 = (i17 + hashCode18) * 31;
        String str8 = this.chainKey;
        if (str8 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str8.hashCode();
        }
        int i19 = (i18 + hashCode19) * 31;
        String str9 = this.sellerId;
        if (str9 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str9.hashCode();
        }
        int i20 = (i19 + hashCode20) * 31;
        Boolean bool = this.assistantSwitch;
        if (bool == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = bool.hashCode();
        }
        int i21 = (i20 + hashCode21) * 31;
        List<Object> list5 = this.assistantModules;
        if (list5 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = list5.hashCode();
        }
        int i22 = (((i21 + hashCode22) * 31) + this.bagIndex) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        if (addToCartButton == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = addToCartButton.hashCode();
        }
        int i23 = (i22 + hashCode23) * 31;
        Object obj = this.activityInfo;
        if (obj == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = obj.hashCode();
        }
        int i24 = (i23 + hashCode24) * 31;
        List<Object> list6 = this.voucherList;
        if (list6 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = list6.hashCode();
        }
        int i25 = (i24 + hashCode25) * 31;
        String str10 = this.orderRequestParams;
        if (str10 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str10.hashCode();
        }
        int i26 = (i25 + hashCode26) * 31;
        Integer num = this.shippingFrom;
        if (num == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = num.hashCode();
        }
        int i27 = (i26 + hashCode27) * 31;
        List<Object> list7 = this.category;
        if (list7 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = list7.hashCode();
        }
        int i28 = (i27 + hashCode28) * 31;
        String str11 = this.productUnavailableText;
        if (str11 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = str11.hashCode();
        }
        int i29 = (i28 + hashCode29) * 31;
        List<Integer> list8 = this.promLogosIndex;
        if (list8 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = list8.hashCode();
        }
        int i30 = (i29 + hashCode30) * 31;
        String str12 = this.displayOriginPrice;
        if (str12 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = str12.hashCode();
        }
        int i31 = (i30 + hashCode31) * 31;
        String str13 = this.displayAvailablePrice;
        if (str13 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = str13.hashCode();
        }
        int i32 = (i31 + hashCode32) * 31;
        String str14 = this.displayCurrency;
        if (str14 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = str14.hashCode();
        }
        int i33 = (i32 + hashCode33) * 31;
        Integer num2 = this.bizType;
        if (num2 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = num2.hashCode();
        }
        int i34 = (i33 + hashCode34) * 31;
        List<Object> list9 = this.skcInfo;
        if (list9 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = list9.hashCode();
        }
        int i35 = (i34 + hashCode35) * 31;
        String str15 = this.daInfo;
        if (str15 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = str15.hashCode();
        }
        int i36 = (i35 + hashCode36) * 31;
        String str16 = this.discount;
        if (str16 != null) {
            i = str16.hashCode();
        }
        return i36 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Product(productId=");
        sb.append(this.productId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", img=");
        sb.append(this.img);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", marketPrice=");
        sb.append(this.marketPrice);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", pricePrefix=");
        sb.append(this.pricePrefix);
        sb.append(", detailUrl=");
        sb.append(this.detailUrl);
        sb.append(", productStatus=");
        sb.append(this.productStatus);
        sb.append(", additionId=");
        sb.append(this.additionId);
        sb.append(", elasticTitle=");
        sb.append(this.elasticTitle);
        sb.append(", elasticImg=");
        sb.append(this.elasticImg);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", formatPrice=");
        sb.append(this.formatPrice);
        sb.append(", formatMarketPrice=");
        sb.append(this.formatMarketPrice);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", cellingPrice=");
        sb.append(this.cellingPrice);
        sb.append(", floorPrice=");
        sb.append(this.floorPrice);
        sb.append(", source_from=");
        sb.append(this.source_from);
        sb.append(", formatOriginPrice=");
        sb.append(this.formatOriginPrice);
        sb.append(", formatAvailablePrice=");
        sb.append(this.formatAvailablePrice);
        sb.append(", availablePriceIntegerNum=");
        sb.append(this.availablePriceIntegerNum);
        sb.append(", availablePriceDecimalNum=");
        sb.append(this.availablePriceDecimalNum);
        sb.append(", isIntroduce=");
        sb.append(this.LIZ);
        sb.append(", flashSaleInfo=");
        sb.append(this.flashSaleInfo);
        sb.append(", promotionLogos=");
        sb.append(this.promotionLogos);
        sb.append(", promotionView=");
        sb.append(this.promotionView);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", soldCount=");
        sb.append(this.soldCount);
        sb.append(", productRating=");
        sb.append(this.productRating);
        sb.append(", sellingView=");
        sb.append(this.sellingView);
        sb.append(", skuIds=");
        sb.append(this.skuIds);
        sb.append(", visitReportParams=");
        sb.append(this.visitReportParams);
        sb.append(", chainKey=");
        sb.append(this.chainKey);
        sb.append(", sellerId=");
        sb.append(this.sellerId);
        sb.append(", assistantSwitch=");
        sb.append(this.assistantSwitch);
        sb.append(", assistantModules=");
        sb.append(this.assistantModules);
        sb.append(", bagIndex=");
        sb.append(this.bagIndex);
        sb.append(", addToCartButton=");
        sb.append(this.addToCartButton);
        sb.append(", activityInfo=");
        sb.append(this.activityInfo);
        sb.append(", voucherList=");
        sb.append(this.voucherList);
        sb.append(", orderRequestParams=");
        sb.append(this.orderRequestParams);
        sb.append(", shippingFrom=");
        sb.append(this.shippingFrom);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", productUnavailableText=");
        sb.append(this.productUnavailableText);
        sb.append(", promLogosIndex=");
        sb.append(this.promLogosIndex);
        sb.append(", displayOriginPrice=");
        sb.append(this.displayOriginPrice);
        sb.append(", displayAvailablePrice=");
        sb.append(this.displayAvailablePrice);
        sb.append(", displayCurrency=");
        sb.append(this.displayCurrency);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", skcInfo=");
        sb.append(this.skcInfo);
        sb.append(", daInfo=");
        sb.append(this.daInfo);
        sb.append(", discount=");
        return C07670Rv.LIZIZ(sb, this.discount, ')');
    }

    public Product(String productId, String title, ECImage eCImage, List<ECImage> list, Long l, Long l2, String currency, String pricePrefix, String detailUrl, int i, String additionId, String elasticTitle, List<ECImage> list2, int i2, String formatPrice, String formatMarketPrice, String source, String schema, String str, String str2, int i3, String formatOriginPrice, String formatAvailablePrice, String str3, String str4, boolean z, FlashSaleDTO flashSaleDTO, List<PromotionLogo> list3, PromotionView promotionView, Map<String, String> map, String str5, String str6, SellingView sellingView, List<String> list4, String str7, String str8, String str9, Boolean bool, List<Object> list5, int i4, AddToCartButton addToCartButton, Object obj, List<? extends Object> list6, String str10, Integer num, List<? extends Object> list7, String str11, List<Integer> list8, String str12, String str13, String str14, Integer num2, List<Object> list9, String str15, String str16) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(currency, "currency");
        o.LJIIIZ(pricePrefix, "pricePrefix");
        o.LJIIIZ(detailUrl, "detailUrl");
        o.LJIIIZ(additionId, "additionId");
        o.LJIIIZ(elasticTitle, "elasticTitle");
        o.LJIIIZ(formatPrice, "formatPrice");
        o.LJIIIZ(formatMarketPrice, "formatMarketPrice");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(formatOriginPrice, "formatOriginPrice");
        o.LJIIIZ(formatAvailablePrice, "formatAvailablePrice");
        this.productId = productId;
        this.title = title;
        this.cover = eCImage;
        this.img = list;
        this.price = l;
        this.marketPrice = l2;
        this.currency = currency;
        this.pricePrefix = pricePrefix;
        this.detailUrl = detailUrl;
        this.productStatus = i;
        this.additionId = additionId;
        this.elasticTitle = elasticTitle;
        this.elasticImg = list2;
        this.platform = i2;
        this.formatPrice = formatPrice;
        this.formatMarketPrice = formatMarketPrice;
        this.source = source;
        this.schema = schema;
        this.cellingPrice = str;
        this.floorPrice = str2;
        this.source_from = i3;
        this.formatOriginPrice = formatOriginPrice;
        this.formatAvailablePrice = formatAvailablePrice;
        this.availablePriceIntegerNum = str3;
        this.availablePriceDecimalNum = str4;
        this.LIZ = z;
        this.flashSaleInfo = flashSaleDTO;
        this.promotionLogos = list3;
        this.promotionView = promotionView;
        this.extra = map;
        this.soldCount = str5;
        this.productRating = str6;
        this.sellingView = sellingView;
        this.skuIds = list4;
        this.visitReportParams = str7;
        this.chainKey = str8;
        this.sellerId = str9;
        this.assistantSwitch = bool;
        this.assistantModules = list5;
        this.bagIndex = i4;
        this.addToCartButton = addToCartButton;
        this.activityInfo = obj;
        this.voucherList = list6;
        this.orderRequestParams = str10;
        this.shippingFrom = num;
        this.category = list7;
        this.productUnavailableText = str11;
        this.promLogosIndex = list8;
        this.displayOriginPrice = str12;
        this.displayAvailablePrice = str13;
        this.displayCurrency = str14;
        this.bizType = num2;
        this.skcInfo = list9;
        this.daInfo = str15;
        this.discount = str16;
    }

    public /* synthetic */ Product(String str, String str2, ECImage eCImage, List list, Long l, Long l2, String str3, String str4, String str5, int i, String str6, String str7, List list2, int i2, String str8, String str9, String str10, String str11, String str12, String str13, int i3, String str14, String str15, String str16, String str17, boolean z, FlashSaleDTO flashSaleDTO, List list3, PromotionView promotionView, Map map, String str18, String str19, SellingView sellingView, List list4, String str20, String str21, String str22, Boolean bool, List list5, int i4, AddToCartButton addToCartButton, Object obj, List list6, String str23, Integer num, List list7, String str24, List list8, String str25, String str26, String str27, Integer num2, List list9, String str28, String str29, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? null : eCImage, (i5 & 8) != 0 ? null : list, (i5 & 16) != 0 ? null : l, (i5 & 32) != 0 ? null : l2, (i5 & 64) != 0 ? "" : str3, (i5 & 128) != 0 ? "" : str4, (i5 & 256) != 0 ? "" : str5, (i5 & 512) != 0 ? 0 : i, (i5 & 1024) != 0 ? "" : str6, (i5 & 2048) != 0 ? "" : str7, (i5 & 4096) != 0 ? null : list2, (i5 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i2, (i5 & 16384) != 0 ? "" : str8, (i5 & 32768) != 0 ? "" : str9, (i5 & 65536) != 0 ? "" : str10, (i5 & 131072) != 0 ? "" : str11, (i5 & 262144) != 0 ? null : str12, (524288 & i5) != 0 ? null : str13, (1048576 & i5) != 0 ? 0 : i3, (2097152 & i5) != 0 ? "" : str14, (4194304 & i5) == 0 ? str15 : "", str16, str17, (33554432 & i5) != 0 ? false : z, flashSaleDTO, list3, (268435456 & i5) != 0 ? null : promotionView, map, (1073741824 & i5) != 0 ? null : str18, (i5 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str19, (i6 & 1) != 0 ? null : sellingView, (i6 & 2) != 0 ? null : list4, (i6 & 4) != 0 ? null : str20, (i6 & 8) != 0 ? null : str21, (i6 & 16) != 0 ? null : str22, (i6 & 32) != 0 ? Boolean.FALSE : bool, (i6 & 64) != 0 ? null : list5, (i6 & 128) != 0 ? 0 : i4, (i6 & 256) != 0 ? null : addToCartButton, (i6 & 512) != 0 ? null : obj, (i6 & 1024) != 0 ? null : list6, (i6 & 2048) != 0 ? null : str23, (i6 & 4096) != 0 ? null : num, (i6 & FileUtils.BUFFER_SIZE) != 0 ? null : list7, (i6 & 16384) != 0 ? null : str24, (i6 & 32768) != 0 ? null : list8, (i6 & 65536) != 0 ? null : str25, (i6 & 131072) != 0 ? null : str26, (i6 & 262144) != 0 ? null : str27, (524288 & i6) != 0 ? null : num2, (1048576 & i6) != 0 ? null : list9, (2097152 & i6) != 0 ? null : str28, (4194304 & i6) != 0 ? null : str29);
    }
}
