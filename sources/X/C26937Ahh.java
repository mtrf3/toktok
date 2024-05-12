package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS29S1000000_4;
import ujb.o;

/* renamed from: X.Ahh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26937Ahh {
    public static final LinkedHashMap<String, Object> LIZ = new LinkedHashMap<>();
    public static String LIZIZ;
    public static String LIZJ;

    public static String LIZ(List list) {
        if (list == null) {
            return LIZIZ;
        }
        new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Map<String, String> map = ((LogisticDTO) it.next()).eventTrackInfo;
            if (map != null) {
                arrayList.add(map);
            }
        }
        if (arrayList.isEmpty()) {
            return LIZIZ;
        }
        String LJI = C27739Aud.LJI(arrayList);
        LIZIZ = LJI;
        return LJI;
    }

    public static void LJI(C26800AfU c26800AfU) {
        java.util.Map LJJLIL = C113554cx.LJJLIL(LIZ);
        LJJLIL.put("module_name", "free_shipping_condition");
        List<LogisticItem> list = c26800AfU.LIZ.items;
        if (list != null) {
            Iterator<LogisticItem> it = list.iterator();
            while (it.hasNext()) {
                HashMap<String, Object> LJII = C27739Aud.LJII(it.next().daInfo);
                if (LJII != null) {
                    LJJLIL.putAll(LJII);
                }
            }
        }
        b.LJJIJIIJI("tiktokec_module_show", LJJLIL);
        String str = c26800AfU.LIZIZ;
        if (str == null || o.LJJJJJL(str)) {
            return;
        }
        C76542zS.LIZIZ("tiktokec_coupon_show", LIZ, new AqS29S1000000_4(str, 35));
    }

    public static String LIZIZ(LogisticDTO logisticDTO, List list) {
        java.util.Map<String, String> map;
        java.util.Map<String, String> map2;
        if (logisticDTO != null && (map2 = logisticDTO.eventTrackInfo) != null && map2.containsKey("ship_from")) {
            LIZJ = map2.get("ship_from");
            return map2.get("ship_from");
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LogisticDTO logisticDTO2 = (LogisticDTO) it.next();
                Boolean bool = logisticDTO2.isDefault;
                if (bool != null && bool.booleanValue() && (map = logisticDTO2.eventTrackInfo) != null && map.containsKey("ship_from")) {
                    LIZJ = map.get("ship_from");
                    return map.get("ship_from");
                }
            }
        }
        return LIZJ;
    }

    public static void LJ(String buttonName, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        kotlin.jvm.internal.o.LJIIIZ(buttonName, "buttonName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("button_name", buttonName);
        if (str != null) {
            linkedHashMap.put("button_type", str);
        }
        if (str2 != null) {
            linkedHashMap.put("is_next_day_delivery", str2);
        }
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
    }

    public static void LIZJ(String buttonName, String str, Float f, String str2, String str3, String str4, String str5) {
        kotlin.jvm.internal.o.LJIIIZ(buttonName, "buttonName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("button_name", buttonName);
        if (str != null) {
            linkedHashMap.put("button_type", str);
        }
        if (f != null) {
            linkedHashMap.put("shipping_price", f);
        }
        if (str2 != null) {
            linkedHashMap.put("shipping_currency", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("free_shipping_condition", str3);
        }
        if (str5 != null) {
            linkedHashMap.put("sub_page_name", str5);
        }
        if (str4 != null) {
            linkedHashMap.put("is_next_day_delivery", str4);
        }
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }

    public static /* synthetic */ void LIZLLL(String str, String str2, Float f, String str3, String str4, String str5, String str6, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        LIZJ(str, str2, f, str3, str4, str5, str6);
    }

    public static void LJFF(String str, String str2, int i, Float f, String str3, String str4, java.util.Map params, String str5, String str6, java.util.Map map) {
        kotlin.jvm.internal.o.LJIIIZ(params, "params");
        C76542zS.LIZIZ(str, LIZ, new C26939Ahj(params, str2, i, str5, f, str3, str4, str6, map));
    }
}
