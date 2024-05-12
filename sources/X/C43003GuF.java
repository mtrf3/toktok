package X;

import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.GuF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43003GuF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String errorCode, String str, String actionName, long j, String str2, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, long j2) {
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(actionName, "actionName");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "status");
        c188727au.LJIIIZ("error_code", errorCode);
        c188727au.LJIIIZ("error_msg", str);
        c188727au.LJIIIZ("action_name", actionName);
        c188727au.LJ(j, "duration");
        c188727au.LJIIIZ("conversation_id", str2);
        c188727au.LJIIIZ("server_log_id", String.valueOf(jSONArray3));
        c188727au.LJIIIZ("search_ability_cost", String.valueOf(jSONArray));
        c188727au.LJIIIZ("search_ability_name", String.valueOf(jSONArray2));
        c188727au.LJ(0L, "prepare_resource_cost");
        c188727au.LJ(j2, "apply_effect_cost");
        FMX.LJIIL("action_ai_execute_action", c188727au.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", i).put("error_code", errorCode).put("error_msg", str).put("action_name", actionName).put("duration", j).put("conversation_id", str2).put("server_log_id", String.valueOf(jSONArray3)).put("search_ability_cost", String.valueOf(jSONArray)).put("search_ability_name", String.valueOf(jSONArray2)).put("prepare_resource_cost", 0L).put("apply_effect_cost", j2);
        C43882HKc.LIZLLL(i, "action_ai_execute_action", jSONObject, true);
    }
}
