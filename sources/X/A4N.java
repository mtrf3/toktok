package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class A4N {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str2, "roomId");
        LIZLLL.LJIIIZ("user_id", str);
        LIZLLL.LJIIIZ("enter_from", "live");
        LIZLLL.LJIIIZ("room_id", str2);
        FMX.LJIIL("livesdk_live_takepage_series_show", LIZLLL.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, List list) {
        String str4;
        C188727au LIZLLL = KNV.LIZLLL(str2, "roomId");
        LIZLLL.LJIIIZ("enter_from", "live");
        LIZLLL.LJIIIZ("user_id", str);
        if (list != null) {
            str4 = ORZ.LLD(list, ",", null, null, null, 62);
        } else {
            str4 = null;
        }
        LIZLLL.LJIIIZ("collection_id_list", str4);
        LIZLLL.LJIIIZ("room_id", str2);
        LIZLLL.LJIIIZ("error_code", str3);
        FMX.LJIIL("add_series_page_show_live", LIZLLL.LIZ);
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", str);
        c188727au.LJIIIZ("collection_id", str2);
        c188727au.LJIIIZ("room_id", str3);
        c188727au.LIZLLL(i, "finish_flag");
        FMX.LJIIL("pinned_series_show_live", c188727au.LIZ);
    }

    public static void LIZLLL(List list, String str, String str2, String str3, String str4) {
        C188727au LIZLLL = KNV.LIZLLL(str2, "roomId");
        LIZLLL.LJIIIZ("enter_from", "live");
        LIZLLL.LJIIIZ("user_id", str);
        LIZLLL.LJFF(list, "collection_id_list_ordered");
        LIZLLL.LJIIIZ("room_id", str2);
        LIZLLL.LJIIIZ("page_type", str3);
        LIZLLL.LJIIIZ("error_code", str4);
        FMX.LJIIL("selected_series_show_live", LIZLLL.LIZ);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.CharSequence, X.Yns] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.CharSequence, X.Yns] */
    public static void LJ(String str, String str2, String str3, List list, String str4, List list2, List list3, List list4) {
        String str5;
        String str6;
        String str7;
        String str8;
        C188727au LIZLLL = KNV.LIZLLL(str2, "roomId");
        LIZLLL.LJIIIZ("enter_from", "live_shop_panel");
        LIZLLL.LJIIIZ("author_id", str);
        LIZLLL.LJIIIZ("room_id", str2);
        LIZLLL.LJIIIZ("user_id", str3);
        LIZLLL.LJIIIZ("entry_method", "series_list_button");
        String str9 = null;
        if (list != null) {
            str5 = ORZ.LLD(list, ",", null, null, null, 62);
        } else {
            str5 = null;
        }
        LIZLLL.LJIIIZ("collection_id_list_ordered", str5);
        if (list2 != null) {
            str9 = null;
            str6 = ORZ.LLD(list2, ",", null, null, null, 62);
        } else {
            str6 = null;
        }
        LIZLLL.LJIIIZ("collection_price_list", str6);
        if (list3 != null) {
            ?? r4 = str9;
            str7 = ORZ.LLD(list3, ",", r4, r4, r4, 62);
            str8 = r4;
        } else {
            str7 = str9;
            str8 = str9;
        }
        LIZLLL.LJIIIZ("is_discounted_flag_list", str7);
        String str10 = str8;
        if (list4 != null) {
            ?? r42 = str8;
            str10 = ORZ.LLD(list4, ",", r42, r42, r42, 62);
        }
        LIZLLL.LJIIIZ("discount_price_list", str10);
        LIZLLL.LJIIIZ("error_code", str4);
        FMX.LJIIL("view_series_live", LIZLLL.LIZ);
    }
}
