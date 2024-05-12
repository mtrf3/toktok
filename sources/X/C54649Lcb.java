package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Lcb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54649Lcb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("discovery_type", String.valueOf(2));
        linkedHashMap.put("actual_discovery_type", String.valueOf(i));
        FMX.LJIIL("enter_discovery", linkedHashMap);
    }

    public static void LIZJ(java.util.Map map, int i, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", String.valueOf(i));
        linkedHashMap.put("enter_from", "places_discover");
        linkedHashMap.put("previous_page", str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        FMX.LJIIL("search_this_area_result", linkedHashMap);
    }

    public static void LIZIZ(String str, java.util.Map map, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, EnumC56160M2i actionType) {
        Object obj;
        Object obj2;
        o.LJIIIZ(actionType, "actionType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "places_discover");
        linkedHashMap.put("previous_page", str);
        linkedHashMap.put("type_code", str2);
        linkedHashMap.put("city_id", str3);
        linkedHashMap.put("city_name", str4);
        String str5 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("enable_location", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("system_is_precise", obj2);
        if (!z3) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("inapp_is_precise", str5);
        linkedHashMap.put("action_type", actionType.getValue());
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        FMX.LJIIL("discovery_map_action", linkedHashMap);
    }
}
