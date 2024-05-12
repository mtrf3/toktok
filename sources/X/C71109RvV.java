package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RvV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71109RvV {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJ(int i, String str, String str2, String role) {
        o.LJIIIZ(role, "role");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("author_id", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("room_id", str2);
        C132805Jc.LJFF(linkedHashMap, "live_role", role, i, "step");
        C48658J7u.LIZ("rd_tiktokec_live_pop_coupon_card_data_process", linkedHashMap);
    }

    public static final void LJFF(String str, String str2, Long l, String str3, String role) {
        o.LJIIIZ(role, "role");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("author_id", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("room_id", str2);
        linkedHashMap.put("fail_reason", str3);
        if (l != null) {
            linkedHashMap.put("duration", String.valueOf(l.longValue()));
        }
        linkedHashMap.put("live_role", role);
        C48658J7u.LIZ("rd_tiktokec_live_pop_coupon_card_show_fail", linkedHashMap);
    }

    public static final void LIZLLL(String str, String str2, String str3, boolean z, String str4, String str5, String role, long j) {
        o.LJIIIZ(role, "role");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("author_id", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("room_id", str2);
        if (str3 == null || ujb.o.LJJJJJL(str3)) {
            str3 = "-1";
        }
        linkedHashMap.put("coupon_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("coupon_type_id", str4);
        linkedHashMap.put("success", String.valueOf(z));
        linkedHashMap.put("duration", String.valueOf(j));
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("error_message", str5);
        linkedHashMap.put("live_role", role);
        C48658J7u.LIZ("rd_tiktokec_live_pop_coupon_claim_result", linkedHashMap);
    }

    public static final void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        LinkedHashMap LIZ2 = C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str == null) {
            str = "";
        }
        LIZ2.put("author_id", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("room_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("enter_from_merge", str3);
        if (str4 == null) {
            str4 = "";
        }
        LIZ2.put("enter_method", str4);
        if (str5 == null) {
            str5 = "";
        }
        LIZ2.put("action_type", str5);
        LIZ2.put("follow_status", String.valueOf(str6));
        if (str7 == null) {
            str7 = "";
        }
        LIZ2.put("page_name", str7);
        LIZ2.put("button_type", "use_coupon");
        LIZ2.put("button_name", "use");
        LIZ2.put("subsequent_page", "add_on_item");
        if (str8 == null || ujb.o.LJJJJJL(str8)) {
            str8 = "-1";
        }
        LIZ2.put("coupon_id", str8);
        if (str9 == null) {
            str9 = "";
        }
        LIZ2.put("coupon_type_id", str9);
        if (str10 == null) {
            str10 = "";
        }
        LIZ2.put("coupon_type_info", str10);
        LIZ2.put("coupon_zone", "live_popup_card");
        LIZ2.put("click_area", str11);
        C48658J7u.LIZ("livesdk_tiktokec_button_click", LIZ2);
    }

    public static final void LIZJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        LinkedHashMap LIZ2 = C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str == null) {
            str = "";
        }
        LIZ2.put("author_id", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("room_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("enter_from_merge", str3);
        if (str4 == null) {
            str4 = "";
        }
        LIZ2.put("enter_method", str4);
        if (str5 == null) {
            str5 = "";
        }
        LIZ2.put("action_type", str5);
        if (str6 == null) {
            str6 = "";
        }
        LIZ2.put("follow_status", str6);
        if (str7 == null) {
            str7 = "";
        }
        LIZ2.put("page_name", str7);
        if (str8 == null || ujb.o.LJJJJJL(str8)) {
            str8 = "-1";
        }
        LIZ2.put("coupon_id", str8);
        if (str9 == null) {
            str9 = "";
        }
        LIZ2.put("coupon_type_id", str9);
        if (str10 == null) {
            str10 = "";
        }
        LIZ2.put("coupon_type_info", str10);
        LIZ2.put("coupon_zone", "live_popup_card");
        LIZ2.put("click_area", str11);
        C48658J7u.LIZ("livesdk_tiktokec_coupon_click", LIZ2);
    }

    public static final void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11) {
        String str12;
        LinkedHashMap LIZ2 = C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str == null) {
            str = "";
        }
        LIZ2.put("author_id", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("room_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("enter_from_merge", str3);
        if (str4 == null) {
            str4 = "";
        }
        LIZ2.put("enter_method", str4);
        if (str5 == null) {
            str5 = "";
        }
        LIZ2.put("action_type", str5);
        if (str6 == null) {
            str6 = "";
        }
        LIZ2.put("follow_status", str6);
        if (str7 == null) {
            str7 = "";
        }
        LIZ2.put("page_name", str7);
        if (str8 == null || ujb.o.LJJJJJL(str8)) {
            str8 = "-1";
        }
        LIZ2.put("coupon_id", str8);
        if (str9 == null) {
            str9 = "";
        }
        LIZ2.put("coupon_type_id", str9);
        if (str10 == null) {
            str10 = "";
        }
        LIZ2.put("coupon_type_info", str10);
        LIZ2.put("coupon_zone", "live_popup_card");
        if (z) {
            str12 = "1";
        } else {
            str12 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_success", str12);
        if (str11 == null) {
            str11 = "";
        }
        LIZ2.put("fail_reason", str11);
        C48658J7u.LIZ("livesdk_tiktokec_coupon_result", LIZ2);
    }
}
