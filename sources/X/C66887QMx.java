package X;

import org.json.JSONObject;

/* renamed from: X.QMx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66887QMx {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        if (str == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 1508632) {
            if (hashCode != 1509441) {
                if (hashCode != 1721912 || !str.equals("8660")) {
                    return;
                }
            } else {
                if (!str.equals("1233")) {
                    return;
                }
                LIZIZ("va", "https://verification-va.tiktokv.com");
                C66888QMy.LIZ.optJSONObject("common").optJSONObject("host").put("va", "https://vcs-va.tiktokv.com");
                return;
            }
        } else if (!str.equals("1180")) {
            return;
        }
        LIZIZ("sg", "https://verify-sg.tiktokv.com");
        C66888QMy.LIZ.optJSONObject("common").optJSONObject("host").put("sg", "https://vcs-sg.tiktokv.com");
    }

    public static void LIZIZ(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject jSONObject = C66888QMy.LIZ;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("sms");
        if (optJSONObject3 != null && (optJSONObject2 = optJSONObject3.optJSONObject("host")) != null) {
            optJSONObject2.put(str, str2);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("verify");
        if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("host")) != null) {
            optJSONObject.put(str, str2);
        }
    }
}
