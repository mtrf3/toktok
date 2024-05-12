package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PlatformPromotion {

    @InterfaceC65349Pkn("bonus_info")
    public final BonusInfo bonusInfo;

    @InterfaceC65349Pkn("coupon_schema")
    public final String couponSchema;

    @InterfaceC65349Pkn("coupon_status")
    public final String couponStatus;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("discount_back")
    public final DiscountBackInfo discountBack;

    @InterfaceC65349Pkn("discount_brief")
    public final List<PromotionDiscountBrief> discountBrief;

    @InterfaceC65349Pkn("first_screen_banner_text")
    public final String firstScreenBannerText;

    @InterfaceC65349Pkn("highlight_promotion")
    public final HighLightPromotionInfo highlightPromotion;

    @InterfaceC65349Pkn("order_promotion_cache_key")
    public final String orderPromotionCacheKey;

    @InterfaceC65349Pkn("platform_discount")
    public final String platformDiscount;

    @InterfaceC65349Pkn("promotion_banner")
    public final PromotionBanner promotionBanner;

    @InterfaceC65349Pkn("promotion_tag_style")
    public final PromotionTagStyle promotionTagStyle;

    @InterfaceC65349Pkn("promotion_tag_text")
    public final String promotionTagText;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("unused_coupon_count")
    public final Integer unusedCouponCount;

    @InterfaceC65349Pkn("voucher_selected_info")
    public final List<VoucherInfoNew> voucherSelectedInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformPromotion)) {
            return false;
        }
        PlatformPromotion platformPromotion = (PlatformPromotion) obj;
        return o.LJ(this.couponStatus, platformPromotion.couponStatus) && o.LJ(this.orderPromotionCacheKey, platformPromotion.orderPromotionCacheKey) && o.LJ(this.platformDiscount, platformPromotion.platformDiscount) && o.LJ(this.voucherSelectedInfo, platformPromotion.voucherSelectedInfo) && o.LJ(this.couponSchema, platformPromotion.couponSchema) && o.LJ(this.discountBack, platformPromotion.discountBack) && o.LJ(this.title, platformPromotion.title) && o.LJ(this.unusedCouponCount, platformPromotion.unusedCouponCount) && o.LJ(this.promotionTagText, platformPromotion.promotionTagText) && o.LJ(this.firstScreenBannerText, platformPromotion.firstScreenBannerText) && o.LJ(this.highlightPromotion, platformPromotion.highlightPromotion) && o.LJ(this.discountBrief, platformPromotion.discountBrief) && o.LJ(this.bonusInfo, platformPromotion.bonusInfo) && o.LJ(this.daInfo, platformPromotion.daInfo) && o.LJ(this.promotionBanner, platformPromotion.promotionBanner) && this.promotionTagStyle == platformPromotion.promotionTagStyle;
    }

    public final int hashCode() {
        String str = this.couponStatus;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderPromotionCacheKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platformDiscount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<VoucherInfoNew> list = this.voucherSelectedInfo;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.couponSchema;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DiscountBackInfo discountBackInfo = this.discountBack;
        int hashCode6 = (hashCode5 + (discountBackInfo == null ? 0 : discountBackInfo.hashCode())) * 31;
        String str5 = this.title;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.unusedCouponCount;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.promotionTagText;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstScreenBannerText;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        HighLightPromotionInfo highLightPromotionInfo = this.highlightPromotion;
        int hashCode11 = (hashCode10 + (highLightPromotionInfo == null ? 0 : highLightPromotionInfo.hashCode())) * 31;
        List<PromotionDiscountBrief> list2 = this.discountBrief;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BonusInfo bonusInfo = this.bonusInfo;
        int hashCode13 = (hashCode12 + (bonusInfo == null ? 0 : bonusInfo.hashCode())) * 31;
        String str8 = this.daInfo;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        PromotionBanner promotionBanner = this.promotionBanner;
        int hashCode15 = (hashCode14 + (promotionBanner == null ? 0 : promotionBanner.hashCode())) * 31;
        PromotionTagStyle promotionTagStyle = this.promotionTagStyle;
        return hashCode15 + (promotionTagStyle != null ? promotionTagStyle.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformPromotion(couponStatus=" + this.couponStatus + ", orderPromotionCacheKey=" + this.orderPromotionCacheKey + ", platformDiscount=" + this.platformDiscount + ", voucherSelectedInfo=" + this.voucherSelectedInfo + ", couponSchema=" + this.couponSchema + ", discountBack=" + this.discountBack + ", title=" + this.title + ", unusedCouponCount=" + this.unusedCouponCount + ", promotionTagText=" + this.promotionTagText + ", firstScreenBannerText=" + this.firstScreenBannerText + ", highlightPromotion=" + this.highlightPromotion + ", discountBrief=" + this.discountBrief + ", bonusInfo=" + this.bonusInfo + ", daInfo=" + this.daInfo + ", promotionBanner=" + this.promotionBanner + ", promotionTagStyle=" + this.promotionTagStyle + ')';
    }

    public PlatformPromotion(String str, String str2, String str3, List<VoucherInfoNew> list, String str4, DiscountBackInfo discountBackInfo, String str5, Integer num, String str6, String str7, HighLightPromotionInfo highLightPromotionInfo, List<PromotionDiscountBrief> list2, BonusInfo bonusInfo, String str8, PromotionBanner promotionBanner, PromotionTagStyle promotionTagStyle) {
        this.couponStatus = str;
        this.orderPromotionCacheKey = str2;
        this.platformDiscount = str3;
        this.voucherSelectedInfo = list;
        this.couponSchema = str4;
        this.discountBack = discountBackInfo;
        this.title = str5;
        this.unusedCouponCount = num;
        this.promotionTagText = str6;
        this.firstScreenBannerText = str7;
        this.highlightPromotion = highLightPromotionInfo;
        this.discountBrief = list2;
        this.bonusInfo = bonusInfo;
        this.daInfo = str8;
        this.promotionBanner = promotionBanner;
        this.promotionTagStyle = promotionTagStyle;
    }
}
