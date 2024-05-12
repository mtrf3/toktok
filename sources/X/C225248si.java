package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDetails;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225248si {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new ConcurrentHashMap();
    }

    public static void LJ() {
        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "video_post_page", "anchor_type", "poi");
        LIZIZ.put("anchor_name", "Location");
        FMX.LJIIL("add_label", LIZIZ);
    }

    public static void LJFF(java.util.Map params) {
        o.LJIIIZ(params, "params");
        for (Map.Entry<String, String> entry : LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave().entrySet()) {
            C65777Prh.LIZJ(params).put(entry.getKey(), entry.getValue());
        }
        FMX.LJIIL("cancel_favourite_poi", params);
    }

    public static void LJIILJJIL(java.util.Map params) {
        o.LJIIIZ(params, "params");
        for (Map.Entry<String, String> entry : LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave().entrySet()) {
            C65777Prh.LIZJ(params).put(entry.getKey(), entry.getValue());
        }
        FMX.LJIIL("favourite_poi", params);
    }

    public static void LJJIIJ(java.util.Map map) {
        map.putAll(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationCommonParamsIfHave());
        FMX.LJIIL("show_favourite_poi_button", map);
    }

    public static void LIZIZ(PoiData poiData, java.util.Map map) {
        String str;
        if (poiData == null) {
            return;
        }
        try {
            String details = poiData.getDetails();
            if (details != null) {
                JSONObject jSONObject = new JSONObject(details);
                LIZJ(JSONObjectProtectorUtils.getString(jSONObject, "collect_info"), map);
                String optString = jSONObject.optString("city_code");
                o.LJIIIIZZ(optString, "details.optString(\"city_code\")");
                map.put("poi_city", optString);
                String optString2 = jSONObject.optString("country_code");
                o.LJIIIIZZ(optString2, "details.optString(\"country_code\")");
                map.put("poi_region_code", optString2);
                PoiDetails poiDetails = poiData.getPoiDetails();
                if (poiDetails == null || (str = poiDetails.poiTypeName()) == null) {
                    str = "";
                }
                map.put("poi_detail_type", str);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LIZJ(String str, java.util.Map map) {
        JSONObject jSONObject;
        Object opt;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    if (C78685UuP.LJJJZ(key) && (opt = jSONObject.opt(key)) != null) {
                        o.LJIIIIZZ(key, "key");
                        map.put(key, opt.toString());
                    }
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return;
            }
        } else {
            jSONObject = null;
        }
        C3C5.m7constructorimpl(jSONObject);
    }

    public static void LIZLLL(PoiData poiData, java.util.Map map) {
        String str;
        String searchId;
        if (poiData == null) {
            return;
        }
        LIZIZ(poiData, map);
        String logId = poiData.getLogId();
        String str2 = "";
        if (logId == null) {
            logId = "";
        }
        map.put("poi_log_id", logId);
        PoiMobParam mobParam = poiData.getMobParam();
        if (mobParam == null || (str = mobParam.getEnterMethod()) == null) {
            str = "";
        }
        map.put("poi_enter_method", str);
        PoiMobParam mobParam2 = poiData.getMobParam();
        if (mobParam2 != null && (searchId = mobParam2.getSearchId()) != null) {
            str2 = searchId;
        }
        map.put("poi_search_id", str2);
        map.putAll(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationCommonParamsIfHave());
    }

    public static void LJIIJJI(Integer num, boolean z) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_grey_status", str);
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        FMX.LJIIL("location_entrance_show", linkedHashMap);
    }

    public static void LJIILL(String str, boolean z) {
        String str2;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("poi_id", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ("enable_location", str2);
        FMX.LJIIL("poi_collection_show", C113554cx.LJJLIIIIJ(oszArr));
    }

    public static void LJIJI(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("poi_id", str2);
        FMX.LJIIL("poi_map_action", linkedHashMap);
    }

    public static HashMap LIZ(String str, String str2, PoiAnchorData poiAnchorData) {
        String poiRegionCode;
        String poiDetailTypeFromLevelType;
        String poiCityCode;
        HashMap hashMap = new HashMap();
        String str3 = null;
        if (poiAnchorData != null) {
            str3 = poiAnchorData.getCollectInfo();
        }
        LIZJ(str3, hashMap);
        if (!hashMap.containsKey("poi_city") && poiAnchorData != null && (poiCityCode = poiAnchorData.getPoiCityCode()) != null && C78685UuP.LJJJZ(poiCityCode)) {
            hashMap.put("poi_city", poiCityCode);
        }
        if (!hashMap.containsKey("poi_detail_type") && poiAnchorData != null && (poiDetailTypeFromLevelType = poiAnchorData.getPoiDetailTypeFromLevelType()) != null && C78685UuP.LJJJZ(poiDetailTypeFromLevelType)) {
            hashMap.put("poi_detail_type", poiDetailTypeFromLevelType);
        }
        if (!hashMap.containsKey("poi_region_code") && poiAnchorData != null && (poiRegionCode = poiAnchorData.getPoiRegionCode()) != null && C78685UuP.LJJJZ(poiRegionCode)) {
            hashMap.put("poi_region_code", poiRegionCode);
        }
        hashMap.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("poi_id", str2);
        return hashMap;
    }

    public static void LJIIIIZZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("poi_id", str3);
        FMX.LJIIL("copy_address", linkedHashMap);
    }

    public static void LJIIJ(boolean z, boolean z2, Integer num) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_grey_status", obj);
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_have_poi", str);
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        FMX.LJIIL("click_location_button", linkedHashMap);
    }

    public static void LJIJJLI(Integer num, String str, String str2) {
        LinkedHashMap LIZIZ = JF1.LIZIZ("request_from", str, "result", str2);
        if (num != null) {
            LIZIZ.put("error_code", num.toString());
        }
        FMX.LJIIL("poi_map_install_result", LIZIZ);
    }

    public static void LJIILIIL(Integer num, String enterFrom, String enterMethod, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", enterFrom);
        linkedHashMap.put("enter_method", enterMethod);
        if (str != null) {
            linkedHashMap.put("log_id", str);
        }
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("enter_poi_search", linkedHashMap);
    }

    public static void LJIILLIIL(int i, int i2, int i3, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("creation_id", str);
        }
        linkedHashMap.put("enter_from", "video_post_page");
        linkedHashMap.put("enable_location", String.valueOf(i));
        linkedHashMap.put("has_poi", String.valueOf(i2));
        linkedHashMap.put("has_location", String.valueOf(i3));
        linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("poi_entrance_show", linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r3 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            if (r5 == 0) goto Lc
            java.lang.String r0 = "poi_id"
            r4.put(r0, r5)
        Lc:
            if (r6 == 0) goto L13
            java.lang.String r0 = "enter_from"
            r4.put(r0, r6)
        L13:
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click_profile_card"
            r4.put(r1, r0)
            if (r7 == 0) goto L21
            java.lang.String r0 = "group_id"
            r4.put(r0, r7)
        L21:
            if (r8 == 0) goto L28
            java.lang.String r0 = "author_id"
            r4.put(r0, r8)
        L28:
            if (r9 == 0) goto L2f
            java.lang.String r0 = "log_pb"
            r4.put(r0, r9)
        L2f:
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L3b
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L3e
        L3b:
            r1 = r2
            if (r3 == 0) goto L69
        L3e:
            boolean r0 = r3.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L46:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r1, r0)
            if (r3 == 0) goto L55
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L58
        L55:
            r1 = r2
            if (r3 == 0) goto L5e
        L58:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L67
        L5e:
            r4.put(r1, r2)
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r4)
            return
        L67:
            r2 = r0
            goto L5e
        L69:
            r0 = 0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C225248si.LJIIL(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void LJIIZILJ(String str, String str2, String str3, String str4, String str5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C78685UuP.LJJJZ(str)) {
            linkedHashMap.put("enter_from", str);
        }
        if (C78685UuP.LJJJZ(str2)) {
            linkedHashMap.put("enter_method", str2);
        }
        if (C78685UuP.LJJJZ(str3)) {
            linkedHashMap.put("creation_id", str3);
        }
        if (C78685UuP.LJJJZ(str4)) {
            linkedHashMap.put("content_type", str4);
        }
        if (C78685UuP.LJJJZ(str5)) {
            linkedHashMap.put("shoot_way", str5);
        }
        linkedHashMap.putAll(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationCommonParamsIfHave());
        FMX.LJIIL("poi_fallback_button_click", linkedHashMap);
    }

    public static void LJIJ(String str, String str2, String str3, String str4, String str5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C78685UuP.LJJJZ(str)) {
            linkedHashMap.put("enter_from", str);
        }
        if (C78685UuP.LJJJZ(str2)) {
            linkedHashMap.put("enter_method", str2);
        }
        if (C78685UuP.LJJJZ(str3)) {
            linkedHashMap.put("creation_id", str3);
        }
        if (C78685UuP.LJJJZ(str4)) {
            linkedHashMap.put("content_type", str4);
        }
        if (C78685UuP.LJJJZ(str5)) {
            linkedHashMap.put("shoot_way", str5);
        }
        linkedHashMap.putAll(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationCommonParamsIfHave());
        FMX.LJIIL("poi_fallback_button_show", linkedHashMap);
    }

    public static void LJIJJ(Boolean bool, String str, Long l, Long l2, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("is_silent", bool.toString());
        }
        linkedHashMap.put("state", str);
        if (l != null) {
            linkedHashMap.put("bytes_downloaded", l.toString());
        }
        if (l2 != null) {
            linkedHashMap.put("total_bytes_to_download", l2.toString());
        }
        if (str2 != null) {
            linkedHashMap.put("permission_dialog_result", str2);
        }
        FMX.LJIIL("poi_map_df_state_change", linkedHashMap);
    }

    public static void LJJII(String channelName, long j, String scene, boolean z, boolean z2) {
        String str;
        o.LJIIIZ(channelName, "channelName");
        o.LJIIIZ(scene, "scene");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", String.valueOf(j));
        if (z2) {
            str = "1";
        } else if (z) {
            str = "3";
        } else {
            str = "2";
        }
        linkedHashMap.put("load_status", str);
        linkedHashMap.put("channel_name", channelName);
        linkedHashMap.put(WM7.SCENE_SERVICE, scene);
        FMX.LJIIL("poi_preload_gecko_result", linkedHashMap);
    }

    public static void LJJI(int i, int i2, int i3, String str, String contentType, String str2) {
        o.LJIIIZ(contentType, "contentType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "video_post_page");
        linkedHashMap.put("poi_number", String.valueOf(i));
        linkedHashMap.put("creation_id", str);
        linkedHashMap.put("content_type", contentType);
        linkedHashMap.put("shoot_way", str2);
        linkedHashMap.put("enable_location", String.valueOf(i2));
        linkedHashMap.put("is_ip_recommend", String.valueOf(i3));
        linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("poi_recommendation_show", linkedHashMap);
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4, PoiData poiData, String str5, String enterFrom, Integer num) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", enterFrom);
        linkedHashMap.put("poi_id", str);
        linkedHashMap.put("poi_city", str2);
        C132805Jc.LJFF(linkedHashMap, "poi_region_code", str3, 0, "poi_device_same_city");
        if (str4 != null) {
            linkedHashMap.put("log_id", str4);
        }
        LIZIZ(poiData, linkedHashMap);
        if (str5 != null) {
            linkedHashMap.put("search_id", str5);
        }
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        FMX.LJIIL("delete_poi", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("enter_from", "video_post_page");
        linkedHashMap2.put("anchor_type", "poi");
        linkedHashMap2.put("anchor_name", str2);
        if (str4 != null) {
            linkedHashMap2.put("log_id", str4);
        }
        LIZIZ(poiData, linkedHashMap2);
        FMX.LJIIL("delete_label", linkedHashMap2);
    }

    public static void LJJIFFI(String str, String str2, String str3, String str4, String str5, String str6, String str7, PoiData poiData) {
        LinkedHashMap LIZ2 = C0JU.LIZ("enter_from", "video_post_page");
        if (str != null) {
            LIZ2.put("creation_id", str);
        }
        if (str2 != null) {
            LIZ2.put("content_type", str2);
        }
        if (str3 != null) {
            LIZ2.put("shoot_way", str3);
        }
        LIZ2.put("enable_location", str4);
        if (str5 != null) {
            LIZ2.put("poi_id", str5);
        }
        if (str6 != null) {
            LIZ2.put("index", str6);
        }
        if (str7 != null) {
            LIZ2.put("log_id", str7);
        }
        LIZIZ(poiData, LIZ2);
        LIZ2.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("poi_recommendation_show_al", LIZ2);
    }

    public static void LJJ(int i, String str, String str2, String str3, int i2, long j, int i3, String str4, List poiIds, List list, String str5) {
        o.LJIIIZ(poiIds, "poiIds");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("poi_number", String.valueOf(i));
        if (str != null) {
            linkedHashMap.put("creation_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("content_type", str2);
        }
        linkedHashMap.put("enter_from", "video_post_page");
        C132805Jc.LJFF(linkedHashMap, "shoot_way", str3, i2, "enable_location");
        linkedHashMap.put("duration", String.valueOf(j));
        linkedHashMap.put("is_success", String.valueOf(i3));
        if (str4 != null) {
            linkedHashMap.put("reason", str4);
        }
        linkedHashMap.put("poi_id", poiIds.toString());
        linkedHashMap.put("index", list.toString());
        if (str5 != null) {
            linkedHashMap.put("log_id", str5);
        }
        linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("poi_recommendation_result", linkedHashMap);
    }

    public static void LJI(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, PoiData poiData, String str8, Integer num, int i3) {
        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "video_post_page", "enter_method", "recommend_poi");
        C132805Jc.LJFF(LIZIZ, "poi_id", str, 0, "poi_device_samecity");
        LIZIZ.put("poi_city", str2);
        LIZIZ.put("poi_region_code", str3);
        LIZIZ.put("creation_id", String.valueOf(str4));
        LIZIZ.put("content_type", String.valueOf(str5));
        LIZIZ.put("shoot_way", str6);
        LIZIZ.put("enable_location", String.valueOf(i));
        LIZIZ.put("poi_index", String.valueOf(i2));
        LIZIZ.put("order", String.valueOf(i3));
        if (str7 != null) {
            LIZIZ.put("log_id", str7);
        }
        LIZIZ(poiData, LIZIZ);
        if (str8 != null) {
            LIZIZ.put("search_id", str8);
        }
        if (num != null) {
            LIZIZ.put("aweme_type", String.valueOf(num.intValue()));
        }
        LIZIZ.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("choose_poi", LIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "video_post_page");
        linkedHashMap.put("enter_method", "recommend_poi");
        linkedHashMap.put("poi_id", str);
        linkedHashMap.put("anchor_name", str2);
        linkedHashMap.put("anchor_type", "poi");
        LIZIZ(poiData, linkedHashMap);
        FMX.LJIIL("add_label", linkedHashMap);
    }

    public static void LJIL(String poiId, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, Boolean bool, String str10) {
        String str11;
        o.LJIIIZ(poiId, "poiId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str9 == null) {
            str9 = "poi_detail";
        }
        linkedHashMap.put("enter_from", str9);
        linkedHashMap.put("poi_id", poiId);
        if (str != null) {
            linkedHashMap.put("group_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("author_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("enter_method", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("entrance_enter_method", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("entrance_enter_page", str5);
        }
        C132805Jc.LJFF(linkedHashMap, "poi_info_source", "google", i, "poi_device_samecity");
        if (str6 != null) {
            linkedHashMap.put("poi_city", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("poi_region_code", str7);
        }
        linkedHashMap.put("poi_info_source", "google");
        if (bool != null) {
            if (bool.booleanValue()) {
                str11 = "1";
            } else {
                str11 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_dynamic", str11);
        }
        if (str8 != null) {
            linkedHashMap.put("log_pb", str8);
        }
        C43001GuD.LIZJ(str10, linkedHashMap);
        FMX.LJIIL("poi_map_operation", linkedHashMap);
    }

    public static void LJJIII(String str, String str2, String str3, int i, int i2, int i3, long j, List poiIds, String str4, List indexs, String str5, Long l, Integer num, Integer num2, String str6, Boolean bool) {
        String str7;
        o.LJIIIZ(poiIds, "poiIds");
        o.LJIIIZ(indexs, "indexs");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("key_word", str3);
        linkedHashMap.put("is_success", String.valueOf(i));
        linkedHashMap.put("page_order", String.valueOf(i2));
        linkedHashMap.put("enable_location", String.valueOf(i3));
        linkedHashMap.put("duration", String.valueOf(j));
        linkedHashMap.put("poi_id", poiIds.toString());
        if (o.LJ(bool, Boolean.TRUE)) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_cache_search", str7);
        if (str4 != null) {
            linkedHashMap.put("log_id", str4);
        }
        linkedHashMap.put("index", indexs.toString());
        if (str5 != null) {
            linkedHashMap.put("impr_id", str5);
        }
        if (C78685UuP.LJJJZ(str3)) {
            linkedHashMap.put("search_session_id", String.valueOf(l));
        }
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        linkedHashMap.put("deduplication_num", String.valueOf(num2.intValue()));
        if (str6 != null) {
            linkedHashMap.put("creation_id", str6);
        }
        linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("search_poi_result", linkedHashMap);
    }

    public static void LJII(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, int i2, String str10, String str11, PoiData poiData, String str12, Long l, Integer num, String str13, Boolean bool) {
        String str14;
        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", str, "enter_method", "recommend_poi");
        C132805Jc.LJFF(LIZIZ, "poi_id", str2, 0, "poi_device_samecity");
        LIZIZ.put("poi_city", str3);
        LIZIZ.put("poi_region_code", str4);
        LIZIZ.put("creation_id", String.valueOf(str5));
        LIZIZ.put("content_type", String.valueOf(str6));
        C132805Jc.LJFF(LIZIZ, "shoot_way", str7, i, "enable_location");
        if (str8 == null) {
            str8 = "";
        }
        LIZIZ.put("poi_index", str8);
        if (o.LJ(bool, Boolean.TRUE)) {
            str14 = "1";
        } else {
            str14 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.put("is_cache_search", str14);
        C132805Jc.LJFF(LIZIZ, "key_word", str9, i2, "order");
        LIZIZ.put("enter_method", str10);
        if (str11 != null) {
            LIZIZ.put("log_id", str11);
        }
        LIZIZ(poiData, LIZIZ);
        if (str12 != null) {
            LIZIZ.put("search_id", str12);
        }
        if (C78685UuP.LJJJZ(str9)) {
            LIZIZ.put("search_session_id", String.valueOf(l));
        }
        if (num != null) {
            LIZIZ.put("aweme_type", String.valueOf(num.intValue()));
        }
        LIZIZ.put("poi_category_has_show", str13);
        LIZIZ.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("choose_poi", LIZIZ);
    }
}
