package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.LinkedHashMap;

/* renamed from: X.Lce, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54652Lce {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(String str, boolean z) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("key_word", str);
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_success", str2);
        FMX.LJIIL("search_city_result", linkedHashMap);
    }

    public static void LIZJ(String str, String str2, String str3) {
        LinkedHashMap LIZ2 = C0JU.LIZ("enter_method", str);
        if (str2 != null) {
            LIZ2.put("city_name", str2);
        }
        if (str3 != null) {
            LIZ2.put("previous_region", str3);
        }
        FMX.LJIIL("choose_region", LIZ2);
    }

    public static void LJ(String str, java.util.Map map, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    public static void LIZ(String str, String str2, int i, int i2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("tab_code", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("city_id", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("city_name", str4);
        }
        linkedHashMap.put("index", String.valueOf(i));
        linkedHashMap.put("total_tab_cnt", String.valueOf(i2));
        linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("category_carousel_click", linkedHashMap);
    }

    public static void LIZIZ(String str, String str2, int i, int i2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("tab_code", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        linkedHashMap.put("city_id", str3);
        if (str4 != null) {
            linkedHashMap.put("city_name", str4);
        }
        linkedHashMap.put("index", String.valueOf(i));
        linkedHashMap.put("total_tab_cnt", String.valueOf(i2));
        linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("category_carousel_show", linkedHashMap);
    }
}
