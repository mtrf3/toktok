package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.UC7;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ShopWindowExtraModel {

    @InterfaceC65349Pkn("add_to_cart_button")
    public AddToCartButton addToCartButton;

    @InterfaceC65349Pkn("anchor_privilege")
    public final AnchorPrivilege anchorPrivilege;

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("cover_url")
    public final String coverUrl;

    @InterfaceC65349Pkn("detail_url")
    public final String detailUrl;

    @InterfaceC65349Pkn("elastic_title")
    public final String elasticTitle;

    @InterfaceC65349Pkn("elastic_url")
    public final String elasticUrl;

    @InterfaceC65349Pkn("final_url")
    public final String finalUrl;

    @InterfaceC65349Pkn("format_price")
    public String formatPrice;

    @InterfaceC65349Pkn("im_schema")
    public final String imSchema;

    @InterfaceC65349Pkn("load_method_type")
    public final Integer loadMethodType;

    @InterfaceC65349Pkn("need_preload")
    public final Boolean need_preload;

    @InterfaceC65349Pkn("platform")
    public final Integer platform;

    @InterfaceC65349Pkn("price_need_delete")
    public final int price;

    @InterfaceC65349Pkn("product_base")
    public ProductBase productBase;

    @InterfaceC65349Pkn("product_id")
    public final Long productId;

    @InterfaceC65349Pkn("product_status")
    public final Integer productStatus;

    @InterfaceC65349Pkn("product_type")
    public final String productType;

    @InterfaceC65349Pkn("product_unavailable_text")
    public final String productUnavailableText;

    @InterfaceC65349Pkn("promotionLogExtraInfo")
    public Map<String, ? extends Object> promotionLogExtraInfo;

    @InterfaceC65349Pkn("promotion_logos")
    public final List<PromotionLogo> promotionLogos;

    @InterfaceC65349Pkn("promotion_view")
    public PromotionView promotionView;

    @InterfaceC65349Pkn("review_overall_score")
    public final Float reviewOverallScore;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("seller_id")
    public String sellerId;

    @InterfaceC65349Pkn("shop_link_schema")
    public final String shopLinkSchema;

    @InterfaceC65349Pkn("skus")
    public List<SkuItem> skus;

    @InterfaceC65349Pkn("sold_count")
    public final Integer soldCount;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("source_from")
    public final String sourceFrom;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("unavailable_schema")
    public final String unavailableSchema;

    @InterfaceC65349Pkn("unavailable_text")
    public final String unavailableText;

    /* JADX WARN: Multi-variable type inference failed */
    public ShopWindowExtraModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopWindowExtraModel)) {
            return false;
        }
        ShopWindowExtraModel shopWindowExtraModel = (ShopWindowExtraModel) obj;
        return o.LJ(this.productType, shopWindowExtraModel.productType) && o.LJ(this.productId, shopWindowExtraModel.productId) && o.LJ(this.title, shopWindowExtraModel.title) && o.LJ(this.elasticTitle, shopWindowExtraModel.elasticTitle) && this.price == shopWindowExtraModel.price && o.LJ(this.formatPrice, shopWindowExtraModel.formatPrice) && o.LJ(this.coverUrl, shopWindowExtraModel.coverUrl) && o.LJ(this.elasticUrl, shopWindowExtraModel.elasticUrl) && o.LJ(this.platform, shopWindowExtraModel.platform) && o.LJ(this.schema, shopWindowExtraModel.schema) && o.LJ(this.sourceFrom, shopWindowExtraModel.sourceFrom) && o.LJ(this.source, shopWindowExtraModel.source) && o.LJ(this.detailUrl, shopWindowExtraModel.detailUrl) && o.LJ(this.need_preload, shopWindowExtraModel.need_preload) && o.LJ(this.loadMethodType, shopWindowExtraModel.loadMethodType) && o.LJ(this.productBase, shopWindowExtraModel.productBase) && o.LJ(this.productStatus, shopWindowExtraModel.productStatus) && o.LJ(this.productUnavailableText, shopWindowExtraModel.productUnavailableText) && o.LJ(this.unavailableText, shopWindowExtraModel.unavailableText) && o.LJ(this.unavailableSchema, shopWindowExtraModel.unavailableSchema) && o.LJ(this.promotionView, shopWindowExtraModel.promotionView) && o.LJ(this.addToCartButton, shopWindowExtraModel.addToCartButton) && o.LJ(this.skus, shopWindowExtraModel.skus) && o.LJ(this.sellerId, shopWindowExtraModel.sellerId) && o.LJ(this.promotionLogos, shopWindowExtraModel.promotionLogos) && o.LJ(this.promotionLogExtraInfo, shopWindowExtraModel.promotionLogExtraInfo) && o.LJ(this.anchorPrivilege, shopWindowExtraModel.anchorPrivilege) && o.LJ(this.finalUrl, shopWindowExtraModel.finalUrl) && o.LJ(this.reviewOverallScore, shopWindowExtraModel.reviewOverallScore) && o.LJ(this.shopLinkSchema, shopWindowExtraModel.shopLinkSchema) && o.LJ(this.imSchema, shopWindowExtraModel.imSchema) && o.LJ(this.soldCount, shopWindowExtraModel.soldCount) && o.LJ(this.bizType, shopWindowExtraModel.bizType);
    }

    public final int hashCode() {
        String str = this.productType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.productId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.elasticTitle;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.price) * 31;
        String str4 = this.formatPrice;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.coverUrl;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.elasticUrl;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.platform;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.schema;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sourceFrom;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.source;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.detailUrl;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.need_preload;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.loadMethodType;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ProductBase productBase = this.productBase;
        int hashCode15 = (hashCode14 + (productBase == null ? 0 : productBase.hashCode())) * 31;
        Integer num3 = this.productStatus;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.productUnavailableText;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.unavailableText;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.unavailableSchema;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int hashCode20 = (hashCode19 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        int hashCode21 = (hashCode20 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
        List<SkuItem> list = this.skus;
        int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        String str14 = this.sellerId;
        int hashCode23 = (hashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List<PromotionLogo> list2 = this.promotionLogos;
        int hashCode24 = (hashCode23 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, ? extends Object> map = this.promotionLogExtraInfo;
        int hashCode25 = (hashCode24 + (map == null ? 0 : map.hashCode())) * 31;
        AnchorPrivilege anchorPrivilege = this.anchorPrivilege;
        int hashCode26 = (hashCode25 + (anchorPrivilege == null ? 0 : anchorPrivilege.hashCode())) * 31;
        String str15 = this.finalUrl;
        int hashCode27 = (hashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Float f = this.reviewOverallScore;
        int hashCode28 = (hashCode27 + (f == null ? 0 : f.hashCode())) * 31;
        String str16 = this.shopLinkSchema;
        int hashCode29 = (hashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.imSchema;
        int hashCode30 = (hashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num4 = this.soldCount;
        int hashCode31 = (hashCode30 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.bizType;
        return hashCode31 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShopWindowExtraModel(productType=");
        sb.append(this.productType);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", elasticTitle=");
        sb.append(this.elasticTitle);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", formatPrice=");
        sb.append(this.formatPrice);
        sb.append(", coverUrl=");
        sb.append(this.coverUrl);
        sb.append(", elasticUrl=");
        sb.append(this.elasticUrl);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", sourceFrom=");
        sb.append(this.sourceFrom);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", detailUrl=");
        sb.append(this.detailUrl);
        sb.append(", need_preload=");
        sb.append(this.need_preload);
        sb.append(", loadMethodType=");
        sb.append(this.loadMethodType);
        sb.append(", productBase=");
        sb.append(this.productBase);
        sb.append(", productStatus=");
        sb.append(this.productStatus);
        sb.append(", productUnavailableText=");
        sb.append(this.productUnavailableText);
        sb.append(", unavailableText=");
        sb.append(this.unavailableText);
        sb.append(", unavailableSchema=");
        sb.append(this.unavailableSchema);
        sb.append(", promotionView=");
        sb.append(this.promotionView);
        sb.append(", addToCartButton=");
        sb.append(this.addToCartButton);
        sb.append(", skus=");
        sb.append(this.skus);
        sb.append(", sellerId=");
        sb.append(this.sellerId);
        sb.append(", promotionLogos=");
        sb.append(this.promotionLogos);
        sb.append(", promotionLogExtraInfo=");
        sb.append(this.promotionLogExtraInfo);
        sb.append(", anchorPrivilege=");
        sb.append(this.anchorPrivilege);
        sb.append(", finalUrl=");
        sb.append(this.finalUrl);
        sb.append(", reviewOverallScore=");
        sb.append(this.reviewOverallScore);
        sb.append(", shopLinkSchema=");
        sb.append(this.shopLinkSchema);
        sb.append(", imSchema=");
        sb.append(this.imSchema);
        sb.append(", soldCount=");
        sb.append(this.soldCount);
        sb.append(", bizType=");
        return UC7.LIZ(sb, this.bizType, ')');
    }

    public ShopWindowExtraModel(String str, Long l, String str2, String str3, int i, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, Boolean bool, Integer num2, ProductBase productBase, Integer num3, String str11, String str12, String str13, PromotionView promotionView, AddToCartButton addToCartButton, List<SkuItem> list, String str14, List<PromotionLogo> list2, Map<String, ? extends Object> map, AnchorPrivilege anchorPrivilege, String str15, Float f, String str16, String str17, Integer num4, Integer num5) {
        this.productType = str;
        this.productId = l;
        this.title = str2;
        this.elasticTitle = str3;
        this.price = i;
        this.formatPrice = str4;
        this.coverUrl = str5;
        this.elasticUrl = str6;
        this.platform = num;
        this.schema = str7;
        this.sourceFrom = str8;
        this.source = str9;
        this.detailUrl = str10;
        this.need_preload = bool;
        this.loadMethodType = num2;
        this.productBase = productBase;
        this.productStatus = num3;
        this.productUnavailableText = str11;
        this.unavailableText = str12;
        this.unavailableSchema = str13;
        this.promotionView = promotionView;
        this.addToCartButton = addToCartButton;
        this.skus = list;
        this.sellerId = str14;
        this.promotionLogos = list2;
        this.promotionLogExtraInfo = map;
        this.anchorPrivilege = anchorPrivilege;
        this.finalUrl = str15;
        this.reviewOverallScore = f;
        this.shopLinkSchema = str16;
        this.imSchema = str17;
        this.soldCount = num4;
        this.bizType = num5;
    }

    public /* synthetic */ ShopWindowExtraModel(String str, Long l, String str2, String str3, int i, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, Boolean bool, Integer num2, ProductBase productBase, Integer num3, String str11, String str12, String str13, PromotionView promotionView, AddToCartButton addToCartButton, List list, String str14, List list2, Map map, AnchorPrivilege anchorPrivilege, String str15, Float f, String str16, String str17, Integer num4, Integer num5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : str10, (i2 & FileUtils.BUFFER_SIZE) != 0 ? Boolean.FALSE : bool, (i2 & 16384) != 0 ? null : num2, (32768 & i2) != 0 ? null : productBase, (65536 & i2) != 0 ? null : num3, (131072 & i2) != 0 ? null : str11, (262144 & i2) != 0 ? null : str12, (524288 & i2) != 0 ? null : str13, (1048576 & i2) != 0 ? null : promotionView, (2097152 & i2) != 0 ? null : addToCartButton, (4194304 & i2) != 0 ? null : list, (8388608 & i2) != 0 ? null : str14, (16777216 & i2) != 0 ? null : list2, (33554432 & i2) != 0 ? null : map, (67108864 & i2) != 0 ? null : anchorPrivilege, (134217728 & i2) != 0 ? null : str15, (268435456 & i2) != 0 ? null : f, (536870912 & i2) != 0 ? null : str16, (1073741824 & i2) != 0 ? null : str17, (i2 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : num4, (i3 & 1) != 0 ? null : num5);
    }
}
