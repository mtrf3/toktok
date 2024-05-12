package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.RwM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71162RwM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            jSONObject.put(str, obj);
        }
    }

    public static final void LIZIZ(String str, C48502J1u c48502J1u, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String LIZJ;
        LinkedHashMap LIZ2 = C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str9 = "";
        if (c48502J1u == null || (str4 = c48502J1u.LIZJ("author_id")) == null) {
            str4 = "";
        }
        LIZ2.put("author_id", str4);
        if (c48502J1u == null || (str5 = c48502J1u.LIZJ("room_id")) == null) {
            str5 = "";
        }
        LIZ2.put("room_id", str5);
        LIZ2.put("live_status", "during_live");
        LIZ2.put("page_name", "live");
        LIZ2.put("button_name", "live_helper");
        LIZ2.put("is_pin_product", "1");
        LIZ2.put("user_type", str);
        if (c48502J1u == null || (str6 = c48502J1u.LIZJ("product_id")) == null) {
            str6 = "";
        }
        LIZ2.put("product_id", str6);
        if (c48502J1u == null || (str7 = c48502J1u.LIZJ("product_source")) == null) {
            str7 = "";
        }
        LIZ2.put("product_source", str7);
        if (c48502J1u == null || (str8 = c48502J1u.LIZJ("source_from")) == null) {
            str8 = "";
        }
        LIZ2.put("source_from", str8);
        if (c48502J1u != null && (LIZJ = c48502J1u.LIZJ("source")) != null) {
            str9 = LIZJ;
        }
        LIZ2.put("source", str9);
        LIZ2.put("button_type", "open");
        if (o.LJ(str, "moderator")) {
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            o.LJIIIIZZ(currentUserID, "get().getService(IUserSe…class.java).currentUserID");
            LIZ2.put("moderator_id", currentUserID);
        }
        LIZ2.put("click_status", str2);
        if (str3 != null) {
            LIZ2.put("fail_reason", str3);
        }
        C48658J7u.LIZ("livesdk_tiktokec_button_click", LIZ2);
    }

    public static final void LIZJ(String str, String str2, String role, String str3) {
        o.LJIIIZ(role, "role");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("author_id", str2);
            jSONObject.put("room_id", str);
            jSONObject.put("product_id", str3);
            jSONObject.put("live_role", role);
            C48658J7u.LIZIZ("rd_tiktokec_cancel_pin_product", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void LJI(String str, String str2, String str3, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("message_id", str3);
            jSONObject.put("author_id", str4);
            jSONObject.put("live_role", str5);
            C48658J7u.LIZIZ("rd_tiktokec_pin_card_entrance_show", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void LJ(String str, String str2, String str3, String str4, boolean z, boolean z2, String role, boolean z3) {
        int i;
        int i2;
        o.LJIIIZ(role, "role");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("author_id", str3);
            int i3 = 0;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("has_ec_perm", i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_anchor", i2);
            jSONObject.put("quit_step", str4);
            jSONObject.put("live_role", role);
            if (z3) {
                i3 = 1;
            }
            jSONObject.put("is_page_visible", i3);
            C48658J7u.LIZIZ("rd_tiktokec_live_pop_product_quit", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void LIZLLL(String str, String str2, boolean z, long j, int i, String str3, boolean z2, String str4, boolean z3) {
        int i2;
        String str5;
        try {
            JSONObject jSONObject = new JSONObject();
            int i3 = 0;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_success", i2);
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("cost", j);
            jSONObject.put("error_msg", str3);
            jSONObject.put("ec_code", String.valueOf(i));
            if (z2) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_from_message", str5);
            jSONObject.put("live_role", str4);
            if (z3) {
                i3 = 1;
            }
            jSONObject.put("is_prefetch", i3);
            C48658J7u.LIZIZ("rd_tiktokec_get_introduce_products", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void LJFF(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2;
        int i3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("page_name", "live");
            jSONObject.put("author_id", str3);
            jSONObject.put("source", "live_popup_card");
            jSONObject.put("is_first", str4);
            jSONObject.put("live_role", str5);
            int i4 = 0;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_app_background", i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_page_visible", i2);
            if (z3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("has_ec_perm", i3);
            if (z4) {
                i4 = 1;
            }
            jSONObject.put("is_anchor", i4);
            C48658J7u.LIZIZ("rd_ec_data_ready", jSONObject);
        } catch (Exception unused) {
        }
    }
}
