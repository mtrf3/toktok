package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommercelive.common.framework.utils.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommercelive.common.framework.utils.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommercelive.common.framework.utils.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rtv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71011Rtv {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("anchor_show_type", "author_id", "product_id", "action_type", "product_source", "source_from", "source", "follow_status", "source_page_type", "entrance_form", "is_ad", "rec_content_id", "rec_content_type", "request_id", "search_id", "search_result_id", "effect_ad_extra", "track_id", "enter_from_info", "source_content_id", "rec_session_id", "traffic_source_list", "creative_id", "ad_id", "biz_type");
    public static final List<String> LIZIZ;
    public static final List<String> LIZJ;
    public static final List<String> LIZLLL;

    static {
        List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI("anchor_show_type", "author_id", "product_id", "action_type", "product_source", "source_from", "source", "follow_status", "source_page_type", "entrance_form", "is_ad", "rec_content_id", "rec_content_type", "request_id", "search_id", "search_result_id", "effect_ad_extra", "track_id", "campaign_channel", "start_click_time", "previous_page", "source_content_id", "enter_from_info", "rec_session_id", "traffic_source_list", "purchase_path", "saleable_sku_num", "creative_id", "ad_id", "source_module", "biz_type", "rights_content", "rights_cnt");
        LIZIZ = LJJIJIIJI;
        LIZJ = LJJIJIIJI;
        LIZLLL = C47261Igj.LJJIJIIJI("source_page_type", "entrance_form", "product_source", "product_id", "author_id", "is_ad", "creative_id", "ad_id", "action_type", "rec_content_id", "rec_content_type", "request_id", "track_id", "source_content_id", "enter_from_info", "purchase_path", "source_module");
    }

    public static java.util.Map LIZ(List list, C48502J1u c48502J1u) {
        String str;
        String str2;
        String str3;
        HashMap hashMap;
        String str4;
        C86393XvR LJJIJIL;
        InterfaceC71013Rtx LJJJLL;
        String str5;
        C86393XvR LJJIJIL2;
        InterfaceC71013Rtx LJJJLL2;
        String str6;
        Object obj;
        HashMap hashMap2;
        String str7;
        HashMap hashMap3 = new HashMap();
        if (c48502J1u != null) {
            str = c48502J1u.LIZJ("enter_from_merge");
            str2 = c48502J1u.LIZJ("enter_method");
        } else {
            str = null;
            str2 = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str8 = (String) it.next();
            switch (str8.hashCode()) {
                case -1758096516:
                    if (!str8.equals("enter_from_info")) {
                        break;
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str);
                        LIZ2.append("_temai_");
                        LIZ2.append(str2);
                        hashMap3.put(str8, X1D.LIZIZ(LIZ2));
                        break;
                    }
                case -1366079744:
                    if (!str8.equals("traffic_source_list")) {
                        break;
                    } else {
                        if (c48502J1u != null && (hashMap = (HashMap) c48502J1u.LIZIZ()) != null) {
                            str3 = (String) hashMap.get("traffic_source_list");
                        } else {
                            str3 = null;
                        }
                        hashMap3.put(str8, M2T.LIZJ(1, str3));
                        break;
                    }
                    break;
                case -266558761:
                    if (!str8.equals("previous_page")) {
                        break;
                    } else {
                        hashMap3.put(str8, "live");
                        break;
                    }
                case -209775985:
                    if (!str8.equals("rec_content_type")) {
                        break;
                    } else {
                        ILiveOuterService LJJJLL3 = LiveOuterService.LJJJLL();
                        if (LJJJLL3 != null && (LJJIJIL = LJJJLL3.LJJIJIL()) != null && (LJJJLL = LJJIJIL.LJJJLL()) != null) {
                            str4 = LJJJLL.LIZIZ();
                        } else {
                            str4 = null;
                        }
                        hashMap3.put(str8, str4);
                        break;
                    }
                    break;
                case -120888912:
                    if (!str8.equals("rec_content_id")) {
                        break;
                    } else {
                        ILiveOuterService LJJJLL4 = LiveOuterService.LJJJLL();
                        if (LJJJLL4 != null && (LJJIJIL2 = LJJJLL4.LJJIJIL()) != null && (LJJJLL2 = LJJIJIL2.LJJJLL()) != null) {
                            str5 = LJJJLL2.LIZ();
                        } else {
                            str5 = null;
                        }
                        hashMap3.put(str8, str5);
                        break;
                    }
                case 741958194:
                    if (!str8.equals("anchor_show_type")) {
                        break;
                    } else {
                        hashMap3.put(str8, "live_popup_card");
                        break;
                    }
                case 1191058757:
                    if (!str8.equals("source_content_id")) {
                        break;
                    } else {
                        if (c48502J1u != null) {
                            str6 = c48502J1u.LIZJ("room_id");
                        } else {
                            str6 = null;
                        }
                        hashMap3.put(str8, str6);
                        break;
                    }
                case 1276412531:
                    if (!str8.equals("rec_session_id")) {
                        break;
                    } else {
                        if (c48502J1u == null || (hashMap2 = (HashMap) c48502J1u.LIZIZ()) == null || (obj = hashMap2.get("rec_session_id")) == null) {
                            obj = "";
                        }
                        hashMap3.put(str8, obj);
                        break;
                    }
                case 1329423302:
                    if (!str8.equals("source_page_type")) {
                        break;
                    } else {
                        hashMap3.put(str8, "live");
                        break;
                    }
            }
            if (c48502J1u != null) {
                str7 = c48502J1u.LIZJ(str8);
            } else {
                str7 = null;
            }
            hashMap3.put(str8, str7);
        }
        return hashMap3;
    }

    public static String LIZIZ(PopupCardVO product, C48502J1u c48502J1u) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(product, "product");
        if (c48502J1u == null || (str = c48502J1u.LIZJ("room_id")) == null) {
            str = "";
        }
        String valueOf = String.valueOf(product.getProductId());
        List<String> skuIds = product.getSkuIds();
        if (skuIds != null) {
            str2 = (String) ORZ.LJLLLLLL(0, skuIds);
        } else {
            str2 = null;
        }
        OrderSubmitRequestParam orderSubmitRequestParam = new OrderSubmitRequestParam(C47261Igj.LJJIJ(new OrderShopDigest(product.getSellerId(), C47261Igj.LJJIJ(new OrderSKUDTO(valueOf, str2, 1, 1, C27739Aud.LJI(LIZ(LIZLLL, c48502J1u)), product.getChainKey(), null, 64, null)))), 1);
        android.net.Uri parse = UriProtector.parse("aweme://ec/order_submit_v2");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(parse.getScheme());
        builder.authority(parse.getHost());
        builder.path(parse.getPath());
        builder.appendQueryParameter("buy_type", CardStruct.IStatusCode.DEFAULT);
        builder.appendQueryParameter("requestParams", C27739Aud.LJI(orderSubmitRequestParam));
        if (c48502J1u == null || (str3 = c48502J1u.LIZJ("biz_type")) == null) {
            str3 = "-1";
        }
        builder.appendQueryParameter("biz_type", str3);
        String chainKey = product.getChainKey();
        if (chainKey != null) {
            builder.appendQueryParameter("chain_key", chainKey);
        }
        builder.appendQueryParameter("orderRequestParams", C65232Piu.LIZJ("room_id", str).toString());
        builder.appendQueryParameter("trackParams", C27739Aud.LJI(LIZ(LIZJ, c48502J1u)));
        String uri = builder.build().toString();
        o.LJIIIIZZ(uri, "builder.build().toString()");
        return uri;
    }

    public static String LIZJ(PopupCardVO product, C48502J1u c48502J1u) {
        String str;
        String str2;
        o.LJIIIZ(product, "product");
        if (c48502J1u == null || (str = c48502J1u.LIZJ("room_id")) == null) {
            str = "";
        }
        android.net.Uri parse = UriProtector.parse("aweme://ec/sku");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(parse.getScheme());
        builder.authority(parse.getHost());
        builder.path(parse.getPath());
        builder.appendQueryParameter("product_id", String.valueOf(product.getProductId()));
        builder.appendQueryParameter("click_from", "1");
        builder.appendQueryParameter("visitReportParams", product.getVisitReportParams());
        builder.appendQueryParameter("enter_from", "live");
        builder.appendQueryParameter("need_request", "true");
        builder.appendQueryParameter("one_step_order_type", "2");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", str);
        builder.appendQueryParameter("orderRequestParams", jSONObject.toString());
        builder.appendQueryParameter("trackParams", C27739Aud.LJI(LIZ(LIZIZ, c48502J1u)));
        if (c48502J1u == null || (str2 = c48502J1u.LIZJ("biz_type")) == null) {
            str2 = "-1";
        }
        builder.appendQueryParameter("biz_type", str2);
        List<Object> skcInfo = product.getSkcInfo();
        if (skcInfo != null && !skcInfo.isEmpty() && ((Boolean) C52674Klq.LIZ.getValue()).booleanValue()) {
            builder.appendQueryParameter("sku_type", String.valueOf(EnumC70108RfM.SKC.getValue()));
        }
        String uri = builder.build().toString();
        o.LJIIIIZZ(uri, "builder.build().toString()");
        return uri;
    }

    public static void LIZLLL(PopupCardVO product, String str, Integer num, C48502J1u c48502J1u, java.util.Map map) {
        o.LJIIIZ(product, "product");
        if (c48502J1u == null) {
            return;
        }
        C76542zS.LIZJ("tiktokec_confirm_sku", new C71012Rtw(c48502J1u, c48502J1u.LIZJ("enter_from_merge"), c48502J1u.LIZJ("enter_method"), str, num, map));
    }
}
