package X;

import java.util.LinkedHashMap;

/* renamed from: X.7rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198847rE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(Integer num, String str, String str2) {
        LinkedHashMap LIZ2 = C0JU.LIZ("enter_from", "poi_detail");
        if (str != null) {
            LIZ2.put("poi_id", str);
        }
        if (num != null) {
            LIZ2.put("review_cnt", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            C43001GuD.LIZJ(str2, LIZ2);
        }
        FMX.LJIIL("show_reviews_section", LIZ2);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        linkedHashMap.put("enter_method", str2);
        if (str3 != null) {
            linkedHashMap.put("poi_id", str3);
        }
        if (str4 != null) {
            C43001GuD.LIZJ(str4, linkedHashMap);
        }
        linkedHashMap.put("is_enter", String.valueOf(1));
        FMX.LJIIL("poi_review_post_entrance_click", linkedHashMap);
    }

    public static void LIZJ(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        linkedHashMap.put("enter_method", str2);
        if (str3 != null) {
            linkedHashMap.put("poi_id", str3);
        }
        if (str4 != null) {
            C43001GuD.LIZJ(str4, linkedHashMap);
        }
        FMX.LJIIL("poi_review_post_entrance_show", linkedHashMap);
    }

    public static void LIZ(int i, String str, String str2, String str3, String str4) {
        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", str, "enter_method", str2);
        LIZIZ.put("poi_id", str3);
        C43001GuD.LIZJ(str4, LIZIZ);
        LIZIZ.put("review_cnt", String.valueOf(i));
        FMX.LJIIL("enter_poi_reviews_page", LIZIZ);
    }
}
