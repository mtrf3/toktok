package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1DF;
import X.C27739Aud;
import X.C27943Axv;
import X.C38350F3i;
import X.C70414RkI;
import X.C76800UCe;
import X.C77117UOj;
import X.FFL;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.RT2;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS0S1220100_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S1220100_12 aqS0S1220100_12, Object obj) {
        String str;
        int i;
        int i2;
        Float f;
        String str2;
        WarehouseTag warehouseTag;
        boolean z;
        String str3;
        String str4;
        PurchaseLimit purchaseLimit;
        PdpShipping pdpShipping;
        ShipFromInfo shipFromInfo;
        String str5;
        ProductBase productBase;
        Boolean bool;
        ProductUnavailableInfo productUnavailableInfo;
        Integer num;
        PromotionEntrance promotionEntrance;
        float f2;
        float f3;
        List<SkuItem> list;
        SkuItem skuItem;
        SkuPrice skuPrice;
        String str6;
        Float LJJIJLIJ;
        List<SkuItem> list2;
        SkuItem skuItem2;
        SkuPrice skuPrice2;
        Price price;
        String priceVal;
        Float LJJIJLIJ2;
        List<SkuItem> list3;
        SkuItem skuItem3;
        SkuPrice skuPrice3;
        Price price2;
        String currency;
        ShopReviewEntry shopReviewEntry;
        Integer num2;
        PreOrderInfo preOrderInfo;
        Integer num3;
        ProductDetailReview productDetailReview;
        Integer num4;
        Object obj2;
        Integer num5;
        LogisticDTO logisticDTO;
        LogisticTextDTO logisticTextDTO;
        String str7;
        String str8;
        WarehouseTag warehouseTag2;
        LogisticDTO logisticDTO2;
        Price price3;
        LogisticDTO logisticDTO3;
        Price price4;
        String priceVal2;
        LogisticDTO logisticDTO4;
        Integer num6;
        Integer num7;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS0S1220100_12.l1).LIZIZ);
        if (aqS0S1220100_12.z3) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        logNode.plusAssign("page_show_type", str);
        ProductPackStruct productPackStruct = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        boolean z2 = true;
        if (productPackStruct != null && (num7 = productPackStruct.status) != null) {
            i = num7.intValue();
        } else {
            i = 1;
        }
        logNode.plusAssign("product_type", String.valueOf(i));
        ProductPackStruct productPackStruct2 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct2 != null && (logisticDTO4 = productPackStruct2.logistic) != null && (num6 = logisticDTO4.deliveryOption) != null) {
            i2 = num6.intValue();
        } else {
            i2 = 0;
        }
        logNode.plusAssign("delivery_option", Integer.valueOf(i2));
        Object obj3 = aqS0S1220100_12.l2;
        if ((obj3 instanceof Long) && !o.LJ(obj3, -1L)) {
            logNode.put("start_click_to_now", Long.valueOf(aqS0S1220100_12.j5 - ((Number) aqS0S1220100_12.l2).longValue()));
        }
        ProductPackStruct productPackStruct3 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct3 != null && (logisticDTO3 = productPackStruct3.logistic) != null && (price4 = logisticDTO3.shippingFee) != null && (priceVal2 = price4.getPriceVal()) != null) {
            f = C38350F3i.LJJIJLIJ(priceVal2);
        } else {
            f = null;
        }
        ProductPackStruct productPackStruct4 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct4 != null && (logisticDTO2 = productPackStruct4.logistic) != null && (price3 = logisticDTO2.shippingFee) != null) {
            str2 = price3.getCurrency();
        } else {
            str2 = null;
        }
        if (f != null && str2 != null) {
            logNode.plusAssign("shipping_price", f);
            logNode.plusAssign("shipping_currency", str2);
        }
        ProductPackStruct productPackStruct5 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct5 != null) {
            warehouseTag = productPackStruct5.warehouseTag;
        } else {
            warehouseTag = null;
        }
        if (warehouseTag != null) {
            if (productPackStruct5 == null || (warehouseTag2 = productPackStruct5.warehouseTag) == null || (str8 = warehouseTag2.fulfilledBy) == null) {
                str8 = "";
            }
            logNode.plusAssign("fulfilled_by", str8);
        } else {
            logNode.plusAssign("fulfilled_by", "no_label");
        }
        ProductPackStruct productPackStruct6 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct6 != null && (logisticDTO = productPackStruct6.logistic) != null && (logisticTextDTO = logisticDTO.logisticText) != null && (str7 = logisticTextDTO.thresholdTextEn) != null) {
            logNode.plusAssign("free_shipping_condition", str7);
        }
        FFL.LJIIIZ().getClass();
        logNode.plusAssign("precise_exp", Integer.valueOf(FFL.LJIIJ(31744, 0, "enter_pdp_precise_exp", true)));
        ProductPackStruct productPackStruct7 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct7 == null || (num5 = productPackStruct7.status) == null || num5.intValue() != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            logNode.plusAssign("shopping_status", "product_not_available");
        } else {
            logNode.plusAssign("shopping_status", "product_available");
        }
        ProductPackStruct productPackStruct8 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct8 != null && productPackStruct8.codPolicy != null) {
            logNode.plusAssign("payment_service_info", "cod");
        }
        logNode.plusAssign("traceparent", aqS0S1220100_12.s0);
        logNode.withNotCheckParam("traceparent", aqS0S1220100_12.s0);
        ProductPackStruct productPackStruct9 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct9 != null) {
            str3 = productPackStruct9.daInfo;
        } else {
            str3 = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str3);
        if (LJII != null) {
            Object obj4 = LJII.get("user_type");
            if (obj4 != null) {
                logNode.plusAssign("user_type", obj4);
            }
            Object obj5 = LJII.get("logistics_request");
            if (obj5 != null) {
                logNode.plusAssign("logistics_request", obj5);
            }
            Object obj6 = LJII.get("open_stock_cnt");
            if (obj6 != null) {
                logNode.plusAssign("open_stock_cnt", obj6);
            }
            Object obj7 = LJII.get("marketing_stock_cnt");
            if (obj7 != null) {
                logNode.plusAssign("marketing_stock_cnt", obj7);
            }
        }
        ProductPackStruct productPackStruct10 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct10 != null) {
            str4 = productPackStruct10.daInfo;
        } else {
            str4 = null;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str4);
        if (LJII2 != null && (obj2 = LJII2.get("logo_type")) != null) {
            logNode.plusAssign("logo_type", obj2);
        }
        ProductPackStruct productPackStruct11 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct11 != null && (productDetailReview = productPackStruct11.review) != null && (num4 = productDetailReview.reviewCount) != null) {
            logNode.plusAssign("review_cnt", Integer.valueOf(num4.intValue()));
        }
        ProductPackStruct productPackStruct12 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct12 != null && (preOrderInfo = productPackStruct12.preOrderInfo) != null && (num3 = preOrderInfo.shippingDays) != null) {
            logNode.plusAssign("preorder_shipdays", Integer.valueOf(num3.intValue()));
        }
        ProductPackStruct productPackStruct13 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct13 != null && (shopReviewEntry = productPackStruct13.shopReview) != null && (num2 = shopReviewEntry.reviewCount) != null) {
            logNode.plusAssign("shop_review_cnt", Integer.valueOf(num2.intValue()));
        }
        ProductPackStruct productPackStruct14 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct14 != null && (list3 = productPackStruct14.skus) != null && (skuItem3 = (SkuItem) ORZ.LJLLLL(list3)) != null && (skuPrice3 = skuItem3.price) != null && (price2 = skuPrice3.realPrice) != null && (currency = price2.getCurrency()) != null) {
            logNode.plusAssign("currency", currency);
        }
        C70414RkI c70414RkI = (C70414RkI) aqS0S1220100_12.l1;
        if (c70414RkI.LJIILLIIL) {
            ProductPackStruct productPackStruct15 = c70414RkI.LJIIJJI;
            if (productPackStruct15 != null && (list2 = productPackStruct15.skus) != null && (skuItem2 = (SkuItem) ORZ.LJLLLL(list2)) != null && (skuPrice2 = skuItem2.price) != null && (price = skuPrice2.realPrice) != null && (priceVal = price.getPriceVal()) != null && (LJJIJLIJ2 = C38350F3i.LJJIJLIJ(priceVal)) != null) {
                f2 = LJJIJLIJ2.floatValue();
            } else {
                f2 = 0.0f;
            }
            ProductPackStruct productPackStruct16 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
            if (productPackStruct16 != null && (list = productPackStruct16.skus) != null && (skuItem = (SkuItem) ORZ.LJLLLL(list)) != null && (skuPrice = skuItem.price) != null && (str6 = skuPrice.originalPriceVal) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(str6)) != null) {
                f3 = LJJIJLIJ.floatValue();
            } else {
                f3 = f2;
            }
            logNode.plusAssign("sale_price_value", Float.valueOf(f2));
            logNode.plusAssign("original_price_value", Float.valueOf(f3));
        }
        logNode.plusAssign("is_with_coupon", Integer.valueOf(aqS0S1220100_12.z4 ? 1 : 0));
        C1DF.LIZLLL(((C70414RkI) aqS0S1220100_12.l1).LIZIZ, logNode);
        ((C70414RkI) aqS0S1220100_12.l1).LJII(logNode);
        ((C70414RkI) aqS0S1220100_12.l1).LIZJ(logNode);
        ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI(logNode);
        ((C70414RkI) aqS0S1220100_12.l1).LJIILIIL(logNode);
        HeaderBannerDaInfo LJJII = C77117UOj.LJJII(((C70414RkI) aqS0S1220100_12.l1).LJIIJJI);
        logNode.plusAssign("rights_cnt", Integer.valueOf(LJJII.rightsCnt));
        logNode.plusAssign("rights_content", LJJII.rightsContent);
        ((C70414RkI) aqS0S1220100_12.l1).LIZ(logNode);
        ProductPackStruct productPackStruct17 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct17 != null && (promotionEntrance = productPackStruct17.promotionEntrance) != null) {
            C70414RkI.LJIIIZ(logNode, promotionEntrance);
        }
        ProductPackStruct productPackStruct18 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct18 != null && (productUnavailableInfo = productPackStruct18.unavailableInfo) != null && (num = productUnavailableInfo.unavailableReason) != null) {
            logNode.plusAssign("unavailable_reason", Integer.valueOf(num.intValue()));
        }
        ProductPackStruct productPackStruct19 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct19 != null && (productBase = productPackStruct19.baseInfo) != null && (bool = productBase.isGift) != null) {
            logNode.plusAssign("is_gift", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct20 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct20 != null && (pdpShipping = productPackStruct20.shipping) != null && (shipFromInfo = pdpShipping.shipFromInfo) != null && (str5 = shipFromInfo.fromOverseas) != null && str5.length() != 0) {
            z2 = false;
        }
        if (z2) {
            logNode.plusAssign("ship_from", "local");
        } else {
            logNode.plusAssign("ship_from", "overseas");
        }
        RT2 rt2 = PurchaseLimit.Companion;
        ProductPackStruct productPackStruct21 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct21 != null) {
            purchaseLimit = productPackStruct21.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        rt2.getClass();
        logNode.plusAssign("is_new_user_discount_limit1", RT2.LIZ(purchaseLimit, null));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S1220100_12 aqS0S1220100_12, Object obj) {
        String str;
        int i;
        int i2;
        Float f;
        String str2;
        WarehouseTag warehouseTag;
        boolean z;
        String str3;
        String str4;
        PurchaseLimit purchaseLimit;
        PdpShipping pdpShipping;
        ShipFromInfo shipFromInfo;
        String str5;
        ProductBase productBase;
        Boolean bool;
        ProductUnavailableInfo productUnavailableInfo;
        Integer num;
        PromotionEntrance promotionEntrance;
        float f2;
        float f3;
        List<SkuItem> list;
        SkuItem skuItem;
        SkuPrice skuPrice;
        String str6;
        Float LJJIJLIJ;
        List<SkuItem> list2;
        SkuItem skuItem2;
        SkuPrice skuPrice2;
        Price price;
        String priceVal;
        Float LJJIJLIJ2;
        List<SkuItem> list3;
        SkuItem skuItem3;
        SkuPrice skuPrice3;
        Price price2;
        String currency;
        ShopReviewEntry shopReviewEntry;
        Integer num2;
        PreOrderInfo preOrderInfo;
        Integer num3;
        ProductDetailReview productDetailReview;
        Integer num4;
        Object obj2;
        Integer num5;
        LogisticDTO logisticDTO;
        LogisticTextDTO logisticTextDTO;
        String str7;
        String str8;
        WarehouseTag warehouseTag2;
        LogisticDTO logisticDTO2;
        Price price3;
        LogisticDTO logisticDTO3;
        Price price4;
        String priceVal2;
        LogisticDTO logisticDTO4;
        Integer num6;
        Integer num7;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS0S1220100_12.l1).LIZIZ);
        if (aqS0S1220100_12.z3) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        sendLogReturnParams.LIZJ("page_show_type", str);
        ProductPackStruct productPackStruct = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        boolean z2 = true;
        if (productPackStruct != null && (num7 = productPackStruct.status) != null) {
            i = num7.intValue();
        } else {
            i = 1;
        }
        sendLogReturnParams.LIZJ("product_type", String.valueOf(i));
        ProductPackStruct productPackStruct2 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct2 != null && (logisticDTO4 = productPackStruct2.logistic) != null && (num6 = logisticDTO4.deliveryOption) != null) {
            i2 = num6.intValue();
        } else {
            i2 = 0;
        }
        sendLogReturnParams.LIZJ("delivery_option", Integer.valueOf(i2));
        Object obj3 = aqS0S1220100_12.l2;
        if ((obj3 instanceof Long) && !o.LJ(obj3, -1L)) {
            sendLogReturnParams.LIZLLL("start_click_to_now", Long.valueOf(aqS0S1220100_12.j5 - ((Number) aqS0S1220100_12.l2).longValue()));
        }
        ProductPackStruct productPackStruct3 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct3 != null && (logisticDTO3 = productPackStruct3.logistic) != null && (price4 = logisticDTO3.shippingFee) != null && (priceVal2 = price4.getPriceVal()) != null) {
            f = C38350F3i.LJJIJLIJ(priceVal2);
        } else {
            f = null;
        }
        ProductPackStruct productPackStruct4 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct4 != null && (logisticDTO2 = productPackStruct4.logistic) != null && (price3 = logisticDTO2.shippingFee) != null) {
            str2 = price3.getCurrency();
        } else {
            str2 = null;
        }
        if (f != null && str2 != null) {
            sendLogReturnParams.LIZJ("shipping_price", f);
            sendLogReturnParams.LIZJ("shipping_currency", str2);
        }
        ProductPackStruct productPackStruct5 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct5 != null) {
            warehouseTag = productPackStruct5.warehouseTag;
        } else {
            warehouseTag = null;
        }
        if (warehouseTag != null) {
            if (productPackStruct5 == null || (warehouseTag2 = productPackStruct5.warehouseTag) == null || (str8 = warehouseTag2.fulfilledBy) == null) {
                str8 = "";
            }
            sendLogReturnParams.LIZJ("fulfilled_by", str8);
        } else {
            sendLogReturnParams.LIZJ("fulfilled_by", "no_label");
        }
        ProductPackStruct productPackStruct6 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct6 != null && (logisticDTO = productPackStruct6.logistic) != null && (logisticTextDTO = logisticDTO.logisticText) != null && (str7 = logisticTextDTO.thresholdTextEn) != null) {
            sendLogReturnParams.LIZJ("free_shipping_condition", str7);
        }
        FFL.LJIIIZ().getClass();
        sendLogReturnParams.LIZJ("precise_exp", Integer.valueOf(FFL.LJIIJ(31744, 0, "enter_pdp_precise_exp", true)));
        ProductPackStruct productPackStruct7 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct7 == null || (num5 = productPackStruct7.status) == null || num5.intValue() != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            sendLogReturnParams.LIZJ("shopping_status", "product_not_available");
        } else {
            sendLogReturnParams.LIZJ("shopping_status", "product_available");
        }
        ProductPackStruct productPackStruct8 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct8 != null && productPackStruct8.codPolicy != null) {
            sendLogReturnParams.LIZJ("payment_service_info", "cod");
        }
        sendLogReturnParams.LIZJ("traceparent", aqS0S1220100_12.s0);
        ProductPackStruct productPackStruct9 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct9 != null) {
            str3 = productPackStruct9.daInfo;
        } else {
            str3 = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str3);
        if (LJII != null) {
            Object obj4 = LJII.get("user_type");
            if (obj4 != null) {
                sendLogReturnParams.LIZJ("user_type", obj4);
            }
            Object obj5 = LJII.get("logistics_request");
            if (obj5 != null) {
                sendLogReturnParams.LIZJ("logistics_request", obj5);
            }
            Object obj6 = LJII.get("open_stock_cnt");
            if (obj6 != null) {
                sendLogReturnParams.LIZJ("open_stock_cnt", obj6);
            }
            Object obj7 = LJII.get("marketing_stock_cnt");
            if (obj7 != null) {
                sendLogReturnParams.LIZJ("marketing_stock_cnt", obj7);
            }
        }
        ProductPackStruct productPackStruct10 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct10 != null) {
            str4 = productPackStruct10.daInfo;
        } else {
            str4 = null;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str4);
        if (LJII2 != null && (obj2 = LJII2.get("logo_type")) != null) {
            sendLogReturnParams.LIZJ("logo_type", obj2);
        }
        ProductPackStruct productPackStruct11 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct11 != null && (productDetailReview = productPackStruct11.review) != null && (num4 = productDetailReview.reviewCount) != null) {
            sendLogReturnParams.LIZJ("review_cnt", Integer.valueOf(num4.intValue()));
        }
        ProductPackStruct productPackStruct12 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct12 != null && (preOrderInfo = productPackStruct12.preOrderInfo) != null && (num3 = preOrderInfo.shippingDays) != null) {
            sendLogReturnParams.LIZJ("preorder_shipdays", Integer.valueOf(num3.intValue()));
        }
        ProductPackStruct productPackStruct13 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct13 != null && (shopReviewEntry = productPackStruct13.shopReview) != null && (num2 = shopReviewEntry.reviewCount) != null) {
            sendLogReturnParams.LIZJ("shop_review_cnt", Integer.valueOf(num2.intValue()));
        }
        ProductPackStruct productPackStruct14 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct14 != null && (list3 = productPackStruct14.skus) != null && (skuItem3 = (SkuItem) ORZ.LJLLLL(list3)) != null && (skuPrice3 = skuItem3.price) != null && (price2 = skuPrice3.realPrice) != null && (currency = price2.getCurrency()) != null) {
            sendLogReturnParams.LIZJ("currency", currency);
        }
        C70414RkI c70414RkI = (C70414RkI) aqS0S1220100_12.l1;
        if (c70414RkI.LJIILLIIL) {
            ProductPackStruct productPackStruct15 = c70414RkI.LJIIJJI;
            if (productPackStruct15 != null && (list2 = productPackStruct15.skus) != null && (skuItem2 = (SkuItem) ORZ.LJLLLL(list2)) != null && (skuPrice2 = skuItem2.price) != null && (price = skuPrice2.realPrice) != null && (priceVal = price.getPriceVal()) != null && (LJJIJLIJ2 = C38350F3i.LJJIJLIJ(priceVal)) != null) {
                f2 = LJJIJLIJ2.floatValue();
            } else {
                f2 = 0.0f;
            }
            ProductPackStruct productPackStruct16 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
            if (productPackStruct16 != null && (list = productPackStruct16.skus) != null && (skuItem = (SkuItem) ORZ.LJLLLL(list)) != null && (skuPrice = skuItem.price) != null && (str6 = skuPrice.originalPriceVal) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(str6)) != null) {
                f3 = LJJIJLIJ.floatValue();
            } else {
                f3 = f2;
            }
            sendLogReturnParams.LIZJ("sale_price_value", Float.valueOf(f2));
            sendLogReturnParams.LIZJ("original_price_value", Float.valueOf(f3));
        }
        sendLogReturnParams.LIZJ("is_with_coupon", Integer.valueOf(aqS0S1220100_12.z4 ? 1 : 0));
        C1DF.LIZJ(((C70414RkI) aqS0S1220100_12.l1).LIZIZ, false, sendLogReturnParams, false, null);
        ((C70414RkI) aqS0S1220100_12.l1).LJIIIIZZ(sendLogReturnParams);
        ((C70414RkI) aqS0S1220100_12.l1).LIZLLL(sendLogReturnParams);
        ((C70414RkI) aqS0S1220100_12.l1).LJIIL(sendLogReturnParams);
        ((C70414RkI) aqS0S1220100_12.l1).LJIILJJIL(sendLogReturnParams);
        HeaderBannerDaInfo LJJII = C77117UOj.LJJII(((C70414RkI) aqS0S1220100_12.l1).LJIIJJI);
        sendLogReturnParams.LIZJ("rights_cnt", Integer.valueOf(LJJII.rightsCnt));
        sendLogReturnParams.LIZJ("rights_content", LJJII.rightsContent);
        ((C70414RkI) aqS0S1220100_12.l1).LIZIZ(sendLogReturnParams);
        C70414RkI c70414RkI2 = (C70414RkI) aqS0S1220100_12.l1;
        ProductPackStruct productPackStruct17 = c70414RkI2.LJIIJJI;
        if (productPackStruct17 != null && (promotionEntrance = productPackStruct17.promotionEntrance) != null) {
            c70414RkI2.LJIIJ(sendLogReturnParams, promotionEntrance);
        }
        ProductPackStruct productPackStruct18 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct18 != null && (productUnavailableInfo = productPackStruct18.unavailableInfo) != null && (num = productUnavailableInfo.unavailableReason) != null) {
            sendLogReturnParams.LIZJ("unavailable_reason", Integer.valueOf(num.intValue()));
        }
        ProductPackStruct productPackStruct19 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct19 != null && (productBase = productPackStruct19.baseInfo) != null && (bool = productBase.isGift) != null) {
            sendLogReturnParams.LIZJ("is_gift", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct20 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct20 != null && (pdpShipping = productPackStruct20.shipping) != null && (shipFromInfo = pdpShipping.shipFromInfo) != null && (str5 = shipFromInfo.fromOverseas) != null && str5.length() != 0) {
            z2 = false;
        }
        if (z2) {
            sendLogReturnParams.LIZJ("ship_from", "local");
        } else {
            sendLogReturnParams.LIZJ("ship_from", "overseas");
        }
        RT2 rt2 = PurchaseLimit.Companion;
        ProductPackStruct productPackStruct21 = ((C70414RkI) aqS0S1220100_12.l1).LJIIJJI;
        if (productPackStruct21 != null) {
            purchaseLimit = productPackStruct21.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        rt2.getClass();
        sendLogReturnParams.LIZJ("is_new_user_discount_limit1", RT2.LIZ(purchaseLimit, null));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1220100_12(C70414RkI c70414RkI, boolean z, Object obj, long j, String str, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70414RkI;
        this.z3 = z;
        this.l2 = obj;
        this.j5 = j;
        this.s0 = str;
        this.z4 = z2;
    }
}
