package X;

import java.util.LinkedHashMap;

/* renamed from: X.RzX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71359RzX {
    public static final C71359RzX LIZ = new C71359RzX();
    public static final java.util.Map<String, Object> LIZIZ = new LinkedHashMap();

    public static void LIZ(java.util.Map map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("author_id");
        if (obj != null) {
            LIZIZ.put("author_id", obj);
        }
        Object obj2 = linkedHashMap.get("creation_id");
        if (obj2 != null) {
            LIZIZ.put("creation_id", obj2);
        }
        Object obj3 = linkedHashMap.get("has_shop_anchor");
        if (obj3 != null) {
            LIZIZ.put("has_shop_anchor", obj3);
        }
        Object obj4 = linkedHashMap.get("last_has_shop_anchor");
        if (obj4 != null) {
            LIZIZ.put("last_has_shop_anchor", obj4);
        }
        Object obj5 = linkedHashMap.get("region");
        if (obj5 != null) {
            LIZIZ.put("region", obj5);
        }
    }

    public static /* synthetic */ void LJ(C71359RzX c71359RzX, Integer num, String str, String str2, boolean z) {
        c71359RzX.getClass();
        LIZLLL(true, num, str, str2, z, null);
    }

    public static void LIZIZ(int i, String str, boolean z, long j, Integer num, long j2) {
        int i2;
        String str2;
        EnumC53638L3i enumC53638L3i = EnumC53638L3i.VIDEO_ANCHOR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("duration", Long.valueOf(j));
        linkedHashMap.put("click_duration", Long.valueOf(j2));
        linkedHashMap.put("error_code", 6001);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        linkedHashMap.put("request_code", Integer.valueOf(i2));
        linkedHashMap.put("type", Integer.valueOf(i));
        if (z) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        linkedHashMap.put("is_single_anchor", str2);
        if (str != null) {
            linkedHashMap.put("entrance_form", str);
        }
        C66832jn.LIZIZ("rd_tiktokec_video_shopping_list_request_result", enumC53638L3i, 1001, "diff request fail", linkedHashMap);
    }

    public static /* synthetic */ void LIZJ(C71359RzX c71359RzX, int i, String str, boolean z, long j, Integer num) {
        c71359RzX.getClass();
        LIZIZ(i, str, z, j, num, -1L);
    }

    public static void LIZLLL(boolean z, Integer num, String str, String str2, boolean z2, java.util.Map map) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (z2) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        linkedHashMap.put("is_single_anchor", str3);
        if (map != null) {
            linkedHashMap.putAll(C113554cx.LJJLIL(map));
        }
        if (str2 != null) {
            linkedHashMap.put("entrance_form", str2);
        }
        if (z) {
            C66832jn.LIZIZ("rd_tiktokec_video_anchor_view_click_fail", EnumC53638L3i.VIDEO_ANCHOR, num, str, linkedHashMap);
        } else {
            C66832jn.LIZJ(num, "rd_tiktokec_video_anchor_view_click_fail", str, linkedHashMap);
        }
    }
}
