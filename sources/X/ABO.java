package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ABO {
    public static void LIZ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("app_language", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("translation_language", str2);
            AppLogNewUtils.onEventV3("enter_sys_language_setting", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
