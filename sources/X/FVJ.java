package X;

import Y.ACallableS7S2200000_6;
import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FVJ {
    public static volatile long LIZ;
    public static volatile boolean LIZIZ;

    static {
        FVW.LIZ.LIZ(FVU.VIDEO_REQ);
        LIZ = -1L;
        LIZIZ = false;
    }

    public static boolean LIZ() {
        long j;
        if (LIZIZ) {
            return true;
        }
        Context LIZIZ2 = EF7.LIZIZ();
        if (LIZ <= 0) {
            SharedPreferences LIZIZ3 = F9J.LIZIZ(LIZIZ2, 0, "ies_log_flag");
            if (C38987FRv.LIZLLL) {
                j = -1;
            } else {
                j = 1;
            }
            LIZ = LIZIZ3.getLong("first_install_time_key", j);
            if (LIZ <= 0) {
                LIZ = System.currentTimeMillis();
                F9J.LIZIZ(EF7.LIZIZ(), 0, "ies_log_flag").edit().putLong("first_install_time_key", System.currentTimeMillis()).apply();
            }
        }
        if (LIZ + 172800000 > System.currentTimeMillis()) {
            return false;
        }
        if (!LIZIZ) {
            LIZIZ = true;
            F9J.LIZIZ(LIZIZ2, 0, "ies_log_flag").edit().putLong("first_install_time_key", 1L).apply();
        }
        return true;
    }

    public static void LIZIZ(String str, long j, JSONObject jSONObject) {
        if (LIZ()) {
            return;
        }
        Context LIZIZ2 = EF7.LIZIZ();
        try {
            jSONObject.put("local_time", j / 1000);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C10K.LIZJ(new ACallableS7S2200000_6(LIZIZ2, str, jSONObject, 1));
    }
}
