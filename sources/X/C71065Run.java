package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.a1;
import defpackage.i0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ujb.o;

/* renamed from: X.Run, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71065Run {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(OSR.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(OSS.LJLIL);
    public static String LIZJ = "";

    public static void LIZ(java.util.Map map) {
        for (Map.Entry entry : ((java.util.Map) LIZ.getValue()).entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void LIZIZ(java.util.Map map) {
        for (Map.Entry entry : ((java.util.Map) LIZIZ.getValue()).entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static int LIZLLL(FeedEcCardConfig feedEcCardConfig) {
        if (feedEcCardConfig == null) {
            return 0;
        }
        Integer triggerSubCondition = feedEcCardConfig.getTriggerSubCondition();
        if (triggerSubCondition != null) {
            int intValue = triggerSubCondition.intValue();
            if (intValue > 0) {
                return intValue;
            }
            if (feedEcCardConfig == null) {
                return 0;
            }
        }
        Integer triggerCondition = feedEcCardConfig.getTriggerCondition();
        if (triggerCondition == null) {
            return 0;
        }
        return triggerCondition.intValue();
    }

    public static OSZ LJFF(EcUgProduct ecUgProduct) {
        String str;
        String str2;
        EcUgProduct.EcUgProductPrice price = ecUgProduct.getPrice();
        if (price != null) {
            String LIZ2 = ED2.LIZ(price.getCurrency());
            str2 = ED2.LIZ(price.getMinSalesPrice());
            str = ED2.LIZ(price.getMinOriginalPrice());
            if (!o.LJJJJJL(str2)) {
                str2 = i0.LJFF(LIZ2, str2);
            }
            if (!o.LJJJJJL(str)) {
                str = i0.LJFF(LIZ2, str);
            }
        } else {
            str = "";
            str2 = "";
        }
        return new OSZ(str2, str);
    }

    public static String LJI(String str) {
        return a1.LJ("rec_fyp_ecom_card_outer_", str, "_module");
    }

    public static String LJ(List list, EcUgProduct curProduct) {
        Object obj;
        String str;
        kotlin.jvm.internal.o.LJIIIZ(curProduct, "curProduct");
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    FeedEcCardConfig.FeedEcCardProductInfo feedEcCardProductInfo = (FeedEcCardConfig.FeedEcCardProductInfo) obj;
                    if (feedEcCardProductInfo != null) {
                        str = feedEcCardProductInfo.getProductId();
                    } else {
                        str = null;
                    }
                    if (kotlin.jvm.internal.o.LJ(str, curProduct.getProductId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            FeedEcCardConfig.FeedEcCardProductInfo feedEcCardProductInfo2 = (FeedEcCardConfig.FeedEcCardProductInfo) obj;
            if (feedEcCardProductInfo2 != null) {
                str2 = feedEcCardProductInfo2.getRecommendInfo();
            }
        }
        return ED2.LIZ(str2);
    }

    public static java.util.Map LJIIIZ(int i, EcUgProduct ecUgProduct, Aweme aweme, FeedEcCardConfig feedEcCardConfig) {
        int i2;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        linkedHashMap.put("button_name", "buy");
        java.util.Map<String, Object> trackParams = feedEcCardConfig.getTrackParams();
        if (trackParams != null) {
            linkedHashMap.put("entrance_form", ED2.LIZ(ED2.LIZ(trackParams.get("entrance_form"))));
        }
        String LIZ2 = ED2.LIZ(Integer.valueOf(LIZLLL(feedEcCardConfig)));
        linkedHashMap.put("source_module", LJI(LIZ2));
        int i3 = i + 1;
        linkedHashMap.put("item_order", Integer.valueOf(i3));
        String LIZ3 = ED2.LIZ(ecUgProduct.getProductId());
        linkedHashMap.put("product_id", LIZ3);
        OSZ LJFF = LJFF(ecUgProduct);
        Object first = LJFF.getFirst();
        Object second = LJFF.getSecond();
        linkedHashMap.put("sales_price", first);
        linkedHashMap.put("original_price", second);
        String LIZ4 = ED2.LIZ(feedEcCardConfig.getContentType());
        linkedHashMap.put("compo_layout_type", LIZ4);
        String LIZ5 = ED2.LIZ(feedEcCardConfig.getUserStatus());
        linkedHashMap.put("user_status", LIZ5);
        linkedHashMap.put("trigger_condition", LIZ2);
        Integer bizType = ecUgProduct.getBizType();
        if (bizType != null) {
            i2 = bizType.intValue();
        } else {
            i2 = -1;
        }
        linkedHashMap.put("biz_type", ED2.LIZ(Integer.valueOf(i2)));
        String LIZ6 = ED2.LIZ(aweme.getRequestId());
        linkedHashMap.put("track_id", LIZJ(i3, LIZ5, LIZ2, LIZ4, LIZ6, LIZ3));
        linkedHashMap.put("rec_params", LJ(feedEcCardConfig.getProductInfoList(), ecUgProduct));
        linkedHashMap.put("request_id", LIZ6);
        FeedEcCardConfig.FeedEcCardInfo cardInfo = feedEcCardConfig.getCardInfo();
        if (cardInfo != null) {
            str = cardInfo.getSessionId();
        } else {
            str = null;
        }
        linkedHashMap.put("rec_session_id", ED2.LIZ(str));
        linkedHashMap.put("aweme_id", ED2.LIZ(aweme.getAid()));
        return linkedHashMap;
    }

    public static java.util.Map LJIIJ(int i, EcUgProduct ecUgProduct, Aweme aweme, FeedEcCardConfig feedEcCardConfig) {
        String str;
        String str2;
        int i2;
        String sellerId;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        java.util.Map<String, Object> trackParams = feedEcCardConfig.getTrackParams();
        if (trackParams != null) {
            linkedHashMap.put("entrance_form", ED2.LIZ(trackParams.get("entrance_form")));
        }
        String LIZ2 = ED2.LIZ(Integer.valueOf(LIZLLL(feedEcCardConfig)));
        linkedHashMap.put("source_module", LJI(LIZ2));
        EcUgProduct.EcUgProductPrice price = ecUgProduct.getPrice();
        String str3 = null;
        if (price != null) {
            str = price.getMinOriginalPrice();
        } else {
            str = null;
        }
        if (str == null || o.LJJJJJL(str)) {
            str2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            str2 = "original";
        }
        linkedHashMap.put("original_price_type", str2);
        linkedHashMap.put("is_ad", 0);
        EcUgProduct.EcUgProductSeller seller = ecUgProduct.getSeller();
        if (seller != null && (sellerId = seller.getSellerId()) != null && !o.LJJJJJL(sellerId)) {
            linkedHashMap.put("shop_id", sellerId);
        }
        int i3 = i + 1;
        linkedHashMap.put("item_order", Integer.valueOf(i3));
        String LIZ3 = ED2.LIZ(ecUgProduct.getProductId());
        linkedHashMap.put("product_id", LIZ3);
        OSZ LJFF = LJFF(ecUgProduct);
        Object first = LJFF.getFirst();
        Object second = LJFF.getSecond();
        linkedHashMap.put("sales_price", first);
        linkedHashMap.put("original_price", second);
        String LIZ4 = ED2.LIZ(feedEcCardConfig.getContentType());
        linkedHashMap.put("compo_layout_type", LIZ4);
        String LIZ5 = ED2.LIZ(feedEcCardConfig.getUserStatus());
        linkedHashMap.put("user_status", LIZ5);
        linkedHashMap.put("trigger_condition", LIZ2);
        Integer bizType = ecUgProduct.getBizType();
        if (bizType != null) {
            i2 = bizType.intValue();
        } else {
            i2 = -1;
        }
        linkedHashMap.put("biz_type", ED2.LIZ(Integer.valueOf(i2)));
        String LIZ6 = ED2.LIZ(aweme.getRequestId());
        linkedHashMap.put("track_id", LIZJ(i3, LIZ5, LIZ2, LIZ4, LIZ6, LIZ3));
        linkedHashMap.put("rec_params", LJ(feedEcCardConfig.getProductInfoList(), ecUgProduct));
        linkedHashMap.put("request_id", LIZ6);
        FeedEcCardConfig.FeedEcCardInfo cardInfo = feedEcCardConfig.getCardInfo();
        if (cardInfo != null) {
            str3 = cardInfo.getSessionId();
        }
        linkedHashMap.put("rec_session_id", ED2.LIZ(str3));
        linkedHashMap.put("aweme_id", ED2.LIZ(aweme.getAid()));
        return linkedHashMap;
    }

    public static java.util.Map LJII(List list, boolean z, Aweme aweme, FeedEcCardConfig feedEcCardConfig, String str) {
        Integer num;
        Integer num2;
        java.util.Map<String, Object> trackParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        linkedHashMap.put("button_name", str);
        if (feedEcCardConfig != null && (trackParams = feedEcCardConfig.getTrackParams()) != null) {
            linkedHashMap.put("entrance_form", ED2.LIZ(trackParams.get("entrance_form")));
        }
        linkedHashMap.put("product_id", ED2.LIZ(C35777E2j.LIZ(list)));
        linkedHashMap.put("is_content_show", Integer.valueOf(z ? 1 : 0));
        String str2 = null;
        if (feedEcCardConfig != null) {
            num = feedEcCardConfig.getContentType();
        } else {
            num = null;
        }
        linkedHashMap.put("compo_layout_type", ED2.LIZ(num));
        if (feedEcCardConfig != null) {
            num2 = feedEcCardConfig.getUserStatus();
        } else {
            num2 = null;
        }
        linkedHashMap.put("user_status", ED2.LIZ(num2));
        linkedHashMap.put("trigger_condition", ED2.LIZ(Integer.valueOf(LIZLLL(feedEcCardConfig))));
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        linkedHashMap.put("aweme_id", ED2.LIZ(str2));
        return linkedHashMap;
    }

    public static String LIZJ(int i, String str, String str2, String str3, String str4, String str5) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fyp_shoptab_");
        LIZ2.append(str);
        LIZ2.append('_');
        LIZ2.append(str2);
        LIZ2.append('_');
        LIZ2.append(str3);
        LIZ2.append('_');
        LIZ2.append(str4);
        LIZ2.append('_');
        LIZ2.append(str5);
        LIZ2.append('_');
        LIZ2.append(i);
        return X1D.LIZIZ(LIZ2);
    }

    public static java.util.Map LJIIIIZZ(List list, String str, boolean z, Aweme aweme, FeedEcCardConfig feedEcCardConfig, FeedEcCardStyle feedEcCardStyle) {
        String str2;
        Integer num;
        Integer num2;
        String str3;
        String str4;
        String str5;
        FeedEcCardConfig.FeedEcCardInfo cardInfo;
        FeedEcCardConfig.FeedEcCardInfo cardInfo2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        String LIZ2 = ED2.LIZ(Integer.valueOf(LIZLLL(feedEcCardConfig)));
        linkedHashMap.put("source_module", LJI(LIZ2));
        String str6 = null;
        if (feedEcCardStyle != null) {
            str2 = feedEcCardStyle.getCardTitleText();
        } else {
            str2 = null;
        }
        linkedHashMap.put("title", ED2.LIZ(str2));
        linkedHashMap.put("product_id", ED2.LIZ(C35777E2j.LIZ(list)));
        if (feedEcCardConfig != null) {
            num = feedEcCardConfig.getContentType();
        } else {
            num = null;
        }
        linkedHashMap.put("compo_layout_type", ED2.LIZ(num));
        if (feedEcCardConfig != null) {
            num2 = feedEcCardConfig.getUserStatus();
        } else {
            num2 = null;
        }
        linkedHashMap.put("user_status", ED2.LIZ(num2));
        linkedHashMap.put("trigger_condition", LIZ2);
        linkedHashMap.put("is_content_show", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("biz_type", str);
        if (feedEcCardConfig != null && (cardInfo2 = feedEcCardConfig.getCardInfo()) != null) {
            str3 = cardInfo2.getRecommendInfo();
        } else {
            str3 = null;
        }
        linkedHashMap.put("rec_params", ED2.LIZ(str3));
        if (aweme != null) {
            str4 = aweme.getRequestId();
        } else {
            str4 = null;
        }
        linkedHashMap.put("request_id", ED2.LIZ(str4));
        if (feedEcCardConfig != null && (cardInfo = feedEcCardConfig.getCardInfo()) != null) {
            str5 = cardInfo.getSessionId();
        } else {
            str5 = null;
        }
        linkedHashMap.put("rec_session_id", ED2.LIZ(str5));
        if (aweme != null) {
            str6 = aweme.getAid();
        }
        linkedHashMap.put("aweme_id", ED2.LIZ(str6));
        return linkedHashMap;
    }

    public static void LJIIJJI(List list, String bizType, boolean z, Aweme aweme, FeedEcCardConfig cardConfig, FeedEcCardStyle cardStyle, String clickArea, EcUgProduct ecUgProduct) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(bizType, "bizType");
        kotlin.jvm.internal.o.LJIIIZ(aweme, "aweme");
        kotlin.jvm.internal.o.LJIIIZ(cardConfig, "cardConfig");
        kotlin.jvm.internal.o.LJIIIZ(cardStyle, "cardStyle");
        kotlin.jvm.internal.o.LJIIIZ(clickArea, "clickArea");
        java.util.Map LJIIIIZZ = LJIIIIZZ(list, bizType, z, aweme, cardConfig, cardStyle);
        LJIIIIZZ.put("click_area", clickArea);
        if (ecUgProduct != null) {
            str = ecUgProduct.getProductId();
        } else {
            str = null;
        }
        LJIIIIZZ.put("click_product_id", ED2.LIZ(str));
        C76542zS.LIZ("tiktokec_card_click", LJIIIIZZ);
    }

    public static void LJIIL(List list, String str, boolean z, Aweme aweme, FeedEcCardConfig feedEcCardConfig, FeedEcCardStyle feedEcCardStyle, long j, String actionType, String str2, String str3) {
        kotlin.jvm.internal.o.LJIIIZ(actionType, "actionType");
        java.util.Map LJIIIIZZ = LJIIIIZZ(list, str, z, aweme, feedEcCardConfig, feedEcCardStyle);
        LJIIIIZZ.put("stay_time", Long.valueOf(j));
        LJIIIIZZ.put("action_type", actionType);
        if (str2 != null && !o.LJJJJJL(str2)) {
            LJIIIIZZ.put("draw_action", str2);
        }
        if (str3 != null && !o.LJJJJJL(str3)) {
            LJIIIIZZ.put("click_area", str3);
        }
        C76542zS.LIZ("tiktokec_stay_card", LJIIIIZZ);
    }
}
