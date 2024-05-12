package X;

import Y.ACallableS112S0100000_9;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.Lp9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55427Lp9 {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static int LIZJ = -1;
    public static String LIZLLL = "";
    public static int LJ;

    public static final void LIZ() {
        if (LIZJ < 0 || LIZ < 0 || LIZIZ < 0 || TextUtils.isEmpty(LIZLLL)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_status", String.valueOf(LIZJ));
        jSONObject.put("push_label", LIZLLL);
        jSONObject.put("push_cold_boost_user_cache", LJ);
        long j = LIZIZ;
        long j2 = LIZ;
        if (j - j2 > 0) {
            jSONObject.put("push_total", String.valueOf(j - j2));
        }
        C10K.LIZJ(new ACallableS112S0100000_9(jSONObject, 10));
    }
}
