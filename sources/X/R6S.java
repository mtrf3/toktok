package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public class R6S {
    public static final /* synthetic */ int LIZ = 0;

    public static R6R LIZ(R6Y r6y, boolean z) {
        R6R r6r = new R6R(z, 0);
        r6r.LIZLLL = r6y.LIZ;
        r6r.LJFF = r6y.LIZIZ;
        r6r.LJIIJ = r6y.LJFF;
        r6r.LJIIJJI = r6y.LJI;
        r6r.LJIIL = r6y.LJII;
        r6r.LJIIIZ = r6y.LJ;
        return r6r;
    }

    public static void LIZIZ(R6Y r6y, JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("error_code")) {
                r6y.LIZ = jSONObject.optInt("error_code", r6y.LIZ);
            } else if (jSONObject.has("code")) {
                r6y.LIZ = jSONObject.optInt("code", r6y.LIZ);
            }
            r6y.LIZIZ = jSONObject.optString("description");
            String optString = jSONObject.optString("name");
            if ("connect_switch".equals(optString) || "connect_exist".equals(optString)) {
                r6y.LJFF = jSONObject.optString("description");
                r6y.LJI = jSONObject.optString("dialog_tips");
                r6y.LJII = jSONObject.optString("auth_token");
            }
            if (r6y.LIZ == 1075) {
                jSONObject.optLong("apply_time");
                jSONObject.optString("avatar_url");
                jSONObject.optString("nick_name");
                jSONObject.optString("token");
                jSONObject.optLong("cancel_time");
            }
            if (r6y.LIZ == 1041) {
                jSONObject.optString("screen_name");
                jSONObject.optString("avatar_url");
                jSONObject.optString("last_login_time");
                jSONObject.optString("mobile");
                jSONObject.optString("platform_screen_name_current");
                jSONObject.optString("platform_screen_name_conflict");
            }
        }
    }

    public static QTX LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        QTX qtx = new QTX(jSONObject, jSONObject2);
        qtx.LIZ();
        return qtx;
    }
}
