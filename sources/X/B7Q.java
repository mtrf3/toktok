package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class B7Q {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Integer num, boolean z, String url) {
        int i;
        o.LJIIIZ(url, "url");
        JSONObject jSONObject = new JSONObject();
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C05630Jz.LIZ(i, "error_code", jSONObject);
        if (str == null) {
            str = "";
        }
        C05630Jz.LJI(jSONObject, "error_reason", str);
        C05630Jz.LJI(jSONObject, "url", url);
        if (!z) {
            i2 = 1;
        }
        C0K2.LJIIIIZZ("ttlive_live_match_x_load_event", i2, jSONObject);
    }
}
