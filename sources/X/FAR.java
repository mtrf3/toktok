package X;

import android.os.SystemClock;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FAR {
    public static long LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static void LIZ(boolean z) {
        long j;
        try {
            if (LIZJ) {
                return;
            }
            if (LIZIZ) {
                j = SystemClock.uptimeMillis() - LIZ;
            } else {
                j = 0;
            }
            LIZJ = true;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_start_to_feed_exposed_duration", j);
            jSONObject.put("is_video_pre_load", LIZLLL ? 1 : 0);
            jSONObject.put("is_cold_start_first_launch", z ? 1 : 0);
            AppLogNewUtils.onEventV3("feed_page_exposure", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
