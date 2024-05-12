package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Esq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37820Esq {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ(C37821Esr c37821Esr) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_loader_error_code", c37821Esr.LIZJ.LIZ);
        jSONObject.put("res_error_msg", c37821Esr.LIZJ.LIZIZ);
        c37821Esr.LIZJ.getClass();
        jSONObject.put("net_library_error_code", -1);
        jSONObject.put("http_status_code", c37821Esr.LIZJ.LIZJ);
        return jSONObject;
    }

    public static JSONObject LIZIZ(C37821Esr c37821Esr) {
        String str;
        Object LIZ2;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_src", c37821Esr.LIZ.LIZ);
        if (c37821Esr.LIZ.LIZLLL) {
            jSONObject.put("res_scene", "web_main_resource");
        } else {
            jSONObject.put("res_scene", "web_child_resource");
        }
        jSONObject.put("res_from", "cdn");
        if (c37821Esr.LIZ.LIZIZ) {
            str = "success";
        } else {
            str = "failed";
        }
        jSONObject.put("res_state", str);
        jSONObject.put("cdn_request_method", c37821Esr.LIZ.LIZJ);
        jSONObject.put("cdn_response_content_type", c37821Esr.LIZ.LJIIIIZZ);
        jSONObject.put("cdn_is_socket_reused", c37821Esr.LIZ.LJIIJ);
        jSONObject.put("cdn_request_header_accept", c37821Esr.LIZ.LJ);
        jSONObject.put("cdn_request_header_accept_encoding", c37821Esr.LIZ.LJFF);
        jSONObject.put("cdn_response_header_content_encoding", c37821Esr.LIZ.LJIIIZ);
        try {
            LIZ2 = new JSONObject(c37821Esr.LIZ.LJI);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m13isSuccessimpl(LIZ2)) {
            JSONObject jSONObject2 = (JSONObject) LIZ2;
            JSONObject optJSONObject = jSONObject2.optJSONObject("base");
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("header");
            Integer num = null;
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.optString("x-tt-logid");
            } else {
                str2 = null;
            }
            jSONObject.put("cdn_response_header_logid", str2);
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("header");
            if (optJSONObject3 != null) {
                str3 = optJSONObject3.optString("x-tt-trace-host");
            } else {
                str3 = null;
            }
            jSONObject.put("cdn_response_header_trace_host", str3);
            JSONObject optJSONObject4 = jSONObject2.optJSONObject("header");
            if (optJSONObject4 != null) {
                str4 = optJSONObject4.optString("x-tt-trace-id");
            } else {
                str4 = null;
            }
            jSONObject.put("cdn_response_header_trace_id", str4);
            if (optJSONObject != null) {
                num = Integer.valueOf(optJSONObject.optInt("redirect_times"));
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    jSONObject.put("cdn_dispatch_action", optJSONObject.optBoolean("dispatched"));
                    JSONArray optJSONArray = optJSONObject.optJSONArray("redirecting_list");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        jSONObject.put("cdn_dispatch_target_host", optJSONArray.get(optJSONArray.length() - 1));
                    }
                }
            } else {
                jSONObject.put("cdn_dispatch_action", false);
            }
        }
        return jSONObject;
    }
}
