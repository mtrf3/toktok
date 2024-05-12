package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QOZ {
    public static volatile String LIZ = "";

    public static void LIZ(String enterFrom, String str, String str2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LIZ = enterFrom;
        JSONObject LJ = C47135Ieh.LJ("enter_from", enterFrom, "error_type", str);
        LJ.put("status", 1);
        JSONObject jSONObject = new JSONObject();
        if (str2 != null) {
            jSONObject.put("message", str2);
        }
        C09900aA.LJI("aweme_long_connection_status", LJ, null, jSONObject);
    }
}
