package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.router.ECMallRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.EcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Lzs */
/* loaded from: classes10.dex */
public final class C56092Lzs {
    public static final C56092Lzs LIZ = new C56092Lzs();
    public static final ConcurrentHashMap<String, Integer> LIZIZ;
    public static final String LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;
    public static final C62822Ol8 LJFF;
    public static final C62822Ol8 LJI;

    static {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("tiktokec_cart_entrance_show", 1);
        concurrentHashMap.put("tiktokec_cart_entrance_show_test", 1);
        LIZIZ = concurrentHashMap;
        LynxEnv.LJIIIZ().getClass();
        LIZJ = "2.10.16-rc.10";
        LIZLLL = C221108m2.LIZIZ(M0J.LJLIL);
        LJ = C221108m2.LIZIZ(C35695Dzf.LJLIL);
        LJFF = C221108m2.LIZIZ(E2K.LJLIL);
        LJI = C221108m2.LIZIZ(E2L.LJLIL);
    }

    public static String LIZJ() {
        ShopMainFragment.LJZ.getClass();
        if (C54741Le5.LIZIZ()) {
            return "homepage_mall";
        }
        return "mall";
    }

    public static java.util.Map LJ() {
        return (java.util.Map) LIZLLL.getValue();
    }

    public static String LIZLLL() {
        if (C53286Kvi.LIZLLL()) {
            return "mall";
        }
        if (C53286Kvi.LJ()) {
            return "homepage_mall";
        }
        return "";
    }

    public static void LIZ(java.util.Map map) {
        Boolean LJ2 = C38987FRv.LJ();
        o.LJIIIIZZ(LJ2, "isFirstInstallAndFirstLaunchLowCost()");
        HashMap hashMap = (HashMap) map;
        hashMap.put("is_first_launch", Integer.valueOf(LJ2.booleanValue() ? 1 : 0));
        hashMap.put("is_first_enter_mall", Integer.valueOf(M0M.LIZIZ() ? 1 : 0));
        hashMap.put("is_ug_allowlist_user", EcUgNewInstallService.LIZLLL().LIZ().getSecond());
    }

    public static void LIZIZ(java.util.Map map) {
        for (Map.Entry entry : ((java.util.Map) LJI.getValue()).entrySet()) {
            HashMap hashMap = (HashMap) map;
            if (!hashMap.containsKey(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        HashMap hashMap2 = (HashMap) map;
        if (!hashMap2.containsKey("mall_extra_info")) {
            ShopMainFragment.LJZ.getClass();
            String str = ShopMainFragment.LLFF;
            if (str == null) {
                str = "";
            }
            hashMap2.put("mall_extra_info", str);
        }
    }

    public static void LJFF(java.util.Map extraParams) {
        o.LJIIIZ(extraParams, "extraParams");
        HashMap hashMap = new HashMap();
        hashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        LIZ.getClass();
        hashMap.put("enter_from", LIZJ());
        hashMap.put("page_name", "mall");
        for (Map.Entry entry : extraParams.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        LJIILIIL("tiktokec_cart_entrance_click", hashMap);
    }

    public static void LJIIIZ(boolean z) {
        Object obj;
        Object obj2;
        HashMap LIZJ2 = C03660Ck.LIZJ("page_name", "mall");
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ2.put("is_success", obj);
        LIZ.getClass();
        LIZJ2.put("enter_from", LIZJ());
        if (M0M.LIZ()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ2.put("is_first_install_launch", obj2);
        if (M0M.LIZIZ()) {
            str = "1";
        }
        LIZJ2.put("is_first_show_mall", str);
        LJIILJJIL("rd_tiktokec_lynx_template_result", LIZJ2);
    }

    public static void LJIIL(int i, String str) {
        HashMap hashMap = new HashMap();
        LIZ.getClass();
        hashMap.put("enter_from", LIZJ());
        ShopMainFragment.LJZ.getClass();
        String str2 = ShopMainFragment.LJZI;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("previous_page", str2);
        hashMap.put("status", Integer.valueOf(i));
        if (str != null) {
            hashMap.put("page_type", str);
        }
        hashMap.putAll(LJ());
        LJIILJJIL("rd_tiktokec_mall_error_view_status", hashMap);
    }

    public static void LJIILIIL(String str, java.util.Map map) {
        LIZIZ(map);
        for (Map.Entry entry : ((java.util.Map) LJFF.getValue()).entrySet()) {
            HashMap hashMap = (HashMap) map;
            if (!hashMap.containsKey(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C76542zS.LIZ(str, map);
    }

    public static void LJIILJJIL(String str, java.util.Map map) {
        LIZIZ(map);
        for (Map.Entry entry : ((java.util.Map) LJ.getValue()).entrySet()) {
            HashMap hashMap = (HashMap) map;
            if (!hashMap.containsKey(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        HashMap hashMap2 = (HashMap) map;
        if (!hashMap2.containsKey("open_from")) {
            ShopMainFragment.LJZ.getClass();
            String str2 = ShopMainFragment.LLF;
            if (str2 == null) {
                str2 = "";
            }
            hashMap2.put("open_from", str2);
        }
        C76542zS.LIZ(str, map);
    }

    public static void LJIILL(java.util.Map map, boolean z) {
        Object obj;
        Object obj2;
        HashMap hashMap = new HashMap();
        LIZ.getClass();
        hashMap.put("enter_from", LIZLLL());
        hashMap.put("page_name", "mall");
        String str = "1";
        if (M0M.LIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_first_install_launch", obj);
        if (M0M.LIZIZ()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_first_show_mall", obj2);
        if (!z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_available", str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LJIILJJIL("rd_tiktokec_network_available", hashMap);
    }

    public static void LJIJI(String str, String source) {
        long j;
        String str2;
        o.LJIIIZ(source, "source");
        if (ECMallRouterInterceptor.LJLIL) {
            if (o.LJ(str, "onPageShow")) {
                ECMallRouterInterceptor.LJLIL = false;
            }
            java.util.Map<String, ? extends Object> map = ECMallRouterInterceptor.LJLJI;
            if (map != null) {
                C56092Lzs c56092Lzs = LIZ;
                HashMap LIZJ2 = C03660Ck.LIZJ("stage", str);
                long currentTimeMillis = System.currentTimeMillis();
                Object obj = ((LinkedHashMap) map).get("init_time");
                if ((obj instanceof String) && (str2 = (String) obj) != null) {
                    j = CastLongProtector.parseLong(str2);
                } else {
                    j = 0;
                }
                LIZJ2.put("duration", Long.valueOf(currentTimeMillis - j));
                c56092Lzs.getClass();
                LIZJ2.put("enter_from", LIZLLL());
                LIZJ2.put("source", source);
                LIZ(LIZJ2);
                LIZJ2.putAll(map);
                LJIILJJIL("rd_tiktokec_mall_tab_life", LIZJ2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(android.content.Context r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56092Lzs.LJIJJ(android.content.Context, java.lang.String):void");
    }

    public static void LJI(String str, String str2, java.util.Map map) {
        String str3;
        long j;
        String str4;
        if (ECMallRouterInterceptor.LJLILLLLZI) {
            ECMallRouterInterceptor.LJLILLLLZI = false;
            HashMap LIZJ2 = C03660Ck.LIZJ("page_name", "mall");
            LIZ.getClass();
            LIZJ2.put("enter_from", LIZJ());
            LIZJ2.put("schema", str);
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            LIZJ2.put("deeplink_from", str3);
            if (str2 == null) {
                str2 = "";
            }
            LIZJ2.put("source", str2);
            for (Map.Entry entry : map.entrySet()) {
                LIZJ2.put(entry.getKey(), entry.getValue());
            }
            java.util.Map<String, ? extends Object> map2 = ECMallRouterInterceptor.LJLJI;
            if (map2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                Object obj = ((LinkedHashMap) map2).get("init_time");
                if ((obj instanceof String) && (str4 = (String) obj) != null) {
                    j = CastLongProtector.parseLong(str4);
                } else {
                    j = 0;
                }
                LIZJ2.put("duration", Long.valueOf(currentTimeMillis - j));
            }
            LJIILJJIL("rd_tiktokec_deeplink_event_send", LIZJ2);
        }
    }

    public static void LJIJJLI(Boolean bool, Boolean bool2, Boolean bool3) {
        String str;
        Object obj;
        HashMap LIZJ2 = C03660Ck.LIZJ("page_name", "mall");
        LIZ.getClass();
        LIZJ2.put("enter_from", LIZJ());
        String str2 = "1";
        if (bool == null) {
            str = "-1";
        } else if (bool.booleanValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ2.put("is_success", str);
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ2.put("is_data_cache", obj);
        }
        if (bool3 != null) {
            if (!bool3.booleanValue()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ2.put("has_data", str2);
        }
        LIZJ2.putAll(LJ());
        LJIILJJIL("rd_tiktokec_mall_update_lynx_data_unsent", LIZJ2);
    }

    public static void LJIIIIZZ(String pageName, String requestType, String loadType, String loadSrc) {
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(requestType, "requestType");
        o.LJIIIZ(loadType, "loadType");
        o.LJIIIZ(loadSrc, "loadSrc");
        HashMap hashMap = new HashMap();
        hashMap.put("page_name", pageName);
        LIZ.getClass();
        hashMap.put("enter_from", LIZLLL());
        hashMap.put("request_type", requestType);
        hashMap.put("load_type", loadType);
        hashMap.put("load_src", loadSrc);
        LJIILJJIL("rd_img_preload_start", hashMap);
    }

    public static void LJIILLIIL(int i, int i2, long j, java.util.Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("mall_request_type", Integer.valueOf(i));
        hashMap.put("stage", Integer.valueOf(i2));
        hashMap.put("duration", Long.valueOf(j));
        LIZ.getClass();
        hashMap.put("enter_from", LIZLLL());
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LJIILJJIL("rd_tiktokec_mall_power_preload", hashMap);
    }

    public static void LJIIJ(String str, long j, boolean z, boolean z2, java.util.Map map) {
        Object obj;
        HashMap LIZ2 = C1R5.LIZ(str, "stage");
        LIZ.getClass();
        LIZ2.put("enter_from", LIZJ());
        ShopMainFragment.LJZ.getClass();
        String str2 = ShopMainFragment.LJZI;
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("previous_page", str2);
        LIZ2.put("stage", str);
        LIZ2.put("duration", Long.valueOf(j));
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_success", obj);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("has_failed", str3);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                LIZ2.put(entry.getKey(), entry.getValue());
            }
        }
        LIZ.getClass();
        LIZ2.putAll(LJ());
        LJIILJJIL("rd_tiktokec_mall_container_lifecycle_dur", LIZ2);
    }

    public static /* synthetic */ void LJIIJJI(C56092Lzs c56092Lzs, String str, long j, boolean z, int i) {
        boolean z2;
        long j2 = j;
        boolean z3 = z;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        c56092Lzs.getClass();
        LJIIJ(str, j2, z2, z3, null);
    }

    public static /* synthetic */ void LJIIZILJ(C56092Lzs c56092Lzs, int i, int i2, long j, int i3) {
        if ((i3 & 4) != 0) {
            j = 0;
        }
        c56092Lzs.getClass();
        LJIILLIIL(i, i2, j, null);
    }

    public static void LJIJ(String str, long j, boolean z, boolean z2, java.util.Map map) {
        Object obj;
        HashMap LIZ2 = C1R5.LIZ(str, "stage");
        LIZ.getClass();
        LIZ2.put("enter_from", LIZJ());
        ShopMainFragment.LJZ.getClass();
        String str2 = ShopMainFragment.LJZI;
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("previous_page", str2);
        LIZ2.put("stage", str);
        LIZ2.put("duration", Long.valueOf(j));
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_success", obj);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("has_failed", str3);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                LIZ2.put(entry.getKey(), entry.getValue());
            }
        }
        LIZ.getClass();
        LIZ2.putAll(LJ());
        LJIILJJIL("rd_tiktokec_mall_stage_dur_native", LIZ2);
    }

    public static void LJII(String pageName, String requestType, long j, String loadType, String loadSrc, String loadState, String url) {
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(requestType, "requestType");
        o.LJIIIZ(loadType, "loadType");
        o.LJIIIZ(loadSrc, "loadSrc");
        o.LJIIIZ(loadState, "loadState");
        o.LJIIIZ(url, "url");
        HashMap hashMap = new HashMap();
        hashMap.put("page_name", pageName);
        LIZ.getClass();
        hashMap.put("enter_from", LIZLLL());
        hashMap.put("request_type", requestType);
        hashMap.put("load_type", loadType);
        hashMap.put("load_src", loadSrc);
        hashMap.put("load_duration", Long.valueOf(j));
        hashMap.put("load_state", loadState);
        hashMap.put("img_url", url);
        LJIILJJIL("rd_img_preload_result", hashMap);
    }

    public static void LJIL(String str, long j, boolean z, String str2, int i, boolean z2, boolean z3, String sourceType, boolean z4) {
        Object obj;
        Object obj2;
        Object obj3;
        java.util.Map<String, ? extends Object> map;
        long j2;
        String str3;
        o.LJIIIZ(sourceType, "sourceType");
        HashMap hashMap = new HashMap();
        hashMap.put("page_name", "mall");
        hashMap.put("previous_page", str);
        LIZ.getClass();
        hashMap.put("enter_from", LIZJ());
        hashMap.put("stay_time", Long.valueOf(j));
        hashMap.put("quit_type", str2);
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_load_data", obj);
        hashMap.put("request_type", Integer.valueOf(i));
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("lynx_load_success", obj2);
        if (z3) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("lynx_first_screen", obj3);
        hashMap.put("source", sourceType);
        hashMap.putAll(LJ());
        if (!z4) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_mall_route", str4);
        if (z4 && (map = ECMallRouterInterceptor.LJLJI) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj4 = ((LinkedHashMap) map).get("init_time");
            if ((obj4 instanceof String) && (str3 = (String) obj4) != null) {
                j2 = CastLongProtector.parseLong(str3);
            } else {
                j2 = 0;
            }
            hashMap.put("duration", Long.valueOf(currentTimeMillis - j2));
            hashMap.putAll(map);
        }
        LJIILJJIL("rd_tiktokec_stay_page", hashMap);
    }
}
