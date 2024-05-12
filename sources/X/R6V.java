package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R6V {
    public static void LIZ(C68969R4z c68969R4z, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            c68969R4z.LIZ = jSONObject.optInt("error_code", c68969R4z.LIZ);
        } else if (jSONObject.has("code")) {
            c68969R4z.LIZ = jSONObject.optInt("code", c68969R4z.LIZ);
        }
        c68969R4z.LIZIZ = jSONObject.optString("description");
        if (c68969R4z.LIZ == 1075) {
            jSONObject.optLong("apply_time");
            jSONObject.optString("avatar_url");
            jSONObject.optString("nick_name");
            jSONObject.optString("token");
            jSONObject.optLong("cancel_time");
        }
    }

    public static void LIZJ(R74 r74, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            r74.LIZ = jSONObject.optInt("error_code", r74.LIZ);
        } else if (jSONObject.has("code")) {
            r74.LIZ = jSONObject.optInt("code", r74.LIZ);
        }
        r74.LIZJ = jSONObject.optString("description");
        r74.LIZLLL = jSONObject.optString("captcha");
        jSONObject.optString("alert_text");
        if (r74.LIZ == 1001 && (r74 instanceof R7E)) {
            jSONObject.optString("dialog_tips");
        }
        if (r74.LIZ == 1057 && (r74 instanceof R7E)) {
            jSONObject.optString("dialog_tips");
            ((R7E) r74).LJFF = jSONObject.optString("next_url");
        }
        if (r74.LIZ == 1057 && (r74 instanceof C68999R6d)) {
            jSONObject.optString("dialog_tips");
            jSONObject.optString("next_url");
        }
        if (r74.LIZ == 1075) {
            jSONObject.optLong("apply_time");
            jSONObject.optString("avatar_url");
            jSONObject.optString("nick_name");
            jSONObject.optString("token");
            jSONObject.optLong("cancel_time");
        }
    }

    public static QQN LIZIZ(String str, String str2, String str3, String str4, String str5, java.util.Map map) {
        QQN qqn = new QQN();
        if (!TextUtils.isEmpty(str)) {
            qqn.LIZJ("platform", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            qqn.LIZJ("access_token", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            qqn.LIZJ("expires_in", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            qqn.LIZJ("code", str4);
        }
        if (!TextUtils.isEmpty(null)) {
            qqn.LIZJ("profile_key", null);
        }
        if (!TextUtils.isEmpty(str5)) {
            qqn.LIZJ("platform_app_id", str5);
        }
        if (map != null && !map.isEmpty()) {
            for (String str6 : map.keySet()) {
                if (!TextUtils.isEmpty(str6)) {
                    qqn.LIZJ(str6, (String) map.get(str6));
                }
            }
        }
        return qqn;
    }
}
