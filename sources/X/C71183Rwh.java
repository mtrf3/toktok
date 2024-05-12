package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Rwh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71183Rwh {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new HashSet();
        new HashSet();
        new HashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Map LIZIZ() {
        C86393XvR LJJIJIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("room_id");
            arrayList.add("anchor_id");
            arrayList.add("live_lineup_type");
            arrayList.add("live_lineup_user_type");
            arrayList.add("live_lineup_change_type");
            arrayList.add("is_commerce_inner_flow");
            arrayList.add("commerce_inner_flow_id");
            arrayList.add("commerce_inner_source");
            LJJIJIL.LJJZZI(arrayList, linkedHashMap);
        }
        Object obj = linkedHashMap.get("room_id");
        String str = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("lineup_room_id", obj);
        linkedHashMap.remove("room_id");
        Object obj2 = linkedHashMap.get("anchor_id");
        if (obj2 != 0) {
            str = obj2;
        }
        linkedHashMap.put("lineup_author_id", str);
        linkedHashMap.remove("anchor_id");
        return linkedHashMap;
    }

    public static void LIZ(C188727au c188727au) {
        String str;
        C86393XvR LJJIJIL;
        InterfaceC71013Rtx LJJJLL;
        C86393XvR LJJIJIL2;
        InterfaceC71013Rtx LJJJLL2;
        ILiveOuterService LJJJLL3 = LiveOuterService.LJJJLL();
        String str2 = null;
        if (LJJJLL3 != null && (LJJIJIL2 = LJJJLL3.LJJIJIL()) != null && (LJJJLL2 = LJJIJIL2.LJJJLL()) != null) {
            str = LJJJLL2.LIZ();
        } else {
            str = null;
        }
        ILiveOuterService LJJJLL4 = LiveOuterService.LJJJLL();
        if (LJJJLL4 != null && (LJJIJIL = LJJJLL4.LJJIJIL()) != null && (LJJJLL = LJJIJIL.LJJJLL()) != null) {
            str2 = LJJJLL.LIZIZ();
        }
        if (!TextUtils.isEmpty(str)) {
            c188727au.LJI("rec_content_id", str);
            c188727au.LJI("rec_content_type", str2);
        }
    }

    public static boolean LIZJ(java.util.Map map) {
        Object obj;
        if (map != null) {
            obj = map.get("is_pseudo_ad");
        } else {
            obj = null;
        }
        if (o.LJ(obj, "1")) {
            return true;
        }
        return false;
    }

    public static C188727au LIZLLL(C48502J1u eventParamHelper) {
        String str;
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        C188727au c188727au = new C188727au();
        String LIZJ = eventParamHelper.LIZJ("author_id");
        String str2 = "";
        if (LIZJ == null) {
            LIZJ = "";
        }
        c188727au.LJI("author_id", LIZJ);
        c188727au.LJI("EVENT_ORIGIN_FEATURE", "TEMAI");
        String LIZJ2 = eventParamHelper.LIZJ("product_id");
        if (LIZJ2 == null) {
            LIZJ2 = "";
        }
        c188727au.LJI("product_id", LIZJ2);
        Object LIZJ3 = eventParamHelper.LIZJ("biz_type");
        if (LIZJ3 == null) {
            LIZJ3 = -1;
        }
        c188727au.LJFF(LIZJ3, "biz_type");
        String LIZJ4 = eventParamHelper.LIZJ("product_source");
        if (LIZJ4 == null) {
            LIZJ4 = "";
        }
        c188727au.LJI("product_source", LIZJ4);
        String LIZJ5 = eventParamHelper.LIZJ("source");
        if (LIZJ5 == null) {
            LIZJ5 = "";
        }
        c188727au.LJI("source", LIZJ5);
        String LIZJ6 = eventParamHelper.LIZJ("room_id");
        if (LIZJ6 == null) {
            LIZJ6 = "";
        }
        c188727au.LJI("room_id", LIZJ6);
        String LIZJ7 = eventParamHelper.LIZJ("enter_from_merge");
        if (LIZJ7 == null) {
            LIZJ7 = "";
        }
        c188727au.LJI("enter_from_merge", LIZJ7);
        String LIZJ8 = eventParamHelper.LIZJ("enter_method");
        if (LIZJ8 == null) {
            LIZJ8 = "";
        }
        c188727au.LJI("enter_method", LIZJ8);
        String LIZJ9 = eventParamHelper.LIZJ("action_type");
        if (LIZJ9 == null) {
            LIZJ9 = "";
        }
        c188727au.LJI("action_type", LIZJ9);
        String LIZJ10 = eventParamHelper.LIZJ("carrier_type");
        if (LIZJ10 == null) {
            LIZJ10 = "";
        }
        c188727au.LJI("carrier_type", LIZJ10);
        String LIZJ11 = eventParamHelper.LIZJ("page_type");
        if (LIZJ11 == null) {
            LIZJ11 = "";
        }
        c188727au.LJI("page_type", LIZJ11);
        String LIZJ12 = eventParamHelper.LIZJ("anchor_show_type");
        if (LIZJ12 == null) {
            LIZJ12 = "";
        }
        c188727au.LJI("anchor_show_type", LIZJ12);
        String LIZJ13 = eventParamHelper.LIZJ("follow_status");
        if (LIZJ13 == null) {
            LIZJ13 = "-1";
        }
        c188727au.LJI("follow_status", LIZJ13);
        String LIZJ14 = eventParamHelper.LIZJ("entrance_form");
        if (LIZJ14 == null) {
            LIZJ14 = "";
        }
        c188727au.LJI("entrance_form", LIZJ14);
        String LIZJ15 = eventParamHelper.LIZJ("page_name");
        if (LIZJ15 == null) {
            LIZJ15 = "";
        }
        c188727au.LJI("page_name", LIZJ15);
        String LIZJ16 = eventParamHelper.LIZJ("request_id");
        if (LIZJ16 == null) {
            LIZJ16 = "";
        }
        c188727au.LJI("request_id", LIZJ16);
        String LIZJ17 = eventParamHelper.LIZJ("room_id");
        String LIZJ18 = eventParamHelper.LIZJ("enter_from_merge");
        String LIZJ19 = eventParamHelper.LIZJ("param_search_result_id");
        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
        String LJIIIIZZ = LJJJJZI.LJIIIIZZ("search_entrance_second");
        if (LJIIIIZZ != null && C78685UuP.LJJJZ(LJIIIIZZ)) {
            c188727au.LJI("search_entrance_second", LJIIIIZZ);
        }
        String LJIIIIZZ2 = LJJJJZI.LJIIIIZZ("source_module");
        if (LJIIIIZZ2 != null && C78685UuP.LJJJZ(LJIIIIZZ2)) {
            c188727au.LJI("source_module", LJIIIIZZ2);
        }
        for (Map.Entry<String, String> entry : Z9N.LIZIZ.LIZ.LJJZ(LIZJ18, LIZJ17, "search_result_id", "search_id", "search_entrance", "list_item_id", "last_from_group_id").entrySet()) {
            if (o.LJ(entry.getKey(), "list_item_id") && o.LJ(LIZJ18, "general_search")) {
                if (LIZJ17 == null) {
                    str = entry.getValue();
                } else {
                    str = LIZJ17;
                }
                c188727au.LJI("list_item_id", str);
            } else if (o.LJ(entry.getKey(), "search_result_id") && !TextUtils.isEmpty(LIZJ19)) {
                c188727au.LJI(entry.getKey(), LIZJ19);
            } else {
                c188727au.LJI(entry.getKey(), entry.getValue());
            }
        }
        String LIZJ20 = eventParamHelper.LIZJ("entrance_form");
        if (LIZJ20 != null && TextUtils.equals(LIZJ20, "live_popup_card")) {
            String LIZJ21 = eventParamHelper.LIZJ("is_mix_product");
            if (LIZJ21 == null) {
                LIZJ21 = "";
            }
            c188727au.LJI("is_mix_product", LIZJ21);
        }
        HashMap hashMap = (HashMap) eventParamHelper.LIZIZ();
        if (hashMap != null) {
            c188727au.LJII(hashMap);
        }
        String LIZJ22 = eventParamHelper.LIZJ("track_id");
        if (LIZJ22 != null) {
            c188727au.LJI("track_id", LIZJ22);
        }
        String LIZJ23 = eventParamHelper.LIZJ("is_ad");
        if (LIZJ23 == null) {
            LIZJ23 = "";
        }
        c188727au.LJI("is_ad", LIZJ23);
        String LIZJ24 = eventParamHelper.LIZJ("ad_id");
        if (LIZJ24 == null) {
            LIZJ24 = "";
        }
        c188727au.LJI("ad_id", LIZJ24);
        String LIZJ25 = eventParamHelper.LIZJ("creative_id");
        if (LIZJ25 != null) {
            str2 = LIZJ25;
        }
        c188727au.LJI("creative_id", str2);
        return c188727au;
    }

    public static void LJFF(C48502J1u eventParamHelper, String str, Boolean bool, java.util.Map map, java.util.Map map2) {
        C86393XvR LJJIJIL;
        long j;
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        C188727au LIZLLL = LIZLLL(eventParamHelper);
        LIZLLL.LJIIIZ("item_order", eventParamHelper.LIZJ("item_order"));
        if (eventParamHelper.LJ("campaign_id")) {
            LIZLLL.LJI("campaign_id", eventParamHelper.LIZJ("campaign_id"));
        }
        if (eventParamHelper.LJ("campaign_type")) {
            LIZLLL.LJI("campaign_type", eventParamHelper.LIZJ("campaign_type"));
        }
        if (eventParamHelper.LJ("campaign_channel")) {
            LIZLLL.LJI("campaign_channel", eventParamHelper.LIZJ("campaign_channel"));
        }
        if (eventParamHelper.LJ("campaign_user_tag")) {
            LIZLLL.LJI("campaign_user_tag", eventParamHelper.LIZJ("campaign_user_tag"));
        }
        if (eventParamHelper.LJ("source_page_type")) {
            LIZLLL.LJI("source_page_type", eventParamHelper.LIZJ("source_page_type"));
        }
        if (eventParamHelper.LJ("shopping_status")) {
            LIZLLL.LJI("shopping_status", eventParamHelper.LIZJ("shopping_status"));
        }
        if (eventParamHelper.LJ("isFirst")) {
            LIZLLL.LJI("is_first", eventParamHelper.LIZJ("isFirst"));
        }
        if (eventParamHelper.LJ("api_end_time")) {
            String LIZJ = eventParamHelper.LIZJ("api_end_time");
            if (LIZJ != null) {
                j = CastLongProtector.parseLong(LIZJ);
            } else {
                j = 0;
            }
            LIZLLL.LJ(System.currentTimeMillis() - j, "duration");
        }
        String LIZJ2 = eventParamHelper.LIZJ("is_hot");
        if (LIZJ2 != null) {
            LIZLLL.LJI("is_hot", LIZJ2);
        }
        String LIZJ3 = eventParamHelper.LIZJ("hot_sell_number");
        if (LIZJ3 != null) {
            LIZLLL.LJI("hot_sell_number", LIZJ3);
        }
        String LIZJ4 = eventParamHelper.LIZJ("label_type");
        if (LIZJ4 != null) {
            LIZLLL.LJI("label_type", LIZJ4);
        }
        String LIZJ5 = eventParamHelper.LIZJ("label_number");
        if (LIZJ5 != null) {
            LIZLLL.LJI("label_number", LIZJ5);
        }
        if (eventParamHelper.LJ("source_module")) {
            LIZLLL.LJI("source_module", eventParamHelper.LIZJ("source_module"));
        }
        LIZ(LIZLLL);
        LIZLLL.LJIIIIZZ(map);
        LIZLLL.LJIIIIZZ(map2);
        LIZLLL.LJIIIIZZ(LIZIZ());
        C48658J7u.LIZ("livesdk_tiktokec_product_entrance_show", LIZLLL.LIZ);
        if (o.LJ(bool, Boolean.TRUE) || LIZJ(map)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("refer", "icon");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("room_id", str);
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && LJJIJIL.LIZIZ() != null) {
                C28835BTj.LIZ("live_ad", "othershow", hashMap, hashMap2);
            }
        }
    }

    public static void LJ(C48502J1u eventParamHelper, Boolean bool, String str, String str2, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        C86393XvR LJJIJIL;
        o.LJIIIZ(eventParamHelper, "eventParamHelper");
        C188727au LIZLLL = LIZLLL(eventParamHelper);
        LIZLLL.LJIIIZ("item_order", eventParamHelper.LIZJ("item_order"));
        if (eventParamHelper.LJ("campaign_id")) {
            LIZLLL.LJI("campaign_id", eventParamHelper.LIZJ("campaign_id"));
        }
        if (eventParamHelper.LJ("campaign_type")) {
            LIZLLL.LJI("campaign_type", eventParamHelper.LIZJ("campaign_type"));
        }
        if (eventParamHelper.LJ("campaign_channel")) {
            LIZLLL.LJI("campaign_channel", eventParamHelper.LIZJ("campaign_channel"));
        }
        if (eventParamHelper.LJ("campaign_user_tag")) {
            LIZLLL.LJI("campaign_user_tag", eventParamHelper.LIZJ("campaign_user_tag"));
        }
        if (eventParamHelper.LJ("shopping_status")) {
            LIZLLL.LJI("shopping_status", eventParamHelper.LIZJ("shopping_status"));
        }
        if (eventParamHelper.LJ("source_page_type")) {
            LIZLLL.LJI("source_page_type", eventParamHelper.LIZJ("source_page_type"));
        }
        String LIZJ = eventParamHelper.LIZJ("is_hot");
        if (LIZJ != null) {
            LIZLLL.LJI("is_hot", LIZJ);
        }
        String LIZJ2 = eventParamHelper.LIZJ("hot_sell_number");
        if (LIZJ2 != null) {
            LIZLLL.LJI("hot_sell_number", LIZJ2);
        }
        String LIZJ3 = eventParamHelper.LIZJ("label_type");
        if (LIZJ3 != null) {
            LIZLLL.LJI("label_type", LIZJ3);
        }
        String LIZJ4 = eventParamHelper.LIZJ("label_number");
        if (LIZJ4 != null) {
            LIZLLL.LJI("label_number", LIZJ4);
        }
        String LIZJ5 = eventParamHelper.LIZJ("label_order");
        if (LIZJ5 != null) {
            LIZLLL.LJI("label_order", LIZJ5);
        }
        String LIZJ6 = eventParamHelper.LIZJ("ec_access_forbidden");
        if (LIZJ6 != null) {
            LIZLLL.LJI("ec_access_forbidden", LIZJ6);
        }
        if (eventParamHelper.LJ("source_module")) {
            LIZLLL.LJI("source_module", eventParamHelper.LIZJ("source_module"));
        }
        String LIZJ7 = eventParamHelper.LIZJ("guidance_text_type");
        if (LIZJ7 != null) {
            LIZLLL.LJI("guidance_text_type", LIZJ7);
        }
        LIZ(LIZLLL);
        LIZLLL.LJIIIIZZ(map);
        LIZLLL.LJIIIIZZ(map2);
        LIZLLL.LJIIIIZZ(LIZIZ());
        LIZLLL.LJIIIIZZ(map3);
        C48658J7u.LIZ("livesdk_tiktokec_product_entrance_click", LIZLLL.LIZ);
        if (o.LJ(bool, Boolean.TRUE) || LIZJ(map)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("refer", str2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("room_id", str);
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && LJJIJIL.LIZIZ() != null) {
                C28835BTj.LIZ("live_ad", "otherclick", hashMap, hashMap2);
            }
        }
    }
}
