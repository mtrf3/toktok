package X;

import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KAD {
    public static long LIZ;
    public static long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;

    public static void LIZ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZ;
        if (j != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gap", currentTimeMillis - j);
            jSONObject.put("keyword", keyword);
            jSONObject.put("type", "request_start");
            AppLogNewUtils.onEventV3("search_sug_frequency_monitor", jSONObject);
        }
        LIZ = currentTimeMillis;
    }

    public static void LIZIZ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        if (j != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gap", currentTimeMillis - j);
            jSONObject.put("keyword", keyword);
            jSONObject.put("type", "request_success");
            AppLogNewUtils.onEventV3("search_sug_frequency_monitor", jSONObject);
        }
        LIZIZ = currentTimeMillis;
    }
}
