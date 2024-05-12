package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C07670Rv;
import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.C69679RWh;
import X.InterfaceC65349Pkn;
import X.InterfaceC87283bg;
import X.RWA;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductPackStruct implements InterfaceC87283bg, Parcelable {

    @InterfaceC65349Pkn("activity_info")
    public final PickTag activityInfo;

    @InterfaceC65349Pkn("add_to_cart_button")
    public final AddToCartButton addToCartButton;

    @InterfaceC65349Pkn("additional_info")
    public final List<AdditionInfo> additionInfo;

    @InterfaceC65349Pkn("announcements")
    public final List<Announcement> announcements;

    @InterfaceC65349Pkn("product_base")
    public final ProductBase baseInfo;

    @InterfaceC65349Pkn("bill_info_server_params")
    public final String billInfoParams;

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("block_page_info")
    public final BlockPageInfo blockPageInfo;

    @InterfaceC65349Pkn("button_area")
    public final PdpBottomArea bottomArea;

    @InterfaceC65349Pkn("bottom_nav_bar_style")
    public final Integer bottomNavBarStyle;

    @InterfaceC65349Pkn("bricks")
    public List<BrickInfo> bricks;

    @InterfaceC65349Pkn("bundle_brief")
    public final BundleBrief bundleBrief;

    @InterfaceC65349Pkn("buy_button")
    public final BuyButton buyButton;

    @InterfaceC65349Pkn("cart_entry")
    public CartEntry cartEntry;

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("cod_policy")
    public final CodPolicy codPolicy;

    @InterfaceC65349Pkn("convenient_submit_order")
    public final ConvenientSubmitOrder convenientSubmitOrder;

    @InterfaceC65349Pkn("creator")
    public final Creator creator;

    @InterfaceC65349Pkn("creator_videos")
    public final List<Video> creatorVideos;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("default_address_id")
    public final String defaultAddressId;

    @InterfaceC65349Pkn("delay_operation")
    public final List<DelayOperation> delayOperation;

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("favorite")
    public Favorite favorite;

    @InterfaceC65349Pkn("save_status")
    public final Integer favoriteStatus;

    @InterfaceC65349Pkn("flash_sale")
    public final FlashSale flashSale;

    @InterfaceC65349Pkn("free_return")
    public final UserRightTag freeReturn;

    @InterfaceC65349Pkn("global_waist_banner")
    public final GlobalWaistBanner globalWaistBanner;

    @InterfaceC65349Pkn("half_waist_banner")
    public final HalfWaistBanner halfWaistBanner;

    @InterfaceC65349Pkn("has_pay_method")
    public Boolean hasPayMethod;

    @InterfaceC65349Pkn("has_shipping_address")
    public Boolean hasShippingAddress;
    public long lastUpdateTime;

    @InterfaceC65349Pkn("lazy_load_info")
    public final LazyLoadInfo lazyLoadInfo;

    @InterfaceC65349Pkn("local_size_sale_prop")
    public final StandardSaleProps localSizeSaleProp;

    @InterfaceC65349Pkn("logistic")
    public final LogisticDTO logistic;

    @InterfaceC65349Pkn("marketing_config")
    public final MarketingConfig marketingConfig;

    @InterfaceC65349Pkn("model_card")
    public final ModelCard modelCard;

    @InterfaceC65349Pkn("outer_voucher")
    public final Voucher outerVoucher;

    @InterfaceC65349Pkn("pdp_logistic_module")
    public final PDPLogisticModule pdpLogisticModule;

    @InterfaceC65349Pkn("pdp_payment_module")
    public final PdpPaymentModule pdpPaymentModule;

    @InterfaceC65349Pkn("platform_promotion")
    public final PlatformPromotion platformPromotion;

    @InterfaceC65349Pkn("pop_up")
    public PopUp popUp;

    @InterfaceC65349Pkn("preorder_info_undecided_sku")
    public final PreOrderInfo preOrderInfo;

    @InterfaceC65349Pkn("product_banner_labels")
    public final List<ProductBannerLabel> productBannerLabel;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("product_logo")
    public final List<ProductLogo> productLogos;

    @InterfaceC65349Pkn("product_properties")
    public final ProductProperty productProps;

    @InterfaceC65349Pkn("product_type")
    public Integer productType;

    @InterfaceC65349Pkn("product_unavailable_info")
    public ProductUnavailableInfo productUnavailableInfo;

    @InterfaceC65349Pkn("promotion_discount")
    public final List<PromotionDiscount> promotionDiscounts;

    @InterfaceC65349Pkn("promotion_entrance")
    public final PromotionEntrance promotionEntrance;

    @InterfaceC65349Pkn("promotion_logos")
    public final List<PromotionLogo> promotionLogos;

    @InterfaceC65349Pkn("promotion_reform")
    public final Boolean promotionReform;

    @InterfaceC65349Pkn("promotion_view")
    public final PromotionView promotionView;

    @InterfaceC65349Pkn("purchase_limit")
    public final PurchaseLimit purchaseLimit;

    @InterfaceC65349Pkn("rank_info")
    public final RankInfo rankInfo;

    @InterfaceC65349Pkn("recall_box")
    public final RecallBox recallBox;

    @InterfaceC65349Pkn("return_policy")
    public final UserRight returnPolicy;

    @InterfaceC65349Pkn("product_detail_review")
    public final ProductDetailReview review;

    @InterfaceC65349Pkn("sale_props")
    public final List<SaleProp> saleProps;

    @InterfaceC65349Pkn("schema_info")
    public DynamicSchema schemaInfo;

    @InterfaceC65349Pkn("security_information")
    public final SecurityInformation securityInformation;

    @InterfaceC65349Pkn("self_operated_policy")
    public final SelfOperatedPolicy selfOperatedPolicy;

    @InterfaceC65349Pkn("self_operated_slogan")
    public final SelfOperatedSloganInfo selfOperatedSloganInfo;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("seller")
    public final SellerInfo sellerInfo;

    @InterfaceC65349Pkn("seller_promotion")
    public final SellerPromotion sellerPromotion;

    @InterfaceC65349Pkn("share_info")
    public final ShareInfo shareInfo;

    @InterfaceC65349Pkn("shipping")
    public final PdpShipping shipping;

    @InterfaceC65349Pkn("shop_policies")
    public final List<ShopPolicy> shopPolicies;

    @InterfaceC65349Pkn("shop_review_entry")
    public final ShopReviewEntry shopReview;

    @InterfaceC65349Pkn("skc_info")
    public final SkcInfo skcInfo;

    @InterfaceC65349Pkn("sku_common_config")
    public final SkuCommonConfig skuCommonConfig;

    @InterfaceC65349Pkn("sku_panel_bottom_text")
    public final SKUPanelBottomText skuPanelBottomText;

    @InterfaceC65349Pkn("sku_style")
    public final Integer skuStyle;

    @InterfaceC65349Pkn("skus")
    public final List<SkuItem> skus;

    @InterfaceC65349Pkn("static_selling_points")
    public final List<StaticSellingPoint> staticSellingPoints;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("tabs")
    public List<Tab> tabs;

    @InterfaceC65349Pkn("template")
    public final Integer template;

    @InterfaceC65349Pkn("third_party")
    public final ThirdParty thirdPartyData;

    @InterfaceC65349Pkn("unavailable_info")
    public final ProductUnavailableInfo unavailableInfo;

    @InterfaceC65349Pkn("user_right")
    public final UserRight userRight;

    @InterfaceC65349Pkn("voucher_info")
    public final VoucherInfo voucherInfo;

    @InterfaceC65349Pkn("waist_banner")
    public final WaistBanner waistBanner;

    @InterfaceC65349Pkn("warehouse_tag")
    public final WarehouseTag warehouseTag;

    @InterfaceC65349Pkn("with_coupon")
    public final Boolean withCoupon;
    public static final C69679RWh Companion = new C69679RWh();
    public static final Parcelable.Creator<ProductPackStruct> CREATOR = new RWA();
    public static final Integer[] ALL_STATUS = {2, 1, 3, 4, 5};

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProductPackStruct() {
        /*
            r91 = this;
            r1 = 0
            r87 = -1
            r89 = 4194303(0x3fffff, float:5.87747E-39)
            r0 = r91
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r1
            r27 = r1
            r28 = r1
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r37 = r1
            r38 = r1
            r39 = r1
            r40 = r1
            r41 = r1
            r42 = r1
            r43 = r1
            r44 = r1
            r45 = r1
            r46 = r1
            r47 = r1
            r48 = r1
            r49 = r1
            r50 = r1
            r51 = r1
            r52 = r1
            r53 = r1
            r54 = r1
            r55 = r1
            r56 = r1
            r57 = r1
            r58 = r1
            r59 = r1
            r60 = r1
            r61 = r1
            r62 = r1
            r63 = r1
            r64 = r1
            r65 = r1
            r66 = r1
            r67 = r1
            r68 = r1
            r69 = r1
            r70 = r1
            r71 = r1
            r72 = r1
            r73 = r1
            r74 = r1
            r75 = r1
            r76 = r1
            r77 = r1
            r78 = r1
            r79 = r1
            r80 = r1
            r81 = r1
            r82 = r1
            r83 = r1
            r84 = r1
            r85 = r1
            r86 = r1
            r88 = r87
            r90 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPackStruct)) {
            return false;
        }
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        return o.LJ(this.productId, productPackStruct.productId) && o.LJ(this.status, productPackStruct.status) && o.LJ(this.sellerInfo, productPackStruct.sellerInfo) && o.LJ(this.selfOperatedSloganInfo, productPackStruct.selfOperatedSloganInfo) && o.LJ(this.baseInfo, productPackStruct.baseInfo) && o.LJ(this.creatorVideos, productPackStruct.creatorVideos) && o.LJ(this.localSizeSaleProp, productPackStruct.localSizeSaleProp) && o.LJ(this.saleProps, productPackStruct.saleProps) && o.LJ(this.skcInfo, productPackStruct.skcInfo) && o.LJ(this.skus, productPackStruct.skus) && o.LJ(this.shopPolicies, productPackStruct.shopPolicies) && o.LJ(this.userRight, productPackStruct.userRight) && o.LJ(this.freeReturn, productPackStruct.freeReturn) && o.LJ(this.securityInformation, productPackStruct.securityInformation) && o.LJ(this.logistic, productPackStruct.logistic) && o.LJ(this.additionInfo, productPackStruct.additionInfo) && o.LJ(this.waistBanner, productPackStruct.waistBanner) && o.LJ(this.voucherInfo, productPackStruct.voucherInfo) && o.LJ(this.outerVoucher, productPackStruct.outerVoucher) && o.LJ(this.modelCard, productPackStruct.modelCard) && o.LJ(this.review, productPackStruct.review) && o.LJ(this.shopReview, productPackStruct.shopReview) && o.LJ(this.flashSale, productPackStruct.flashSale) && o.LJ(this.productType, productPackStruct.productType) && o.LJ(this.productBannerLabel, productPackStruct.productBannerLabel) && o.LJ(this.thirdPartyData, productPackStruct.thirdPartyData) && o.LJ(this.addToCartButton, productPackStruct.addToCartButton) && o.LJ(this.creator, productPackStruct.creator) && o.LJ(this.cartEntry, productPackStruct.cartEntry) && o.LJ(this.activityInfo, productPackStruct.activityInfo) && o.LJ(this.promotionLogos, productPackStruct.promotionLogos) && o.LJ(this.productLogos, productPackStruct.productLogos) && o.LJ(this.popUp, productPackStruct.popUp) && o.LJ(this.chainKey, productPackStruct.chainKey) && o.LJ(this.promotionView, productPackStruct.promotionView) && o.LJ(this.halfWaistBanner, productPackStruct.halfWaistBanner) && o.LJ(this.hasShippingAddress, productPackStruct.hasShippingAddress) && o.LJ(this.hasPayMethod, productPackStruct.hasPayMethod) && o.LJ(this.schemaInfo, productPackStruct.schemaInfo) && o.LJ(this.extra, productPackStruct.extra) && o.LJ(this.buyButton, productPackStruct.buyButton) && o.LJ(this.productUnavailableInfo, productPackStruct.productUnavailableInfo) && o.LJ(this.shareInfo, productPackStruct.shareInfo) && o.LJ(this.staticSellingPoints, productPackStruct.staticSellingPoints) && o.LJ(this.rankInfo, productPackStruct.rankInfo) && o.LJ(this.preOrderInfo, productPackStruct.preOrderInfo) && o.LJ(this.promotionEntrance, productPackStruct.promotionEntrance) && o.LJ(this.template, productPackStruct.template) && o.LJ(this.marketingConfig, productPackStruct.marketingConfig) && o.LJ(this.promotionDiscounts, productPackStruct.promotionDiscounts) && o.LJ(this.bricks, productPackStruct.bricks) && o.LJ(this.tabs, productPackStruct.tabs) && o.LJ(this.unavailableInfo, productPackStruct.unavailableInfo) && o.LJ(this.defaultAddressId, productPackStruct.defaultAddressId) && o.LJ(this.favoriteStatus, productPackStruct.favoriteStatus) && o.LJ(this.blockPageInfo, productPackStruct.blockPageInfo) && o.LJ(this.announcements, productPackStruct.announcements) && o.LJ(this.recallBox, productPackStruct.recallBox) && o.LJ(this.skuPanelBottomText, productPackStruct.skuPanelBottomText) && o.LJ(this.delayOperation, productPackStruct.delayOperation) && o.LJ(this.skuCommonConfig, productPackStruct.skuCommonConfig) && o.LJ(this.daInfo, productPackStruct.daInfo) && o.LJ(this.pdpLogisticModule, productPackStruct.pdpLogisticModule) && o.LJ(this.pdpPaymentModule, productPackStruct.pdpPaymentModule) && o.LJ(this.returnPolicy, productPackStruct.returnPolicy) && o.LJ(this.warehouseTag, productPackStruct.warehouseTag) && o.LJ(this.withCoupon, productPackStruct.withCoupon) && o.LJ(this.promotionReform, productPackStruct.promotionReform) && o.LJ(this.skuStyle, productPackStruct.skuStyle) && o.LJ(this.bundleBrief, productPackStruct.bundleBrief) && o.LJ(this.lazyLoadInfo, productPackStruct.lazyLoadInfo) && o.LJ(this.shipping, productPackStruct.shipping) && o.LJ(this.billInfoParams, productPackStruct.billInfoParams) && o.LJ(this.productProps, productPackStruct.productProps) && o.LJ(this.codPolicy, productPackStruct.codPolicy) && o.LJ(this.selfOperatedPolicy, productPackStruct.selfOperatedPolicy) && o.LJ(this.bottomNavBarStyle, productPackStruct.bottomNavBarStyle) && o.LJ(this.bizType, productPackStruct.bizType) && o.LJ(this.favorite, productPackStruct.favorite) && o.LJ(this.platformPromotion, productPackStruct.platformPromotion) && o.LJ(this.globalWaistBanner, productPackStruct.globalWaistBanner) && o.LJ(this.sellerPromotion, productPackStruct.sellerPromotion) && o.LJ(this.bottomArea, productPackStruct.bottomArea) && o.LJ(this.purchaseLimit, productPackStruct.purchaseLimit) && o.LJ(this.convenientSubmitOrder, productPackStruct.convenientSubmitOrder) && o.LJ(this.sellerId, productPackStruct.sellerId);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        SellerInfo sellerInfo = this.sellerInfo;
        int hashCode3 = (hashCode2 + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31;
        SelfOperatedSloganInfo selfOperatedSloganInfo = this.selfOperatedSloganInfo;
        int hashCode4 = (hashCode3 + (selfOperatedSloganInfo == null ? 0 : selfOperatedSloganInfo.hashCode())) * 31;
        ProductBase productBase = this.baseInfo;
        int hashCode5 = (hashCode4 + (productBase == null ? 0 : productBase.hashCode())) * 31;
        List<Video> list = this.creatorVideos;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        StandardSaleProps standardSaleProps = this.localSizeSaleProp;
        int hashCode7 = (hashCode6 + (standardSaleProps == null ? 0 : standardSaleProps.hashCode())) * 31;
        List<SaleProp> list2 = this.saleProps;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkcInfo skcInfo = this.skcInfo;
        int hashCode9 = (hashCode8 + (skcInfo == null ? 0 : skcInfo.hashCode())) * 31;
        List<SkuItem> list3 = this.skus;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ShopPolicy> list4 = this.shopPolicies;
        int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        UserRight userRight = this.userRight;
        int hashCode12 = (hashCode11 + (userRight == null ? 0 : userRight.hashCode())) * 31;
        UserRightTag userRightTag = this.freeReturn;
        int hashCode13 = (hashCode12 + (userRightTag == null ? 0 : userRightTag.hashCode())) * 31;
        SecurityInformation securityInformation = this.securityInformation;
        int hashCode14 = (hashCode13 + (securityInformation == null ? 0 : securityInformation.hashCode())) * 31;
        LogisticDTO logisticDTO = this.logistic;
        int hashCode15 = (hashCode14 + (logisticDTO == null ? 0 : logisticDTO.hashCode())) * 31;
        List<AdditionInfo> list5 = this.additionInfo;
        int hashCode16 = (hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        WaistBanner waistBanner = this.waistBanner;
        int hashCode17 = (hashCode16 + (waistBanner == null ? 0 : waistBanner.hashCode())) * 31;
        VoucherInfo voucherInfo = this.voucherInfo;
        int hashCode18 = (hashCode17 + (voucherInfo == null ? 0 : voucherInfo.hashCode())) * 31;
        Voucher voucher = this.outerVoucher;
        int hashCode19 = (hashCode18 + (voucher == null ? 0 : voucher.hashCode())) * 31;
        ModelCard modelCard = this.modelCard;
        int hashCode20 = (hashCode19 + (modelCard == null ? 0 : modelCard.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.review;
        int hashCode21 = (hashCode20 + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31;
        ShopReviewEntry shopReviewEntry = this.shopReview;
        int hashCode22 = (hashCode21 + (shopReviewEntry == null ? 0 : shopReviewEntry.hashCode())) * 31;
        FlashSale flashSale = this.flashSale;
        int hashCode23 = (hashCode22 + (flashSale == null ? 0 : flashSale.hashCode())) * 31;
        Integer num2 = this.productType;
        int hashCode24 = (hashCode23 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ProductBannerLabel> list6 = this.productBannerLabel;
        int hashCode25 = (hashCode24 + (list6 == null ? 0 : list6.hashCode())) * 31;
        ThirdParty thirdParty = this.thirdPartyData;
        int hashCode26 = (hashCode25 + (thirdParty == null ? 0 : thirdParty.hashCode())) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        int hashCode27 = (hashCode26 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
        Creator creator = this.creator;
        int hashCode28 = (hashCode27 + (creator == null ? 0 : creator.hashCode())) * 31;
        CartEntry cartEntry = this.cartEntry;
        int hashCode29 = (hashCode28 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        PickTag pickTag = this.activityInfo;
        int hashCode30 = (hashCode29 + (pickTag == null ? 0 : pickTag.hashCode())) * 31;
        List<PromotionLogo> list7 = this.promotionLogos;
        int hashCode31 = (hashCode30 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<ProductLogo> list8 = this.productLogos;
        int hashCode32 = (hashCode31 + (list8 == null ? 0 : list8.hashCode())) * 31;
        PopUp popUp = this.popUp;
        int hashCode33 = (hashCode32 + (popUp == null ? 0 : popUp.hashCode())) * 31;
        String str2 = this.chainKey;
        int hashCode34 = (hashCode33 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int hashCode35 = (hashCode34 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        HalfWaistBanner halfWaistBanner = this.halfWaistBanner;
        int hashCode36 = (hashCode35 + (halfWaistBanner == null ? 0 : halfWaistBanner.hashCode())) * 31;
        Boolean bool = this.hasShippingAddress;
        int hashCode37 = (hashCode36 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasPayMethod;
        int hashCode38 = (hashCode37 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DynamicSchema dynamicSchema = this.schemaInfo;
        int hashCode39 = (hashCode38 + (dynamicSchema == null ? 0 : dynamicSchema.hashCode())) * 31;
        Map<String, String> map = this.extra;
        int hashCode40 = (hashCode39 + (map == null ? 0 : map.hashCode())) * 31;
        BuyButton buyButton = this.buyButton;
        int hashCode41 = (hashCode40 + (buyButton == null ? 0 : buyButton.hashCode())) * 31;
        ProductUnavailableInfo productUnavailableInfo = this.productUnavailableInfo;
        int hashCode42 = (hashCode41 + (productUnavailableInfo == null ? 0 : productUnavailableInfo.hashCode())) * 31;
        ShareInfo shareInfo = this.shareInfo;
        int hashCode43 = (hashCode42 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31;
        List<StaticSellingPoint> list9 = this.staticSellingPoints;
        int hashCode44 = (hashCode43 + (list9 == null ? 0 : list9.hashCode())) * 31;
        RankInfo rankInfo = this.rankInfo;
        int hashCode45 = (hashCode44 + (rankInfo == null ? 0 : rankInfo.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        int hashCode46 = (hashCode45 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        PromotionEntrance promotionEntrance = this.promotionEntrance;
        int hashCode47 = (hashCode46 + (promotionEntrance == null ? 0 : promotionEntrance.hashCode())) * 31;
        Integer num3 = this.template;
        int hashCode48 = (hashCode47 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MarketingConfig marketingConfig = this.marketingConfig;
        int hashCode49 = (hashCode48 + (marketingConfig == null ? 0 : marketingConfig.hashCode())) * 31;
        List<PromotionDiscount> list10 = this.promotionDiscounts;
        int hashCode50 = (hashCode49 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<BrickInfo> list11 = this.bricks;
        int hashCode51 = (hashCode50 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<Tab> list12 = this.tabs;
        int hashCode52 = (hashCode51 + (list12 == null ? 0 : list12.hashCode())) * 31;
        ProductUnavailableInfo productUnavailableInfo2 = this.unavailableInfo;
        int hashCode53 = (hashCode52 + (productUnavailableInfo2 == null ? 0 : productUnavailableInfo2.hashCode())) * 31;
        String str3 = this.defaultAddressId;
        int hashCode54 = (hashCode53 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.favoriteStatus;
        int hashCode55 = (hashCode54 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BlockPageInfo blockPageInfo = this.blockPageInfo;
        int hashCode56 = (hashCode55 + (blockPageInfo == null ? 0 : blockPageInfo.hashCode())) * 31;
        List<Announcement> list13 = this.announcements;
        int hashCode57 = (hashCode56 + (list13 == null ? 0 : list13.hashCode())) * 31;
        RecallBox recallBox = this.recallBox;
        int hashCode58 = (hashCode57 + (recallBox == null ? 0 : recallBox.hashCode())) * 31;
        SKUPanelBottomText sKUPanelBottomText = this.skuPanelBottomText;
        int hashCode59 = (hashCode58 + (sKUPanelBottomText == null ? 0 : sKUPanelBottomText.hashCode())) * 31;
        List<DelayOperation> list14 = this.delayOperation;
        int hashCode60 = (hashCode59 + (list14 == null ? 0 : list14.hashCode())) * 31;
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        int hashCode61 = (hashCode60 + (skuCommonConfig == null ? 0 : skuCommonConfig.hashCode())) * 31;
        String str4 = this.daInfo;
        int hashCode62 = (hashCode61 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
        int hashCode63 = (hashCode62 + (pDPLogisticModule == null ? 0 : pDPLogisticModule.hashCode())) * 31;
        PdpPaymentModule pdpPaymentModule = this.pdpPaymentModule;
        int hashCode64 = (hashCode63 + (pdpPaymentModule == null ? 0 : pdpPaymentModule.hashCode())) * 31;
        UserRight userRight2 = this.returnPolicy;
        int hashCode65 = (hashCode64 + (userRight2 == null ? 0 : userRight2.hashCode())) * 31;
        WarehouseTag warehouseTag = this.warehouseTag;
        int hashCode66 = (hashCode65 + (warehouseTag == null ? 0 : warehouseTag.hashCode())) * 31;
        Boolean bool3 = this.withCoupon;
        int hashCode67 = (hashCode66 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.promotionReform;
        int hashCode68 = (hashCode67 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num5 = this.skuStyle;
        int hashCode69 = (hashCode68 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BundleBrief bundleBrief = this.bundleBrief;
        int hashCode70 = (hashCode69 + (bundleBrief == null ? 0 : bundleBrief.hashCode())) * 31;
        LazyLoadInfo lazyLoadInfo = this.lazyLoadInfo;
        int hashCode71 = (hashCode70 + (lazyLoadInfo == null ? 0 : lazyLoadInfo.hashCode())) * 31;
        PdpShipping pdpShipping = this.shipping;
        int hashCode72 = (hashCode71 + (pdpShipping == null ? 0 : pdpShipping.hashCode())) * 31;
        String str5 = this.billInfoParams;
        int hashCode73 = (hashCode72 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ProductProperty productProperty = this.productProps;
        int hashCode74 = (hashCode73 + (productProperty == null ? 0 : productProperty.hashCode())) * 31;
        CodPolicy codPolicy = this.codPolicy;
        int hashCode75 = (hashCode74 + (codPolicy == null ? 0 : codPolicy.hashCode())) * 31;
        SelfOperatedPolicy selfOperatedPolicy = this.selfOperatedPolicy;
        int hashCode76 = (hashCode75 + (selfOperatedPolicy == null ? 0 : selfOperatedPolicy.hashCode())) * 31;
        Integer num6 = this.bottomNavBarStyle;
        int hashCode77 = (hashCode76 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.bizType;
        int hashCode78 = (hashCode77 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Favorite favorite = this.favorite;
        int hashCode79 = (hashCode78 + (favorite == null ? 0 : favorite.hashCode())) * 31;
        PlatformPromotion platformPromotion = this.platformPromotion;
        int hashCode80 = (hashCode79 + (platformPromotion == null ? 0 : platformPromotion.hashCode())) * 31;
        GlobalWaistBanner globalWaistBanner = this.globalWaistBanner;
        int hashCode81 = (hashCode80 + (globalWaistBanner == null ? 0 : globalWaistBanner.hashCode())) * 31;
        SellerPromotion sellerPromotion = this.sellerPromotion;
        int hashCode82 = (hashCode81 + (sellerPromotion == null ? 0 : sellerPromotion.hashCode())) * 31;
        PdpBottomArea pdpBottomArea = this.bottomArea;
        int hashCode83 = (hashCode82 + (pdpBottomArea == null ? 0 : pdpBottomArea.hashCode())) * 31;
        PurchaseLimit purchaseLimit = this.purchaseLimit;
        int hashCode84 = (hashCode83 + (purchaseLimit == null ? 0 : purchaseLimit.hashCode())) * 31;
        ConvenientSubmitOrder convenientSubmitOrder = this.convenientSubmitOrder;
        int hashCode85 = (hashCode84 + (convenientSubmitOrder == null ? 0 : convenientSubmitOrder.hashCode())) * 31;
        String str6 = this.sellerId;
        return hashCode85 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String LIZIZ() {
        Integer num;
        FlashSale flashSale = this.flashSale;
        if (flashSale == null || (num = flashSale.status) == null) {
            return null;
        }
        if (num.intValue() == 1) {
            return "warm_up";
        }
        if (num.intValue() != 2) {
            return null;
        }
        return "on_sale";
    }

    public final boolean LIZLLL() {
        boolean z;
        String str;
        SkcInfo skcInfo = this.skcInfo;
        if (skcInfo == null || (str = skcInfo.skcPropertyId) == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductPackStruct(productId=");
        sb.append(this.productId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", sellerInfo=");
        sb.append(this.sellerInfo);
        sb.append(", selfOperatedSloganInfo=");
        sb.append(this.selfOperatedSloganInfo);
        sb.append(", baseInfo=");
        sb.append(this.baseInfo);
        sb.append(", creatorVideos=");
        sb.append(this.creatorVideos);
        sb.append(", localSizeSaleProp=");
        sb.append(this.localSizeSaleProp);
        sb.append(", saleProps=");
        sb.append(this.saleProps);
        sb.append(", skcInfo=");
        sb.append(this.skcInfo);
        sb.append(", skus=");
        sb.append(this.skus);
        sb.append(", shopPolicies=");
        sb.append(this.shopPolicies);
        sb.append(", userRight=");
        sb.append(this.userRight);
        sb.append(", freeReturn=");
        sb.append(this.freeReturn);
        sb.append(", securityInformation=");
        sb.append(this.securityInformation);
        sb.append(", logistic=");
        sb.append(this.logistic);
        sb.append(", additionInfo=");
        sb.append(this.additionInfo);
        sb.append(", waistBanner=");
        sb.append(this.waistBanner);
        sb.append(", voucherInfo=");
        sb.append(this.voucherInfo);
        sb.append(", outerVoucher=");
        sb.append(this.outerVoucher);
        sb.append(", modelCard=");
        sb.append(this.modelCard);
        sb.append(", review=");
        sb.append(this.review);
        sb.append(", shopReview=");
        sb.append(this.shopReview);
        sb.append(", flashSale=");
        sb.append(this.flashSale);
        sb.append(", productType=");
        sb.append(this.productType);
        sb.append(", productBannerLabel=");
        sb.append(this.productBannerLabel);
        sb.append(", thirdPartyData=");
        sb.append(this.thirdPartyData);
        sb.append(", addToCartButton=");
        sb.append(this.addToCartButton);
        sb.append(", creator=");
        sb.append(this.creator);
        sb.append(", cartEntry=");
        sb.append(this.cartEntry);
        sb.append(", activityInfo=");
        sb.append(this.activityInfo);
        sb.append(", promotionLogos=");
        sb.append(this.promotionLogos);
        sb.append(", productLogos=");
        sb.append(this.productLogos);
        sb.append(", popUp=");
        sb.append(this.popUp);
        sb.append(", chainKey=");
        sb.append(this.chainKey);
        sb.append(", promotionView=");
        sb.append(this.promotionView);
        sb.append(", halfWaistBanner=");
        sb.append(this.halfWaistBanner);
        sb.append(", hasShippingAddress=");
        sb.append(this.hasShippingAddress);
        sb.append(", hasPayMethod=");
        sb.append(this.hasPayMethod);
        sb.append(", schemaInfo=");
        sb.append(this.schemaInfo);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", buyButton=");
        sb.append(this.buyButton);
        sb.append(", productUnavailableInfo=");
        sb.append(this.productUnavailableInfo);
        sb.append(", shareInfo=");
        sb.append(this.shareInfo);
        sb.append(", staticSellingPoints=");
        sb.append(this.staticSellingPoints);
        sb.append(", rankInfo=");
        sb.append(this.rankInfo);
        sb.append(", preOrderInfo=");
        sb.append(this.preOrderInfo);
        sb.append(", promotionEntrance=");
        sb.append(this.promotionEntrance);
        sb.append(", template=");
        sb.append(this.template);
        sb.append(", marketingConfig=");
        sb.append(this.marketingConfig);
        sb.append(", promotionDiscounts=");
        sb.append(this.promotionDiscounts);
        sb.append(", bricks=");
        sb.append(this.bricks);
        sb.append(", tabs=");
        sb.append(this.tabs);
        sb.append(", unavailableInfo=");
        sb.append(this.unavailableInfo);
        sb.append(", defaultAddressId=");
        sb.append(this.defaultAddressId);
        sb.append(", favoriteStatus=");
        sb.append(this.favoriteStatus);
        sb.append(", blockPageInfo=");
        sb.append(this.blockPageInfo);
        sb.append(", announcements=");
        sb.append(this.announcements);
        sb.append(", recallBox=");
        sb.append(this.recallBox);
        sb.append(", skuPanelBottomText=");
        sb.append(this.skuPanelBottomText);
        sb.append(", delayOperation=");
        sb.append(this.delayOperation);
        sb.append(", skuCommonConfig=");
        sb.append(this.skuCommonConfig);
        sb.append(", daInfo=");
        sb.append(this.daInfo);
        sb.append(", pdpLogisticModule=");
        sb.append(this.pdpLogisticModule);
        sb.append(", pdpPaymentModule=");
        sb.append(this.pdpPaymentModule);
        sb.append(", returnPolicy=");
        sb.append(this.returnPolicy);
        sb.append(", warehouseTag=");
        sb.append(this.warehouseTag);
        sb.append(", withCoupon=");
        sb.append(this.withCoupon);
        sb.append(", promotionReform=");
        sb.append(this.promotionReform);
        sb.append(", skuStyle=");
        sb.append(this.skuStyle);
        sb.append(", bundleBrief=");
        sb.append(this.bundleBrief);
        sb.append(", lazyLoadInfo=");
        sb.append(this.lazyLoadInfo);
        sb.append(", shipping=");
        sb.append(this.shipping);
        sb.append(", billInfoParams=");
        sb.append(this.billInfoParams);
        sb.append(", productProps=");
        sb.append(this.productProps);
        sb.append(", codPolicy=");
        sb.append(this.codPolicy);
        sb.append(", selfOperatedPolicy=");
        sb.append(this.selfOperatedPolicy);
        sb.append(", bottomNavBarStyle=");
        sb.append(this.bottomNavBarStyle);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", favorite=");
        sb.append(this.favorite);
        sb.append(", platformPromotion=");
        sb.append(this.platformPromotion);
        sb.append(", globalWaistBanner=");
        sb.append(this.globalWaistBanner);
        sb.append(", sellerPromotion=");
        sb.append(this.sellerPromotion);
        sb.append(", bottomArea=");
        sb.append(this.bottomArea);
        sb.append(", purchaseLimit=");
        sb.append(this.purchaseLimit);
        sb.append(", convenientSubmitOrder=");
        sb.append(this.convenientSubmitOrder);
        sb.append(", sellerId=");
        return C07670Rv.LIZIZ(sb, this.sellerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.productId);
        Integer num = this.status;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        SellerInfo sellerInfo = this.sellerInfo;
        if (sellerInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sellerInfo.writeToParcel(out, i);
        }
        SelfOperatedSloganInfo selfOperatedSloganInfo = this.selfOperatedSloganInfo;
        if (selfOperatedSloganInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            selfOperatedSloganInfo.writeToParcel(out, i);
        }
        ProductBase productBase = this.baseInfo;
        if (productBase == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productBase.writeToParcel(out, i);
        }
        List<Video> list = this.creatorVideos;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((Video) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        StandardSaleProps standardSaleProps = this.localSizeSaleProp;
        if (standardSaleProps == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            standardSaleProps.writeToParcel(out, i);
        }
        List<SaleProp> list2 = this.saleProps;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((SaleProp) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        SkcInfo skcInfo = this.skcInfo;
        if (skcInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            skcInfo.writeToParcel(out, i);
        }
        List<SkuItem> list3 = this.skus;
        if (list3 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ3 = C279017q.LIZIZ(out, 1, list3);
            while (LIZIZ3.hasNext()) {
                ((SkuItem) LIZIZ3.next()).writeToParcel(out, i);
            }
        }
        List<ShopPolicy> list4 = this.shopPolicies;
        if (list4 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ4 = C279017q.LIZIZ(out, 1, list4);
            while (LIZIZ4.hasNext()) {
                ((ShopPolicy) LIZIZ4.next()).writeToParcel(out, i);
            }
        }
        UserRight userRight = this.userRight;
        if (userRight == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            userRight.writeToParcel(out, i);
        }
        UserRightTag userRightTag = this.freeReturn;
        if (userRightTag == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            userRightTag.writeToParcel(out, i);
        }
        SecurityInformation securityInformation = this.securityInformation;
        if (securityInformation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            securityInformation.writeToParcel(out, i);
        }
        LogisticDTO logisticDTO = this.logistic;
        if (logisticDTO == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticDTO.writeToParcel(out, i);
        }
        List<AdditionInfo> list5 = this.additionInfo;
        if (list5 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ5 = C279017q.LIZIZ(out, 1, list5);
            while (LIZIZ5.hasNext()) {
                ((AdditionInfo) LIZIZ5.next()).writeToParcel(out, i);
            }
        }
        WaistBanner waistBanner = this.waistBanner;
        if (waistBanner == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            waistBanner.writeToParcel(out, i);
        }
        VoucherInfo voucherInfo = this.voucherInfo;
        if (voucherInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            voucherInfo.writeToParcel(out, i);
        }
        Voucher voucher = this.outerVoucher;
        if (voucher == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            voucher.writeToParcel(out, i);
        }
        ModelCard modelCard = this.modelCard;
        if (modelCard == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            modelCard.writeToParcel(out, i);
        }
        ProductDetailReview productDetailReview = this.review;
        if (productDetailReview == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productDetailReview.writeToParcel(out, i);
        }
        ShopReviewEntry shopReviewEntry = this.shopReview;
        if (shopReviewEntry == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shopReviewEntry.writeToParcel(out, i);
        }
        FlashSale flashSale = this.flashSale;
        if (flashSale == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            flashSale.writeToParcel(out, i);
        }
        Integer num2 = this.productType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        List<ProductBannerLabel> list6 = this.productBannerLabel;
        if (list6 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ6 = C279017q.LIZIZ(out, 1, list6);
            while (LIZIZ6.hasNext()) {
                ((ProductBannerLabel) LIZIZ6.next()).writeToParcel(out, i);
            }
        }
        ThirdParty thirdParty = this.thirdPartyData;
        if (thirdParty == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            thirdParty.writeToParcel(out, i);
        }
        AddToCartButton addToCartButton = this.addToCartButton;
        if (addToCartButton == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addToCartButton.writeToParcel(out, i);
        }
        Creator creator = this.creator;
        if (creator == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            creator.writeToParcel(out, i);
        }
        out.writeParcelable(this.cartEntry, i);
        PickTag pickTag = this.activityInfo;
        if (pickTag == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pickTag.writeToParcel(out, i);
        }
        List<PromotionLogo> list7 = this.promotionLogos;
        if (list7 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ7 = C279017q.LIZIZ(out, 1, list7);
            while (LIZIZ7.hasNext()) {
                ((PromotionLogo) LIZIZ7.next()).writeToParcel(out, i);
            }
        }
        List<ProductLogo> list8 = this.productLogos;
        if (list8 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ8 = C279017q.LIZIZ(out, 1, list8);
            while (LIZIZ8.hasNext()) {
                ((ProductLogo) LIZIZ8.next()).writeToParcel(out, i);
            }
        }
        PopUp popUp = this.popUp;
        if (popUp == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            popUp.writeToParcel(out, i);
        }
        out.writeString(this.chainKey);
        out.writeParcelable(this.promotionView, i);
        HalfWaistBanner halfWaistBanner = this.halfWaistBanner;
        if (halfWaistBanner == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            halfWaistBanner.writeToParcel(out, i);
        }
        Boolean bool = this.hasShippingAddress;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.hasPayMethod;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        DynamicSchema dynamicSchema = this.schemaInfo;
        if (dynamicSchema == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dynamicSchema.writeToParcel(out, i);
        }
        Map<String, String> map = this.extra;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        BuyButton buyButton = this.buyButton;
        if (buyButton == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            buyButton.writeToParcel(out, i);
        }
        ProductUnavailableInfo productUnavailableInfo = this.productUnavailableInfo;
        if (productUnavailableInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productUnavailableInfo.writeToParcel(out, i);
        }
        ShareInfo shareInfo = this.shareInfo;
        if (shareInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shareInfo.writeToParcel(out, i);
        }
        List<StaticSellingPoint> list9 = this.staticSellingPoints;
        if (list9 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ9 = C279017q.LIZIZ(out, 1, list9);
            while (LIZIZ9.hasNext()) {
                ((StaticSellingPoint) LIZIZ9.next()).writeToParcel(out, i);
            }
        }
        RankInfo rankInfo = this.rankInfo;
        if (rankInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rankInfo.writeToParcel(out, i);
        }
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        if (preOrderInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            preOrderInfo.writeToParcel(out, i);
        }
        PromotionEntrance promotionEntrance = this.promotionEntrance;
        if (promotionEntrance == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            promotionEntrance.writeToParcel(out, i);
        }
        Integer num3 = this.template;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        MarketingConfig marketingConfig = this.marketingConfig;
        if (marketingConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            marketingConfig.writeToParcel(out, i);
        }
        List<PromotionDiscount> list10 = this.promotionDiscounts;
        if (list10 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ10 = C279017q.LIZIZ(out, 1, list10);
            while (LIZIZ10.hasNext()) {
                ((PromotionDiscount) LIZIZ10.next()).writeToParcel(out, i);
            }
        }
        List<BrickInfo> list11 = this.bricks;
        if (list11 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ11 = C279017q.LIZIZ(out, 1, list11);
            while (LIZIZ11.hasNext()) {
                ((BrickInfo) LIZIZ11.next()).writeToParcel(out, i);
            }
        }
        List<Tab> list12 = this.tabs;
        if (list12 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ12 = C279017q.LIZIZ(out, 1, list12);
            while (LIZIZ12.hasNext()) {
                ((Tab) LIZIZ12.next()).writeToParcel(out, i);
            }
        }
        ProductUnavailableInfo productUnavailableInfo2 = this.unavailableInfo;
        if (productUnavailableInfo2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productUnavailableInfo2.writeToParcel(out, i);
        }
        out.writeString(this.defaultAddressId);
        Integer num4 = this.favoriteStatus;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
        BlockPageInfo blockPageInfo = this.blockPageInfo;
        if (blockPageInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            blockPageInfo.writeToParcel(out, i);
        }
        List<Announcement> list13 = this.announcements;
        if (list13 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ13 = C279017q.LIZIZ(out, 1, list13);
            while (LIZIZ13.hasNext()) {
                ((Announcement) LIZIZ13.next()).writeToParcel(out, i);
            }
        }
        RecallBox recallBox = this.recallBox;
        if (recallBox == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            recallBox.writeToParcel(out, i);
        }
        SKUPanelBottomText sKUPanelBottomText = this.skuPanelBottomText;
        if (sKUPanelBottomText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sKUPanelBottomText.writeToParcel(out, i);
        }
        List<DelayOperation> list14 = this.delayOperation;
        if (list14 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ14 = C279017q.LIZIZ(out, 1, list14);
            while (LIZIZ14.hasNext()) {
                ((DelayOperation) LIZIZ14.next()).writeToParcel(out, i);
            }
        }
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        if (skuCommonConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            skuCommonConfig.writeToParcel(out, i);
        }
        out.writeString(this.daInfo);
        PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
        if (pDPLogisticModule == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pDPLogisticModule.writeToParcel(out, i);
        }
        PdpPaymentModule pdpPaymentModule = this.pdpPaymentModule;
        if (pdpPaymentModule == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pdpPaymentModule.writeToParcel(out, i);
        }
        UserRight userRight2 = this.returnPolicy;
        if (userRight2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            userRight2.writeToParcel(out, i);
        }
        WarehouseTag warehouseTag = this.warehouseTag;
        if (warehouseTag == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            warehouseTag.writeToParcel(out, i);
        }
        Boolean bool3 = this.withCoupon;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        Boolean bool4 = this.promotionReform;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
        Integer num5 = this.skuStyle;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num5);
        }
        BundleBrief bundleBrief = this.bundleBrief;
        if (bundleBrief == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bundleBrief.writeToParcel(out, i);
        }
        LazyLoadInfo lazyLoadInfo = this.lazyLoadInfo;
        if (lazyLoadInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lazyLoadInfo.writeToParcel(out, i);
        }
        PdpShipping pdpShipping = this.shipping;
        if (pdpShipping == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pdpShipping.writeToParcel(out, i);
        }
        out.writeString(this.billInfoParams);
        ProductProperty productProperty = this.productProps;
        if (productProperty == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productProperty.writeToParcel(out, i);
        }
        CodPolicy codPolicy = this.codPolicy;
        if (codPolicy == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            codPolicy.writeToParcel(out, i);
        }
        SelfOperatedPolicy selfOperatedPolicy = this.selfOperatedPolicy;
        if (selfOperatedPolicy == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            selfOperatedPolicy.writeToParcel(out, i);
        }
        Integer num6 = this.bottomNavBarStyle;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num6);
        }
        Integer num7 = this.bizType;
        if (num7 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num7);
        }
        Favorite favorite = this.favorite;
        if (favorite == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            favorite.writeToParcel(out, i);
        }
        PlatformPromotion platformPromotion = this.platformPromotion;
        if (platformPromotion == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            platformPromotion.writeToParcel(out, i);
        }
        GlobalWaistBanner globalWaistBanner = this.globalWaistBanner;
        if (globalWaistBanner == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            globalWaistBanner.writeToParcel(out, i);
        }
        SellerPromotion sellerPromotion = this.sellerPromotion;
        if (sellerPromotion == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sellerPromotion.writeToParcel(out, i);
        }
        PdpBottomArea pdpBottomArea = this.bottomArea;
        if (pdpBottomArea == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pdpBottomArea.writeToParcel(out, i);
        }
        PurchaseLimit purchaseLimit = this.purchaseLimit;
        if (purchaseLimit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            purchaseLimit.writeToParcel(out, i);
        }
        ConvenientSubmitOrder convenientSubmitOrder = this.convenientSubmitOrder;
        if (convenientSubmitOrder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            convenientSubmitOrder.writeToParcel(out, i);
        }
        out.writeString(this.sellerId);
    }

    public static ProductPackStruct LIZ(ProductPackStruct productPackStruct, SellerInfo sellerInfo, List list, FlashSale flashSale, AddToCartButton addToCartButton, List list2, Integer num, List list3, RecallBox recallBox, int i, int i2) {
        String str;
        Integer num2;
        SelfOperatedSloganInfo selfOperatedSloganInfo;
        ProductBase productBase;
        List<Video> list4;
        StandardSaleProps standardSaleProps;
        SkcInfo skcInfo;
        List<SkuItem> list5;
        List<ShopPolicy> list6;
        UserRight userRight;
        UserRightTag userRightTag;
        SecurityInformation securityInformation;
        LogisticDTO logisticDTO;
        List<AdditionInfo> list7;
        WaistBanner waistBanner;
        VoucherInfo voucherInfo;
        Voucher voucher;
        ModelCard modelCard;
        ProductDetailReview productDetailReview;
        ShopReviewEntry shopReviewEntry;
        Integer num3;
        List<ProductBannerLabel> list8;
        ThirdParty thirdParty;
        Creator creator;
        CartEntry cartEntry;
        PickTag pickTag;
        List<PromotionLogo> list9;
        List<ProductLogo> list10;
        PopUp popUp;
        String str2;
        PromotionView promotionView;
        HalfWaistBanner halfWaistBanner;
        Boolean bool;
        Boolean bool2;
        DynamicSchema dynamicSchema;
        Map<String, String> map;
        BuyButton buyButton;
        ProductUnavailableInfo productUnavailableInfo;
        ShareInfo shareInfo;
        List<StaticSellingPoint> list11;
        RankInfo rankInfo;
        PreOrderInfo preOrderInfo;
        PromotionEntrance promotionEntrance;
        Integer num4;
        MarketingConfig marketingConfig;
        int i3;
        List<PromotionDiscount> list12;
        int i4;
        List<Tab> list13;
        int i5;
        ProductUnavailableInfo productUnavailableInfo2;
        int i6;
        String str3;
        int i7;
        BlockPageInfo blockPageInfo;
        int i8;
        SKUPanelBottomText sKUPanelBottomText;
        List<DelayOperation> list14;
        SkuCommonConfig skuCommonConfig;
        String str4;
        PDPLogisticModule pDPLogisticModule;
        PdpPaymentModule pdpPaymentModule;
        RecallBox recallBox2 = recallBox;
        List list15 = list3;
        Integer num5 = num;
        SellerInfo sellerInfo2 = sellerInfo;
        FlashSale flashSale2 = flashSale;
        List list16 = list;
        AddToCartButton addToCartButton2 = addToCartButton;
        List list17 = list2;
        if ((i & 1) != 0) {
            str = productPackStruct.productId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            num2 = productPackStruct.status;
        } else {
            num2 = null;
        }
        if ((i & 4) != 0) {
            sellerInfo2 = productPackStruct.sellerInfo;
        }
        if ((i & 8) != 0) {
            selfOperatedSloganInfo = productPackStruct.selfOperatedSloganInfo;
        } else {
            selfOperatedSloganInfo = null;
        }
        if ((i & 16) != 0) {
            productBase = productPackStruct.baseInfo;
        } else {
            productBase = null;
        }
        if ((i & 32) != 0) {
            list4 = productPackStruct.creatorVideos;
        } else {
            list4 = null;
        }
        if ((i & 64) != 0) {
            standardSaleProps = productPackStruct.localSizeSaleProp;
        } else {
            standardSaleProps = null;
        }
        if ((i & 128) != 0) {
            list16 = productPackStruct.saleProps;
        }
        if ((i & 256) != 0) {
            skcInfo = productPackStruct.skcInfo;
        } else {
            skcInfo = null;
        }
        if ((i & 512) != 0) {
            list5 = productPackStruct.skus;
        } else {
            list5 = null;
        }
        if ((i & 1024) != 0) {
            list6 = productPackStruct.shopPolicies;
        } else {
            list6 = null;
        }
        if ((i & 2048) != 0) {
            userRight = productPackStruct.userRight;
        } else {
            userRight = null;
        }
        if ((i & 4096) != 0) {
            userRightTag = productPackStruct.freeReturn;
        } else {
            userRightTag = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            securityInformation = productPackStruct.securityInformation;
        } else {
            securityInformation = null;
        }
        if ((i & 16384) != 0) {
            logisticDTO = productPackStruct.logistic;
        } else {
            logisticDTO = null;
        }
        if ((i & 32768) != 0) {
            list7 = productPackStruct.additionInfo;
        } else {
            list7 = null;
        }
        if ((65536 & i) != 0) {
            waistBanner = productPackStruct.waistBanner;
        } else {
            waistBanner = null;
        }
        if ((i & 131072) != 0) {
            voucherInfo = productPackStruct.voucherInfo;
        } else {
            voucherInfo = null;
        }
        if ((262144 & i) != 0) {
            voucher = productPackStruct.outerVoucher;
        } else {
            voucher = null;
        }
        if ((524288 & i) != 0) {
            modelCard = productPackStruct.modelCard;
        } else {
            modelCard = null;
        }
        if ((1048576 & i) != 0) {
            productDetailReview = productPackStruct.review;
        } else {
            productDetailReview = null;
        }
        if ((2097152 & i) != 0) {
            shopReviewEntry = productPackStruct.shopReview;
        } else {
            shopReviewEntry = null;
        }
        if ((4194304 & i) != 0) {
            flashSale2 = productPackStruct.flashSale;
        }
        if ((8388608 & i) != 0) {
            num3 = productPackStruct.productType;
        } else {
            num3 = null;
        }
        if ((16777216 & i) != 0) {
            list8 = productPackStruct.productBannerLabel;
        } else {
            list8 = null;
        }
        if ((33554432 & i) != 0) {
            thirdParty = productPackStruct.thirdPartyData;
        } else {
            thirdParty = null;
        }
        if ((67108864 & i) != 0) {
            addToCartButton2 = productPackStruct.addToCartButton;
        }
        if ((134217728 & i) != 0) {
            creator = productPackStruct.creator;
        } else {
            creator = null;
        }
        if ((268435456 & i) != 0) {
            cartEntry = productPackStruct.cartEntry;
        } else {
            cartEntry = null;
        }
        if ((536870912 & i) != 0) {
            pickTag = productPackStruct.activityInfo;
        } else {
            pickTag = null;
        }
        if ((1073741824 & i) != 0) {
            list9 = productPackStruct.promotionLogos;
        } else {
            list9 = null;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            list10 = productPackStruct.productLogos;
        } else {
            list10 = null;
        }
        if ((i2 & 1) != 0) {
            popUp = productPackStruct.popUp;
        } else {
            popUp = null;
        }
        if ((i2 & 2) != 0) {
            str2 = productPackStruct.chainKey;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            promotionView = productPackStruct.promotionView;
        } else {
            promotionView = null;
        }
        if ((i2 & 8) != 0) {
            halfWaistBanner = productPackStruct.halfWaistBanner;
        } else {
            halfWaistBanner = null;
        }
        if ((i2 & 16) != 0) {
            bool = productPackStruct.hasShippingAddress;
        } else {
            bool = null;
        }
        if ((i2 & 32) != 0) {
            bool2 = productPackStruct.hasPayMethod;
        } else {
            bool2 = null;
        }
        if ((i2 & 64) != 0) {
            dynamicSchema = productPackStruct.schemaInfo;
        } else {
            dynamicSchema = null;
        }
        if ((i2 & 128) != 0) {
            map = productPackStruct.extra;
        } else {
            map = null;
        }
        if ((i2 & 256) != 0) {
            buyButton = productPackStruct.buyButton;
        } else {
            buyButton = null;
        }
        if ((i2 & 512) != 0) {
            productUnavailableInfo = productPackStruct.productUnavailableInfo;
        } else {
            productUnavailableInfo = null;
        }
        if ((i2 & 1024) != 0) {
            shareInfo = productPackStruct.shareInfo;
        } else {
            shareInfo = null;
        }
        if ((i2 & 2048) != 0) {
            list11 = productPackStruct.staticSellingPoints;
        } else {
            list11 = null;
        }
        if ((i2 & 4096) != 0) {
            rankInfo = productPackStruct.rankInfo;
        } else {
            rankInfo = null;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            preOrderInfo = productPackStruct.preOrderInfo;
        } else {
            preOrderInfo = null;
        }
        if ((i2 & 16384) != 0) {
            promotionEntrance = productPackStruct.promotionEntrance;
        } else {
            promotionEntrance = null;
        }
        if ((32768 & i2) != 0) {
            num4 = productPackStruct.template;
        } else {
            num4 = null;
        }
        if ((65536 & i2) != 0) {
            marketingConfig = productPackStruct.marketingConfig;
        } else {
            marketingConfig = null;
        }
        if ((i2 & 131072) != 0) {
            list12 = productPackStruct.promotionDiscounts;
            i3 = 262144;
        } else {
            i3 = 262144;
            list12 = null;
        }
        if ((i3 & i2) != 0) {
            list17 = productPackStruct.bricks;
        }
        if ((524288 & i2) != 0) {
            list13 = productPackStruct.tabs;
            i4 = 1048576;
        } else {
            i4 = 1048576;
            list13 = null;
        }
        if ((i4 & i2) != 0) {
            productUnavailableInfo2 = productPackStruct.unavailableInfo;
            i5 = 2097152;
        } else {
            i5 = 2097152;
            productUnavailableInfo2 = null;
        }
        if ((i5 & i2) != 0) {
            str3 = productPackStruct.defaultAddressId;
            i6 = 4194304;
        } else {
            i6 = 4194304;
            str3 = null;
        }
        if ((i6 & i2) != 0) {
            num5 = productPackStruct.favoriteStatus;
        }
        if ((8388608 & i2) != 0) {
            blockPageInfo = productPackStruct.blockPageInfo;
            i7 = 16777216;
        } else {
            i7 = 16777216;
            blockPageInfo = null;
        }
        if ((i7 & i2) != 0) {
            list15 = productPackStruct.announcements;
        }
        if ((33554432 & i2) != 0) {
            recallBox2 = productPackStruct.recallBox;
        }
        if ((67108864 & i2) != 0) {
            sKUPanelBottomText = productPackStruct.skuPanelBottomText;
            i8 = 134217728;
        } else {
            i8 = 134217728;
            sKUPanelBottomText = null;
        }
        if ((i8 & i2) != 0) {
            list14 = productPackStruct.delayOperation;
        } else {
            list14 = null;
        }
        if ((268435456 & i2) != 0) {
            skuCommonConfig = productPackStruct.skuCommonConfig;
        } else {
            skuCommonConfig = null;
        }
        if ((536870912 & i2) != 0) {
            str4 = productPackStruct.daInfo;
        } else {
            str4 = null;
        }
        if ((1073741824 & i2) != 0) {
            pDPLogisticModule = productPackStruct.pdpLogisticModule;
        } else {
            pDPLogisticModule = null;
        }
        if ((i2 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            pdpPaymentModule = productPackStruct.pdpPaymentModule;
        } else {
            pdpPaymentModule = null;
        }
        UserRight userRight2 = productPackStruct.returnPolicy;
        WarehouseTag warehouseTag = productPackStruct.warehouseTag;
        Boolean bool3 = productPackStruct.withCoupon;
        Boolean bool4 = productPackStruct.promotionReform;
        Integer num6 = productPackStruct.skuStyle;
        BundleBrief bundleBrief = productPackStruct.bundleBrief;
        LazyLoadInfo lazyLoadInfo = productPackStruct.lazyLoadInfo;
        PdpShipping pdpShipping = productPackStruct.shipping;
        String str5 = productPackStruct.billInfoParams;
        ProductProperty productProperty = productPackStruct.productProps;
        CodPolicy codPolicy = productPackStruct.codPolicy;
        SelfOperatedPolicy selfOperatedPolicy = productPackStruct.selfOperatedPolicy;
        Integer num7 = productPackStruct.bottomNavBarStyle;
        Integer num8 = productPackStruct.bizType;
        Favorite favorite = productPackStruct.favorite;
        PlatformPromotion platformPromotion = productPackStruct.platformPromotion;
        GlobalWaistBanner globalWaistBanner = productPackStruct.globalWaistBanner;
        SellerPromotion sellerPromotion = productPackStruct.sellerPromotion;
        PdpBottomArea pdpBottomArea = productPackStruct.bottomArea;
        PurchaseLimit purchaseLimit = productPackStruct.purchaseLimit;
        ConvenientSubmitOrder convenientSubmitOrder = productPackStruct.convenientSubmitOrder;
        String str6 = productPackStruct.sellerId;
        productPackStruct.getClass();
        return new ProductPackStruct(str, num2, sellerInfo2, selfOperatedSloganInfo, productBase, list4, standardSaleProps, list16, skcInfo, list5, list6, userRight, userRightTag, securityInformation, logisticDTO, list7, waistBanner, voucherInfo, voucher, modelCard, productDetailReview, shopReviewEntry, flashSale2, num3, list8, thirdParty, addToCartButton2, creator, cartEntry, pickTag, list9, list10, popUp, str2, promotionView, halfWaistBanner, bool, bool2, dynamicSchema, map, buyButton, productUnavailableInfo, shareInfo, list11, rankInfo, preOrderInfo, promotionEntrance, num4, marketingConfig, list12, list17, list13, productUnavailableInfo2, str3, num5, blockPageInfo, list15, recallBox2, sKUPanelBottomText, list14, skuCommonConfig, str4, pDPLogisticModule, pdpPaymentModule, userRight2, warehouseTag, bool3, bool4, num6, bundleBrief, lazyLoadInfo, pdpShipping, str5, productProperty, codPolicy, selfOperatedPolicy, num7, num8, favorite, platformPromotion, globalWaistBanner, sellerPromotion, pdpBottomArea, purchaseLimit, convenientSubmitOrder, str6);
    }

    public ProductPackStruct(String str, Integer num, SellerInfo sellerInfo, SelfOperatedSloganInfo selfOperatedSloganInfo, ProductBase productBase, List<Video> list, StandardSaleProps standardSaleProps, List<SaleProp> list2, SkcInfo skcInfo, List<SkuItem> list3, List<ShopPolicy> list4, UserRight userRight, UserRightTag userRightTag, SecurityInformation securityInformation, LogisticDTO logisticDTO, List<AdditionInfo> list5, WaistBanner waistBanner, VoucherInfo voucherInfo, Voucher voucher, ModelCard modelCard, ProductDetailReview productDetailReview, ShopReviewEntry shopReviewEntry, FlashSale flashSale, Integer num2, List<ProductBannerLabel> list6, ThirdParty thirdParty, AddToCartButton addToCartButton, Creator creator, CartEntry cartEntry, PickTag pickTag, List<PromotionLogo> list7, List<ProductLogo> list8, PopUp popUp, String str2, PromotionView promotionView, HalfWaistBanner halfWaistBanner, Boolean bool, Boolean bool2, DynamicSchema dynamicSchema, Map<String, String> map, BuyButton buyButton, ProductUnavailableInfo productUnavailableInfo, ShareInfo shareInfo, List<StaticSellingPoint> list9, RankInfo rankInfo, PreOrderInfo preOrderInfo, PromotionEntrance promotionEntrance, Integer num3, MarketingConfig marketingConfig, List<PromotionDiscount> list10, List<BrickInfo> list11, List<Tab> list12, ProductUnavailableInfo productUnavailableInfo2, String str3, Integer num4, BlockPageInfo blockPageInfo, List<Announcement> list13, RecallBox recallBox, SKUPanelBottomText sKUPanelBottomText, List<DelayOperation> list14, SkuCommonConfig skuCommonConfig, String str4, PDPLogisticModule pDPLogisticModule, PdpPaymentModule pdpPaymentModule, UserRight userRight2, WarehouseTag warehouseTag, Boolean bool3, Boolean bool4, Integer num5, BundleBrief bundleBrief, LazyLoadInfo lazyLoadInfo, PdpShipping pdpShipping, String str5, ProductProperty productProperty, CodPolicy codPolicy, SelfOperatedPolicy selfOperatedPolicy, Integer num6, Integer num7, Favorite favorite, PlatformPromotion platformPromotion, GlobalWaistBanner globalWaistBanner, SellerPromotion sellerPromotion, PdpBottomArea pdpBottomArea, PurchaseLimit purchaseLimit, ConvenientSubmitOrder convenientSubmitOrder, String str6) {
        this.productId = str;
        this.status = num;
        this.sellerInfo = sellerInfo;
        this.selfOperatedSloganInfo = selfOperatedSloganInfo;
        this.baseInfo = productBase;
        this.creatorVideos = list;
        this.localSizeSaleProp = standardSaleProps;
        this.saleProps = list2;
        this.skcInfo = skcInfo;
        this.skus = list3;
        this.shopPolicies = list4;
        this.userRight = userRight;
        this.freeReturn = userRightTag;
        this.securityInformation = securityInformation;
        this.logistic = logisticDTO;
        this.additionInfo = list5;
        this.waistBanner = waistBanner;
        this.voucherInfo = voucherInfo;
        this.outerVoucher = voucher;
        this.modelCard = modelCard;
        this.review = productDetailReview;
        this.shopReview = shopReviewEntry;
        this.flashSale = flashSale;
        this.productType = num2;
        this.productBannerLabel = list6;
        this.thirdPartyData = thirdParty;
        this.addToCartButton = addToCartButton;
        this.creator = creator;
        this.cartEntry = cartEntry;
        this.activityInfo = pickTag;
        this.promotionLogos = list7;
        this.productLogos = list8;
        this.popUp = popUp;
        this.chainKey = str2;
        this.promotionView = promotionView;
        this.halfWaistBanner = halfWaistBanner;
        this.hasShippingAddress = bool;
        this.hasPayMethod = bool2;
        this.schemaInfo = dynamicSchema;
        this.extra = map;
        this.buyButton = buyButton;
        this.productUnavailableInfo = productUnavailableInfo;
        this.shareInfo = shareInfo;
        this.staticSellingPoints = list9;
        this.rankInfo = rankInfo;
        this.preOrderInfo = preOrderInfo;
        this.promotionEntrance = promotionEntrance;
        this.template = num3;
        this.marketingConfig = marketingConfig;
        this.promotionDiscounts = list10;
        this.bricks = list11;
        this.tabs = list12;
        this.unavailableInfo = productUnavailableInfo2;
        this.defaultAddressId = str3;
        this.favoriteStatus = num4;
        this.blockPageInfo = blockPageInfo;
        this.announcements = list13;
        this.recallBox = recallBox;
        this.skuPanelBottomText = sKUPanelBottomText;
        this.delayOperation = list14;
        this.skuCommonConfig = skuCommonConfig;
        this.daInfo = str4;
        this.pdpLogisticModule = pDPLogisticModule;
        this.pdpPaymentModule = pdpPaymentModule;
        this.returnPolicy = userRight2;
        this.warehouseTag = warehouseTag;
        this.withCoupon = bool3;
        this.promotionReform = bool4;
        this.skuStyle = num5;
        this.bundleBrief = bundleBrief;
        this.lazyLoadInfo = lazyLoadInfo;
        this.shipping = pdpShipping;
        this.billInfoParams = str5;
        this.productProps = productProperty;
        this.codPolicy = codPolicy;
        this.selfOperatedPolicy = selfOperatedPolicy;
        this.bottomNavBarStyle = num6;
        this.bizType = num7;
        this.favorite = favorite;
        this.platformPromotion = platformPromotion;
        this.globalWaistBanner = globalWaistBanner;
        this.sellerPromotion = sellerPromotion;
        this.bottomArea = pdpBottomArea;
        this.purchaseLimit = purchaseLimit;
        this.convenientSubmitOrder = convenientSubmitOrder;
        this.sellerId = str6;
        this.lastUpdateTime = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ ProductPackStruct(String str, Integer num, SellerInfo sellerInfo, SelfOperatedSloganInfo selfOperatedSloganInfo, ProductBase productBase, List list, StandardSaleProps standardSaleProps, List list2, SkcInfo skcInfo, List list3, List list4, UserRight userRight, UserRightTag userRightTag, SecurityInformation securityInformation, LogisticDTO logisticDTO, List list5, WaistBanner waistBanner, VoucherInfo voucherInfo, Voucher voucher, ModelCard modelCard, ProductDetailReview productDetailReview, ShopReviewEntry shopReviewEntry, FlashSale flashSale, Integer num2, List list6, ThirdParty thirdParty, AddToCartButton addToCartButton, Creator creator, CartEntry cartEntry, PickTag pickTag, List list7, List list8, PopUp popUp, String str2, PromotionView promotionView, HalfWaistBanner halfWaistBanner, Boolean bool, Boolean bool2, DynamicSchema dynamicSchema, Map map, BuyButton buyButton, ProductUnavailableInfo productUnavailableInfo, ShareInfo shareInfo, List list9, RankInfo rankInfo, PreOrderInfo preOrderInfo, PromotionEntrance promotionEntrance, Integer num3, MarketingConfig marketingConfig, List list10, List list11, List list12, ProductUnavailableInfo productUnavailableInfo2, String str3, Integer num4, BlockPageInfo blockPageInfo, List list13, RecallBox recallBox, SKUPanelBottomText sKUPanelBottomText, List list14, SkuCommonConfig skuCommonConfig, String str4, PDPLogisticModule pDPLogisticModule, PdpPaymentModule pdpPaymentModule, UserRight userRight2, WarehouseTag warehouseTag, Boolean bool3, Boolean bool4, Integer num5, BundleBrief bundleBrief, LazyLoadInfo lazyLoadInfo, PdpShipping pdpShipping, String str5, ProductProperty productProperty, CodPolicy codPolicy, SelfOperatedPolicy selfOperatedPolicy, Integer num6, Integer num7, Favorite favorite, PlatformPromotion platformPromotion, GlobalWaistBanner globalWaistBanner, SellerPromotion sellerPromotion, PdpBottomArea pdpBottomArea, PurchaseLimit purchaseLimit, ConvenientSubmitOrder convenientSubmitOrder, String str6, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : sellerInfo, (i & 8) != 0 ? null : selfOperatedSloganInfo, (i & 16) != 0 ? null : productBase, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : standardSaleProps, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : skcInfo, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : list4, (i & 2048) != 0 ? null : userRight, (i & 4096) != 0 ? null : userRightTag, (i & FileUtils.BUFFER_SIZE) != 0 ? null : securityInformation, (i & 16384) != 0 ? null : logisticDTO, (i & 32768) != 0 ? null : list5, (i & 65536) != 0 ? null : waistBanner, (i & 131072) != 0 ? null : voucherInfo, (i & 262144) != 0 ? null : voucher, (i & 524288) != 0 ? null : modelCard, (i & 1048576) != 0 ? null : productDetailReview, (2097152 & i) != 0 ? null : shopReviewEntry, (4194304 & i) != 0 ? null : flashSale, (8388608 & i) != 0 ? null : num2, (16777216 & i) != 0 ? null : list6, (33554432 & i) != 0 ? null : thirdParty, (67108864 & i) != 0 ? null : addToCartButton, (134217728 & i) != 0 ? null : creator, (268435456 & i) != 0 ? null : cartEntry, (536870912 & i) != 0 ? null : pickTag, (1073741824 & i) != 0 ? null : list7, (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : list8, (i2 & 1) != 0 ? null : popUp, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : promotionView, (i2 & 8) != 0 ? null : halfWaistBanner, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : dynamicSchema, (i2 & 128) != 0 ? null : map, (i2 & 256) != 0 ? null : buyButton, (i2 & 512) != 0 ? null : productUnavailableInfo, (i2 & 1024) != 0 ? null : shareInfo, (i2 & 2048) != 0 ? null : list9, (i2 & 4096) != 0 ? null : rankInfo, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : preOrderInfo, (i2 & 16384) != 0 ? null : promotionEntrance, (i2 & 32768) != 0 ? 0 : num3, (i2 & 65536) != 0 ? null : marketingConfig, (i2 & 131072) != 0 ? null : list10, (i2 & 262144) != 0 ? null : list11, (i2 & 524288) != 0 ? null : list12, (i2 & 1048576) != 0 ? null : productUnavailableInfo2, (2097152 & i2) != 0 ? null : str3, (4194304 & i2) != 0 ? null : num4, (8388608 & i2) != 0 ? null : blockPageInfo, (16777216 & i2) != 0 ? null : list13, (33554432 & i2) != 0 ? null : recallBox, (67108864 & i2) != 0 ? null : sKUPanelBottomText, (134217728 & i2) != 0 ? null : list14, (268435456 & i2) != 0 ? null : skuCommonConfig, (536870912 & i2) != 0 ? null : str4, (1073741824 & i2) != 0 ? null : pDPLogisticModule, (i2 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : pdpPaymentModule, (i3 & 1) != 0 ? null : userRight2, (i3 & 2) != 0 ? null : warehouseTag, (i3 & 4) != 0 ? null : bool3, (i3 & 8) != 0 ? null : bool4, (i3 & 16) != 0 ? 1 : num5, (i3 & 32) != 0 ? null : bundleBrief, (i3 & 64) != 0 ? null : lazyLoadInfo, (i3 & 128) != 0 ? null : pdpShipping, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? null : productProperty, (i3 & 1024) != 0 ? null : codPolicy, (i3 & 2048) != 0 ? null : selfOperatedPolicy, (i3 & 4096) != 0 ? null : num6, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : num7, (i3 & 16384) != 0 ? null : favorite, (i3 & 32768) != 0 ? null : platformPromotion, (i3 & 65536) != 0 ? null : globalWaistBanner, (i3 & 131072) != 0 ? null : sellerPromotion, (i3 & 262144) != 0 ? null : pdpBottomArea, (i3 & 524288) != 0 ? null : purchaseLimit, (i3 & 1048576) != 0 ? null : convenientSubmitOrder, (i3 & 2097152) != 0 ? null : str6);
    }
}
