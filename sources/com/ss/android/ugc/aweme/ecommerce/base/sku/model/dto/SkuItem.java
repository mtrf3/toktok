package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C07670Rv;
import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.C38350F3i;
import X.C69686RWo;
import X.InterfaceC65349Pkn;
import X.RWC;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuItem implements Parcelable {

    @InterfaceC65349Pkn("add_to_cart_button")
    public final AddToCartButton addToCartButton;

    @InterfaceC65349Pkn("pdp_button_area_id")
    public final String bottomAreaId;

    @InterfaceC65349Pkn("buy_button")
    public final BuyButton buyButton;

    @InterfaceC65349Pkn("click_hint")
    public final String clickHint;

    @InterfaceC65349Pkn("deduction_text")
    public final String deductionText;

    @InterfaceC65349Pkn("default_add_cart_quantity")
    public final Integer defaultAddCartQuantity;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("low_stock_warning")
    public final String lowStockWarning;

    @InterfaceC65349Pkn("minimum_buy_quantity")
    public final Integer minBuyQuantity;

    @InterfaceC65349Pkn("need_icon")
    public final Boolean needIcon;

    @InterfaceC65349Pkn("platform_promotion_id")
    public final String platformPromotionId;

    @InterfaceC65349Pkn("pre_order_info")
    public final PreOrderInfo preOrderInfo;

    @InterfaceC65349Pkn("price")
    public final SkuPrice price;

    @InterfaceC65349Pkn("promotion_key_list")
    public final List<String> promotionKeyList;

    @InterfaceC65349Pkn("promotion_limit_quantity")
    public final Integer promotionLimitQuantity;

    @InterfaceC65349Pkn("promotion_view")
    public final PromotionView promotionView;

    @InterfaceC65349Pkn("purchase_limit")
    public final Integer purchaseLimit;

    @InterfaceC65349Pkn("purchase_notice")
    public final PurchaseNotice purchaseNotice;

    @InterfaceC65349Pkn("quantity_minus_support_edit")
    public final Boolean quantityMinusSupportEdit;

    @InterfaceC65349Pkn("sale_prop_value_ids")
    public final String salePropValueIds;

    @InterfaceC65349Pkn("seller_promotion_id_list")
    public final List<String> sellerPromotionIds;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("quantity_property")
    public final SkuQuantityProperty skuQuantityProperty;

    @InterfaceC65349Pkn("sku_sale_props")
    public final List<SkuSaleProp> skuSalePropList;

    @InterfaceC65349Pkn("status")
    public final Integer skuStatus;

    @InterfaceC65349Pkn("stock")
    public final Integer stockNum;

    @InterfaceC65349Pkn("unavailable_info_id")
    public final Integer unavailableInfoId;

    @InterfaceC65349Pkn("voucher_info")
    public final SkuVoucher voucherInfo;

    @InterfaceC65349Pkn("exposed_voucher_type_ids")
    public final List<String> voucherTypeIds;

    @InterfaceC65349Pkn("warehouse_id")
    public String warehouseId;
    public static final C69686RWo Companion = new C69686RWo();
    public static final Parcelable.Creator<SkuItem> CREATOR = new RWC();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuItem)) {
            return false;
        }
        SkuItem skuItem = (SkuItem) obj;
        return o.LJ(this.skuId, skuItem.skuId) && o.LJ(this.skuSalePropList, skuItem.skuSalePropList) && o.LJ(this.salePropValueIds, skuItem.salePropValueIds) && o.LJ(this.stockNum, skuItem.stockNum) && o.LJ(this.lowStockWarning, skuItem.lowStockWarning) && o.LJ(this.purchaseLimit, skuItem.purchaseLimit) && o.LJ(this.price, skuItem.price) && o.LJ(this.needIcon, skuItem.needIcon) && o.LJ(this.voucherInfo, skuItem.voucherInfo) && o.LJ(this.warehouseId, skuItem.warehouseId) && o.LJ(this.addToCartButton, skuItem.addToCartButton) && o.LJ(this.purchaseNotice, skuItem.purchaseNotice) && o.LJ(this.promotionView, skuItem.promotionView) && o.LJ(this.defaultAddCartQuantity, skuItem.defaultAddCartQuantity) && o.LJ(this.quantityMinusSupportEdit, skuItem.quantityMinusSupportEdit) && o.LJ(this.buyButton, skuItem.buyButton) && o.LJ(this.skuQuantityProperty, skuItem.skuQuantityProperty) && o.LJ(this.minBuyQuantity, skuItem.minBuyQuantity) && o.LJ(this.promotionLimitQuantity, skuItem.promotionLimitQuantity) && o.LJ(this.link, skuItem.link) && o.LJ(this.preOrderInfo, skuItem.preOrderInfo) && o.LJ(this.promotionKeyList, skuItem.promotionKeyList) && o.LJ(this.deductionText, skuItem.deductionText) && o.LJ(this.skuStatus, skuItem.skuStatus) && o.LJ(this.unavailableInfoId, skuItem.unavailableInfoId) && o.LJ(this.voucherTypeIds, skuItem.voucherTypeIds) && o.LJ(this.platformPromotionId, skuItem.platformPromotionId) && o.LJ(this.sellerPromotionIds, skuItem.sellerPromotionIds) && o.LJ(this.bottomAreaId, skuItem.bottomAreaId) && o.LJ(this.clickHint, skuItem.clickHint);
    }

    public final int hashCode() {
        String str = this.skuId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SkuSaleProp> list = this.skuSalePropList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.salePropValueIds;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.stockNum;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.lowStockWarning;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.purchaseLimit;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        SkuPrice skuPrice = this.price;
        int hashCode7 = (hashCode6 + (skuPrice == null ? 0 : skuPrice.hashCode())) * 31;
        Boolean bool = this.needIcon;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        SkuVoucher skuVoucher = this.voucherInfo;
        int hashCode9 = (hashCode8 + (skuVoucher == null ? 0 : skuVoucher.hashCode())) * 31;
        String str4 = this.warehouseId;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        int hashCode11 = (hashCode10 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        int hashCode12 = (hashCode11 + (purchaseNotice == null ? 0 : purchaseNotice.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int hashCode13 = (hashCode12 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        Integer num3 = this.defaultAddCartQuantity;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.quantityMinusSupportEdit;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BuyButton buyButton = this.buyButton;
        int hashCode16 = (hashCode15 + (buyButton == null ? 0 : buyButton.hashCode())) * 31;
        SkuQuantityProperty skuQuantityProperty = this.skuQuantityProperty;
        int hashCode17 = (hashCode16 + (skuQuantityProperty == null ? 0 : skuQuantityProperty.hashCode())) * 31;
        Integer num4 = this.minBuyQuantity;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.promotionLimitQuantity;
        int hashCode19 = (hashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str5 = this.link;
        int hashCode20 = (hashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        int hashCode21 = (hashCode20 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        List<String> list2 = this.promotionKeyList;
        int hashCode22 = (hashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.deductionText;
        int hashCode23 = (hashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num6 = this.skuStatus;
        int hashCode24 = (hashCode23 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.unavailableInfoId;
        int hashCode25 = (hashCode24 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List<String> list3 = this.voucherTypeIds;
        int hashCode26 = (hashCode25 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str7 = this.platformPromotionId;
        int hashCode27 = (hashCode26 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list4 = this.sellerPromotionIds;
        int hashCode28 = (hashCode27 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.bottomAreaId;
        int hashCode29 = (hashCode28 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.clickHint;
        return hashCode29 + (str9 != null ? str9.hashCode() : 0);
    }

    public final Float LIZ() {
        String str;
        SkuPrice skuPrice = this.price;
        if (skuPrice != null && (str = skuPrice.originalPriceVal) != null) {
            return C38350F3i.LJJIJLIJ(str);
        }
        return null;
    }

    public final Float LIZIZ() {
        Price price;
        String priceVal;
        SkuPrice skuPrice = this.price;
        if (skuPrice != null && (price = skuPrice.realPrice) != null && (priceVal = price.getPriceVal()) != null) {
            return C38350F3i.LJJIJLIJ(priceVal);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkuItem(skuId=");
        sb.append(this.skuId);
        sb.append(", skuSalePropList=");
        sb.append(this.skuSalePropList);
        sb.append(", salePropValueIds=");
        sb.append(this.salePropValueIds);
        sb.append(", stockNum=");
        sb.append(this.stockNum);
        sb.append(", lowStockWarning=");
        sb.append(this.lowStockWarning);
        sb.append(", purchaseLimit=");
        sb.append(this.purchaseLimit);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", needIcon=");
        sb.append(this.needIcon);
        sb.append(", voucherInfo=");
        sb.append(this.voucherInfo);
        sb.append(", warehouseId=");
        sb.append(this.warehouseId);
        sb.append(", addToCartButton=");
        sb.append(this.addToCartButton);
        sb.append(", purchaseNotice=");
        sb.append(this.purchaseNotice);
        sb.append(", promotionView=");
        sb.append(this.promotionView);
        sb.append(", defaultAddCartQuantity=");
        sb.append(this.defaultAddCartQuantity);
        sb.append(", quantityMinusSupportEdit=");
        sb.append(this.quantityMinusSupportEdit);
        sb.append(", buyButton=");
        sb.append(this.buyButton);
        sb.append(", skuQuantityProperty=");
        sb.append(this.skuQuantityProperty);
        sb.append(", minBuyQuantity=");
        sb.append(this.minBuyQuantity);
        sb.append(", promotionLimitQuantity=");
        sb.append(this.promotionLimitQuantity);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", preOrderInfo=");
        sb.append(this.preOrderInfo);
        sb.append(", promotionKeyList=");
        sb.append(this.promotionKeyList);
        sb.append(", deductionText=");
        sb.append(this.deductionText);
        sb.append(", skuStatus=");
        sb.append(this.skuStatus);
        sb.append(", unavailableInfoId=");
        sb.append(this.unavailableInfoId);
        sb.append(", voucherTypeIds=");
        sb.append(this.voucherTypeIds);
        sb.append(", platformPromotionId=");
        sb.append(this.platformPromotionId);
        sb.append(", sellerPromotionIds=");
        sb.append(this.sellerPromotionIds);
        sb.append(", bottomAreaId=");
        sb.append(this.bottomAreaId);
        sb.append(", clickHint=");
        return C07670Rv.LIZIZ(sb, this.clickHint, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.skuId);
        List<SkuSaleProp> list = this.skuSalePropList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((SkuSaleProp) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.salePropValueIds);
        Integer num = this.stockNum;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.lowStockWarning);
        Integer num2 = this.purchaseLimit;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        SkuPrice skuPrice = this.price;
        if (skuPrice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            skuPrice.writeToParcel(out, i);
        }
        Boolean bool = this.needIcon;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        SkuVoucher skuVoucher = this.voucherInfo;
        if (skuVoucher == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            skuVoucher.writeToParcel(out, i);
        }
        out.writeString(this.warehouseId);
        AddToCartButton addToCartButton = this.addToCartButton;
        if (addToCartButton == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addToCartButton.writeToParcel(out, i);
        }
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        if (purchaseNotice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            purchaseNotice.writeToParcel(out, i);
        }
        out.writeParcelable(this.promotionView, i);
        Integer num3 = this.defaultAddCartQuantity;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Boolean bool2 = this.quantityMinusSupportEdit;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        BuyButton buyButton = this.buyButton;
        if (buyButton == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            buyButton.writeToParcel(out, i);
        }
        SkuQuantityProperty skuQuantityProperty = this.skuQuantityProperty;
        if (skuQuantityProperty == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            skuQuantityProperty.writeToParcel(out, i);
        }
        Integer num4 = this.minBuyQuantity;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
        Integer num5 = this.promotionLimitQuantity;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num5);
        }
        out.writeString(this.link);
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        if (preOrderInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            preOrderInfo.writeToParcel(out, i);
        }
        out.writeStringList(this.promotionKeyList);
        out.writeString(this.deductionText);
        Integer num6 = this.skuStatus;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num6);
        }
        Integer num7 = this.unavailableInfoId;
        if (num7 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num7);
        }
        out.writeStringList(this.voucherTypeIds);
        out.writeString(this.platformPromotionId);
        out.writeStringList(this.sellerPromotionIds);
        out.writeString(this.bottomAreaId);
        out.writeString(this.clickHint);
    }

    public SkuItem(String str, List<SkuSaleProp> list, String str2, Integer num, String str3, Integer num2, SkuPrice skuPrice, Boolean bool, SkuVoucher skuVoucher, String str4, AddToCartButton addToCartButton, PurchaseNotice purchaseNotice, PromotionView promotionView, Integer num3, Boolean bool2, BuyButton buyButton, SkuQuantityProperty skuQuantityProperty, Integer num4, Integer num5, String str5, PreOrderInfo preOrderInfo, List<String> list2, String str6, Integer num6, Integer num7, List<String> list3, String str7, List<String> list4, String str8, String str9) {
        this.skuId = str;
        this.skuSalePropList = list;
        this.salePropValueIds = str2;
        this.stockNum = num;
        this.lowStockWarning = str3;
        this.purchaseLimit = num2;
        this.price = skuPrice;
        this.needIcon = bool;
        this.voucherInfo = skuVoucher;
        this.warehouseId = str4;
        this.addToCartButton = addToCartButton;
        this.purchaseNotice = purchaseNotice;
        this.promotionView = promotionView;
        this.defaultAddCartQuantity = num3;
        this.quantityMinusSupportEdit = bool2;
        this.buyButton = buyButton;
        this.skuQuantityProperty = skuQuantityProperty;
        this.minBuyQuantity = num4;
        this.promotionLimitQuantity = num5;
        this.link = str5;
        this.preOrderInfo = preOrderInfo;
        this.promotionKeyList = list2;
        this.deductionText = str6;
        this.skuStatus = num6;
        this.unavailableInfoId = num7;
        this.voucherTypeIds = list3;
        this.platformPromotionId = str7;
        this.sellerPromotionIds = list4;
        this.bottomAreaId = str8;
        this.clickHint = str9;
    }
}
