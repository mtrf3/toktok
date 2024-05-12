package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopOrderNew {

    @InterfaceC65349Pkn("banner_promotion_activity")
    public final ShopPromotionActivity bannerPromotionActivity;

    @InterfaceC65349Pkn("coupon_schema")
    public final String couponSchema;

    @InterfaceC65349Pkn("expand_all_items_text")
    public final String expandAllTitle;

    @InterfaceC65349Pkn("item_text")
    public final String itemText;

    @InterfaceC65349Pkn("main_order_infos")
    public List<MainOrderInfo> mainOrderInfos;

    @InterfaceC65349Pkn("phone_credit")
    public PhoneCredit phoneCredit;

    @InterfaceC65349Pkn("product_type")
    public Integer productType;

    @InterfaceC65349Pkn("seller")
    public final SellerInfo seller;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("seller_text")
    public final String sellerText;

    @InterfaceC65349Pkn("shop_bill")
    public final ShopBill shopBill;

    @InterfaceC65349Pkn("starling_texts")
    public final ShopOrderStarling shopOrderStarling;

    @InterfaceC65349Pkn("shop_promotion_cache_key")
    public final String shopPromotionCacheKey;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("voucher_selected_info")
    public final List<VoucherInfoNew> voucherSelectedInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderNew)) {
            return false;
        }
        ShopOrderNew shopOrderNew = (ShopOrderNew) obj;
        return o.LJ(this.seller, shopOrderNew.seller) && o.LJ(this.sellerId, shopOrderNew.sellerId) && o.LJ(this.shopBill, shopOrderNew.shopBill) && o.LJ(this.bannerPromotionActivity, shopOrderNew.bannerPromotionActivity) && o.LJ(this.shopPromotionCacheKey, shopOrderNew.shopPromotionCacheKey) && o.LJ(this.mainOrderInfos, shopOrderNew.mainOrderInfos) && o.LJ(this.voucherSelectedInfo, shopOrderNew.voucherSelectedInfo) && o.LJ(this.productType, shopOrderNew.productType) && o.LJ(this.phoneCredit, shopOrderNew.phoneCredit) && o.LJ(this.couponSchema, shopOrderNew.couponSchema) && o.LJ(this.title, shopOrderNew.title) && o.LJ(this.expandAllTitle, shopOrderNew.expandAllTitle) && o.LJ(this.sellerText, shopOrderNew.sellerText) && o.LJ(this.itemText, shopOrderNew.itemText) && o.LJ(this.shopOrderStarling, shopOrderNew.shopOrderStarling);
    }

    public final int hashCode() {
        SellerInfo sellerInfo = this.seller;
        int hashCode = (sellerInfo == null ? 0 : sellerInfo.hashCode()) * 31;
        String str = this.sellerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ShopBill shopBill = this.shopBill;
        int hashCode3 = (hashCode2 + (shopBill == null ? 0 : shopBill.hashCode())) * 31;
        ShopPromotionActivity shopPromotionActivity = this.bannerPromotionActivity;
        int hashCode4 = (hashCode3 + (shopPromotionActivity == null ? 0 : shopPromotionActivity.hashCode())) * 31;
        String str2 = this.shopPromotionCacheKey;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MainOrderInfo> list = this.mainOrderInfos;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<VoucherInfoNew> list2 = this.voucherSelectedInfo;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.productType;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        PhoneCredit phoneCredit = this.phoneCredit;
        int hashCode9 = (hashCode8 + (phoneCredit == null ? 0 : phoneCredit.hashCode())) * 31;
        String str3 = this.couponSchema;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expandAllTitle;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sellerText;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.itemText;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ShopOrderStarling shopOrderStarling = this.shopOrderStarling;
        return hashCode14 + (shopOrderStarling != null ? shopOrderStarling.hashCode() : 0);
    }

    public final String toString() {
        return "ShopOrderNew(seller=" + this.seller + ", sellerId=" + this.sellerId + ", shopBill=" + this.shopBill + ", bannerPromotionActivity=" + this.bannerPromotionActivity + ", shopPromotionCacheKey=" + this.shopPromotionCacheKey + ", mainOrderInfos=" + this.mainOrderInfos + ", voucherSelectedInfo=" + this.voucherSelectedInfo + ", productType=" + this.productType + ", phoneCredit=" + this.phoneCredit + ", couponSchema=" + this.couponSchema + ", title=" + this.title + ", expandAllTitle=" + this.expandAllTitle + ", sellerText=" + this.sellerText + ", itemText=" + this.itemText + ", shopOrderStarling=" + this.shopOrderStarling + ')';
    }

    public ShopOrderNew(SellerInfo sellerInfo, String str, ShopBill shopBill, ShopPromotionActivity shopPromotionActivity, String str2, List<MainOrderInfo> list, List<VoucherInfoNew> list2, Integer num, PhoneCredit phoneCredit, String str3, String str4, String str5, String str6, String str7, ShopOrderStarling shopOrderStarling) {
        this.seller = sellerInfo;
        this.sellerId = str;
        this.shopBill = shopBill;
        this.bannerPromotionActivity = shopPromotionActivity;
        this.shopPromotionCacheKey = str2;
        this.mainOrderInfos = list;
        this.voucherSelectedInfo = list2;
        this.productType = num;
        this.phoneCredit = phoneCredit;
        this.couponSchema = str3;
        this.title = str4;
        this.expandAllTitle = str5;
        this.sellerText = str6;
        this.itemText = str7;
        this.shopOrderStarling = shopOrderStarling;
    }
}
