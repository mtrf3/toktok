package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27739Aud;
import X.C27943Axv;
import X.C47261Igj;
import X.C70414RkI;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.RT2;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleTotalPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes13.dex */
public class AqS0S2460100_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j12;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public boolean z10;
    public boolean z11;
    public boolean z6;
    public boolean z7;
    public boolean z8;
    public boolean z9;

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

    public static final Object invoke$0(AqS0S2460100_12 aqS0S2460100_12, Object obj) {
        String str;
        int i;
        int i2;
        int i3;
        boolean z;
        String str2;
        String str3;
        PurchaseLimit purchaseLimit;
        PdpShipping pdpShipping;
        ShipFromInfo shipFromInfo;
        String str4;
        ProductBase productBase;
        Boolean bool;
        ProductUnavailableInfo productUnavailableInfo;
        Integer num;
        BundleTotalPrice bundleTotalPrice;
        String str5;
        String str6;
        ShopReviewEntry shopReviewEntry;
        Integer num2;
        ProductDetailReview productDetailReview;
        Integer num3;
        Object obj2;
        LogisticDTO logisticDTO;
        LogisticTextDTO logisticTextDTO;
        String str7;
        Integer num4;
        LogisticDTO logisticDTO2;
        Integer num5;
        Integer num6;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS0S2460100_12.l2).LIZIZ);
        if (aqS0S2460100_12.z6) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        logNode.plusAssign("page_show_type", str);
        ProductPackStruct productPackStruct = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        boolean z2 = true;
        if (productPackStruct != null && (num6 = productPackStruct.status) != null) {
            i = num6.intValue();
        } else {
            i = 1;
        }
        logNode.plusAssign("product_type", String.valueOf(i));
        ((C70414RkI) aqS0S2460100_12.l2).LJII(logNode);
        logNode.plusAssign("sku_photo_view_cnt", Integer.valueOf(((C70414RkI) aqS0S2460100_12.l2).LJII.size()));
        logNode.plusAssign("main_photo_view_cnt", Integer.valueOf(((C70414RkI) aqS0S2460100_12.l2).LJI.size()));
        logNode.plusAssign("stay_time", Long.valueOf(aqS0S2460100_12.j12));
        logNode.plusAssign("quit_type", ((C70414RkI) aqS0S2460100_12.l2).LJJ);
        logNode.plusAssign("is_sku_selected", Integer.valueOf(aqS0S2460100_12.z7 ? 1 : 0));
        logNode.plusAssign("is_add_cart", Integer.valueOf(aqS0S2460100_12.z8 ? 1 : 0));
        logNode.plusAssign("is_collection_clicked", Integer.valueOf(aqS0S2460100_12.z9 ? 1 : 0));
        logNode.plusAssign("is_image_clicked", Integer.valueOf(((C70414RkI) aqS0S2460100_12.l2).LJIIIIZZ ? 1 : 0));
        logNode.plusAssign("is_seller_store_entered", Integer.valueOf(((C70414RkI) aqS0S2460100_12.l2).LJIIL ? 1 : 0));
        if (((C70414RkI) aqS0S2460100_12.l2).LJIIJJI != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        logNode.plusAssign("is_load_data", Integer.valueOf(i2));
        logNode.plusAssign("is_address_deliverable", Integer.valueOf(aqS0S2460100_12.z10 ? 1 : 0));
        ProductPackStruct productPackStruct2 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct2 != null && (logisticDTO2 = productPackStruct2.logistic) != null && (num5 = logisticDTO2.deliveryOption) != null) {
            i3 = num5.intValue();
        } else {
            i3 = 0;
        }
        logNode.plusAssign("delivery_option", Integer.valueOf(i3));
        ProductPackStruct productPackStruct3 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct3 == null || (num4 = productPackStruct3.status) == null || num4.intValue() != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            logNode.plusAssign("shopping_status", "product_not_available");
        } else {
            logNode.plusAssign("shopping_status", "product_available");
        }
        ProductPackStruct productPackStruct4 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct4 != null && productPackStruct4.codPolicy != null) {
            logNode.plusAssign("payment_service_info", "cod");
        }
        Float f = (Float) aqS0S2460100_12.l3;
        if (f != null && aqS0S2460100_12.s0 != null) {
            logNode.plusAssign("shipping_price", f);
            logNode.plusAssign("shipping_currency", aqS0S2460100_12.s0);
        }
        ((C70414RkI) aqS0S2460100_12.l2).LIZJ(logNode);
        ProductPackStruct productPackStruct5 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct5 != null && (logisticDTO = productPackStruct5.logistic) != null && (logisticTextDTO = logisticDTO.logisticText) != null && (str7 = logisticTextDTO.thresholdTextEn) != null) {
            logNode.plusAssign("free_shipping_condition", str7);
        }
        ProductPackStruct productPackStruct6 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct6 != null) {
            str2 = productPackStruct6.daInfo;
        } else {
            str2 = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str2);
        if (LJII != null) {
            Object obj3 = LJII.get("logistics_request");
            if (obj3 != null) {
                logNode.plusAssign("logistics_request", obj3);
            }
            Object obj4 = LJII.get("open_stock_cnt");
            if (obj4 != null) {
                logNode.plusAssign("open_stock_cnt", obj4);
            }
            Object obj5 = LJII.get("marketing_stock_cnt");
            if (obj5 != null) {
                logNode.plusAssign("marketing_stock_cnt", obj5);
            }
        }
        ProductPackStruct productPackStruct7 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct7 != null) {
            str3 = productPackStruct7.daInfo;
        } else {
            str3 = null;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str3);
        if (LJII2 != null && (obj2 = LJII2.get("logo_type")) != null) {
            logNode.plusAssign("logo_type", obj2);
        }
        logNode.plusAssign("traceparent", aqS0S2460100_12.s1);
        logNode.withNotCheckParam("traceparent", aqS0S2460100_12.s1);
        logNode.plusAssign("is_with_coupon", Integer.valueOf(aqS0S2460100_12.z11 ? 1 : 0));
        ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI(logNode);
        ((C70414RkI) aqS0S2460100_12.l2).LIZ(logNode);
        C70414RkI c70414RkI = (C70414RkI) aqS0S2460100_12.l2;
        Set set = (Set) aqS0S2460100_12.l4;
        c70414RkI.getClass();
        StringBuilder sb = new StringBuilder();
        if (set != null) {
            int i4 = 0;
            for (Object obj6 : set) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    String str8 = (String) obj6;
                    if (i4 == 0) {
                        sb.append(str8);
                    } else {
                        sb.append(",");
                        sb.append(str8);
                    }
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        logNode.plusAssign("selling_points_shown", sb.toString());
        ProductPackStruct productPackStruct8 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct8 != null && (productDetailReview = productPackStruct8.review) != null && (num3 = productDetailReview.reviewCount) != null) {
            logNode.plusAssign("review_cnt", Integer.valueOf(num3.intValue()));
        }
        ProductPackStruct productPackStruct9 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct9 != null && (shopReviewEntry = productPackStruct9.shopReview) != null && (num2 = shopReviewEntry.reviewCount) != null) {
            logNode.plusAssign("shop_review_cnt", Integer.valueOf(num2.intValue()));
        }
        BundleInfo bundleInfo = (BundleInfo) aqS0S2460100_12.l5;
        if (bundleInfo != null && (str6 = bundleInfo.bundleId) != null) {
            logNode.plusAssign("bundle_id", str6);
        }
        BundleInfo bundleInfo2 = (BundleInfo) aqS0S2460100_12.l5;
        if (bundleInfo2 != null && (bundleTotalPrice = bundleInfo2.totalPrice) != null) {
            String str9 = bundleTotalPrice.activityId;
            if (str9 == null || str9.length() == 0) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str5 = "1";
            }
            logNode.plusAssign("is_discounted_bundle_deal", str5);
        }
        ProductPackStruct productPackStruct10 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct10 != null && (productUnavailableInfo = productPackStruct10.unavailableInfo) != null && (num = productUnavailableInfo.unavailableReason) != null) {
            logNode.plusAssign("unavailable_reason", Integer.valueOf(num.intValue()));
        }
        ProductPackStruct productPackStruct11 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct11 != null && (productBase = productPackStruct11.baseInfo) != null && (bool = productBase.isGift) != null) {
            logNode.plusAssign("is_gift", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct12 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct12 != null && (pdpShipping = productPackStruct12.shipping) != null && (shipFromInfo = pdpShipping.shipFromInfo) != null && (str4 = shipFromInfo.fromOverseas) != null && str4.length() != 0) {
            z2 = false;
        }
        if (z2) {
            logNode.plusAssign("ship_from", "local");
        } else {
            logNode.plusAssign("ship_from", "overseas");
        }
        RT2 rt2 = PurchaseLimit.Companion;
        ProductPackStruct productPackStruct13 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct13 != null) {
            purchaseLimit = productPackStruct13.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        rt2.getClass();
        logNode.plusAssign("is_new_user_discount_limit1", RT2.LIZ(purchaseLimit, null));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2460100_12 aqS0S2460100_12, Object obj) {
        String str;
        int i;
        int i2;
        int i3;
        boolean z;
        String str2;
        String str3;
        PurchaseLimit purchaseLimit;
        PdpShipping pdpShipping;
        ShipFromInfo shipFromInfo;
        String str4;
        ProductBase productBase;
        Boolean bool;
        ProductUnavailableInfo productUnavailableInfo;
        Integer num;
        BundleTotalPrice bundleTotalPrice;
        String str5;
        String str6;
        ShopReviewEntry shopReviewEntry;
        Integer num2;
        ProductDetailReview productDetailReview;
        Integer num3;
        Object obj2;
        LogisticDTO logisticDTO;
        LogisticTextDTO logisticTextDTO;
        String str7;
        Integer num4;
        LogisticDTO logisticDTO2;
        Integer num5;
        Integer num6;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS0S2460100_12.l2).LIZIZ);
        if (aqS0S2460100_12.z6) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        sendLogReturnParams.LIZJ("page_show_type", str);
        ProductPackStruct productPackStruct = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        boolean z2 = true;
        if (productPackStruct != null && (num6 = productPackStruct.status) != null) {
            i = num6.intValue();
        } else {
            i = 1;
        }
        sendLogReturnParams.LIZJ("product_type", String.valueOf(i));
        ((C70414RkI) aqS0S2460100_12.l2).LJIIIIZZ(sendLogReturnParams);
        sendLogReturnParams.LIZJ("sku_photo_view_cnt", Integer.valueOf(((C70414RkI) aqS0S2460100_12.l2).LJII.size()));
        sendLogReturnParams.LIZJ("main_photo_view_cnt", Integer.valueOf(((C70414RkI) aqS0S2460100_12.l2).LJI.size()));
        sendLogReturnParams.LIZJ("stay_time", Long.valueOf(aqS0S2460100_12.j12));
        sendLogReturnParams.LIZJ("quit_type", ((C70414RkI) aqS0S2460100_12.l2).LJJ);
        sendLogReturnParams.LIZJ("is_sku_selected", Integer.valueOf(aqS0S2460100_12.z7 ? 1 : 0));
        sendLogReturnParams.LIZJ("is_add_cart", Integer.valueOf(aqS0S2460100_12.z8 ? 1 : 0));
        sendLogReturnParams.LIZJ("is_collection_clicked", Integer.valueOf(aqS0S2460100_12.z9 ? 1 : 0));
        sendLogReturnParams.LIZJ("is_image_clicked", Integer.valueOf(((C70414RkI) aqS0S2460100_12.l2).LJIIIIZZ ? 1 : 0));
        sendLogReturnParams.LIZJ("is_seller_store_entered", Integer.valueOf(((C70414RkI) aqS0S2460100_12.l2).LJIIL ? 1 : 0));
        if (((C70414RkI) aqS0S2460100_12.l2).LJIIJJI != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        sendLogReturnParams.LIZJ("is_load_data", Integer.valueOf(i2));
        sendLogReturnParams.LIZJ("is_address_deliverable", Integer.valueOf(aqS0S2460100_12.z10 ? 1 : 0));
        ProductPackStruct productPackStruct2 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct2 != null && (logisticDTO2 = productPackStruct2.logistic) != null && (num5 = logisticDTO2.deliveryOption) != null) {
            i3 = num5.intValue();
        } else {
            i3 = 0;
        }
        sendLogReturnParams.LIZJ("delivery_option", Integer.valueOf(i3));
        ProductPackStruct productPackStruct3 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct3 == null || (num4 = productPackStruct3.status) == null || num4.intValue() != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            sendLogReturnParams.LIZJ("shopping_status", "product_not_available");
        } else {
            sendLogReturnParams.LIZJ("shopping_status", "product_available");
        }
        ProductPackStruct productPackStruct4 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct4 != null && productPackStruct4.codPolicy != null) {
            sendLogReturnParams.LIZJ("payment_service_info", "cod");
        }
        Float f = (Float) aqS0S2460100_12.l3;
        if (f != null && aqS0S2460100_12.s0 != null) {
            sendLogReturnParams.LIZJ("shipping_price", f);
            sendLogReturnParams.LIZJ("shipping_currency", aqS0S2460100_12.s0);
        }
        ((C70414RkI) aqS0S2460100_12.l2).LIZLLL(sendLogReturnParams);
        ProductPackStruct productPackStruct5 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct5 != null && (logisticDTO = productPackStruct5.logistic) != null && (logisticTextDTO = logisticDTO.logisticText) != null && (str7 = logisticTextDTO.thresholdTextEn) != null) {
            sendLogReturnParams.LIZJ("free_shipping_condition", str7);
        }
        ProductPackStruct productPackStruct6 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct6 != null) {
            str2 = productPackStruct6.daInfo;
        } else {
            str2 = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str2);
        if (LJII != null) {
            Object obj3 = LJII.get("logistics_request");
            if (obj3 != null) {
                sendLogReturnParams.LIZJ("logistics_request", obj3);
            }
            Object obj4 = LJII.get("open_stock_cnt");
            if (obj4 != null) {
                sendLogReturnParams.LIZJ("open_stock_cnt", obj4);
            }
            Object obj5 = LJII.get("marketing_stock_cnt");
            if (obj5 != null) {
                sendLogReturnParams.LIZJ("marketing_stock_cnt", obj5);
            }
        }
        ProductPackStruct productPackStruct7 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct7 != null) {
            str3 = productPackStruct7.daInfo;
        } else {
            str3 = null;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str3);
        if (LJII2 != null && (obj2 = LJII2.get("logo_type")) != null) {
            sendLogReturnParams.LIZJ("logo_type", obj2);
        }
        sendLogReturnParams.LIZJ("traceparent", aqS0S2460100_12.s1);
        sendLogReturnParams.LIZJ("is_with_coupon", Integer.valueOf(aqS0S2460100_12.z11 ? 1 : 0));
        ((C70414RkI) aqS0S2460100_12.l2).LJIIL(sendLogReturnParams);
        ((C70414RkI) aqS0S2460100_12.l2).LIZIZ(sendLogReturnParams);
        C70414RkI c70414RkI = (C70414RkI) aqS0S2460100_12.l2;
        Set set = (Set) aqS0S2460100_12.l4;
        c70414RkI.getClass();
        StringBuilder sb = new StringBuilder();
        if (set != null) {
            int i4 = 0;
            for (Object obj6 : set) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    String str8 = (String) obj6;
                    if (i4 == 0) {
                        sb.append(str8);
                    } else {
                        sb.append(",");
                        sb.append(str8);
                    }
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        sendLogReturnParams.LIZJ("selling_points_shown", sb.toString());
        ProductPackStruct productPackStruct8 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct8 != null && (productDetailReview = productPackStruct8.review) != null && (num3 = productDetailReview.reviewCount) != null) {
            sendLogReturnParams.LIZJ("review_cnt", Integer.valueOf(num3.intValue()));
        }
        ProductPackStruct productPackStruct9 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct9 != null && (shopReviewEntry = productPackStruct9.shopReview) != null && (num2 = shopReviewEntry.reviewCount) != null) {
            sendLogReturnParams.LIZJ("shop_review_cnt", Integer.valueOf(num2.intValue()));
        }
        BundleInfo bundleInfo = (BundleInfo) aqS0S2460100_12.l5;
        if (bundleInfo != null && (str6 = bundleInfo.bundleId) != null) {
            sendLogReturnParams.LIZJ("bundle_id", str6);
        }
        BundleInfo bundleInfo2 = (BundleInfo) aqS0S2460100_12.l5;
        if (bundleInfo2 != null && (bundleTotalPrice = bundleInfo2.totalPrice) != null) {
            String str9 = bundleTotalPrice.activityId;
            if (str9 == null || str9.length() == 0) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str5 = "1";
            }
            sendLogReturnParams.LIZJ("is_discounted_bundle_deal", str5);
        }
        ProductPackStruct productPackStruct10 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct10 != null && (productUnavailableInfo = productPackStruct10.unavailableInfo) != null && (num = productUnavailableInfo.unavailableReason) != null) {
            sendLogReturnParams.LIZJ("unavailable_reason", Integer.valueOf(num.intValue()));
        }
        ProductPackStruct productPackStruct11 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct11 != null && (productBase = productPackStruct11.baseInfo) != null && (bool = productBase.isGift) != null) {
            sendLogReturnParams.LIZJ("is_gift", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct12 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct12 != null && (pdpShipping = productPackStruct12.shipping) != null && (shipFromInfo = pdpShipping.shipFromInfo) != null && (str4 = shipFromInfo.fromOverseas) != null && str4.length() != 0) {
            z2 = false;
        }
        if (z2) {
            sendLogReturnParams.LIZJ("ship_from", "local");
        } else {
            sendLogReturnParams.LIZJ("ship_from", "overseas");
        }
        RT2 rt2 = PurchaseLimit.Companion;
        ProductPackStruct productPackStruct13 = ((C70414RkI) aqS0S2460100_12.l2).LJIIJJI;
        if (productPackStruct13 != null) {
            purchaseLimit = productPackStruct13.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        rt2.getClass();
        sendLogReturnParams.LIZJ("is_new_user_discount_limit1", RT2.LIZ(purchaseLimit, null));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000b: IPUT (r7 I:boolean), (r1 I:kotlin.jvm.internal.AqS0S2460100_12) (LINE:234881035) kotlin.jvm.internal.AqS0S2460100_12.z7 boolean, block:B:1:0x0000 */
    public AqS0S2460100_12(C70414RkI c70414RkI, C70414RkI c70414RkI2, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, Float f, String str, String str2, boolean z6, Set<String> set, BundleInfo bundleInfo) {
        super(1);
        boolean z7;
        this.$t = bundleInfo;
        this.l2 = c70414RkI;
        this.z6 = c70414RkI2;
        this.j12 = z ? 1L : 0L;
        this.z7 = z7;
        this.z8 = z2;
        this.z9 = z3;
        this.z10 = z4;
        this.l3 = z5;
        this.s0 = f;
        this.s1 = str;
        this.z11 = str2;
        this.l4 = z6;
        this.l5 = set;
    }
}
