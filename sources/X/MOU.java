package X;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class MOU {
    public static Long LIZ;
    public static Long LIZIZ;
    public static Long LIZJ;

    public static void LIZ(Integer num, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notice_duration_type", str);
        jSONObject.put("notice_duration", j);
        if (num != null) {
            jSONObject.put("notice_group", num.intValue());
        }
        C09900aA.LJI("notice_monitor_list_duration", null, null, jSONObject);
    }

    public static void LIZIZ(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notice_group", i);
        jSONObject.put("notice_request_id", str);
        jSONObject.put("notice_error_reason", str2);
        C09900aA.LJI("notice_monitor_list_abnormal", null, null, jSONObject);
    }
}
