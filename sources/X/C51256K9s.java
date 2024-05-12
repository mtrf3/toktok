package X;

import org.json.JSONObject;

/* renamed from: X.K9s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51256K9s {
    public final KA7 LIZ;

    public C51256K9s(KA7 ka7) {
        this.LIZ = ka7;
    }

    public final void LIZ(String str) {
        String str2;
        C50948Jz6 c50948Jz6;
        C50948Jz6 c50948Jz62;
        JSONObject jSONObject = new JSONObject();
        KA7 ka7 = this.LIZ;
        if (ka7 == null || (c50948Jz62 = ka7.LIZ) == null || (str2 = c50948Jz62.getEnterSearchFrom()) == null) {
            str2 = "";
        }
        jSONObject.put("enter_from", str2);
        jSONObject.put(WM7.SCENE_SERVICE, "guess_word_scene");
        jSONObject.put("result_type", str);
        KA7 ka72 = this.LIZ;
        if (ka72 != null && (c50948Jz6 = ka72.LIZ) != null) {
            jSONObject.put("root_enter_from_type", c50948Jz6.getEcSearchEntranceValue());
        }
        C48658J7u.LIZIZ("rd_tiktok_search_intermediate_request_result", jSONObject);
    }

    public static void LIZIZ(C51256K9s c51256K9s, String str, String str2, String str3) {
        String str4;
        C50948Jz6 c50948Jz6;
        C50948Jz6 c50948Jz62;
        c51256K9s.getClass();
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ(WM7.SCENE_SERVICE, str);
        oszArr[1] = new OSZ("step", str2);
        oszArr[2] = new OSZ("is_force", str3);
        KA7 ka7 = c51256K9s.LIZ;
        Object obj = "";
        if (ka7 == null || (c50948Jz62 = ka7.LIZ) == null || (str4 = c50948Jz62.getEnterSearchFrom()) == null) {
            str4 = "";
        }
        oszArr[3] = new OSZ("enter_from", str4);
        KA7 ka72 = c51256K9s.LIZ;
        if (ka72 != null && (c50948Jz6 = ka72.LIZ) != null) {
            obj = Integer.valueOf(c50948Jz6.getEcSearchEntranceValue());
        }
        oszArr[4] = new OSZ("root_enter_from_type", obj.toString());
        oszArr[5] = new OSZ("is_history_first_screen", String.valueOf(false));
        C48658J7u.LIZ("rd_ec_search_middle_trace", C113554cx.LJJLIIIIJ(oszArr));
    }
}
