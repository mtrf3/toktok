package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168626ja {
    public static volatile JSONObject LIZ;

    public static boolean LIZIZ() {
        try {
            JSONObject LIZ2 = LIZ();
            if (LIZ2 != null) {
                if (LIZ2.optInt("optimization_on") == 1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean LIZLLL() {
        JSONObject LIZ2;
        try {
            JSONObject LIZ3 = LIZ();
            if (LIZ3 != null && LIZ3.optInt("audio_info_monitor_on") == 1 && (LIZ2 = LIZ()) != null && LIZ2.optJSONObject("audio_metrics_params") != null) {
                return LJ();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static JSONObject LIZ() {
        boolean z;
        JSONObject jSONObject;
        if (LIZ == null) {
            FFL.LJIIIZ().getClass();
            String LJIILJJIL = FFL.LJIILJJIL(31744, "audio_metrics_experiment", "", true);
            o.LJIIIIZZ(LJIILJJIL, "getExprVal()");
            if (LJIILJJIL.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    FFL.LJIIIZ().getClass();
                    jSONObject = new JSONObject(FFL.LJIILJJIL(31744, "audio_metrics_experiment", "", true));
                } catch (Exception unused) {
                    jSONObject = null;
                }
                LIZ = jSONObject;
            }
        }
        return LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ() {
        /*
            java.lang.String r0 = "audio_metrics"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "audio_metrics_time"
            r3 = 0
            int r2 = r1.getInt(r0, r3)
            org.json.JSONObject r1 = LIZ()     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L1a
            java.lang.String r0 = "audio_metrics_interval"
            int r0 = r1.optInt(r0)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r2 < r0) goto L1e
            r3 = 1
        L1e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168626ja.LJ():boolean");
    }

    public static String LIZJ() {
        JSONObject optJSONObject;
        try {
            JSONObject LIZ2 = LIZ();
            if (LIZ2 != null && (optJSONObject = LIZ2.optJSONObject("audio_metrics_params")) != null) {
                String jSONObject = optJSONObject.toString();
                if (jSONObject != null) {
                    return jSONObject;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
