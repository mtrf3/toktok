package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EyN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38163EyN {
    public static final JSONObject LIZ(C38099ExL jsbInfo) {
        o.LJIIJ(jsbInfo, "jsbInfo");
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJJZI("event_type", "jsbPerf", jSONObject);
        C77123UOp.LJJJJZI("bridge_name", jsbInfo.LIZ, jSONObject);
        C77123UOp.LJJJJLL(jsbInfo.LIZIZ, "status_code", jSONObject);
        C77123UOp.LJJJJZI("status_description", jsbInfo.LIZJ, jSONObject);
        C77123UOp.LJJJJZI("protocol_version", null, jSONObject);
        C77123UOp.LJJJJZ("cost_time", jsbInfo.LIZLLL, jSONObject);
        C77123UOp.LJJJJZ("invoke_ts", jsbInfo.LJ, jSONObject);
        C77123UOp.LJJJJZ("callback_ts", jsbInfo.LJFF, jSONObject);
        C77123UOp.LJJJJZ("fireEvent_ts", 0L, jSONObject);
        return jSONObject;
    }

    public static final JSONObject LIZIZ(C38101ExN jsbError) {
        o.LJIIJ(jsbError, "jsbError");
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJJZI("event_type", "jsbError", jSONObject);
        C77123UOp.LJJJJZI("bridge_name", jsbError.LIZJ, jSONObject);
        C77123UOp.LJJJJZI("error_activity", null, jSONObject);
        C77123UOp.LJJJJLL(jsbError.LIZ, "error_code", jSONObject);
        C77123UOp.LJJJJZI("error_message", jsbError.LIZIZ, jSONObject);
        C77123UOp.LJJJJZI("js_type", null, jSONObject);
        C77123UOp.LJJJJZI("error_url", jsbError.LIZLLL, jSONObject);
        C77123UOp.LJJJJLL(0, "is_sync", jSONObject);
        return jSONObject;
    }

    public static final JSONObject LIZJ(String str, String str2, Integer num, Integer num2, Boolean bool) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJJZI("event_type", "nativeError", jSONObject);
        if (num != null) {
            num.intValue();
            C77123UOp.LJJJJLL(num.intValue(), "error_code", jSONObject);
        }
        if (str2 != null) {
            C77123UOp.LJJJJZI("error_msg", str2, jSONObject);
        }
        if (bool == null) {
            C77123UOp.LJJJJZI(WM7.SCENE_SERVICE, "web_process_terminate", jSONObject);
        } else {
            if (bool.booleanValue()) {
                str3 = "main_frame";
            } else {
                str3 = "child_resource";
            }
            C77123UOp.LJJJJZI(WM7.SCENE_SERVICE, str3, jSONObject);
        }
        if (str != null) {
            C77123UOp.LJJJJZI("error_url", str, jSONObject);
        }
        if (num2 != null) {
            num2.intValue();
            C77123UOp.LJJJJLL(num2.intValue(), "http_status", jSONObject);
        }
        return jSONObject;
    }
}
