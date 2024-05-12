package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* renamed from: X.JuD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50645JuD {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static final /* synthetic */ int LIZJ = 0;

    public static void LIZ(long j) {
        if (LIZIZ > 0) {
            return;
        }
        LIZIZ = j;
        long j2 = j - LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time", j2);
        jSONObject.put("fe_flag", "lynx");
        AppLogNewUtils.onEventV3("search_transfer_firstscreen_time_monitor", jSONObject);
    }
}
