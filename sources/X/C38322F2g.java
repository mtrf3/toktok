package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.net.MalformedURLException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.F2g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38322F2g {
    public static final ConcurrentHashMap<Long, C35515Dwl> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(C35515Dwl c35515Dwl, JSONObject jSONObject) {
        String str;
        String str2 = c35515Dwl.LIZ;
        try {
            str = new java.net.URL(c35515Dwl.LIZJ).getHost();
            o.LJIIIIZZ(str, "urlObj.host");
        } catch (MalformedURLException e) {
            C16880lQ.LLLLIIL(e);
            str = "";
        }
        JSONObject jSONObject2 = new JSONObject(str2);
        jSONObject.put("flag", 2);
        jSONObject.put("status_code", 200);
        jSONObject.put("retry_times", c35515Dwl.LIZIZ);
        jSONObject.put("host", str);
        jSONObject.put("redirect_times", jSONObject2.optJSONObject("base").optInt("redirect_times"));
        if (jSONObject.optInt("redirect_times") > 0) {
            String newHost = jSONObject2.optJSONObject("base").optJSONArray("redirecting_list").optString(jSONObject.optInt("redirect_times") - 1);
            if (!TextUtils.isEmpty(newHost)) {
                o.LJIIIIZZ(newHost, "newHost");
                jSONObject.put("host", new OJD("https?://").replace(newHost, ""));
            }
        }
        jSONObject.put("socket_reuse", JSONObjectProtectorUtils.getBoolean(jSONObject2.optJSONObject("socket"), "socket_reused"));
        jSONObject.put("handshake", jSONObject2.optJSONObject("ssl").optInt("handshake_type"));
        jSONObject.put("conn_status", jSONObject2.optJSONObject("ssl").optInt("connection_status"));
        jSONObject.put("conn_info", jSONObject2.optJSONObject("response").optInt("connection_info"));
        jSONObject.put("rip", jSONObject2.optJSONObject("socket").optString("remote"));
        jSONObject.put("ttfb", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("ttfb"));
        jSONObject.put("dns", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("dns"));
        jSONObject.put("inner", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("inner"));
        jSONObject.put("origin", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("origin"));
        jSONObject.put("proxy", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("proxy"));
        jSONObject.put("tcp", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("tcp"));
        jSONObject.put("dur", jSONObject2.optJSONObject("timing").optJSONObject("request").optInt("duration"));
    }
}
