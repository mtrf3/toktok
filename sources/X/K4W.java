package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class K4W {
    public static long LIZIZ;
    public static boolean LIZJ;
    public static int LJ;
    public static String LIZ = "";
    public static String LIZLLL = "";

    public static void LIZ() {
        LIZLLL = "";
        LIZ = "";
        LIZIZ = 0L;
        LIZJ = false;
    }

    public static String LIZIZ() {
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sug_after_search", LIZJ ? 1 : 0);
        jSONObject.put("cursor_pos", LJ);
        if (LIZIZ > 0) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("is_cleared", i);
        if (!TextUtils.isEmpty(LIZLLL)) {
            jSONObject.put("last_sug", LIZLLL);
        }
        long j = LIZIZ;
        if (j > 0) {
            jSONObject.put("cleared_time", j);
            jSONObject.put("content_before_clear", LIZ);
        }
        String encode = android.net.Uri.encode(jSONObject.toString());
        o.LJIIIIZZ(encode, "encode(jsonObject.toString())");
        return encode;
    }
}
