package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLH {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(BP7.LJLIL);

    public static void LIZ(java.util.Map map) {
        for (Map.Entry entry : ((java.util.Map) LIZ.getValue()).entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static String LIZIZ(int i, String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(str2);
        LIZ2.append('_');
        LIZ2.append(i);
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZJ(VSAProductCardsResponse.ProductCard productCard, java.util.Map trackParams, OL6 clickArea, boolean z) {
        List<VSAProductCardsResponse.ProductDetail> productDetailList;
        VSAProductCardsResponse.ProductDetail productDetail;
        OLI oli;
        o.LJIIIZ(trackParams, "trackParams");
        o.LJIIIZ(clickArea, "clickArea");
        if (productCard == null || (productDetailList = productCard.getProductDetailList()) == null || (productDetail = (VSAProductCardsResponse.ProductDetail) ORZ.LJLLLLLL(0, productDetailList)) == null) {
            return;
        }
        OLL.LJLLI.getClass();
        int LIZ2 = OL9.LIZ(productCard);
        if (LIZ2 > 1) {
            oli = OLI.AD_MULTI_BUBBLE;
        } else if (LIZ2 == 1) {
            oli = OLI.AD_SINGLE_BUBBLE;
        } else {
            oli = OLI.UNKNOWN;
        }
        LIZLLL(oli, 0, productDetail, trackParams, clickArea, z);
    }

    public static void LIZLLL(OLI cardType, int i, VSAProductCardsResponse.ProductDetail productDetail, java.util.Map trackParams, OL6 clickArea, boolean z) {
        String str;
        String str2;
        String str3;
        List<PromotionItem> list;
        PromotionItem promotionItem;
        o.LJIIIZ(cardType, "cardType");
        o.LJIIIZ(productDetail, "productDetail");
        o.LJIIIZ(trackParams, "trackParams");
        o.LJIIIZ(clickArea, "clickArea");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        linkedHashMap.put("click_area", clickArea.getValue());
        String value = cardType.getValue();
        if (z) {
            value = i0.LJFF(value, "_old");
        }
        linkedHashMap.put("card_name", value);
        linkedHashMap.put("entrance_form", value);
        String LIZ2 = ED2.LIZ(productDetail.getProductId());
        OL6 ol6 = OL6.SHOP_TAB_ICON;
        if (clickArea == ol6 || clickArea == OL6.PRODUCT_CARD) {
            linkedHashMap.put("product_id", LIZ2);
            linkedHashMap.put("biz_type", Integer.valueOf(productDetail.getBizType()));
            VSAProductCardsResponse.PriceDetail price = productDetail.getPrice();
            Integer num = null;
            if (price != null) {
                str = price.getCurrency();
            } else {
                str = null;
            }
            String LIZ3 = ED2.LIZ(str);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZ3);
            VSAProductCardsResponse.PriceDetail price2 = productDetail.getPrice();
            if (price2 != null) {
                str2 = price2.getMinRealPriceValue();
            } else {
                str2 = null;
            }
            LIZ4.append(ED2.LIZ(str2));
            linkedHashMap.put("sales_price", X1D.LIZIZ(LIZ4));
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(LIZ3);
            VSAProductCardsResponse.PriceDetail price3 = productDetail.getPrice();
            if (price3 != null) {
                str3 = price3.getMinOriginPriceValue();
            } else {
                str3 = null;
            }
            LIZ5.append(ED2.LIZ(str3));
            linkedHashMap.put("original_price", X1D.LIZIZ(LIZ5));
            PromotionView promotion = productDetail.getPromotion();
            if (promotion != null && (list = promotion.promotion_items) != null && (promotionItem = (PromotionItem) ORZ.LJLLLL(list)) != null) {
                num = promotionItem.getType();
            }
            linkedHashMap.put("ad_benefit_type", ED2.LIZ(num));
            linkedHashMap.put("item_order", Integer.valueOf(i + 1));
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) trackParams;
        linkedHashMap.put("group_id", ED2.LIZ(linkedHashMap2.get("group_id")));
        linkedHashMap.put("ad_id", ED2.LIZ(linkedHashMap2.get("ad_id")));
        linkedHashMap.put("creative_id", ED2.LIZ(linkedHashMap2.get("creative_id")));
        String LIZ6 = ED2.LIZ(linkedHashMap2.get("log_id"));
        linkedHashMap.put("request_id", LIZ6);
        linkedHashMap.put("track_id", LIZIZ(i, LIZ6, LIZ2));
        C76542zS.LIZ("tiktokec_card_click", linkedHashMap);
        if (cardType == OLI.AD_SINGLE_BUBBLE) {
            C76542zS.LIZ("tiktokec_product_click", linkedHashMap);
        }
        if (clickArea == OL6.PRODUCT_CARD || clickArea == ol6) {
            C61503OBv.LIZ(EnumC61504OBw.CARD_OR_ICON_CLICK);
        }
    }

    public static void LJ(String stage, boolean z, int i, String failReason, String logId, VSAProductCardsResponse.ProductCard productCard, java.util.Map map, int i2) {
        String str;
        OLI oli;
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            failReason = "";
        }
        if ((i2 & 16) != 0) {
            logId = "";
        }
        if ((i2 & 32) != 0) {
            productCard = null;
        }
        if ((i2 & 64) != 0) {
            map = null;
        }
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(failReason, "failReason");
        o.LJIIIZ(logId, "logId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stage", stage);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_success", str);
        linkedHashMap.put("error_code", ED2.LIZ(Integer.valueOf(i)));
        linkedHashMap.put("fail_reason", failReason);
        linkedHashMap.put("log_id", logId);
        OLL.LJLLI.getClass();
        int LIZ2 = OL9.LIZ(productCard);
        if (LIZ2 > 1) {
            oli = OLI.AD_MULTI_BUBBLE;
        } else if (LIZ2 == 1) {
            oli = OLI.AD_SINGLE_BUBBLE;
        } else {
            oli = OLI.UNKNOWN;
        }
        linkedHashMap.put("card_name", oli.getValue());
        if (map != null && !map.isEmpty()) {
            linkedHashMap.put("group_id", ED2.LIZ(map.get("group_id")));
            linkedHashMap.put("ad_id", ED2.LIZ(map.get("ad_id")));
            linkedHashMap.put("creative_id", ED2.LIZ(map.get("creative_id")));
            linkedHashMap.put("request_id", ED2.LIZ(map.get("log_id")));
        }
        C76542zS.LIZ("rd_tiktokec_vsa_stage", linkedHashMap);
    }
}
