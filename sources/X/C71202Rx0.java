package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rx0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71202Rx0 {
    public static final /* synthetic */ int LIZ = 0;

    public static C188727au LIZ(C48502J1u c48502J1u) {
        String LIZJ;
        String str = "";
        if (o.LJ(c48502J1u.LIZJ("room_id"), CardStruct.IStatusCode.DEFAULT)) {
            LIZJ = "";
        } else {
            LIZJ = c48502J1u.LIZJ("room_id");
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", c48502J1u.LIZJ("anchor_id"));
        c188727au.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c188727au.LJIIIZ("room_id", LIZJ);
        c188727au.LJIIIZ("live_status", c48502J1u.LIZJ("live_status"));
        String LIZJ2 = c48502J1u.LIZJ("page_type");
        if (LIZJ2 == null) {
            LIZJ2 = "";
        }
        c188727au.LJIIIZ("page_type", LIZJ2);
        String LIZJ3 = c48502J1u.LIZJ("anchor_show_type");
        if (LIZJ3 != null) {
            str = LIZJ3;
        }
        c188727au.LJIIIZ("anchor_show_type", str);
        return c188727au;
    }

    public static void LIZJ(C48502J1u mEventParamHelper) {
        o.LJIIIZ(mEventParamHelper, "mEventParamHelper");
        java.util.Map<String, String> params = LIZ(mEventParamHelper).LIZ;
        o.LJIIIIZZ(params, "params");
        ((HashMap) params).put("user_type", "author");
        C48658J7u.LIZ("livesdk_tiktokec_product_icon_click", params);
    }

    public static void LIZIZ(String str, boolean z, long j, EnumC71217RxF role, int i, String str2) {
        int i2;
        o.LJIIIZ(role, "role");
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_success", i2);
            jSONObject.put("live_role", role.getRoleStr());
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("cost", j);
            jSONObject.put("error_msg", str2);
            jSONObject.put("ec_code", String.valueOf(i));
            C48658J7u.LIZIZ("rd_tiktokec_get_products_count", jSONObject);
        } catch (Exception unused) {
        }
    }
}
